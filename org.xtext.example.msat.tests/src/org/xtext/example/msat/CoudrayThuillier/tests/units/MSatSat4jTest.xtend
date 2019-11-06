package org.xtext.example.msat.CoudrayThuillier.tests.units

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.msat.CoudrayThuillier.utils.CNFConverter
import org.xtext.example.msat.CoudrayThuillier.utils.DimacsPrint
import static org.junit.Assert.assertEquals
import org.xtext.example.msat.CoudrayThuillier.utils.Sat4jFunctions
import org.xtext.example.msat.CoudrayThuillier.utils.IEDimacs

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatSat4jTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	
	String export_path = "temp.dimacs"
	String export_maven_path = "../coudraythuillier/file.dimacs"

	def EList<Expression> extract_expression(SATMorphic sat) {
		var benchmark = sat.benchmark as BenchmarkFormula
		var e = benchmark.expressions
		return e
	}

	@Test
	def void SAT4jJavaModel1() {
		val result = parseHelper.parse('''
			solver sat4j-java benchmarkFormula A
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_java(export_path)
		assertEquals(is_satisfiable, true)
	}

	@Test
	def void SAT4jJavaModel2() {
		val result = parseHelper.parse('''
			solver sat4j-java benchmarkFormula A ^ !A
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_java(export_path)
		assertEquals(is_satisfiable, false)
	}

	@Test
	def void SAT4jJavaModel3() {
		val result = parseHelper.parse('''
			solver sat4j-java benchmarkFormula (A => B) ^ (A <=> C)
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_java(export_path)
		assertEquals(is_satisfiable, true)
	}
	
	@Test
	def void SAT4jJarModel1() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_jar(export_path)
		assertEquals(is_satisfiable, true)
	}
	
	@Test
	def void SAT4jJarModel2() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula A ^ !A
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_jar(export_path)
		assertEquals(is_satisfiable, false)
	}

	@Test
	def void SAT4jJarModel3() {
		val result = parseHelper.parse('''
			solver sat4j-jar benchmarkFormula (A => B) ^ (A <=> C)
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_jar(export_path)
		assertEquals(is_satisfiable, true)
	}
	
	@Test
	def void SAT4jMavenModel1() {
		val result = parseHelper.parse('''
			solver sat4j-maven benchmarkFormula A
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_maven_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_maven(export_maven_path)
		assertEquals(is_satisfiable, true)
	}
	
	@Test
	def void SAT4jMavenModel2() {
		val result = parseHelper.parse('''
			solver sat4j-maven benchmarkFormula A ^ !A
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_maven_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_maven(export_maven_path)
		assertEquals(is_satisfiable, false)
	}

	@Test
	def void SAT4jMavenModel3() {
		val result = parseHelper.parse('''
			solver sat4j-maven benchmarkFormula (A => B) ^ (A <=> C)
		''')
		var list_expr = extract_expression(result)
		var cnf = CNFConverter.convert_to_CNF(list_expr.get(0))
		var dimacs = DimacsPrint.print_dimacs(cnf)
		IEDimacs.export_dimacs(export_maven_path, dimacs)
		
		var is_satisfiable = Sat4jFunctions.solve_maven(export_maven_path)
		assertEquals(is_satisfiable, true)
	}
	
}
