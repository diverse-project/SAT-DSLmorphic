package org.xtext.example.msat.theos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

public class SAT4JBIBCall 
{
	public static List<Object> DoIt(String file_dimacs_formula)
	{

			ISolver solver = SolverFactory.newDefault();
	        solver.setTimeout(600); // 1 hour timeout
	        Reader reader = new DimacsReader(solver);
	        float timeElapsed = -1f;
	       // PrintWriter out = new PrintWriter(System.out,true);
			float start = System.currentTimeMillis();
	        try 
	        {
	            IProblem problem = reader.parseInstance(file_dimacs_formula);

	            if (problem.isSatisfiable()) {
	                //System.out.println("Satisfiable !");
	                //reader.decode(problem.model(),out);

	            } else {
	                //System.out.println("Unsatisfiable !");
	            }
	            boolean sat = problem.isSatisfiable();
				float finish = System.currentTimeMillis();
				timeElapsed = finish - start;
				return Arrays.asList(sat, timeElapsed/1000);
	        } catch (FileNotFoundException e) {
	        	System.out.println("file not found");
	            // TODO Auto-generated catch block
	        } catch (ParseFormatException e) {
	        	System.out.println("ParseFormatException");
	            // TODO Auto-generated catch block
	        } catch (IOException e) {
	        	System.out.println("IOExcpetion");
	            // TODO Auto-generated catch block
	        } catch (ContradictionException e) {
				float finish = System.currentTimeMillis();
				timeElapsed = finish - start;
	        	return Arrays.asList(false, timeElapsed);
	        } catch (TimeoutException e) {
	            System.out.println("Timeout, sorry!");      
	        }
	        throw new Error("Error while calling SAT4J java library");
	}
}
