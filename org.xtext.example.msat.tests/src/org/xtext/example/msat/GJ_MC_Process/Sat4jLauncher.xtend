package org.xtext.example.msat.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT
import org.xtext.example.mydsl1.mSat.MiniSAT
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.Sat4J

class Sat4jLauncher {
	
	static final String SAT4J_JAVA = "sat4j-java";
	static final String SAT4J_JAR = "sat4j-jar";
	static final String SAT4J_COMP = "sat4j-maven";
	
	static def launch(EObject e){
		val model = (e as SATMorphic)
		val solversList = model.solvers
		
		for(solver : solversList){
			switch(solver){
				
				case solver instanceof Sat4J && (solver as Sat4J).variant == SAT4J_JAVA :
					//TODO change files & formulas
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs", expression)
							LibInterpreter.interpret("formula.dimacs")
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							LibInterpreter.interpret(file)
						}
					}
				case solver instanceof Sat4J && (solver as Sat4J).variant == SAT4J_JAR : 
					//TODO change files
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs", expression)
							StandaloneInterpreter.jarCallSat4j("", expression)
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							StandaloneInterpreter.jarCallSat4j(file, null)
						}
					}
					
				case solver instanceof Sat4J && (solver as Sat4J).variant == SAT4J_COMP :
					//TODO change files & formulas
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs",expression)
							Sat4JCompiler.compile("formula.dimacs")
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							Sat4JCompiler.compile(file)
						}
					}
				//TODO
				//case solver == CryptoMiniSAT : 
				//TODO
				//case solver == MiniSAT : 
			}
		}
		
	}
	
}