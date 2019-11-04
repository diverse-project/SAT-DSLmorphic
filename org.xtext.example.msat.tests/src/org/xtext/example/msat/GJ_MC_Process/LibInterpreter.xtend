package org.xtext.example.msat.GJ_MC_Process

import java.io.FileNotFoundException
import java.io.IOException
import java.io.PrintWriter
import java.util.concurrent.TimeoutException
import org.sat4j.minisat.SolverFactory
import org.sat4j.reader.DimacsReader
import org.sat4j.reader.ParseFormatException
import org.sat4j.specs.ContradictionException

class LibInterpreter {
	
	static def interpret(String filename){
		
		var solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        var reader = new DimacsReader(solver);
        var out = new PrintWriter(System.out,true);
        // CNF filename is given on the command line 
        try {
            var problem = reader.parseInstance(filename);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(),out);
            } else {
                System.out.println("Unsatisfiable !");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
            return false
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
            return false
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace()
            return false
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable !");
            return false
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");
            return false      
        }
		
		return true;
	}
}