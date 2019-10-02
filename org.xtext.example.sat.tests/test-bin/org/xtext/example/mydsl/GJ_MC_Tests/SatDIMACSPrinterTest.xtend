package org.xtext.example.mydsl.GJ_MC_Tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.generator.PrettyPrinter
import org.xtext.example.mydsl.generator.SATUtils
import org.xtext.example.mydsl.generator.Simplifier
import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.tests.SatInjectorProvider
import org.xtext.example.mydsl.generator.DIMACSPrinter

class SatDIMACSPrinterTest {
	@Inject
	ParseHelper<Expression> parseHelper
	
	@Test
	def void basicOrTest() {
		val result = parseHelper.parse('''
			A v B
		''')
		val dimacsPrinted = DIMACSPrinter.dimacsPrint(result)
		
		val oracle = "p cnf 2 1 \n 1 2 0"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(dimacsPrinted == oracle)
	}
	
	@Test
	def void basicNegTest() {
		val result = parseHelper.parse('''
			!A
		''')
		val dimacsPrinted = DIMACSPrinter.dimacsPrint(result)
		
		val oracle = "p cnf 1 1 \n -1 0"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(dimacsPrinted == oracle)
	}
	
	@Test
	def void basicAndTest() {
		val result = parseHelper.parse('''
			A^B
		''')
		val dimacsPrinted = DIMACSPrinter.dimacsPrint(result)
		
		val oracle = "p cnf 2 2\n 1 0\n 2 0\n"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	
		Assertions.assertTrue(dimacsPrinted == oracle)
	}
	
	@Test
	def void basicIterationTest() {
		val result = parseHelper.parse('''
			A^A
		''')
		val dimacsPrinted = DIMACSPrinter.dimacsPrint(result)
		
		val oracle = "p cnf 1 2\n 1 0\n 1 0\n"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')

		Assertions.assertTrue(dimacsPrinted == oracle)
	}
	
	@Test
	def void complexCNFTest() {
		val result = parseHelper.parse('''
			(A v B v C) ^ (A v !C) ^ (!B)
		''')
		val dimacsPrinted = DIMACSPrinter.dimacsPrint(result)
		
		val oracle = "p cnf 3 3\n 1 2 3 0\n 1 -3 0\n -2 0\n"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')

		Assertions.assertTrue(dimacsPrinted == oracle)
	}
	
	@Test
	def void complexImplTest() {
		val result = parseHelper.parse('''
			(A => B) ^ C
		''')
		val dimacsPrinted = DIMACSPrinter.dimacsPrint(result)
		
		val oracle = "p cnf 3 2\n 1 -2 0\n 3 0\n"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	
		Assertions.assertTrue(dimacsPrinted == oracle)
	}
	
}