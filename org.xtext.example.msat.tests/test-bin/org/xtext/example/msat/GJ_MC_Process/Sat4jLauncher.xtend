package org.xtext.example.msat.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT
import org.xtext.example.mydsl1.mSat.MiniSAT
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.Sat4J

class Sat4jLauncher {
	
	static def launch(EObject e){
		val model = (e as SATMorphic)
		val solversList = model.solvers
		
		for(solver : solversList){
			switch(solver){
				
				case solver == Sat4J && solver.variant == SAT4J_JAVA :
					//TODO change files & formulas
					if (model.benchmark === BenchmarkFormula){
						SATUtils.writeSat4jFile("formula.dimacs",model.expression)
						LibInterpreter.interpret("formula.dimacs")											  	
					} else { //model.benchmark === BenchmarkDimacs
					  	LibInterpreter.interpret(model.file.path)
					}
				case solver == Sat4J && solver.variant == SAT4J_JAR : 
					//TODO change files
					StandaloneInterpreter.jarCallSat4j(model.file===null?"":model.file.path, model.expression)
					
				case solver == Sat4J && solver.variant == SAT4J_COMP :
					//TODO change files & formulas
					if (model.file === null){
						SATUtils.writeSat4jFile("formula.dimacs",model.expression)
						Sat4JCompiler.compile("formula.dimacs")											  	
					} else {
					  	Sat4JCompiler.compile(model.file.path)
					}
				//TODO
				case solver == CryptoMiniSAT : null
				//TODO
				case solver == MiniSAT : null
			}
		}
		
	}
	
}