package org.xtext.example.msat.CoudrayThuillier.tests.units

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.msat.CoudrayThuillier.utils.ClausesCounter
import org.xtext.example.mydsl1.tests.MSatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatClausesCounterTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	ClausesCounter clauses_counter = new ClausesCounter

	def EList<Expression> extract_expression(SATMorphic sat) {
		var benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void ClausesCounterModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A
		''')
		var list_expr = extract_expression(result)
		var count = clauses_counter.doSwitch(list_expr.get(0))
		Assertions.assertEquals(count, 1)
	}

	@Test
	def void ClausesCounterModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A v B
		''')
		var list_expr = extract_expression(result)
		var count = clauses_counter.doSwitch(list_expr.get(0))
		Assertions.assertEquals(count, 1)
	}

	@Test
	def void ClausesCounterModel3() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A ^ (B v C)
		''')
		var list_expr = extract_expression(result)
		var count = clauses_counter.doSwitch(list_expr.get(0))
		Assertions.assertEquals(count, 2)
	}

	@Test
	def void ClausesCounterModel4() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula !A
		''')
		var list_expr = extract_expression(result)
		var count = clauses_counter.doSwitch(list_expr.get(0))
		Assertions.assertEquals(count, 1)
	}
}
