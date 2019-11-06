package org.xtext.example.msat.CoudrayThuillier.utils

import org.xtext.example.mydsl1.mSat.util.MSatSwitch
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT
import org.xtext.example.mydsl1.mSat.MiniSAT
import org.xtext.example.mydsl1.mSat.Sat4J

class SolverFunctions {

	static class SolverName extends MSatSwitch<String> {
		
		override String caseCryptoMiniSAT (CryptoMiniSAT e) {
			return "CryptoMiniSAT"
		}
		
		override String caseMiniSAT (MiniSAT e) {
			return "MiniSAT"
		}
		
		override String caseSat4J (Sat4J e) {
			return e.variant.getName()
		}
		
	}
	
	static class SolvingBenchmarkFormula extends MSatSwitch<Boolean> {		
		String temp_dimacs_path = "temp.dimacs"
		String maven_dimacs_path = "../coudraythuillier/file.dimacs"
		
		String dimacs
		def void set_dimacs (String dimacs) {
			this.dimacs = dimacs
		}
		
		override Boolean caseCryptoMiniSAT (CryptoMiniSAT e) {
			println("Not Implemented yet")
			return null
		}
		
		override Boolean caseMiniSAT (MiniSAT e) {
			println("Not Implemented yet")
			return true
		}
		
		override Boolean caseSat4J (Sat4J e) {
			switch (e.variant) {
				case SAT4J_JAVA : {
					IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
					return Sat4jFunctions.solve_java(temp_dimacs_path)
				}
				case SAT4J_JAR : {
					IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
					return Sat4jFunctions.solve_jar(temp_dimacs_path)
				}
				case SAT4J_COMP : {
					IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
					return Sat4jFunctions.solve_maven(maven_dimacs_path)
				}
			}
			println("Unknown Sat4J Variant.")
			return false
		}
	}
	
	static class SolvingBenchmarkDimacs extends MSatSwitch<Boolean> {		
		String dimacs_path
		def void set_dimacs_path (String dimacs_path) {
			this.dimacs_path = dimacs_path
		}
		
		override Boolean caseCryptoMiniSAT (CryptoMiniSAT e) {
			println("Not Implemented yet")
			return null
		}
		
		override Boolean caseMiniSAT (MiniSAT e) {
			println("Not Implemented yet")
			return true
		}
		
		override Boolean caseSat4J (Sat4J e) {
			switch (e.variant) {
				case SAT4J_JAVA : {
					return Sat4jFunctions.solve_java(dimacs_path)
				}
				case SAT4J_JAR : {
					return Sat4jFunctions.solve_jar(dimacs_path)
				}
				case SAT4J_COMP : {
					return Sat4jFunctions.solve_maven(dimacs_path)
				}
			}
			println("Unknown Sat4J Variant.")
			return false
		}
	}
	
}
