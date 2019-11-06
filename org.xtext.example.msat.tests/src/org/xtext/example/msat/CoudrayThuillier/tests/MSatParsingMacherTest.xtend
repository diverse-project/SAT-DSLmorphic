package org.xtext.example.msat.CoudrayThuillier.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.msat.CoudrayThuillier.Solve

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatParsingMacherTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	
	// foo1.cnf -> (A v B v C) ^ (!A v !B v D) ^ (!D) ^ (!A v C v !D v B) is statisfiable
	// foo2.cnf -> (A v B) ^ (!A) ^ (!B) is unsatisfiable
	
	@Test
	def void loadSolvers() {
		val result = parseHelper.parse('''
			solver 
				   minisat rnd-freq 1
				   cryptominisat
			benchmarkDIMACS "foo1.cnf", "foo2.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void loadSAT4J() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-java
			benchmarkDIMACS "foo1.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		val answer = Solve.process(result) // return a HashMap where solver name are keys and values are ArrayList of boolean representing formula i satisfiability
		Assertions.assertEquals(answer.get("SAT4J_JAVA").get(0), true)
	}
	
	@Test
	def void loadSAT4J_MVN() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-maven
			benchmarkDIMACS "foo1.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		val answer = Solve.process(result) // return a HashMap where solver name are keys and values are ArrayList of boolean representing formula i satisfiability
		Assertions.assertEquals(answer.get("SAT4J_COMP").get(0), true)
		}
	
	@Test
	def void loadSAT4J_JAR() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-jar
			benchmarkDIMACS "foo1.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		val answer = Solve.process(result) // return a HashMap where solver name are keys and values are ArrayList of boolean representing formula i satisfiability
		Assertions.assertEquals(answer.get("SAT4J_JAR").get(0), true)
	}
}