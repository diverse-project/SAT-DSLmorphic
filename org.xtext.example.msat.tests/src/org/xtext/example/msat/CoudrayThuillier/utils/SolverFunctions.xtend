package org.xtext.example.msat.CoudrayThuillier.utils

import org.xtext.example.mydsl1.mSat.util.MSatSwitch
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT
import org.xtext.example.mydsl1.mSat.MiniSAT
import org.xtext.example.mydsl1.mSat.Sat4J

class SolverFunctions {

	static class SolverName extends MSatSwitch<String> {
		
		override String caseCryptoMiniSAT (CryptoMiniSAT e) {
			return e.variant
		}
		
		override String caseMiniSAT (MiniSAT e) {
			return e.variant + " rnd-freq=" + e.parameter.rndfreq
		}
		
		override String caseSat4J (Sat4J e) {
			return e.variant.getName()
		}
		
	}
	
	static class SolvingBenchmark extends MSatSwitch<Boolean> {
		String temp_dimacs_path = "temp.dimacs"
		String maven_dimacs_path = "../coudraythuillier/file.dimacs"
		
		String dimacs
				
		String solver_version
		boolean is_dimacs_a_formulae
		
		def void set_solver_version (String solver_version) {
			this.solver_version = solver_version
		}
		
		def void set_is_dimacs_a_formulae (boolean is_dimacs_a_formulae) {
			this.is_dimacs_a_formulae = is_dimacs_a_formulae
		}
		
		def void set_dimacs (String dimacs) {
			this.dimacs = dimacs
		}
		
		override Boolean caseCryptoMiniSAT (CryptoMiniSAT e) {
			var path = dimacs
			if (is_dimacs_a_formulae) {
				IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
				path = temp_dimacs_path
			}
			val output = Utils.execute_command("cryptominisat5 " + path)
			return Utils.is_in_output(output, "\ns SATISFIABLE\n")
		}
		
		override Boolean caseMiniSAT (MiniSAT e) {
			var path = dimacs
			if (is_dimacs_a_formulae) {
				IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
				path = temp_dimacs_path
			}
			val output = Utils.execute_command("minisat -rnd-freq=" + e.getParameter.rndfreq + " " + path)
			return Utils.is_in_output(output, "\nSATISFIABLE")
		}
		
		override Boolean caseSat4J (Sat4J e) {
			var path = dimacs
			switch (e.variant) {
				case SAT4J_JAVA : {
					if (is_dimacs_a_formulae) {
						IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
						path = temp_dimacs_path
					}
					return Sat4jFunctions.solve_java(path)
				}
				case SAT4J_JAR : {
					if (is_dimacs_a_formulae) {
						IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
						path = temp_dimacs_path
					}
					return Sat4jFunctions.solve_jar(solver_version, path)
				}
				case SAT4J_COMP : {
					if (is_dimacs_a_formulae) {
						IEDimacs.export_dimacs(maven_dimacs_path, dimacs)
						path = temp_dimacs_path
					}
					return Sat4jFunctions.solve_maven(solver_version, path)
				}
			}
			println("Unknown Sat4J Variant.")
			return false
		}
	}
	
}
