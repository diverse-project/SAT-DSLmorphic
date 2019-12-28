package org.xtext.example.msat.GJ_MC_Process

import java.io.BufferedReader
import java.io.InputStreamReader
import org.eclipse.emf.ecore.EObject

class StandaloneInterpreter {
	static def jarCallSat4j(String filename, EObject e){
		var line = ""
		var commandline = ""
		if(e === null){
			commandline = "java -jar ../lib/org.sat4j.core-2.3.1.jar "+filename
		} else {
			var sat4jFilename = "formula.sat4j"
			SATUtils.writeSat4jFile(sat4jFilename, e)
			commandline = "java -jar ../lib/org.sat4j.core-2.3.1.jar "+sat4jFilename
		}
		
		var process = Runtime.getRuntime().exec(commandline)
		val output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		while((line = output.readLine()) !== null){
			if(line.equals("s SATISFIABLE")) return true
		}
		
		return false
	}
}