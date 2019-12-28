package org.xtext.example.msat.GJ_MC_Process

class MiniSatSolver {
	
	static def solve(String file){
		Runtime.getRuntime().exec("minisat "+file)
	}
}