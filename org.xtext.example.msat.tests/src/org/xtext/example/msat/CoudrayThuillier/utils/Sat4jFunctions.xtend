package org.xtext.example.msat.CoudrayThuillier.utils

import java.util.regex.Pattern
import java.io.BufferedReader
import java.io.InputStreamReader
import org.sat4j.specs.TimeoutException
import org.sat4j.specs.ContradictionException
import java.io.IOException
import org.sat4j.reader.ParseFormatException
import java.io.FileNotFoundException
import org.sat4j.specs.IProblem
import org.sat4j.reader.DimacsReader
import org.sat4j.minisat.SolverFactory
import org.sat4j.specs.ISolver

class Sat4jFunctions {

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

		static def String execute_command(String command) {
			var StringBuffer output = new StringBuffer()
			var Process p
			try {
				p = Runtime.getRuntime.exec(command)
				p.waitFor
				var BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
				var String line = ""
				while ((line = reader.readLine) !== null) {
					output.append(line + "\n")
				}
			} catch (Exception e) {
				e.printStackTrace
			}
			return output.toString
		}

		static def boolean solve_jar(String dimacs) {
			var output = execute_command("java -jar ../lib/org.sat4j.core-2.3.1.jar " + dimacs)
			var sat_pattern = Pattern.compile("s SATISFIABLE\n")
			var matcher = sat_pattern.matcher(output)
			return matcher.find
		}

		static def boolean solve_maven(String dimacs) {
			// Compute absolute dimacs filepath
			var filepath = execute_command("readlink -f " + dimacs).replace("\n", "")
			// Write App.java file with corresponding dimacs filepath
			IEDimacs.export_dimacs(MavenFile.app_path, MavenFile.getApp(filepath))
			// Execute maven on this project
			execute_command("mvn -f " + MavenFile.pom_path + " package")
			var output = execute_command("mvn -f " + MavenFile.pom_path +" exec:java")
			// Parse the outputs
			var sat_pattern = Pattern.compile("Satisfiable: true\n")
			var matcher = sat_pattern.matcher(output)
			return matcher.find
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
		}
}