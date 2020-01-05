package org.xtext.example.mydsl1.tests.dera;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

	public static final String PATH_TO_JAR = "../lib/org.sat4j.core-2.3.1.jar";
	public static final String PATH_TO_MVN = "mvn";
	public static final String PATH_TO_CRYPTOMINISATv5_6_8 = "../lib/cryptominisat-5.6.8/build/cryptominisat5";
	public static final String PATH_TO_CRYPTOMINISATv5_6_7 = "../lib/cryptominisat-5.6.7/build/cryptominisat5";
	
	/**
	 * Code from Sat4J how to saying if a formula is satisfiable or not
	 * @param dimacsFilename the name of a cnf file
	 * @return <code>true</code> iff satisfiable, <code>false</code> otherwise
	 */
	public static boolean Sat4JLibrarySolver(String dimacsFilename) {
		ISolver solver = SolverFactory.newDefault();
		solver.setTimeout(3600); // 1 hour timeout
		Reader reader = new DimacsReader(solver);
		PrintWriter out = new PrintWriter(System.out, true);
		// CNF filename is given on the command line 
		try {
			IProblem problem = reader.parseInstance(dimacsFilename);
			return problem.isSatisfiable();
//			if (problem.isSatisfiable()) {
//				System.out.println("Satisfiable !");
//				reader.decode(problem.model(),out);
//				return true;
//			} else {
//				System.out.println("Unsatisfiable !");
//				return false;
//			}
		} catch (FileNotFoundException e) {
			System.out.println("The file " + dimacsFilename + " does not exist.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ContradictionException e) {
			System.out.println("Unsatisfiable (trivial)!");
			return false;
		} catch (TimeoutException e) {
			System.out.println("Timeout, sorry!");      
		} catch (ParseFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();		}
		return false;
	}

	/**
	 * Answer to the second point of Milestone4
	 * Converts it to a dimacs format with the method from Milestone 3 then 
	 * write the content in a file and launch a system call to tell about the
	 * satisfiability of the formula using the jar file of Sat4J
	 * @param ast a Model
	 * @return 
	 */
	public static boolean JarSolving(String dimacsFileName) {
		return Utils.bashCmd("java -jar " + PATH_TO_JAR + " " + dimacsFileName, "s SATISFIABLE");
		
//		Runtime r = Runtime.getRuntime();
//		try {
//			Process p = r.exec("java -jar " + PATH_TO_JAR + " " + dimacsFileName);
//			p.waitFor();
//			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String line = "";
//			System.out.println("JAR SOLVING");
//
//			while ((line = b.readLine()) != null) {
////				System.out.println(line);
//				if (line.startsWith("s SATISFIABLE")) {
//					System.out.println("SATISFIABLE");
//					return true;
//				}
//			}
//
//			b.close();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("NON SATISFIABLE");
//		return false;
	}

	/**
	 * Solver using maven
	 */
	public static boolean MavenSolving(String dimacsFileName) {
		Runtime r = Runtime.getRuntime();
		Process p1;
//		Process p2;
		try {
			p1 = r.exec("mvn package -f " + PATH_TO_MVN);
			p1.waitFor();
//			p2 = r.exec("mvn exec:java -Dexec.args=\"" + dimacsFileName + "\" -f " + PATH_TO_MVN);
			return Utils.bashCmd("mvn exec:java -Dexec.args=\"" + dimacsFileName + "\" -f " + PATH_TO_MVN, "Satisfiable");
//			p2.waitFor();
//			BufferedReader b = new BufferedReader(new InputStreamReader(p2.getInputStream()));
//			String line = "";
//
//			while ((line = b.readLine()) != null) {
//				// Quite dirty code but the garbage collector is our friend :p
////				System.out.println(line);
//				if (line.startsWith("Satisfiable")) {
//					System.out.println("SATISFIABLE");
//					return true;
//				}
//			}
//			b.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		System.out.println("NON SATISFIABLE");
		return false;
	}

	public static boolean CryptoMinisat5_6_8(String dimacsFileName){
		return Utils.bashCmd("./" + PATH_TO_CRYPTOMINISATv5_6_8 + " " + dimacsFileName, "s SATISFIABLE");
//		Runtime r = Runtime.getRuntime();
//		try {
//			Process p = r.exec("./" + PATH_TO_CRYPTOMINISATv5_6_8 + " " + dimacsFileName);
//			p.waitFor();
//			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String line = "";
//			System.out.println("CRYPTOMINISAT v5.6.8");
//
//			while ((line = b.readLine()) != null) {
//				System.out.println(line);
//				if (line.startsWith("s SATISFIABLE")) {
//					System.out.println("SATISFIABLE");
//					return true;
//				}
//			}
//
//			b.close();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("NON SATISFIABLE");
//		return false;
	}
	
	public static boolean CryptoMinisat5_6_7(String dimacsFileName){
		return Utils.bashCmd("./" + PATH_TO_CRYPTOMINISATv5_6_7 + " " + dimacsFileName, "s SATISFIABLE");
//		Runtime r = Runtime.getRuntime();
//		try {
//			Process p = r.exec("./" + PATH_TO_CRYPTOMINISATv5_6_7 + " " + dimacsFileName);
//			p.waitFor();
//			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String line = "";
//			System.out.println("CRYPTOMINISAT v5.6.8");
//
//			while ((line = b.readLine()) != null) {
//				System.out.println(line);
//				if (line.startsWith("s SATISFIABLE")) {
//					System.out.println("SATISFIABLE");
//					return true;
//				}
//			}
//
//			b.close();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("NON SATISFIABLE");
//		return false;
	}
	
}
