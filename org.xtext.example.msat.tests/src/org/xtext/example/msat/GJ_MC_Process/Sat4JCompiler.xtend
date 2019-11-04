package org.xtext.example.msat.GJ_MC_Process

import java.io.PrintWriter

class Sat4JCompiler {
	
	static def compile(String file){
		val process = Runtime.getRuntime().exec("ls ~/org.xtext.example.mydsl.sat.compiledsat4j");
		val code = process.waitFor
		if(code != 0){
			createMavenProject
			val app = getApp
			val pom = getPom
			val appWriter = new PrintWriter("~/org.xtext.example.mydsl.sat.compiledsat4j/src/main/java/org/xtext/example/mydsl/sat/App.java", "UTF-8");
			appWriter.print(app);
			val pomWriter = new PrintWriter("~/org.xtext.example.mydsl.sat.compiledsat4j/pom.xml", "UTF-8");
			pomWriter.print(pom);
		}
		Runtime.getRuntime().exec("cp " + file + " ~/org.xtext.example.mydsl.sat.compiledsat4j/formula.dimacs");
	}
	
	static def void createMavenProject(){
		Runtime.getRuntime().exec("cd ~");
		val cmd = "mvn -B archetype:generate " + 
				  "-DgroupId=org.xtext.example.mydsl.sat " + 
				  "-DartifactId=org.xtext.example.mydsl.sat.compiledsat4j " +
				  "-DarchetypeGroupId=org.apache.maven.archetypes "
		Runtime.getRuntime().exec(cmd);
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
		
		import org.sat4j.minisat.SolverFactory
		import org.sat4j.reader.DimacsReader
		import org.sat4j.reader.ParseFormatException
		import org.sat4j.specs.ContradictionException
		import org.sat4j.specs.TimeoutException

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
                    IProblem problem = reader.parseInstance("~/org.xtext.example.mydsl.sat.compiledsat4j/formula.dimacs");
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
	
}