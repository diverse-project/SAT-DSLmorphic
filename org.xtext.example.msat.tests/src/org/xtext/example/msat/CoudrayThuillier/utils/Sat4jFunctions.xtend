package org.xtext.example.msat.CoudrayThuillier.utils

import org.sat4j.specs.TimeoutException
import org.sat4j.specs.ContradictionException
import java.io.IOException
import org.sat4j.reader.ParseFormatException
import java.io.FileNotFoundException
import org.sat4j.specs.IProblem
import org.sat4j.reader.DimacsReader
import org.sat4j.minisat.SolverFactory
import org.sat4j.specs.ISolver
import java.util.List

class Sat4jFunctions {

		static List<String> avalaible_sat4j_version = newArrayList("2.0.0", "2.3.1", "2.3.4")

		static def boolean solve_java(String dimacs) {
			var ISolver solver = SolverFactory.newDefault()
			solver.setTimeout(3600) // 1 hour timeout
			var reader = new DimacsReader(solver)
			try {
				var IProblem problem = reader.parseInstance(dimacs)
				problem.isSatisfiable
				return problem.isSatisfiable
			} catch (FileNotFoundException e0) {
				println("ErrorFile")
			} catch (ParseFormatException e0) {
				println("ErrorFormat")
			} catch (IOException e0) {
				println("ErrorIO")
			} catch (ContradictionException e0) {
				println("Unsatisfiable (trivial).")
			} catch (TimeoutException e0) {
				println("Timeout.")
			}
			return false
		}

		static def boolean solve_jar(String version, String dimacs) {
			var output = ""
			if (avalaible_sat4j_version.contains(version)) {
				output = Utils.execute_command("java -jar ../lib/org.sat4j.core-" + version + ".jar " + dimacs)
			} else {
				output = Utils.execute_command("java -jar ../lib/org.sat4j.core-2.3.1.jar " + dimacs)
			}
			// Parse the outputs
			return Utils.is_in_output(output, "s SATISFIABLE\n")
		}

		static def boolean solve_maven(String version, String dimacs) {
			// Compute absolute dimacs filepath
			var filepath = Utils.execute_command("readlink -f " + dimacs).replace("\n", "")
			// Write App.java file with corresponding dimacs filepath
			if (avalaible_sat4j_version.contains(version)) {
				IEDimacs.export_dimacs(MavenFile.pom_path, MavenFile.getPom(version))
			} else {
				IEDimacs.export_dimacs(MavenFile.pom_path, MavenFile.getPom("2.3.1"))
			}
			IEDimacs.export_dimacs(MavenFile.app_path, MavenFile.getApp(filepath))
			// Execute maven on this project
			Utils.execute_command("mvn -f " + MavenFile.pom_path + " package")
			var output = Utils.execute_command("mvn -f " + MavenFile.pom_path +" exec:java")
			// Parse the outputs
			return Utils.is_in_output(output, "Satisfiable: true")
		}
		
		static class MavenFile {
			static String pom_path = "../coudraythuillier/pom.xml"
			static String app_path = "../coudraythuillier/src/main/java/org/xtext/example/msat/coudraythuillier/App.java"
			
			def static String getApp (String filepath) {
				return "package org.xtext.example.msat.coudraythuillier;

import java.io.FileNotFoundException;
import java.io.IOException;
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
	static String dimacs_path = \"" + filepath + "\";
	
    public static void main(String[] args)
    {
    	ISolver solver = SolverFactory.newDefault();
		solver.setTimeout(3600); // 1 hour timeout
		Reader reader = new DimacsReader(solver);
		try {
			IProblem problem = reader.parseInstance(dimacs_path);
			System.out.println(\"Satisfiable: \" + problem.isSatisfiable());
		} catch (FileNotFoundException e0) {
			System.out.println(\"ErrorFile\");
		} catch (ParseFormatException e0) {
			System.out.println(\"ErrorFormat\");
		} catch (IOException e0) {
			System.out.println(\"ErrorIO\");
		} catch (ContradictionException e0) {
			System.out.println(\"Unsatisfiable (trivial).\");
		} catch (TimeoutException e0) {
			System.out.println(\"Timeout.\");
		}
    }
}"
			}
			
			def static String getPom (String sat4j_version) {
				return "
<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"
  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.xtext.example.msat</groupId>
  <artifactId>coudraythuillier</artifactId>
  <packaging>jar</packaging>
  <version>0.0.1-SNAPSHOT</version>
  <name>Maven Quick Start Archetype</name>
  <url>http://maven.apache.org</url>
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
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
        <version>" + sat4j_version + "</version>
    </dependency>
  </dependencies>
  <build>
      <pluginManagement>
      <plugins>
          <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-jar-plugin</artifactId>
              <version>3.0.2</version>
              <configuration>
                  <archive>
                      <manifest>
                          <mainClass>org.xtext.example.msat.coudraythuillier.App</mainClass>
                      </manifest>
                  </archive>
              </configuration>
          </plugin>
		<plugin>
		    <groupId>org.apache.maven.plugins</groupId>
		    <artifactId>maven-compiler-plugin</artifactId>
		    <version>3.5.1</version>
		    <configuration>
		        <source>1.8</source>
		        <target>1.8</target>
		    </configuration>
		</plugin>
        <plugin>
		    <groupId>org.codehaus.mojo</groupId>
		    <artifactId>exec-maven-plugin</artifactId>
		    <version>1.2.1</version>
		    <executions>
		      <execution>
		        <goals>
		          <goal>exec</goal>
		        </goals>
		      </execution>
		    </executions>
		    <configuration>
		      <executable>java</executable>
		      <includeProjectDependencies>true</includeProjectDependencies>
		      <includePluginDependencies>true</includePluginDependencies>
		      <classpathScope>compile</classpathScope>
		      <mainClass>org.xtext.example.msat.coudraythuillier.App</mainClass>
		    </configuration>
		</plugin>
    </plugins>
   </pluginManagement>
  </build>
</project>
"
			}
		}
}