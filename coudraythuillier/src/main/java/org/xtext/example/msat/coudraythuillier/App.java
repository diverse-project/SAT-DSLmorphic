package org.xtext.example.msat.coudraythuillier;

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
	static String dimacs_path = "/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/xpose.sk_6_134.cnf";
	
    public static void main(String[] args)
    {
    	ISolver solver = SolverFactory.newDefault();
		solver.setTimeout(3600); // 1 hour timeout
		Reader reader = new DimacsReader(solver);
		try {
			IProblem problem = reader.parseInstance(dimacs_path);
			System.out.println("Satisfiable: " + problem.isSatisfiable());
		} catch (FileNotFoundException e0) {
			System.out.println("ErrorFile");
		} catch (ParseFormatException e0) {
			System.out.println("ErrorFormat");
		} catch (IOException e0) {
			System.out.println("ErrorIO");
		} catch (ContradictionException e0) {
			System.out.println("Unsatisfiable (trivial).");
		} catch (TimeoutException e0) {
			System.out.println("Timeout.");
		}
    }
}
