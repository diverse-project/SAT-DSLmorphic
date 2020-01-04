package org.xtext.example.msat.CoudrayThuillier.utils

import org.xtext.example.mydsl1.mSat.util.MSatSwitch
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT
import org.xtext.example.mydsl1.mSat.MiniSAT
import org.xtext.example.mydsl1.mSat.Sat4J
import java.util.List
import java.util.ArrayList

class SolverFunctions {

	static class Version extends MSatSwitch<String> {

		static List<String> sat4j_version = newArrayList("2.0.0", "2.0.4", "2.2.3", "2.3.1")
		static String sat4j_default = "2.3.1"

		// static List<String> cryptominisat_version = newArrayList("5.7.8")
		static String cryptominisat_default = "5.7.8"

		// static List<String> minisat_version = newArrayList("2.2.0")
		static String minisat_default = "2.2.0"

		String version

		def void set_version(String version) {
			this.version = version
		}

		override String caseCryptoMiniSAT(CryptoMiniSAT e) {
			return cryptominisat_default
		}

		override String caseMiniSAT(MiniSAT e) {
			return minisat_default
		}

		override String caseSat4J(Sat4J e) {
			if (e.variant.getName() == "SAT4J_JAVA" || !sat4j_version.contains(version)) {
				return sat4j_default
			}
			return version
		}
	}

	static class SolverName extends MSatSwitch<String> {

		override String caseCryptoMiniSAT(CryptoMiniSAT e) {
			return e.variant
		}

		override String caseMiniSAT(MiniSAT e) {
			return e.variant + " rnd-freq=" + e.parameter.rndfreq
		}

		override String caseSat4J(Sat4J e) {
			return e.variant.getName()
		}
	}

	static class SolvingBenchmark extends MSatSwitch<SolverResult> {
		String temp_dimacs_path = "temp.dimacs"
		String maven_dimacs_path = "../coudraythuillier/file.dimacs"

		String dimacs

		String solver_name
		String solver_version
		boolean is_dimacs_a_formulae
		int nb_of_repetition = 1

		def void set_solver(String solver_name, String solver_version) {
			this.solver_name = solver_name
			this.solver_version = solver_version
		}

		def void set_is_dimacs_a_formulae(boolean is_dimacs_a_formulae) {
			this.is_dimacs_a_formulae = is_dimacs_a_formulae
		}

		def void set_dimacs(String dimacs) {
			this.dimacs = dimacs
		}

		def void set_repetition(int nb_of_repetition) {
			this.nb_of_repetition = nb_of_repetition
		}

		override SolverResult caseCryptoMiniSAT(CryptoMiniSAT e) {
			var path = dimacs
			if (is_dimacs_a_formulae) {
				IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
				path = temp_dimacs_path
			}

			var times = new ArrayList
			var ans = true
			for (var i = 0; i < nb_of_repetition; i++) {
				var timer = System.currentTimeMillis
				val output = Utils.execute_command("cryptominisat5 " + path + " | grep SATISFIABLE")
				timer = System.currentTimeMillis - timer
				ans = ans && Utils.is_in_output(output, "s SATISFIABLE")
				times.add(timer)
			}

			if (is_dimacs_a_formulae)
				return new SolverResult("lambda formulae", solver_name, solver_version, ans, Utils.mean(times),
					Utils.standard_deviation(times))
			else
				return new SolverResult(dimacs, solver_name, solver_version, ans, Utils.mean(times),
					Utils.standard_deviation(times))
		}

		override SolverResult caseMiniSAT(MiniSAT e) {
			var path = dimacs
			if (is_dimacs_a_formulae) {
				IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
				path = temp_dimacs_path
			}
			var times = new ArrayList
			var ans = true
			for (var i = 0; i < nb_of_repetition; i++) {
				var timer = System.currentTimeMillis
				val output = Utils.execute_command("minisat -rnd-freq=" + e.getParameter.rndfreq + " " + path + " | grep SATISFIABLE")
				timer = System.currentTimeMillis - timer
				ans = ans && !Utils.is_in_output(output, "UNSATISFIABLE")
				times.add(timer)
			}

			if (is_dimacs_a_formulae)
				return new SolverResult("lambda formulae", solver_name, solver_version, ans, Utils.mean(times),
					Utils.standard_deviation(times))
			else
				return new SolverResult(dimacs, solver_name, solver_version, ans, Utils.mean(times),
					Utils.standard_deviation(times))

		}

		override SolverResult caseSat4J(Sat4J e) {
			var path = dimacs
			switch (e.variant) {
				case SAT4J_JAVA: {
					if (is_dimacs_a_formulae) {
						IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
						path = temp_dimacs_path
					}
					var ans = Sat4jFunctions.solve_java(nb_of_repetition, path)
					if (is_dimacs_a_formulae)
						ans.set_infos("lambda formulae", solver_name, solver_version)
					else
						ans.set_infos(dimacs, solver_name, solver_version)
					return ans
				}
				case SAT4J_JAR: {
					if (is_dimacs_a_formulae) {
						IEDimacs.export_dimacs(temp_dimacs_path, dimacs)
						path = temp_dimacs_path
					}
					var ans = Sat4jFunctions.solve_jar(nb_of_repetition, solver_version, path)
					if (is_dimacs_a_formulae)
						ans.set_infos("lambda formulae", solver_name, solver_version)
					else
						ans.set_infos(dimacs, solver_name, solver_version)
					return ans
				}
				case SAT4J_COMP: {
					if (is_dimacs_a_formulae) {
						IEDimacs.export_dimacs(maven_dimacs_path, dimacs)
						path = temp_dimacs_path
					}
					var ans = Sat4jFunctions.solve_maven(nb_of_repetition, solver_version, path)
					if (is_dimacs_a_formulae)
						ans.set_infos("lambda formulae", solver_name, solver_version)
					else
						ans.set_infos(dimacs, solver_name, solver_version)
					return ans
				}
			}
			println("Unknown Sat4J Variant.")
			return new SolverResult("ERROR", "ERROR", "ERROR", false, -1.0 as long, -1.0 as long)
		}
	}
}
