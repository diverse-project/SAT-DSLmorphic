/*
 * generated by Xtext 2.19.0
 */
package ozhang

import com.google.inject.Inject
import java.io.File
import java.util.regex.Pattern
import java.util.stream.Collectors
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.tests.MSatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class MSatParsingMacherTest {
	@Inject
	ParseHelper<SATMorphic> parseHelper
	
	Solver solver = new Solver()
	
	@Test
	def void loadSAT4J_JAVA() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-java
			benchmarkDIMACS "test.cnf", "test.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void loadSAT4J_MVN() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-maven
			benchmarkDIMACS "test.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void loadSAT4J_JAR() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-jar
			benchmarkDIMACS "test.cnf"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void loadSAT4J_JAVA_formula() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-java
			benchmarkFormula A ^ (!B)
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void loadSAT4J_JAR_formula() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-jar
			benchmarkFormula (A ^ (!B))
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void loadSAT4J_MVN_formula() {
		val result = parseHelper.parse('''
			solver 
				   sat4j-maven
			benchmarkFormula (A ^ (!A))
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void benchmark() {
		
		var benchmark_path = new File("/home/ozhang/Documents/5INFO/DSL/DSL_Project/samplingfm/Benchmarks") // Put here path to benchmark files
		var benchmark_list = benchmark_path.list
		
		var pattern = Pattern.compile("cnf$")
		var benchmark_cnf_list = benchmark_list.stream().filter(pattern.asPredicate()).collect(Collectors.toList());
		
		var result = parseHelper.parse('''
			solver sat4j-jar sat4j-java sat4j-maven minisat cryptominisat
			benchmarkDIMACS 
			«FOR benchmark : benchmark_cnf_list SEPARATOR ' , '»
				"/home/ozhang/Documents/5INFO/DSL/DSL_Project/samplingfm/Benchmarks/«benchmark»"
			«ENDFOR»
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
	
	@Test
	def void solveFile() {
		var file_path = "/home/ozhang/Documents/5INFO/DSL/DSL_Project/samplingfm/Benchmarks/36.sk_3_77.cnf"
		var result = parseHelper.parse('''
			solver sat4j-java sat4j-maven minisat cryptominisat sat4j-jar
			benchmarkDIMACS "«file_path»"
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		solver.solve(result)
	}
}