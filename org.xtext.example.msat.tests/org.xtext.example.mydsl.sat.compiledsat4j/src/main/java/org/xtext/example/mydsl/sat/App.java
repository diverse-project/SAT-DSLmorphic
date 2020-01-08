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
