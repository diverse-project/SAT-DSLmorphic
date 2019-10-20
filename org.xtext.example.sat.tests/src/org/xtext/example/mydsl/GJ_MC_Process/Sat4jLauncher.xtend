package org.xtext.example.mydsl.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.Model

class Sat4jLauncher {
	
	static def launch(EObject e){
		val model = (e as Model)
		
		if (model.file === null){
			
		}
		
		switch(model.solver){
			case model.solver == SAT4J_JAVA : if (model.file === null){
												  LibInterpreter.interpret("")											  	
											  } else {
											  	LibInterpreter.interpret("")
											  }
			case model.solver == SAT4J_JAR  : println()
			case model.solver == SAT4J_COMP : Sat4JCompiler.compile("")
		}
		
	}
	
}