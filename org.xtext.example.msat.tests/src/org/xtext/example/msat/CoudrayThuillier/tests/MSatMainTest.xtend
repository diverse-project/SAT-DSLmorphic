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
import org.xtext.example.msat.CoudrayThuillier.utils.SolverResult

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
		var str = "["
		for (SolverResult s : solvers_results) {
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT UNSAT ]")
	}

	@Test
	def void ProcessingModel1_version() {
		val result = parseHelper.parse('''
			solver sat4j-jar version "2.3.1" benchmarkFormula A, A v B, A ^ !A
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			Assertions.assertEquals(s.getSolver, "SAT4J_JAR")
			Assertions.assertEquals(s.getVersion, "2.3.1")
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT UNSAT ]")
	}

	@Test
	def void ProcessingModel2() {
		val result = parseHelper.parse('''
			solver sat4j-java sat4j-jar benchmarkFormula A
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT ]")
	}

	@Test
	def void ProcessingModel2_version() {
		val result = parseHelper.parse('''
			solver sat4j-jar version "2.3.1" sat4j-jar version "2.3.4" sat4j-maven version "2.3.4" benchmarkFormula A
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT SAT ]")
	}

	@Test
	def void ProcessingModel3() {
		val result = parseHelper.parse('''
			solver sat4j-java sat4j-jar sat4j-maven benchmarkFormula A, A => B
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT SAT SAT SAT SAT ]")
		Assertions.assertEquals(solvers_results.get(0).solver, "SAT4J_JAVA")
		Assertions.assertEquals(solvers_results.get(2).solver, "SAT4J_JAR")
		Assertions.assertEquals(solvers_results.get(4).solver, "SAT4J_COMP")
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
		var str = "["
		for (SolverResult s : solvers_results) {
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT ]")
		Assertions.assertEquals(solvers_results.get(0).solver, "SAT4J_JAVA")
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
			solver sat4j-java sat4j-jar benchmarkDIMACS "temp1.dimacs", "temp2.dimacs"
		''')
		var solvers_results = Solve.process(result)
		var str = "["
		for (SolverResult s : solvers_results) {
			str += " " + s.status
		}
		str += " ]"
		Assertions.assertEquals(str, "[ SAT SAT SAT SAT ]")
		Assertions.assertEquals(solvers_results.get(0).solver, "SAT4J_JAVA")
		Assertions.assertEquals(solvers_results.get(2).solver, "SAT4J_JAR")
	}
}
