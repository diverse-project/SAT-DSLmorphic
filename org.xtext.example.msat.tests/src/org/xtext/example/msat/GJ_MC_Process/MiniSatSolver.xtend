package org.xtext.example.msat.GJ_MC_Process

import java.io.BufferedReader
import java.io.InputStreamReader
import org.xtext.example.mydsl1.mSat.MiniSATParameter

class MiniSatSolver implements Benchmarkable{
	
	var version = "2.2"
	var proba = 0.0
	
	new(String version, MiniSATParameter param){
		this.version = version
		if(param!==null){
			this.proba = param.rndfreq
		}
	}
	
	static def solve(String file, String version, float proba){
		var Process process = null
		if(version.equals("1.4")){
			process = Runtime.getRuntime().exec("minisat-" + version + " " + file)
		} else {
			process = Runtime.getRuntime().exec("minisat-" + version + " -rnd-freq=" + proba + " " + file)
		}
		val output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		var line = ""
		while((line = output.readLine()) !== null){
			if(line.equals("SATISFIABLE")) return true
		}
		return false
	}
	
	override benchmark(String file){
		var delta = 0L
		var Process process = null
		if(this.version == "1.4"){
			val start = System.nanoTime()
			process = Runtime.getRuntime().exec("minisat-" + this.version + " " + file)
			delta = System.nanoTime() - start;
		} else {
			val start = System.nanoTime()
			process = Runtime.getRuntime().exec("minisat-" + this.version + " -rnd-freq=" + this.proba + " " + file)
			delta = System.nanoTime() - start;
		}
		val output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		var line = ""
		while((line = output.readLine()) !== null){
			if(line.equals("SATISFIABLE")) return new Pair<Boolean, Long>(true, delta)
		}
		return new Pair<Boolean, Long>(false, delta)
	}
	override toString(){
		"minisat,v" + this.version + "," + this.proba
	} 
}