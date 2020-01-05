package org.xtext.example.msat.GJ_MC_Process

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

class LibInterpreter implements Benchmarkable{
	
	static def interpret(String filename) throws TimeoutException,FileNotFoundException,IOException,ParseFormatException{
		
		var ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        var Reader reader = new DimacsReader(solver);
        var out = new PrintWriter(System.out,true);
        // CNF filename is given on the command line 
        try {
            var IProblem problem = reader.parseInstance(filename);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(),out);
                return true
            } else {
                System.out.println("Unsatisfiable !");
                return false
            }
        } catch (FileNotFoundException e) {
            throw e
        } catch (ParseFormatException e) {
            throw e
        } catch (IOException e) {
            throw e
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable !");
            return false
        }
	}
	
	override benchmark(String filename){
		
		var ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        var Reader reader = new DimacsReader(solver);
        var out = new PrintWriter(System.out,true);
        // CNF filename is given on the command line 
        val start = System.nanoTime()
        try {
            var IProblem problem = reader.parseInstance(filename);
            val sat = problem.isSatisfiable()
            if (sat) {
            	val delta = System.nanoTime() - start;
                return new Pair<Boolean, Long>(true, delta)
            } else {
            	val delta = System.nanoTime() - start;
                return new Pair<Boolean, Long>(false, delta)
            }
        } catch (ContradictionException e) {
        	val delta = System.nanoTime() - start;
            return new Pair<Boolean, Long>(false, delta)
        } catch (Exception e) {
            val delta = System.nanoTime() - start;
            return new Pair<Boolean, Long>(null, delta)
        }
	}
	
	override toString(){
		"sat4j-java,v2.3.1,0.0"
	} 
}