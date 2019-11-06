package org.xtext.example.mydsl1.tests.dera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import com.google.common.io.Files;

public class Utils {
	
	
	/**
	 * Function that converts a cnf formula written in our Sat grammar to a Dimacs file
	 * @param object a Model
	 * @return dimacs file content in string
	 */
	public static String dimacsPrinter(EObject object) {
		return dimacsPrinterAux(object) + "0 \n";
	}
	
	public static String dimacsPrinterAux(EObject object) {
		String res = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 1;
		if (object instanceof And) {
			And inst = (And)object;
			res += dimacsPrinterAux(inst.getLeft());
			res += " 0\n";
			res += dimacsPrinterAux(inst.getRight());
		}
		if (object instanceof Or) {
			Or inst = (Or)object;
			res += dimacsPrinterAux(inst.getLeft());
			res += " ";
			res += dimacsPrinterAux(inst.getRight());
		}
		if (object instanceof Not) {
			Not inst = (Not)object;
			res += "-" + dimacsPrinterAux(inst.getExpression());
		}
		if (object instanceof Expression) {
			Expression inst = (Expression)object;
			if (!map.containsKey((inst.getId()))){
				map.put(inst.getId(), count);
				count++;
			}
			res += map.get(inst.getId());
		}	
		String header = "";
		for (String name : map.keySet()) {
			header += "c " + map.get(name)+ " " + name + "\n";
		}
		
		return header + res;
	}

	
	/**
	 * PrettyPrinter of Sat formula
	 * @param ast root of the Ast (a Model)
	 * @return Pretty Printing
	 */
	public static String prettyPrinter(EObject ast) {
		String res = "";
		
		if (ast instanceof And){
			And inst = (And)ast;
			res += "( AND" + prettyPrinter(inst.getLeft()) + prettyPrinter(inst.getRight()) + ")";
		}
		if (ast instanceof BiImpl){
			BiImpl inst = (BiImpl)ast;
			res += "( BIIMPL" + prettyPrinter(inst.getLeft()) + prettyPrinter(inst.getRight()) + ")";
		}
		if (ast instanceof Impl){
			Impl inst = (Impl)ast;
			res += "( IMPL" + prettyPrinter(inst.getLeft()) + prettyPrinter(inst.getRight()) + ")";
		}
		if (ast instanceof Nand){
			Nand inst = (Nand)ast;
			res += "( NAND" + prettyPrinter(inst.getLeft()) + prettyPrinter(inst.getRight()) + ")";
		}
		if (ast instanceof Not){
			Not inst = (Not)ast;
			res += "( NOT"+ prettyPrinter(inst.getExpression()) + ")";
		}
		if (ast instanceof Expression){
			Expression inst = (Expression)ast;
			res += " " + inst.getId() + "=" + inst.getVal();
		}
		if (ast instanceof Or){
			Or inst = (Or)ast;
			res += "( OR" + prettyPrinter(inst.getLeft()) + prettyPrinter(inst.getRight()) + ")";
		}
		
		return res;
	}
	
	/**
	 * Answser to the first point of Milestone4
	 * Converts it to a dimacs format with the method from Milestone 3 then 
	 * write the content in a file and uses the Sat4J methods to say if the
	 * formula is satisfiable or not
	 * @param ast a Model
	 */
	public static void LibrarySolving(String dimacsFileName) {
		try {
			Sat4JLibrarySolver("dimacsFileName");
		} catch (IOException e) {
			System.out.println("File error : creation of" + dimacsFileName);
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Answer to the second point of Milestone4
	 * Converts it to a dimacs format with the method from Milestone 3 then 
	 * write the content in a file and launch a system call to tell about the
	 * satisfiability of the formula using the jar file of Sat4J
	 * @param ast a Model
	 */
	public static void JarSolving(String dimacsFileName) {
		Runtime r = Runtime.getRuntime();
		try {
			Process p = r.exec("java -jar org.sat4j.core-2.3.1.jar" + dimacsFileName);
			p.waitFor();
			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";

			while ((line = b.readLine()) != null) {
			  System.out.println(line);
			}

			b.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Code from Sat4J how to saying if a formula is satisfiable or not
	 * @param dimacsFilename the name of a cnf file
	 * @return <code>true</code> iff satisfiable, <code>false</code> otherwise
	 */
	public static boolean Sat4JLibrarySolver(String dimacsFilename) {
		ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new DimacsReader(solver);
        PrintWriter out = new PrintWriter(System.out,true);
        // CNF filename is given on the command line 
        try {
            IProblem problem = reader.parseInstance(dimacsFilename);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(),out);
                return true;
            } else {
                System.out.println("Unsatisfiable !");
                return false;
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + dimacsFilename + " does not exist.");
        } catch (ParseException e) {
        	System.out.println(e.getMessage());
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");      
        }
	}
	/* Awser of the 3 point of the Milestone 4 
	 * Take an AST and in function of it form make the right computation 
	 * Return the result of the SAT problem.
	 */
	public static void InputHandler(EObject ast) { 
		String dimacsFileContent = "";
		if(ast.benchmark instanceof BenchmarkFormula){
			dimacsFileContent = dimacsPrinter(ast.benchmark);
			
		}
		if (ast instanceof File) {
			dimacsFileContent = ast.benchmark;
		}
		try {
			Files.write(dimacsFileContent.getBytes(), new File("tmp.cnf"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		if(ast.solver == SAT4J_JAVA) { 
			LibrarySolving("tmp.cnf");
		}
		if(ast.solver == SAT4J_JAR) {
			JarSolving("tmp.cnf");
		}
		if(ast.solver.variant == SAT4J_COMP) {
			MavenSolving("tmp.cnf");
		}

	}

}
