package ozhang

import org.xtext.example.mydsl1.mSat.SATMorphic
import org.sat4j.minisat.SolverFactory
import org.sat4j.reader.DimacsReader
import java.io.PrintWriter
import java.io.FileNotFoundException
import org.sat4j.reader.ParseFormatException
import java.io.IOException
import org.sat4j.specs.ContradictionException
import org.sat4j.specs.TimeoutException
import java.lang.ProcessBuilder.Redirect
import java.io.File
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import java.util.HashMap
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.impl.BenchmarkDimacsImpl
import org.xtext.example.mydsl1.mSat.impl.BenchmarkFormulaImpl
import org.xtext.example.mydsl1.mSat.impl.Sat4JImpl
import org.xtext.example.mydsl1.mSat.impl.MiniSATImpl
import org.xtext.example.mydsl1.mSat.impl.CryptoMiniSATImpl
import java.io.BufferedReader
import java.io.InputStreamReader
import org.xtext.example.mydsl1.mSat.SATSolver
import java.io.FileWriter
import com.opencsv.CSVWriter
import java.util.regex.Pattern

class Solver {
	
	def void solve(SATMorphic satMorphic) {
		switch satMorphic.benchmark.class {
			// We suppose that there is only one dimacs file to solve
			case BenchmarkDimacsImpl : (satMorphic.benchmark as BenchmarkDimacs).dimacses.forEach[input_path | run_solver(satMorphic, input_path)]
			// We suppose that there is only one formula to solve
			case BenchmarkFormulaImpl : (satMorphic.benchmark as BenchmarkFormula).expressions.forEach[expr | run_solver(satMorphic, expr_to_dimacs(expr))]
			default : println('Unknown input type')
		}
    }
    
    
    def String expr_to_dimacs(Expression expr) {
    	var utils = new Utils()
		var env = new HashMap<String,Integer>()
		var res = utils.dimacs(utils.cnf(expr as Expression), env)
		var nbVar = env.size
		var nbClauses = res.split('\n').size
		var str = 'c test.cnf\n'
		str += 'c\n'
		str += String.format('p cnf %d %d\n', nbVar, nbClauses)
		str += res
		
		var writer = new PrintWriter("test.cnf", "UTF-8")
		writer.close()
		writer.println(str)
		
		 return 'test.cnf'
    }
    
    
    def void run_solver(SATMorphic satMorphic, String input_path) {
    	
    	var file = new File("results.csv")

		var outputfile = new FileWriter(file)
    	var CSVwriter = new CSVWriter(outputfile)
    	CSVwriter.writeNext(#["Benchmark", "Solver", "Sat?", "Time (ms)"])
    	
    	for (SATSolver satSolver : satMorphic.solvers) {
    		var satisfiable = switch satSolver {
				case satSolver.solver instanceof Sat4JImpl : {
					switch (satSolver.solver as Sat4JImpl).variant.literal {
						case 'sat4j-java' : java_solve(input_path, CSVwriter)
						case 'sat4j-jar' : jar_solve(input_path, CSVwriter)
						case 'sat4j-maven' : maven_solve(input_path, CSVwriter)
						default : println('Unknown sat4j solving method')
					}
				}
				case satSolver.solver instanceof MiniSATImpl : {
					var param = (satSolver.solver as MiniSATImpl).parameter
					var rnd_freq = 0f
					if(param != (null as Float)) {
						rnd_freq = param.rndfreq
					}
					minisat_solve(input_path, rnd_freq, CSVwriter)
				}
				case satSolver.solver instanceof CryptoMiniSATImpl : cryptominisat_solve(input_path, CSVwriter)
				default : println('Unknown solver')
			}
			
			if ((satisfiable as Boolean)) {
				println('Satisfiable')
			} else {
				println('Unsatisfiable')
			}
    	}
    	CSVwriter.close()
    }
    
    
    def Boolean minisat_solve(String file_path, Float rnd_freq, CSVWriter CSVwriter) {
    	println('minisat_solve called')
    	var satisfiable = true
    	var pb = new ProcessBuilder()
		pb.command('minisat','-rnd-freq='+rnd_freq, file_path)
//		pb.redirectOutput(Redirect.INHERIT)

		var startTime = System.currentTimeMillis()
		var p = pb.start()
		var output = p.getInputStream()
		p.waitFor()
		var endTime   = System.currentTimeMillis()
		var totalTime = endTime - startTime
		
		var reader = new BufferedReader(new InputStreamReader(output))
        var line = ""
        while ((line = reader.readLine()) !== null) {
            if(line.toLowerCase.contains('unsatisfiable')) {
            	satisfiable = false
            }
        }
        var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
        var matcher = pattern.matcher(file_path)
        matcher.find()
        CSVwriter.writeNext(#[matcher.group(1), "Minisat", satisfiable ? "SAT":"UNSAT", totalTime.toString()])
        return satisfiable
    }
    
    
    def Boolean cryptominisat_solve(String file_path, CSVWriter CSVwriter) {
    	println('cryptominisat_solve called')
    	var satisfiable = true
    	var pb = new ProcessBuilder()
		pb.command('cryptominisat5', file_path)
		
		var startTime = System.currentTimeMillis()
		var p = pb.start()
		var output = p.getInputStream()
		p.waitFor()
		var endTime   = System.currentTimeMillis()
		var totalTime = endTime - startTime
		
		var reader = new BufferedReader(new InputStreamReader(output))
        var line = ""
        while ((line = reader.readLine()) !== null) {
            if(line.toLowerCase.contains('unsatisfiable')) {
            	satisfiable = false
            }
        }
        var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
        var matcher = pattern.matcher(file_path)
        matcher.find()
        CSVwriter.writeNext(#[matcher.group(1), "Cryptominisat", satisfiable ? "SAT":"UNSAT", totalTime.toString()])
        return satisfiable
    }
    
    
    def Boolean java_solve(String file_path, CSVWriter CSVwriter) {
    	println('java_solve called')
    	var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
        var matcher = pattern.matcher(file_path)
        matcher.find()
    	var solver = SolverFactory.newDefault()
        solver.setTimeout(3600); // 1 hour timeout
        var reader = new DimacsReader(solver)
//        var out = new PrintWriter(System.out,true)
        // CNF filename is given on the command line 
        var startTime = System.currentTimeMillis()
        try {
            var problem = reader.parseInstance(file_path)
            var satisfiable = problem.isSatisfiable()
            var endTime   = System.currentTimeMillis()
			var totalTime = endTime - startTime
			CSVwriter.writeNext(#[matcher.group(1), "Sat4j-java", satisfiable ? "SAT":"UNSAT", totalTime.toString()])
            return satisfiable
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        } catch (ContradictionException e) {
//            println("Unsatisfiable (trivial)!")
			var endTime   = System.currentTimeMillis()
			var totalTime = endTime - startTime
			CSVwriter.writeNext(#[matcher.group(1), "Sat4j-java", "UNSAT", totalTime.toString()])
            return false
        } catch (TimeoutException e) {
//            println("Timeout, sorry!");
			var endTime   = System.currentTimeMillis()
			var totalTime = endTime - startTime
			CSVwriter.writeNext(#[matcher.group(1), "Sat4j-java", "UNSAT", totalTime.toString()])
            return false
        }
    }
    
    
    def Boolean jar_solve(String file_path, CSVWriter CSVwriter) {
    	println('jar_solve called')
    	var satisfiable = true
		var pb = new ProcessBuilder()
		pb.command('java', '-jar', 'lib/org.sat4j.jar', file_path)
		
		var startTime = System.currentTimeMillis()
		var p = pb.start()
		var output = p.getInputStream()
		p.waitFor()
		var endTime   = System.currentTimeMillis()
		var totalTime = endTime - startTime
		
		var reader = new BufferedReader(new InputStreamReader(output))
        var line = ""
        while ((line = reader.readLine()) !== null) {
            if(line.toLowerCase.contains('unsatisfiable')) {
            	satisfiable = false
            }
        }
        var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
        var matcher = pattern.matcher(file_path)
        matcher.find()
        CSVwriter.writeNext(#[matcher.group(1), "Sat4j-jar", satisfiable ? "SAT":"UNSAT", totalTime.toString()])
        return satisfiable
    }
    
    
    def Boolean maven_solve(String file_path, CSVWriter CSVwriter) {
    	println('maven_solve called')
    	var satisfiable = true
		var sat_file = new File('sat')
		var solver_file = new File('sat/src/main/java/dsl/Solver.java')
		var pom_file = new File('sat/pom.xml')
		
		
		if (!sat_file.exists()) {
			var pb = new ProcessBuilder()
			println('--------- mvn generation ---------')
			pb.command('mvn', 'archetype:generate', '-DgroupId=dsl', '-DartifactId=sat', '-DarchetypeArtifactId=maven-archetype-quickstart', '-DarchetypeVersion=1.4', '-DinteractiveMode=false', '-e')
			pb.redirectOutput(Redirect.INHERIT)
			var p = pb.start()
			p.waitFor()
		
			var writer = new PrintWriter(solver_file, "UTF-8")
			var content =
'package dsl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

public class Solver {
    public static void main( String[] args ) {
        ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new DimacsReader(solver);
        PrintWriter out = new PrintWriter(System.out,true);
        // CNF filename is given on the command line 
        try {
            IProblem problem = reader.parseInstance(args[0]);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(),out);
            } else {
                System.out.println("Unsatisfiable !");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");      
        }
    }
}'
			writer.println(content)
			writer.close()
		
			writer = new PrintWriter(pom_file, "UTF-8")
			content =
'<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>dsl</groupId>
  <artifactId>sat</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>sat</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.6</maven.compiler.source>
    <maven.compiler.target>1.6</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13</version>
      <scope>test</scope>
    </dependency>
    <dependency>
	  <groupId>org.sat4j</groupId>
	  <artifactId>org.sat4j.core</artifactId>
	  <version>2.3.1</version>
    </dependency>
  </dependencies>
</project>'
			writer.println(content)
			writer.close()
		
			pb = new ProcessBuilder()
			println('--------- mvn install ---------')
			pb.command('mvn', 'install')
			pb.redirectOutput(Redirect.INHERIT)
			pb.directory(sat_file)
			p = pb.start()
			p.waitFor()	
		}
		
		var pb = new ProcessBuilder()
//		println('--------- mvn exectution ---------')
		pb.command('mvn', 'exec:java', '-Dexec.mainClass=dsl.Solver', '-Dexec.args="../'+file_path+'"')
//		pb.redirectOutput(Redirect.INHERIT)
		pb.directory(sat_file)
		
		var startTime = System.currentTimeMillis()
		var p = pb.start()
		var output = p.getInputStream()
		p.waitFor()
		var endTime   = System.currentTimeMillis()
		var totalTime = endTime - startTime
		
		var reader = new BufferedReader(new InputStreamReader(output))
        var line = ""
        while ((line = reader.readLine()) !== null) {
            if(line.toLowerCase.contains('unsatisfiable')) {
            	satisfiable = false
            }
        }
        var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
        var matcher = pattern.matcher(file_path)
        matcher.find()
        CSVwriter.writeNext(#[matcher.group(1), "Sat4j-maven", satisfiable ? "SAT":"UNSAT", totalTime.toString()])
        return satisfiable
    }
}