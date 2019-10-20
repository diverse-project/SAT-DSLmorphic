package org.xtext.example.mydsl.GJ_MC_Process

import java.io.BufferedWriter
import java.io.FileWriter
import org.eclipse.emf.ecore.EObject

class StandaloneInterpreter {
	static def jarCallSat4j(String filename, EObject e){
		var sat4jFilename = filename+".sat4j"
		
		writeSat4jFile(sat4jFilename, e)
		
		var commandline = "java -jar org.sat4j.core.jar "+sat4jFilename
		
		Runtime.getRuntime().exec(commandline)
		
		return true;
	}
	
	static def writeSat4jFile(String filename, EObject e){
		val writer = new BufferedWriter(new FileWriter(filename));
    	writer.write(DIMACSPrinter.dimacsFile(e));
    	writer.close();
	}
}