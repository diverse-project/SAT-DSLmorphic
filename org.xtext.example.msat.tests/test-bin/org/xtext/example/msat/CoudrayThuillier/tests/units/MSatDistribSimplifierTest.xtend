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
import org.xtext.example.msat.CoudrayThuillier.utils.DistribSimplifier
import org.xtext.example.mydsl1.tests.MSatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatDistribSimplifierTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	PrettyPrint prettyprinter = new PrettyPrint
	DistribSimplifier distrib_simplifier = new DistribSimplifier

	def EList<Expression> extract_expression(SATMorphic sat) {
		var benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void DistribSimplifierModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A v B
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = distrib_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "A v B")
	}

	@Test
	def void DistribSimplifierModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A ^ B
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = distrib_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "A ^ B")
	}

	@Test
	def void DistribSimplifierModel3() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A v (B ^ C)
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = distrib_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "B v A ^ C v A")
	}

	@Test
	def void DistribSimplifierModel4() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (A v B) ^ (C v D)
		''')
		var list_expr = extract_expression(result)
		var simplified_expr = distrib_simplifier.doSwitch(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(simplified_expr), "A v B ^ C v D")
	}
}
