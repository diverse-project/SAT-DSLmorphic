package org.xtext.example.msat.GJ_MC_Process

import java.io.BufferedReader
import java.io.InputStreamReader

class CryptoMiniSatSolver implements Benchmarkable{
	
	static def solve(String file){
		val process = Runtime.getRuntime().exec("cryptominisat --verb 0 "+file)
		val output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		var line = ""
		while((line = output.readLine()) !== null){
			if(line.equals("s SATISFIABLE")) return true
		}
		return false
	}
	
	override benchmark(String file){
		val start = System.nanoTime()
		val process = Runtime.getRuntime().exec("cryptominisat --verb 0 "+file)
		val delta = System.nanoTime() - start;
		val output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		var line = ""
		while((line = output.readLine()) !== null){
			if(line.equals("s SATISFIABLE")) return new Pair<Boolean, Long>(true, delta)
		}
		return new Pair<Boolean, Long>(false, delta)
	}
	
	override toString(){
		"CryptoMiniSat,v3.3,0.0"
	} 
}