package org.xtext.example.mydsl.GJ_MC_Tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.GJ_MC_Process.PrettyPrinter
import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.tests.SatInjectorProvider
import org.xtext.example.mydsl.sat.Model

@ExtendWith(InjectionExtension)
@InjectWith(SatInjectorProvider)
class SatPrettyPrinterTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void basicVarTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A
		''')
		
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "A"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
			
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	@Test
	def void basicAndTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A ^ B
		''')
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "(A ^ B)"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	@Test
	def void basicOrTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A v B
		''')
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "(A v B)"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	@Test
	def void basicImplTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A => B
		''')
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "(A => B)"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	@Test
	def void basicBiImplTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A <=> B
		''')
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "(A <=> B)"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	@Test
	def void basicNandTest() {
		val result = parseHelper.parse('''
			solver sat4j-java
			A | B
		''')
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "(A | B)"
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	//Failure
	@Test
	def void complexPriorityTest(){
		val result = parseHelper.parse('''
			solver sat4j-java
			A => B^C vD
		''')
		val prettyPrinted = PrettyPrinter.prettyPrint(result.expression)
		
		val oracle = "(A => ((B ^ C) v D))"
			
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		Assertions.assertTrue(prettyPrinted == oracle)
	}
	
	
}