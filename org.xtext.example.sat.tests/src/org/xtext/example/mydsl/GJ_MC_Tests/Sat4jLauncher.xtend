package org.xtext.example.mydsl.GJ_MC_Tests

import java.io.FileNotFoundException
import java.io.IOException
import java.io.PrintWriter
import org.sat4j.minisat.SolverFactory
import org.sat4j.reader.DimacsReader
import org.sat4j.reader.ParseFormatException
import org.sat4j.reader.Reader
import org.sat4j.specs.ContradictionException
import org.sat4j.specs.IProblem
import org.sat4j.specs.ISolver
import org.sat4j.specs.TimeoutException

class Sat4jLauncher {
	
	static def interpretationSat4j(){
		
		var solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        var reader = new DimacsReader(solver);
        var out = new PrintWriter(System.out,true);
        // CNF filename is given on the command line 
        try {
            var problem = reader.parseInstance("foo.csv");
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(),out);
            } else {
                System.out.println("Unsatisfiable !");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");      
        }
		
		return true;
	}
	
}