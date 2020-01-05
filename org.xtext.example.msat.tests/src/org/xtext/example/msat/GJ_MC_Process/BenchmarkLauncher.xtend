package org.xtext.example.msat.GJ_MC_Process

import java.io.BufferedWriter
import java.io.FileWriter
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.SATSolver
import org.xtext.example.mydsl1.mSat.Sat4J
import org.xtext.example.mydsl1.mSat.impl.CryptoMiniSATImpl
import org.xtext.example.mydsl1.mSat.impl.MiniSATImpl
import org.xtext.example.mydsl1.mSat.impl.Sat4JImpl

class BenchmarkLauncher {
	
	static final String SAT4J_JAVA = "sat4j-java";
	static final String SAT4J_JAR = "sat4j-jar";
	static final String SAT4J_COMP = "sat4j-maven";
	
	 static def String launch(EObject e, int repetition){
	 	val model = (e as SATMorphic)
	 	val solversList = model.solvers
	 	var out = "Problem,Solver,Version,Parameter,Iteration,Time,SAT?\n"
	 	if (model.benchmark instanceof BenchmarkFormula){
	 		val length = (model.benchmark  as BenchmarkFormula).expressions.length
	 		println("0/"+length+" effectué")
	 		var count = 0
	 		for(expression : (model.benchmark  as BenchmarkFormula).expressions){
				SATUtils.writeSat4jFile("formula.dimacs", EcoreUtil2.copy(expression))
				for(solver : solversList){
					val solverImpl = getSolverImpl(solver)
					for(var i = 0; i < repetition; i++){
						val pair = solverImpl.benchmark("formula.dimacs")
						out += PrettyPrinter.prettyPrint(Simplifier.simplify(expression)) + "," + 
							solverImpl + "," + i + "," + pair.value + "," + (pair.key?"SAT":"UNSAT") + "\n"
						//TODO: Process benchmark results
					}
				}
				count++
				println(count+"/"+length+" effectué")
			}
	 	} else {
	 		val length = (model.benchmark  as BenchmarkDimacs).dimacses.length
	 		println("0/"+length+" effectué")
	 		var count = 0
	 		for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
	 			for(solver : solversList){
	 				val solverImpl = getSolverImpl(solver)
					for (var i = 0; i < repetition; i++) {
						val pair = solverImpl.benchmark(file)
						out += file + "," + solverImpl + "," + i + "," + pair.value + "," + (pair.key?"SAT":"UNSAT") + "\n"
						//TODO: Process benchmark results
					}
				}
				count++
			println(count+"/"+length+" effectué")
			val writer = new BufferedWriter(new FileWriter("/home/gwandalf/SAT-DSLmorphic/JOUNEAUX-CAUTE_annexes/"+"benchmarks.csv"));
		    writer.write(out);
		     
		    writer.close();
			}
	 	}
	 	
	 	out
	 }
	 
	 static def Benchmarkable getSolverImpl(SATSolver s){
	 	val impl = s.solver
	 	switch(impl){
	 		case impl instanceof Sat4JImpl: 
	 			switch((impl as Sat4J).variant.literal){
	 				case SAT4J_JAVA: return new LibInterpreter
	 				case SAT4J_JAR: return new StandaloneInterpreter
	 				case SAT4J_COMP: return new Sat4JCompiler
	 			}
	 			
	 		case impl instanceof CryptoMiniSATImpl: 
	 			return new CryptoMiniSatSolver
	 		
	 		case impl instanceof MiniSATImpl:
	 			return new MiniSatSolver(s.version===null?"2.2":s.version.version, (impl as MiniSATImpl).parameter )
	 	}
	 }
}