package org.xtext.example.msat.theos

import com.google.inject.Inject
import java.io.File
import java.io.FileWriter
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.CryptoMiniSAT
import org.xtext.example.mydsl1.mSat.MiniSAT
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.Sat4J
import org.xtext.example.mydsl1.mSat.Sat4JVariant
import org.xtext.example.mydsl1.mSat.SolverVersion
import org.xtext.example.mydsl1.tests.MSatInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)



class Mein 
{
	@Inject
	ParseHelper<SATMorphic> parseHelper
	
	
	
	@Test
	def void loadSolvers() 
	{
		println("-----------------------------------")
		println("loadSolvers : ")
		
		val text = 
		'''
			solver 
				   minisat rnd-freq 1
				   cryptominisat
			benchmarkDIMACS "input.cnf", "input2.cnf"
		'''
		val result = parseHelper.parse(text)
		
		Assertions.assertNotNull(result)
		
		check_formula(text)
		
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
	}
	
	@Test
	def void loadSAT4J() 
	{
		println("-----------------------------------")
		println("loadSAT4J : ")
		val text = 
		'''
			solver 
				   sat4j-java
			benchmarkDIMACS "input.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
		//val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void loadSAT4J_MVN() 
	{
		println("-----------------------------------")
		println("loadSAT4J_MVN : ")
		val text =  
		'''
			solver 
				   sat4j-maven
			benchmarkDIMACS "input.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertFalse(sat);
	}
	
	@Test
	def void loadSAT4J_MVN_2() 
	{
		println("-----------------------------------")
		println("loadSAT4J_MVN_2 : ")
		val text =  
		'''
			solver 
				   sat4j-maven
			benchmarkDIMACS "input2.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertFalse(sat);
	}
	
	@Test
	def void loadSAT4J_JAR() 
	{
		println("-----------------------------------")
		println("loadSAT4J_JAR : ")
		val text =
		'''
			solver 
				   sat4j-jar
			benchmarkDIMACS "input.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
	}
	
	@Test
	def void loadMiniSAT() 
	{
		println("-----------------------------------")
		println("loadMiniSAT : ")
		val text =
		'''
			solver 
				   minisat
			benchmarkDIMACS "input.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
	}
	
	@Test
	def void loadMiniSAT2() 
	{
		println("-----------------------------------")
		println("loadMiniSAT : ")
		val text =
		'''
			solver 
				   minisat
			benchmarkDIMACS "input2.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertFalse(sat);
	}
	
	@Test
	def void loadMiniSATversion() 
	{
		println("-----------------------------------")
		println("loadMiniSATversion : ")
		val text =
		'''
			solver 
				   minisat version "1.14.0"
			benchmarkDIMACS "input.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
	}
	
	@Test
	def void loadCryptoMiniSAT() 
	{
		println("-----------------------------------")
		println("loadCryptoMiniSAT : ")
		val text =
		'''
			solver 
				   cryptominisat
			benchmarkDIMACS "input.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
	}
	
	@Test
	def void main()
	{	
		println("-----------------------------------")
		println("main : ")
		//val ast = parseHelper.parse('''
		//		A ^ (B v C) ^ (~A)
		//		sat4j-java
		//''')
		
		//val input = "formula.msat"
		
		//val text = new String(Files.readAllBytes(Paths.get(input)), StandardCharsets.UTF_8);

		
		//val is_sat = check_formula(text)
		
		//Assertions.assertTrue(!is_sat)
	}
	
	def check_formula(String input)
	{
		//print("text read : ")
		//println(input);
		//println()

		val ast = parseHelper.parse(input);
				
		val dimacs_formula = read_entry(ast)

		val call_methods = get_call_methods(ast)
		//println(call_method.getClass().getSimpleName())
		
		print("dimcas fomula : \n")		
		println(dimacs_formula)
		println()
		
		
		print("call method : ")
		println(call_methods)
		println()


		val filename_of_formula = "tmp_output.cnf"
		val fileWriter = new FileWriter(new File(filename_of_formula));
		fileWriter.write(dimacs_formula);
		fileWriter.close();
		
		val answers = newArrayList();
		
		for (call_method : call_methods)
		{	
			val answer =  evaluate(call_method, filename_of_formula);
			answers.add(answer)
		} 
		
		println("Here is the response for all solvers : ")
		println(answers)
		println("Returning the first one.")
		val some_answer = answers.get(0)
		
		return some_answer
		
	}
	
