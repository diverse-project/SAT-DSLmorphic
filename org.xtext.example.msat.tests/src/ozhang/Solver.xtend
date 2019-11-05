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

class Solver {
	
	
	def void solve(SATMorphic satMorphic) {
		
		var temp_input_path = ''
		switch satMorphic.benchmark.class {
			// We suppose that there is only one dimacs file to solve
			case BenchmarkDimacsImpl : temp_input_path = (satMorphic.benchmark as BenchmarkDimacs).dimacses.get(0)
			// We suppose that there is only one formula to solve
			case BenchmarkFormulaImpl : {
				var expr = (satMorphic.benchmark as BenchmarkFormula).expressions.get(0)
				
				// Convert Expression to DIMACS string format		
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
				
				temp_input_path = 'test.cnf'
			}
			default : println('Unknown input type')
		}
		
		val input_path = temp_input_path
		
		satMorphic.solvers.forEach[satSolver |
			if (satSolver.solver instanceof Sat4JImpl) {
				switch (satSolver.solver as Sat4JImpl).variant.literal {
					case 'sat4j-java' : java_solve(input_path)
					case 'sat4j-jar' : jar_solve(input_path)
					case 'sat4j-maven' : maven_solve(input_path)
					default : println('Unknown solving method.')
				}
			}]
    }
    
    
    def void java_solve(String file_path) {
    	println('java_solve called')
    	var solver = SolverFactory.newDefault()
        solver.setTimeout(3600); // 1 hour timeout
        var reader = new DimacsReader(solver)
        var out = new PrintWriter(System.out,true)
        // CNF filename is given on the command line 
        try {
            var problem = reader.parseInstance(file_path)
            if (problem.isSatisfiable()) {
                println("Satisfiable !")
                reader.decode(problem.model(),out)
            } else {
                println("Unsatisfiable !")
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        } catch (ContradictionException e) {
            println("Unsatisfiable (trivial)!")
        } catch (TimeoutException e) {
            println("Timeout, sorry!");      
        }
    }
    
    
    def void jar_solve(String file_path) {
    	println('jar_solve called')
		var pb = new ProcessBuilder()
		pb.command("cmd.exe", "/c", "java -jar lib/org.sat4j.jar " + file_path)
		pb.redirectOutput(Redirect.INHERIT)
		pb.start()
    }
    
    
    def void maven_solve(String file_path) {
    	println('maven_solve called')
		var sat_file = new File('sat')
		var solver_file = new File('sat\\src\\main\\java\\dsl\\Solver.java')
		var pom_file = new File('sat\\pom.xml')
		
		
		if (!sat_file.exists()) {
			var pb = new ProcessBuilder()
			pb.command("cmd.exe", "/c", 'mvn archetype:generate -DgroupId=dsl -DartifactId=sat -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false -e')
			pb.redirectOutput(Redirect.INHERIT)
			var p = pb.start()
			p.waitFor()
		}
		
		if (!solver_file.exists()) {
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
		}
		
		if (pom_file.exists()) {
			pom_file.delete()
		}
		
		var writer = new PrintWriter(pom_file, "UTF-8")
		var content =
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
      <version>3.8.1</version>
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
		
		var pb = new ProcessBuilder()
		pb.command("cmd.exe", "/c", 'mvn install')
		pb.redirectOutput(Redirect.INHERIT)
		pb.directory(sat_file)
		var p = pb.start()
		p.waitFor()
		
		pb = new ProcessBuilder()
		pb.command("cmd.exe", "/c", String.format('mvn exec:java -D"exec.mainClass"="dsl.Solver" -Dexec.args="..\\%s"',file_path))
		pb.redirectOutput(Redirect.INHERIT)
		pb.directory(sat_file)
		p = pb.start()
		p.waitFor()
    }
}