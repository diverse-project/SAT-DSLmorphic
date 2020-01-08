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
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.ExecutionException

class Solver {
	
	def void solve(SATMorphic satMorphic) {
		
		var file = new File("results2.csv")
		var outputfile = new FileWriter(file)
    	var CSVwriter = new CSVWriter(outputfile)
    	CSVwriter.writeNext(#["Benchmark", "Solver", "Sat?", "Time (ms)"])
    	
    	try {
    		switch satMorphic.benchmark.class {
				case BenchmarkDimacsImpl : {
					var dimaces = (satMorphic.benchmark as BenchmarkDimacs).dimacses
					var nb_dimaces = dimaces.size
					var i = 1
					for(String input_path : dimaces) {
						println(String.format("------------- Proceeding file %d / %d -------------", i, nb_dimaces))
						select_solver(satMorphic, input_path, CSVwriter)
						i++
					}
				}
				case BenchmarkFormulaImpl : {
					for(Expression expr : (satMorphic.benchmark as BenchmarkFormula).expressions) {
						select_solver(satMorphic, expr_to_dimacs(expr), CSVwriter)
					}
				}
				default : println('Unknown input type')
			}
    	} catch (Exception e) {
    		println("------------- Unexpected error during computation -------------")
    	}
    	println("------------- Finished -------------")
		CSVwriter.close()
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
		writer.println(str)
		writer.close()
		
		 return '/home/ozhang/Documents/5INFO/DSL/DSL_Project/SAT-DSLmorphic/org.xtext.example.msat.tests/test.cnf'
    }
    
    
    def void select_solver(SATMorphic satMorphic, String input_path, CSVWriter CSVwriter) {
    	
    	println("Solving file : " + input_path)
    	
    	for (SATSolver satSolver : satMorphic.solvers) {
    		switch satSolver {
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
    	}
    }
    
    
    def void run_solver(String solver_name, ProcessBuilder pb, String file_path, CSVWriter CSVwriter) {
    	
//		pb.redirectOutput(Redirect.INHERIT)
		
		val Runnable thread = new Thread() {
			override void run() {
				var satisfiable = true
		    	var startTime = System.currentTimeMillis()
				var p = pb.start()
				var output = p.getInputStream()
//				p.waitFor()
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
		        CSVwriter.writeNext(#[matcher.group(1), solver_name, satisfiable ? "SAT":"UNSAT", totalTime.toString()])
			}
		}
		
		var ExecutorService executor = Executors.newSingleThreadExecutor()
		var future = executor.submit(thread)
		executor.shutdown()
		
		try {
			future.get(5, TimeUnit.MINUTES)
		} catch (InterruptedException ie) { 
			println("------------- Interrupted -------------")
			CSVwriter.close()
		}
		catch (ExecutionException ee) { 
			println("------------- Exception during execution -------------")
			var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
	        var matcher = pattern.matcher(file_path)
	        matcher.find()
			CSVwriter.writeNext(#[matcher.group(1), solver_name, "CRASHED", ""])
		}
		catch (TimeoutException te) { 
			println("------------- Timed out -------------")
			var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
	        var matcher = pattern.matcher(file_path)
	        matcher.find()
			CSVwriter.writeNext(#[matcher.group(1), solver_name, "TIMED OUT", ""])
		} catch (Exception e) {
			println("---- Timed out ----")
			var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
	        var matcher = pattern.matcher(file_path)
	        matcher.find()
			CSVwriter.writeNext(#[matcher.group(1), solver_name, "TIMED OUT", ""])
		}
		if (!executor.isTerminated()) {
			executor.shutdownNow(); // If you want to stop the code that hasn't finished.
		}
    }
    
    
    def void minisat_solve(String file_path, Float rnd_freq, CSVWriter CSVwriter) {
    	println('minisat_solve called')
    	var pb = new ProcessBuilder()
		pb.command('minisat','-rnd-freq='+rnd_freq, file_path)
		run_solver("Minisat", pb, file_path, CSVwriter)
    }
    
    
    def void cryptominisat_solve(String file_path, CSVWriter CSVwriter) {
    	println('cryptominisat_solve called')
    	var pb = new ProcessBuilder()
		pb.command('cryptominisat5', file_path)
		run_solver("Cryptominisat", pb, file_path, CSVwriter)
    }
    
    
    def Boolean java_solve(String file_path, CSVWriter CSVwriter) {
    	println('java_solve called')
    	var pattern = Pattern.compile(".*\\/(.+\\.cnf)$")
        var matcher = pattern.matcher(file_path)
        matcher .find()
    	var solver = SolverFactory.newDefault()
        solver.setTimeout(60*5); // 1 hour timeout
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
            println("---- Timed out ----")
			CSVwriter.writeNext(#[matcher.group(1), "Sat4j-java", "TIMED OUT", ""])
            return false
        }
    }
    
    
    def void jar_solve(String file_path, CSVWriter CSVwriter) {
    	println('jar_solve called')
		var pb = new ProcessBuilder()
		pb.command('java', '-jar', 'lib/org.sat4j.jar', file_path)
		run_solver("Sat4j-jar", pb, file_path, CSVwriter)
    }
    
    
    def void maven_solve(String file_path, CSVWriter CSVwriter) {
    	println('maven_solve called')
		var sat_file = new File('sat')
		var solver_file = new File('sat/src/main/java/dsl/Solver.java')
		var pom_file = new File('sat/pom.xml')
		
		
		if (!sat_file.exists()) {
			var pb = new ProcessBuilder()
			println('--------- mvn generation ---------')
			pb.command('mvn', 'archetype:generate', '-DgroupId=dsl', '-DartifactId=sat', '-DarchetypeArtifactId=maven-archetype-quickstart', '-DarchetypeVersion=1.4', '-DinteractiveMode=false', '-e')
			pb.redirectOutput(Redirect.INHERIT)
			pb.start()
//			p.waitFor()
		
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
			pb.start()
//			p.waitFor()	
		}
		
		var pb = new ProcessBuilder()
//		println('--------- mvn exectution ---------')
		pb.command('mvn', 'exec:java', '-Dexec.mainClass=dsl.Solver', '-Dexec.args="'+file_path+'"')
//		pb.redirectOutput(Redirect.INHERIT)
		pb.directory(sat_file)
//		var p = pb.start()
//		p.waitFor()
		
		run_solver("Sat4j-maven", pb, file_path, CSVwriter)
    }
}