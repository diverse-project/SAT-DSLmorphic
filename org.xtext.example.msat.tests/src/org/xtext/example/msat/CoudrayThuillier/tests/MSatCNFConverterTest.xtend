package org.xtext.example.msat.CoudrayThuillier.tests

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
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.msat.CoudrayThuillier.utils.CNFConverter

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatCNFConverterTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	PrettyPrint prettyprinter = new PrettyPrint

	def EList<Expression> extract_expression(SATMorphic sat) {
		var BenchmarkFormula benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void CNFConverterModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (A v B) ^ C
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(cnf), "A v B ^ C")
	}

	@Test
	def void CNFConverterModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A => B
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		Assertions.assertEquals(prettyprinter.doSwitch(cnf), "!A v B")
	}
}
