package org.xtext.example.msat.GJ_MC_Process

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter

class Sat4JCompiler implements Benchmarkable{
	
	static def compile(String file){
		var process = Runtime.getRuntime().exec("ls ./org.xtext.example.mydsl.sat.compiledsat4j");
		val code = process.waitFor
		if(code != 0){
			createMavenProject
			val app = getApp
			val pom = getPom
			process = Runtime.getRuntime().exec("ls ./org.xtext.example.mydsl.sat.compiledsat4j/src/main/java/org/xtext/example/mydsl/sat/App.java");
			val appWriter = new PrintWriter("./org.xtext.example.mydsl.sat.compiledsat4j/src/main/java/org/xtext/example/mydsl/sat/App.java", "UTF-8");
			appWriter.write(app);
			appWriter.close
			process = Runtime.getRuntime().exec("ls ./org.xtext.example.mydsl.sat.compiledsat4j/pom.xml");
			val pomWriter = new PrintWriter("./org.xtext.example.mydsl.sat.compiledsat4j/pom.xml", "UTF-8");
			pomWriter.write(pom);
			pomWriter.close
		}
		Runtime.getRuntime().exec("cp " + file + " ./org.xtext.example.mydsl.sat.compiledsat4j/formula.dimacs");
	}
	
	static def void createMavenProject(){
		val cmd = "mvn -B archetype:generate " + 
				  "-DgroupId=org.xtext.example.mydsl.sat " + 
				  "-DartifactId=org.xtext.example.mydsl.sat.compiledsat4j " +
				  "-DarchetypeGroupId=org.apache.maven.archetypes "
		var process = Runtime.getRuntime().exec(cmd);
		process.waitFor
		process = Runtime.getRuntime().exec("rm -rf ./org.xtext.example.mydsl.sat.compiledsat4j/src/test");
	} 
	static def String getPom(){
		'''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
		  <modelVersion>4.0.0</modelVersion>
		  <groupId>org.xtext.example.mydsl.sat</groupId>
		  <artifactId>org.xtext.example.mydsl.sat.compiledsat4j</artifactId>
		  <packaging>jar</packaging>
		  <version>1.0-SNAPSHOT</version>
		  <name>org.xtext.example.mydsl.sat.compiledsat4j</name>
		  <properties>
		  	<maven.compiler.source>1.6</maven.compiler.source>
		  	<maven.compiler.target>1.6</maven.compiler.target>
		  </properties>
		  <build>
		  <plugins>
		    <plugin>
			  <groupId>org.apache.maven.plugins</groupId>
			  <artifactId>maven-jar-plugin</artifactId>
			  <version>2.4</version>
			  <configuration>
			    <archive>
				  <manifest>
				    <mainClass> org.xtext.example.mydsl.sat.App </mainClass>
				  </manifest>
			    </archive>
			  </configuration>
		  </plugin>
		    <plugin>
		        <groupId>org.codehaus.mojo</groupId>
		        <artifactId>exec-maven-plugin</artifactId>
		        <version>1.2.1</version>
		        <executions>
		            <execution>
		                <goals>
		                    <goal>java</goal>
		                </goals>
		            </execution>
		        </executions>
		        <configuration>
		            <mainClass>org.xtext.example.mydsl.sat.App</mainClass>
		        </configuration>
		    </plugin>
		  </plugins>
		  </build>
		  <dependencies>
		    <dependency>
		      <groupId>org.sat4j</groupId>
		      <artifactId>org.sat4j.core</artifactId>
		      <version>2.3.1</version>
		    </dependency>
		  </dependencies>
		</project>
		'''
	} 
	static def String getApp(){
		'''
		package org.xtext.example.mydsl.sat;
		
		import java.io.IOException;
		import java.io.PrintWriter;
		import java.io.FileNotFoundException;
		import org.sat4j.minisat.SolverFactory;
		import org.sat4j.reader.DimacsReader;
		import org.sat4j.reader.ParseFormatException;
		import org.sat4j.reader.Reader;
		import org.sat4j.specs.ContradictionException;
		import org.sat4j.specs.IProblem;
		import org.sat4j.specs.ISolver;
		import org.sat4j.specs.TimeoutException;

		public class App 
		{
		    public static void main( String[] args )
		    {
		        ISolver solver = SolverFactory.newDefault();
                solver.setTimeout(3600); // 1 hour timeout
				Reader reader = new DimacsReader(solver);
                PrintWriter out = new PrintWriter(System.out,true);
                // CNF filename is given on the command line 
                try {
                    IProblem problem = reader.parseInstance("./formula.dimacs");
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
                    System.out.println("Unsatisfiable !");
                } catch (TimeoutException e) {
                    System.out.println("Timeout, sorry!");      
                }
		    }
		}
		'''
	}
	
	override benchmark(String filename) {
		// maybe review the benchmark
		Sat4JCompiler.compile(filename)
		var line = ""
		val start = System.nanoTime()
		var process = Runtime.getRuntime().exec("mvn exec:java -f org.xtext.example.mydsl.sat.compiledsat4j")
		val delta = System.nanoTime() - start;
		
		val output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		while((line = output.readLine()) !== null){
			if(line.equals("Satisfiable !")) return new Pair(true, delta)
		}
		return new Pair(false, delta)
	}
	
	override toString(){
		"sat4j-maven,v2.3.1,0.0"
	} 
}