package org.xtext.example.msat.CoudrayThuillier.tests

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

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatMainTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper

	@Test
	def void ProcessingModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A, A v B, A ^ !A
		''')
		var solvers_results = Solve.process(result)
		Assertions.assertEquals(solvers_results.keySet.length, 1)
		for (String s : solvers_results.keySet) {
			println("--- Solver " + s + " ---")
			var str = "["
			for (boolean b : solvers_results.get(s)) {
				str += " " + b.toString
			}
			str += " ]"
			Assertions.assertEquals(str, "[ true true false ]")
		}
	}

	@Test
	def void ProcessingModel2() {
		val result = parseHelper.parse('''
			solver sat4j-java sat4j-jar sat4j-maven benchmarkFormula A
		''')
		var solvers_results = Solve.process(result)
		Assertions.assertEquals(solvers_results.keySet.length, 3)
		for (String s : solvers_results.keySet) {
			println("--- Solver " + s + " ---")
			var str = "["
			for (boolean b : solvers_results.get(s)) {
				str += " " + b.toString
			}
			str += " ]"
			Assertions.assertEquals(str, "[ true ]")
		}
	}

	@Test
	def void ProcessingModel3() {
		val result = parseHelper.parse('''
			solver sat4j-java sat4j-jar sat4j-maven benchmarkFormula A, A => B
		''')
		var solvers_results = Solve.process(result)
		Assertions.assertEquals(solvers_results.keySet.length, 3)
		for (String s : solvers_results.keySet) {
			println("--- Solver " + s + " ---")
			var str = "["
			for (boolean b : solvers_results.get(s)) {
				str += " " + b.toString
			}
			str += " ]"
			Assertions.assertEquals(str, "[ true true ]")
		}
	}

	@Test
	def void ProcessingModel4() {
		val dimacs = "p cnf 2 2
1 0
2 -1 0" // -> A ^ (B v !A)
		IEDimacs.export_dimacs("temp.dimacs", dimacs)
		val result = parseHelper.parse('''
			solver sat4j-java benchmarkDIMACS "temp.dimacs"
		''')
		var solvers_results = Solve.process(result)
		Assertions.assertEquals(solvers_results.keySet.length, 1)
		for (String s : solvers_results.keySet) {
			println("--- Solver " + s + " ---")
			var str = "["
			for (boolean b : solvers_results.get(s)) {
				str += " " + b.toString
			}
			str += " ]"
			Assertions.assertEquals(str, "[ true ]")
		}
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
			solver sat4j-java sat4j-maven benchmarkDIMACS "temp1.dimacs", "temp2.dimacs"
		''')
		var solvers_results = Solve.process(result)
		Assertions.assertEquals(solvers_results.keySet.length, 2)
		for (String s : solvers_results.keySet) {
			println("--- Solver " + s + " ---")
			var str = "["
			for (boolean b : solvers_results.get(s)) {
				str += " " + b.toString
			}
			str += " ]"
			Assertions.assertEquals(str, "[ true true ]")
		}
	}
}
