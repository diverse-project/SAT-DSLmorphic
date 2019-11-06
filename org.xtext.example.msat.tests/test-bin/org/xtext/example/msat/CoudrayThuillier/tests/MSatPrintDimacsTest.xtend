package org.xtext.example.msat.CoudrayThuillier.tests

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
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.msat.CoudrayThuillier.utils.DimacsPrint
import org.xtext.example.msat.CoudrayThuillier.utils.CNFConverter

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatPrintDimacsTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper

	def EList<Expression> extract_expression(SATMorphic sat) {
		var benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void PrintDimacsModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A v B
		''')
		var list_expr = extract_expression(result)
		var dimacs = DimacsPrint.print_dimacs(list_expr.get(0))
		Assertions.assertEquals(dimacs, "p cnf 2 1\n1 2 0")
	}
	
	@Test
	def void PrintDimacsModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A v A
		''')
		var list_expr = extract_expression(result)
		var dimacs = DimacsPrint.print_dimacs(list_expr.get(0))
		Assertions.assertEquals(dimacs, "p cnf 1 1\n1 1 0")
	}
	
	@Test
	def void PrintDimacsModel3() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A => B
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		Assertions.assertEquals(dimacs, "p cnf 2 1\n-1 2 0")
	}
	
	@Test
	def void PrintDimacsModel4() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A ^ B ^ C
		''')
		var list_expr = extract_expression(result)
		var dimacs = DimacsPrint.print_dimacs(list_expr.get(0))
		Assertions.assertEquals(dimacs, "p cnf 3 3\n1 0\n2 0\n3 0")
	}
	
}
