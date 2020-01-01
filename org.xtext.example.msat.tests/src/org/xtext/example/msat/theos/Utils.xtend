package org.xtext.example.msat.theos

import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Or

class Utils 
{

	static def String prop_to_dimacs(EObject formule)
	{
		tab_symb.clear()
		populate_tab_symb(formule)
		
		"p cnf " + tab_symb.size() + " " + count_clauses(formule) + "\n"
		+
		write_clauses(formule) + " 0"
	}
	
	static def String write_clauses(EObject formule)
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
	
	static def int count_clauses(EObject formule)
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
	
	static def void pretty_print(EObject formule)
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