package org.xtext.example.msat.CoudrayThuillier.tests.units

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.msat.CoudrayThuillier.utils.PrettyPrint
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.msat.CoudrayThuillier.utils.ConstSimplifier
import org.xtext.example.mydsl1.tests.MSatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatConstSimplifierTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	PrettyPrint prettyprinter = new PrettyPrint
	ConstSimplifier const_simplifier = new ConstSimplifier

	def EList<Expression> extract_expression(SATMorphic sat) {
		var benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void ConstSimplifierModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (true v B)
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = const_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "true")
	}

	@Test
	def void ConstSimplifierModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (false v B)
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = const_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "B")
	}

	@Test
	def void ConstSimplifierModel3() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (true ^ B)
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = const_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "B")
	}

	@Test
	def void ConstSimplifierModel4() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (false ^ B)
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = const_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "false")
	}

	@Test
	def void ConstSimplifierModel5() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula !true
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = const_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "false")
	}

	@Test
	def void ConstSimplifierModel6() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula !false
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = const_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "true")
	}
}
