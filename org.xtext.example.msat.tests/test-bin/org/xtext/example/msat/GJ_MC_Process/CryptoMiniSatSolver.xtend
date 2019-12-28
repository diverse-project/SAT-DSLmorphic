package org.xtext.example.msat.GJ_MC_Process

class CryptoMiniSatSolver {
	
	static def solve(String file){
		Runtime.getRuntime().exec("./cryptominisat5_simple --verb 0 "+file)
	}
	
}