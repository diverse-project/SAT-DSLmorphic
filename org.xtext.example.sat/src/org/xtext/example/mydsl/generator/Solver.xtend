package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.sat.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.File
import java.io.PrintStream
import java.util.regex.Pattern
import java.util.regex.Matcher
import org.sat4j.specs.ISolver
import org.sat4j.minisat.SolverFactory
import org.sat4j.reader.Reader
import org.sat4j.reader.DimacsReader
import java.io.PrintWriter
import org.sat4j.specs.IProblem
import java.io.FileNotFoundException
import org.sat4j.reader.ParseFormatException
import java.io.IOException
import org.sat4j.specs.ContradictionException
import org.sat4j.specs.TimeoutException

class Solver {
	
	static def String executeCommand(String command) {
	    var StringBuffer output = new StringBuffer();
	    var Process p;
	    try {
	        p = Runtime.getRuntime().exec(command);
	        p.waitFor();
	        var BufferedReader reader = 
	                        new BufferedReader(new InputStreamReader(p.getInputStream()));
	        var String line = "";           
	        while ((line = reader.readLine()) !== null) {
	            output.append(line + "\n");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return output.toString();
	}

	static def void Solve_java(Expression e) {
		var ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        var Reader reader = new DimacsReader(solver);
        var PrintWriter out = new PrintWriter(System.out,true);
        try {
            var IProblem problem = reader.parseInstance("");
            reader.decode(problem.model(), out);
        } catch (FileNotFoundException e0) {
            // TODO Auto-generated catch block
        } catch (ParseFormatException e0) {
            // TODO Auto-generated catch block
        } catch (IOException e0) {
            // TODO Auto-generated catch block
        } catch (ContradictionException e0) {
            println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e0) {
            println("Timeout, sorry!");      
        }
	}
	
	static def String Solve_jar(Expression e) {
		var str = DIMACSConverter.toDIMACS(CNFConverter.CNFConvert(e));
		val fout = new PrintStream(new File("/home/yarduoc/ENS_INFO/M1/DSL/dimacs.cnf"))
		fout.println(str)
		fout.close
		var output = executeCommand("java -jar /home/yarduoc/ENS_INFO/M1/DSL/javalibs/org.sat4j.core.jar /home/yarduoc/ENS_INFO/M1/DSL/dimacs.cnf")
		return output;
	}
	
	static def Expression Solve_maven(Expression e) {}

}
