package org.xtext.example.mydsl.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.Model

class Sat4jLauncher {
	
	static def launch(EObject e){
		val model = (e as Model)
		
		switch(model.solver){
			case model.solver == SAT4J_JAVA : if (model.file === null){
												  SATUtils.writeSat4jFile("formula.dimacs",model.expression)
												  LibInterpreter.interpret("formula.dimacs")											  	
											  } else {
											  	LibInterpreter.interpret(model.file.path)
											  }
			case model.solver == SAT4J_JAR  : StandaloneInterpreter.jarCallSat4j(model.file===null?"":model.file.path, model.expression)
			case model.solver == SAT4J_COMP : if (model.file === null){
												  SATUtils.writeSat4jFile("formula.dimacs",model.expression)
												  Sat4JCompiler.compile("formula.dimacs")											  	
											  } else {
											  	Sat4JCompiler.compile(model.file.path)
											  }
		}
		
	}
	
}