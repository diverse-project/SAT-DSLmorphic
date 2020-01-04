package org.xtext.example.msat.CoudrayThuillier

import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.SATSolver
import org.xtext.example.mydsl1.mSat.Benchmark
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import java.util.ArrayList
import org.xtext.example.msat.CoudrayThuillier.utils.SolverFunctions.SolverName
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.eclipse.emf.ecore.EObject
import org.xtext.example.msat.CoudrayThuillier.utils.CNFConverter
import org.xtext.example.msat.CoudrayThuillier.utils.DimacsPrint
import org.xtext.example.msat.CoudrayThuillier.utils.SolverFunctions.SolvingBenchmark
import org.xtext.example.msat.CoudrayThuillier.utils.SolverResult
import org.xtext.example.msat.CoudrayThuillier.utils.SolverFunctions.Version
import java.io.PrintStream
import java.io.File

class Solve {

	def static void process_to_CSV(SATMorphic s, String export_file, int nb_of_repetition) {
		var res = process(s, nb_of_repetition)

		var fout = new PrintStream(new File(export_file))
		fout.println(SolverResult.header)
		for (SolverResult solver_result : res) {
			fout.println(solver_result.toString)
		}
		fout.close
	}

	def static ArrayList<SolverResult> process(SATMorphic s) {
		return process(s, 1)
	}

	def static ArrayList<SolverResult> process(SATMorphic s, int nb_of_repetition) {
		var solvers = s.solvers
		var benchmark = s.benchmark

		var res = new ArrayList<SolverResult>
		for (SATSolver solver : solvers) {
			var version = ""
			if (solver.version !== null) {
				version = solver.version.version
			}
			var solver_res = process_benchmark(solver.solver, version, benchmark, nb_of_repetition)
			res.addAll(solver_res)
		}
		return res
	}

	def static ArrayList<SolverResult> process_benchmark(EObject s, String solver_version, Benchmark b,
		int nb_of_repetition) {
		var res = new ArrayList<SolverResult>

		var solver_name = (new SolverName).doSwitch(s)

		var version_switch = new Version()
		version_switch.set_version(solver_version)
		var version = version_switch.doSwitch(s)

		var benchmark_switch = new SolvingBenchmark()
		benchmark_switch.set_solver(solver_name, version)
		benchmark_switch.set_repetition(nb_of_repetition)

		if (b instanceof BenchmarkFormula) {
			var expr = (b as BenchmarkFormula).expressions
			benchmark_switch.set_is_dimacs_a_formulae(true)
			for (var i = 0; i < expr.length; i++) {
				var e = expr.get(i)
				var cnf = CNFConverter.convert_to_CNF(e)
				var dimacs = DimacsPrint.print_dimacs(cnf)
				benchmark_switch.set_dimacs(dimacs)

				res.add(benchmark_switch.doSwitch(s))
			}
		} else {
			benchmark_switch.set_is_dimacs_a_formulae(false)
			var expr = (b as BenchmarkDimacs).dimacses
			for (var i = 0; i < expr.length; i++) {
				var e = expr.get(i)
				benchmark_switch.set_dimacs(e)

				var solver_result = benchmark_switch.doSwitch(s)
				println(solver_result)
				res.add(solver_result)
			}
		}
		return res
	}

}