	def evaluate (ArrayList<Object> call_method, String filename_of_formula)
	{
		val id_solver = call_method.get(0)
		val version_solver = call_method.get(1) as String
		
		var is_sat = false;
		switch id_solver
		{
			case Sat4JVariant.SAT4J_JAVA_VALUE : 
			{
				println("calling sat4j from java code.")
				is_sat = SAT4JBIBCall.DoIt(filename_of_formula)
			}
			case Sat4JVariant.SAT4J_JAR_VALUE : 
			{
				println("calling sat4j from jar")
				is_sat = Sat4JJARCall.DoIt(filename_of_formula, version_solver)
			
			}
			case Sat4JVariant.SAT4J_COMP_VALUE :
			{
				println("generating maven project")
				is_sat = SAT4JMaven.DoIt(filename_of_formula)
				println("Done.")
			}
			case 4 : //MiniSAT solver
			{
				val parameters = call_method.get(2) as String
				println("calling MiniSAT from bin")
				is_sat = MiniSATCall.DoIt(filename_of_formula, version_solver, parameters)
			}	
			case 5 : //CryptoMinisat solver
			{
				println("calling CryptoMiniSAT from bin")
				is_sat = CryptoMiniSATCall.DoIt(filename_of_formula, version_solver)
			}	
			//TODO other solvers
			default :
			{
				println("Unknown variant")
			}
		}	
		
		return is_sat;
		
	}
	
	def read_entry(SATMorphic ast)
	{
		switch ast.benchmark
		{
			case ast.benchmark instanceof BenchmarkDimacs :
			{ 
				// TODO Multiple files
				val filename = (ast.benchmark as BenchmarkDimacs).dimacses.get(0)
				return new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
			}
			case ast.benchmark instanceof BenchmarkFormula :
			{
				// TODO Multiple formulas
				return Utils.prop_to_dimacs(((ast.benchmark as BenchmarkFormula)
											.expressions.get(0) as EObject
				))
			}
			default : 
			{
				println("Never supposed to happen")
				return ""
			}
		}
	}
	/*
	 * Solvers supportés (ou à supporter) : 
	 * 
	 * Sat4J library, version ??
	 * Sat4J Jar, version ??
	 * Sat4J Maven ??
	 * minisat, version ??, parameters ??
	 * cryptominisat ??
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	def get_call_methods(SATMorphic ast)
	{
		val solvers = newArrayList();
		for (solver : ast.solvers)
		{
			val solverr = solver.solver
			var version = "default"
			if (solver.version !== null)
			{
				version = (solver.version as SolverVersion).version
			} 
			switch solverr
			{
				case solverr instanceof Sat4J:
				{
					val id_solver = (solverr as Sat4J).variant.getValue()
					val informations_solver = newArrayList(id_solver, version);
					solvers.add(informations_solver)
				}
				case solverr instanceof MiniSAT:
				{
					val id_solver = 4 //a new identifier for minisat
					var parameters = ""
					if ((solverr as MiniSAT).parameter !== null)
					{
						parameters += "-rnd-freq=" + (solverr as MiniSAT).parameter.rndfreq
					}
					val informations_solver = newArrayList(id_solver, version, parameters);
					solvers.add(informations_solver)					
				}
				case solverr instanceof CryptoMiniSAT:
				{
					val id_solver = 5 //a new identifier for cryptominisat
					val informations_solver = newArrayList(id_solver, version);
					solvers.add(informations_solver)				
				}
				default:
				{
					println("Unknown solver")
				}
			}
		}
		return solvers
	}
}