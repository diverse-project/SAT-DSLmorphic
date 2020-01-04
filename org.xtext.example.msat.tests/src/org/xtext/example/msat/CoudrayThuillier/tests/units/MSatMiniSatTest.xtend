package org.xtext.example.msat.CoudrayThuillier.tests.units

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.msat.CoudrayThuillier.Solve
import org.junit.jupiter.api.Assertions
import org.xtext.example.msat.CoudrayThuillier.utils.IEDimacs
import org.xtext.example.msat.CoudrayThuillier.utils.SolverResult

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatMiniSatTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper

	@Test
	def void ProcessingModel1() {
		val result = parseHelper.parse('''
			solver minisat rnd-freq 0.2 minisat rnd-freq 1 benchmarkFormula A, A v B, A ^ !A
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			println("--- Solver " + s.solver + " ---")
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT UNSAT SAT SAT UNSAT ]")
	}

	@Test
	def void ProcessingModel2() {
		val result = parseHelper.parse('''
			solver minisat rnd-freq 1 sat4j-jar cryptominisat benchmarkFormula A
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			println("--- Solver " + s.solver + " ---")
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT SAT ]")
	}

	@Test
	def void ProcessingModel3() {
		val result = parseHelper.parse('''
			solver cryptominisat minisat rnd-freq 0.5 benchmarkFormula A, A => B
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			println("--- Solver " + s.solver + " ---")
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT SAT SAT ]")
	}

	@Test
	def void ProcessingModel4() {
		val dimacs = "p cnf 2 2
1 0
2 -1 0" // -> A ^ (B v !A)
		IEDimacs.export_dimacs("temp.dimacs", dimacs)
		val result = parseHelper.parse('''
			solver minisat rnd-freq 0.1 benchmarkDIMACS "temp.dimacs"
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			println("--- Solver " + s.solver + " ---")
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT ]")
	}

	@Test
	def void ProcessingModel5() {
		var dimacs = "p cnf 2 2
1 0
2 -1 0" // -> A ^ (B v !A)
		IEDimacs.export_dimacs("temp1.dimacs", dimacs)
		dimacs = "p cnf 1 1
1 0" // -> A
		IEDimacs.export_dimacs("temp2.dimacs", dimacs)
		val result = parseHelper.parse('''
			solver minisat rnd-freq 0.5 cryptominisat benchmarkDIMACS "temp1.dimacs", "temp2.dimacs"
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			println("--- Solver " + s.solver + " ---")
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT SAT SAT ]")
	}
}
