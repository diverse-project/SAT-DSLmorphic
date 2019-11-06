package org.xtext.example.mydsl.GJ_MC_Process

import org.eclipse.emf.ecore.EObject

class StandaloneInterpreter {
	static def jarCallSat4j(String filename, EObject e){
		var commandline = ""
		if(e === null){
			commandline = "java -jar org.sat4j.core.jar "+filename
		} else {
			var sat4jFilename = "formula.sat4j"
		
			SATUtils.writeSat4jFile(sat4jFilename, e)
			commandline = "java -jar org.sat4j.core.jar "+sat4jFilename
		}
		
		var process = Runtime.getRuntime().exec(commandline)
		
		return process.outputStream
	}
}