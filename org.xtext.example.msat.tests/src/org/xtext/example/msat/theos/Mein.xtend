package org.xtext.example.msat.theos

import com.google.inject.Inject
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
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
	
	
	/*
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
	
	*/
	
	@Test
	def void loadSAT4J() 
	{
		println("-----------------------------------")
		println("loadSAT4J - all versions : ")
		val text = 
		'''
			solver 
				   sat4j-jar version "2.0.0"
				   sat4j-jar version "2.2.3"
				   sat4j-jar version "2.3.1"
				   minisat version "1.14.0"
				   minisat version "2.2.0"
				   cryptominisat version "2.4.0"
				   cryptominisat version "4.5.3"
				   cryptominisat version "5.6.8"
			benchmarkDIMACS "input.cnf", "input2.cnf", "tres-tres-dur.cnf"
		'''
		val sat_and_time = check_formulas(text);
		val is_sat = (sat_and_time.get(0) as Boolean)
		val elapsed_time = (sat_and_time.get(1) as Long)
		Assertions.assertTrue(is_sat);
		println("Elapsed time : " + elapsed_time)
		//val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}


	

	static def printFnames(String sDir)
	{
		val filenames = newArrayList();
  		val faFiles = new File(sDir).listFiles();
  		for(file : faFiles)
  		{
    		if(file.getName().matches("*.cnf"))
    		{
    			filenames.add(file.getAbsolutePath())
    			
     			System.out.println(file.getAbsolutePath());
    		}
    	}
    	return filenames
  	}


//--------------------------------------------------------------------------------------------------
//  				Some functions
//--------------------------------------------------------------------------------------------------

	def check_formulas(String input)
	{
		val print_text_read = false;
		val print_formulas = false;
		val print_call_method = true;
		val print_all_responses = true;
		val save_to_file = true;
		
		
		if(print_text_read)
		{
			//print("text read : ")
			//println(input);
			//println()
		}
		val ast = parseHelper.parse(input);
				
		val dimacs_formulas_and_their_name = read_entry(ast)
		val dimacs_formulas = dimacs_formulas_and_their_name.get(0)
		val name_formulas = dimacs_formulas_and_their_name.get(1)

		val call_methods = get_call_methods(ast)
		//println(call_method.getClass().getSimpleName())
		
		
		if(print_formulas)
		{
			print("dimcas fomulas : \n")		
			println(dimacs_formulas)
			println()
		}
		
		if(print_call_method)
		{
			print("call method : ")
			println(call_methods)
			println()
		}

		val results_filename = "results.csv"
		val writer = new BufferedWriter(new FileWriter(results_filename));
		val all_answers = newArrayList();
		for(var i=0; i< dimacs_formulas.size(); i++)
		{
			val formula = dimacs_formulas.get(i)
			val name_formula = name_formulas.get(i)
			val filename_of_formula = "tmp_output.cnf"
			val fileWriter = new FileWriter(new File(filename_of_formula));
			fileWriter.write(formula);
			fileWriter.close();
		
			val answers = newArrayList();
		
			for (call_method : call_methods)
			{	
				val answer =  evaluate(call_method, filename_of_formula);
				answers.add(answer)
				if(save_to_file)
				{
					var line = name_formula + " ; " + id_solver_to_solver_name(call_method.get(0) as Integer) +
									" ; " + call_method.get(1) + " ; " + answer.get(0) + " ; " + 
									answer.get(1) + "\n"
					writer.write(line)
					writer.flush()
				}
			} 
		
			if(print_all_responses)
			{
				println("Here is the response for all solvers : ")
				println(answers)
				println("Returning the first one.")
			}
			all_answers.add(answers)
		}
		
		writer.close()
		
		/*
			if(save_to_file)
			{
				
				val results_filename = "results.csv"
				val writer = new BufferedWriter(new FileWriter(results_filename));
		
				for(var i=0; i< dimacs_formulas.size(); i++)
				{
					val name_formula = name_formulas.get(i)
					for (var j=0 ; j < call_methods.size(); j++)
					{
						val call_method = call_methods.get(j)
						val id_solver = call_method.get(0) as Integer
						val version_solver = call_method.get(1) as String
						
						val line = name_formula + " ; " + id_solver_to_solver_name(id_solver) + " ; " +
									version_solver + " ; " + all_answers.get(i).get(j).get(0) + " ; " + 
									all_answers.get(i).get(j).get(1) + "\n"
						writer.write(line)
						
					}
					
				}
				 // formula_name ; solver ; version ; is_sat ; temps 

				 writer.close();
				 
			}
		*/
		
		

		return newArrayList(false, 50l);
		
	}
	
	def id_solver_to_solver_name(int id_solver)
	{
		switch id_solver
		{
			case Sat4JVariant.SAT4J_JAVA_VALUE : 
			{
				return "sat4j-java"

			}
			case Sat4JVariant.SAT4J_JAR_VALUE : 
			{
				return "sat4j-jar"
				
			}
			case Sat4JVariant.SAT4J_COMP_VALUE :
			{
				return "maven"
			}
			case 4 : //MiniSAT solver
			{
				return "MiniSAT"
			}	
			case 5 : //CryptoMinisat solver
			{
				return "CryptoMiniSAT"
			}
			
		}
		return "error"	
	}
	
	def evaluate (ArrayList<Object> call_method, String filename_of_formula)
	{
		val id_solver = call_method.get(0) as Integer
		val version_solver = call_method.get(1) as String
		
		var is_sat = false;
		var elapsed_time = -1f
		switch id_solver
		{
			case Sat4JVariant.SAT4J_JAVA_VALUE : 
			{
				println("calling sat4j from java code.")
				val answer = SAT4JBIBCall.DoIt(filename_of_formula)
				is_sat = (answer.get(0) as Boolean)
				elapsed_time = (answer.get(1) as Float)
			}
			case Sat4JVariant.SAT4J_JAR_VALUE : 
			{
				println("calling sat4j from jar with version " + version_solver)
				val answer = Sat4JJARCall.DoIt(filename_of_formula, version_solver)
				is_sat = (answer.get(0) as Boolean)
				elapsed_time = (answer.get(1) as Float)
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
				println("calling MiniSAT from bin with version " + version_solver)
				val answer =  MiniSATCall.DoIt(filename_of_formula, version_solver, parameters)
				is_sat = (answer.get(0) as Boolean)
				elapsed_time = (answer.get(1) as Float)
			}	
			case 5 : //CryptoMinisat solver
			{
				println("calling CryptoMiniSAT from bin with version " + version_solver)
				val answer =  CryptoMiniSATCall.DoIt(filename_of_formula, version_solver)
				is_sat = (answer.get(0) as Boolean)
				elapsed_time = (answer.get(1) as Float)
			}	
			//TODO other solvers
			default :
			{
				println("Unknown variant")
			}
		}	
		
		val sat_and_time = newArrayList(is_sat, elapsed_time);
		return sat_and_time;
		
	}
	
	static var cpt = 0
	def read_entry(SATMorphic ast)
	{
		val formulas = newArrayList();
		val name_formulas = newArrayList();
		switch ast.benchmark
		{
			case ast.benchmark instanceof BenchmarkDimacs :
			{ 
				for(filename : (ast.benchmark as BenchmarkDimacs).dimacses)
				{
					val formula =  new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
					formulas.add(formula)
					name_formulas.add(filename)
				
				}
			}
			case ast.benchmark instanceof BenchmarkFormula :
			{
				for(msat_formula : ((ast.benchmark as BenchmarkFormula).expressions))
				{
					val formula =  Utils.prop_to_dimacs(msat_formula);
					val filename = "BenchmarkFormula_" + cpt++
					formulas.add(formula)	
					name_formulas.add(filename)			
				}
			}
			default : 
			{
				throw new Error("Never supposed to happen")
			}
		}
		return newArrayList(formulas, name_formulas)
	}
	
	
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



	