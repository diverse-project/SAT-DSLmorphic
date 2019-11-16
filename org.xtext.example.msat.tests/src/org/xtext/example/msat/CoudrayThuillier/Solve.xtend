package org.xtext.example.msat.CoudrayThuillier

import org.xtext.example.mydsl1.mSat.SATMorphic
import java.util.HashMap
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

class Solve {
	
	def static HashMap<String, ArrayList<Boolean>> process (SATMorphic s){
		var solvers = s.solvers
		var benchmark = s.benchmark
		
		var solver_switch = new SolverName
		var res = new HashMap<String, ArrayList<Boolean>>
		for (SATSolver solver : solvers) {
			var solver_name = solver_switch.doSwitch(solver.solver)
			if (!res.containsKey(solver_name)) {
				var version = ""
				if (solver.version !== null) {
					version = solver.version.version
				}
				var solver_res = process_benchmark(solver.solver, version, benchmark)
				res.put(solver_name + ((version != "") ? " " + version : ""), solver_res)
			}
		}
		return res
	}
	
	def static ArrayList<Boolean> process_benchmark (EObject s, String solver_version, Benchmark b) {
		var res = new ArrayList<Boolean>
		var benchmark_switch = new SolvingBenchmark()
		benchmark_switch.set_solver_version(solver_version)
		if (b instanceof BenchmarkFormula) {
			var expr = (b as BenchmarkFormula).expressions
			benchmark_switch.set_is_dimacs_a_formulae(true)
			for (var i = 0; i < expr.length; i++) {
				var e = expr.get(i)
				var cnf = CNFConverter.convert_to_CNF(e)
				var dimacs = DimacsPrint.print_dimacs(cnf)
				benchmark_switch.set_dimacs(dimacs)
				var sat = benchmark_switch.doSwitch(s)
				res.add(sat)
			}
		} else {
			benchmark_switch.set_is_dimacs_a_formulae(false)
			var expr = (b as BenchmarkDimacs).dimacses
			for (var i = 0; i < expr.length; i++) {
				var e = expr.get(i)
				benchmark_switch.set_dimacs(e)
				var sat = benchmark_switch.doSwitch(s)
				res.add(sat)
			}
		}
		return res
	}
	
}