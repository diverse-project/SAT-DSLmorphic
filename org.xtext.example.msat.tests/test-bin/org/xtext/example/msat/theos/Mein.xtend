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
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.xtext.example.mydsl1.mSat.Sat4J
import org.xtext.example.mydsl1.mSat.Sat4JVariant
import org.xtext.example.mydsl1.mSat.Or
import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.Nand

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)



class Mein 
{
	@Inject
	ParseHelper<SATMorphic> parseHelper
	
	
	
	@Test
	def void loadSolvers() 
	{
		val result = parseHelper.parse(
		'''
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
	def void loadSAT4J() 
	{
		val text = 
		'''
			solver 
				   sat4j-java
			benchmarkDIMACS "output.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
		//val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void loadSAT4J_MVN() 
	{
		val text =  
		'''
			solver 
				   sat4j-maven
			benchmarkDIMACS "output.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertFalse(sat);
	}
	
	@Test
	def void loadSAT4J_JAR() 
	{
		val text =
		'''
			solver 
				   sat4j-jar
			benchmarkDIMACS "output.cnf"
		'''
		val sat = check_formula(text);
		Assertions.assertTrue(sat);
	}
	
	@Test
	def void main()
	{	
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

		val call_method = get_call_method(ast)
		//println(call_method.getClass().getSimpleName())
		
		//print("dimcas fomula : \n")		
		//println(dimacs_formula)
		//println()
		
		
		//print("call method : ")
		//println(call_method)
		//println()


		val filename_of_formula = "output.cnf"
		val fileWriter = new FileWriter(new File(filename_of_formula));
		fileWriter.write(dimacs_formula);
		fileWriter.close();
		
		return evaluate(call_method, filename_of_formula);
		
	}
	
	def evaluate (int call_method, String filename_of_formula)
	{
		var is_sat = false;
		switch call_method
		{
			case Sat4JVariant.SAT4J_JAVA_VALUE : 
			{
				println("calling sat4j from java code.")
				is_sat = Methode1.DoIt(filename_of_formula)
			}
			case Sat4JVariant.SAT4J_JAR_VALUE : 
			{
				println("calling sat4j from jar")
				is_sat = Methode2.DoIt(filename_of_formula)
			
			}
			case Sat4JVariant.SAT4J_COMP_VALUE :
			{
				println("generating maven project")
				is_sat = Method3.DoIt(filename_of_formula)
				println("Done.")
			}
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
				return prop_to_dimacs(((ast.benchmark as BenchmarkFormula)
											.expressions.get(0) as EObject
				))
			}
			default : 
			{
				println("OUPS, ERREURRRRRRRRRRR")
				return ""
			}
		}
	}
	
	def get_call_method(SATMorphic ast)
	{
		// TODO Multiple solver
		switch ast.solvers.get(0).solver
		{
			case ast.solvers.get(0).solver instanceof Sat4J:
			{
				return (ast.solvers.get(0).solver as Sat4J).variant.getValue()
			}
			default:
			{
				println("Unknown solver")
				return -1
			}
		}
	}

	def String prop_to_dimacs(EObject formule)
	{
		tab_symb.clear()
		populate_tab_symb(formule)
		
		"p cnf " + tab_symb.size() + " " + count_clauses(formule) + "\n"
		+
		write_clauses(formule) + " 0"
	}
	
	def String write_clauses(EObject formule)
	{
		switch formule
		{
			case formule instanceof Or : 
			{	
				write_clauses( (formule as Or).left ) + " "
				+
				write_clauses((formule as Or).right)
			} 
			case formule instanceof And : 
			{	
				write_clauses((formule as And).left ) + " 0\n"
				+
				write_clauses((formule as And).right)
			}
			case formule instanceof Not : 
			{	
				"-" + write_clauses((formule as Not).expression)
			} 
			default : 
			{
				if((formule as Expression).id !== null)
				{
					"" + (tab_symb.indexOf((formule as Expression).id) + 1)
				}
				else
				{
					"ERROR"
				}
			}
		}
	}
	
	static ArrayList<String> tab_symb = new ArrayList<String>();
	static def int populate_tab_symb(EObject formule)
	{
		switch formule
		{
			case formule instanceof Or : 
			{	
				populate_tab_symb( (formule as Or).left )
				+
				populate_tab_symb((formule as Or).right)
			} 
			case formule instanceof And : 
			{	
				populate_tab_symb( (formule as And).left )
				+
				populate_tab_symb((formule as And).right)
			}
			case formule instanceof Not : 
			{	
				populate_tab_symb((formule as Not).expression)
			} 
			default : 
			{
				if((formule as Expression).id !== null)
				{
					var id = (formule as Expression).id
					if(!tab_symb.contains(id))
					{
						tab_symb.add(id)
						1
					}
					else
					{
						0
					}
				}
				else
				{
					0
				}
			}
		}
	}
	
	def int count_clauses(EObject formule)
	{
		if(formule instanceof And)
		{
			count_clauses((formule as And).right) + count_clauses((formule as And).left)
		}
		else
		{
			1
		}
	}
	
	def void pretty_print(EObject formule)
	{
		switch formule
		{
			case formule instanceof BiImpl :
			{	
				print("(" )
				pretty_print( (formule as BiImpl).left )  
				print(" <-> " )
				pretty_print((formule as BiImpl).right)
				print(")" )
			} 
			case formule instanceof Impl : 
			{	
				print("(" )
				pretty_print( (formule as Impl).left )  
				print(" -> " )
				pretty_print((formule as Impl).right)
				print(")" )
			} 
			case formule instanceof Or : 
			{	
				print("(" )
				pretty_print( (formule as Or).left )  
				print(" OR " )
				pretty_print((formule as Or).right)
				print(")" )
			} 
			case formule instanceof And : 
			{	
				print("(" )
				pretty_print( (formule as And).left )  
				print(" AND " );
				pretty_print((formule as And).right)
				print(")" )
			} 
			case formule instanceof Nand : 
			{	
				print("(" )
				pretty_print( (formule as Nand).left )  
				print(" NAND " );
				pretty_print((formule as Nand).right)
				print(")" )
			} 
			//case formule instanceof Primary : 
			//	println("oooo")
			case formule instanceof Not : 
			{	
				print("(" )
				print("NOT " );
				pretty_print((formule as Not).expression)
				print(")" )
			} 
			default : 
			{
				if((formule as Expression).id !== null)
				{
					print( (formule as Expression).id)
				}
				if((formule as Expression).^val !== null)
				{
					print( (formule as Expression).^val)
				}
			}
			//case formule instanceof Var : 
			//	println("oooo")
			//case formule instanceof Const : 
			//	println("oooo")
			
			
		}
	}
}
