package org.xtext.example.mydsl.tests

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
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.satt.And
import org.xtext.example.mydsl.satt.BiImpl
import org.xtext.example.mydsl.satt.Expression
import org.xtext.example.mydsl.satt.FILE
import org.xtext.example.mydsl.satt.Impl
import org.xtext.example.mydsl.satt.Nand
import org.xtext.example.mydsl.satt.Not
import org.xtext.example.mydsl.satt.Or
import org.xtext.example.mydsl.satt.SAT

@ExtendWith(InjectionExtension)
@InjectWith(SattInjectorProvider)



class Mein 
{
	@Inject
	ParseHelper<SAT> parseHelper
	
	@Test
	def void main()
	{	
		println("oui");
		create_file();
		
		
	}
	
	def create_file()
	{
		//val ast = parseHelper.parse('''
		//		A ^ (B v C) ^ (~A)
		//		sat4j-java
		//''')
		
		val text = new String(Files.readAllBytes(Paths.get("fomula2.satt")), StandardCharsets.UTF_8);

		val ast = parseHelper.parse(text);
		
		println(text);
		
		val dimacs_formula = read_entry(ast)
		val call_method = get_call_method(ast)
				
		println(dimacs_formula)
		
		println(call_method)
		
		
		val filename= "formula.cnf"
		val fileWriter = new FileWriter(new File(filename));
		fileWriter.write(prop_to_dimacs(ast));
		fileWriter.close();
		
	}
	
	def read_entry(SAT ast)
	{
		switch ast.source
		{
			case ast.source instanceof FILE :
			{ 
				println("oooo")
				println("ooooooooo")
				val filename = (ast.source as FILE).file
				println("hhhhhhh")
				println(filename)
				return new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
			}
			case ast.source instanceof Expression :
			{
				println("oo2")
				return prop_to_dimacs( (ast.source as EObject))
			}
			default : 
			{
				println(typeof (ast.source))
				println("OUPS, ERREURRRRRRRRRRR")
			}
		}
	}
	
	def get_call_method(SAT ast)
	{
		return ast.callMethod
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
