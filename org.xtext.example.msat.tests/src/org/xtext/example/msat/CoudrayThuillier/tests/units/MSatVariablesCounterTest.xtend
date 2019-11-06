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
import org.xtext.example.msat.CoudrayThuillier.utils.VariablesCounter
import org.xtext.example.mydsl1.tests.MSatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatVariablesCounterTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	VariablesCounter variables_counter = new VariablesCounter

	def EList<Expression> extract_expression(SATMorphic sat) {
		var benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void VariablesCounterModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A
		''')
		var list_expr = extract_expression(result)
		variables_counter.doSwitch(list_expr.get(0))
		var count = variables_counter.get_var_number
		Assertions.assertEquals(count, 1)
	}

	@Test
	def void VariablesCounterModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula !A
		''')
		var list_expr = extract_expression(result)
		variables_counter.doSwitch(list_expr.get(0))
		var count = variables_counter.get_var_number
		Assertions.assertEquals(count, 1)
	}

	@Test
	def void VariablesCounterModel3() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (A v B) ^ C
		''')
		var list_expr = extract_expression(result)
		variables_counter.doSwitch(list_expr.get(0))
		var count = variables_counter.get_var_number
		Assertions.assertEquals(count, 3)
	}

	@Test
	def void VariablesCounterModel4() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A v A ^ A
		''')
		var list_expr = extract_expression(result)
		variables_counter.doSwitch(list_expr.get(0))
		var count = variables_counter.get_var_number
		Assertions.assertEquals(count, 1)
	}
	
	@Test
	def void VariablesCounterModel5() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula true v true ^ false
		''')
		var list_expr = extract_expression(result)
		variables_counter.doSwitch(list_expr.get(0))
		var count = variables_counter.get_var_number
		Assertions.assertEquals(count, 0)
	}
}
