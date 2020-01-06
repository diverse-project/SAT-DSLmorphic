package msat.bailluetbouaziz;

import org.sat4j.specs.ISolver;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.Reader;
import org.sat4j.reader.DimacsReader;
import java.io.PrintWriter;
import org.sat4j.specs.IProblem;

public class App 
{
    public static void main( String[] args )
    {
    	ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new DimacsReader(solver);
        PrintWriter out = new PrintWriter(System.out, true);
        // CNF filename is given on the command line 
        try {
            IProblem problem = reader.parseInstance(args[0]);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(), out);
            } else {
                System.out.println("Unsatisfiable !");
            }
        } catch (Exception e) {
            System.out.println("Oops!");      
        }
        out.close();
    }
}
