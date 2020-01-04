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
import java.util.ArrayList

class Sat4jFunctions {
	static def SolverResult solve_java(int nb_of_repetition, String dimacs) {
		var ISolver solver = SolverFactory.newDefault()
		solver.setTimeout(3600) // 1 hour timeout
		var reader = new DimacsReader(solver)
		try {
			var times = new ArrayList
			var ans = true
			for (var i = 0; i < nb_of_repetition; i++) {
				var timer = System.currentTimeMillis
				var IProblem problem = reader.parseInstance(dimacs)
				timer = System.currentTimeMillis - timer
				ans = ans && problem.isSatisfiable
				times.add(timer)
			}
			return new SolverResult(ans, Utils.mean(times), Utils.standard_deviation(times))
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
		return new SolverResult(false, -1.0 as long, -1.0 as long)
	}

	static def SolverResult solve_jar(int nb_of_repetition, String version, String dimacs) {
		var output = ""
		var version_simplified = version.replace(" ", "")

		var times = new ArrayList
		var ans = true
		for (var i = 0; i < nb_of_repetition; i++) {
			var timer = System.currentTimeMillis
			output = Utils.execute_command("java -jar ../lib/org.sat4j.core-" + version_simplified + ".jar " + dimacs + " | grep SATISFIABLE")
			timer = System.currentTimeMillis - timer
			ans = ans && Utils.is_in_output(output, "s SATISFIABLE")
			times.add(timer)
		}

		// Parse the outputs
		return new SolverResult(ans, Utils.mean(times), Utils.standard_deviation(times))
	}

	static def SolverResult solve_maven(int nb_of_repetition, String version, String dimacs) {
		// Compute absolute dimacs filepath
		var filepath = Utils.execute_command("readlink -f " + dimacs).replace("\n", "")
		// Write App.java file with corresponding dimacs filepath
		IEDimacs.export_dimacs(MavenFile.pom_path, MavenFile.getPom(version))
		IEDimacs.export_dimacs(MavenFile.app_path, MavenFile.getApp(filepath))
		// Execute maven on this project
		Utils.execute_command("mvn -f " + MavenFile.pom_path + " package")

		var times = new ArrayList
		var ans = true
		for (var i = 0; i < nb_of_repetition; i++) {
			var timer = System.currentTimeMillis
			var output = Utils.execute_command("mvn -f " + MavenFile.pom_path + " exec:java | grep Satisfiable")
			timer = System.currentTimeMillis - timer
			ans = ans && Utils.is_in_output(output, "Satisfiable: true")
			times.add(timer)
		}

		// Parse the outputs
		return new SolverResult(ans, Utils.mean(times), Utils.standard_deviation(times))
	}

	static class MavenFile {
		static String pom_path = "../coudraythuillier/pom.xml"
		static String app_path = "../coudraythuillier/src/main/java/org/xtext/example/msat/coudraythuillier/App.java"

		def static String getApp(String filepath) {
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

		def static String getPom(String sat4j_version) {
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
