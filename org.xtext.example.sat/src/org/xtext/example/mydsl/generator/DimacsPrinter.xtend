package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or
import org.eclipse.emf.ecore.EObject

class DimacsPrinter {
	
	static def String print(EObject e)
	{
		return "c\n" + "p cnf \n" + format(e)
	}
	
	static def String format(EObject e)
	{
		switch e 
		{
			case e instanceof And:
			{
				val eobj = e as And
				return format(eobj.getLeft()) + "0\n" + format(eobj.getRight()) + " 0";
			}
			case e instanceof Or:
			{
				val eobj = e as Or
				return format(eobj.getLeft()) + " " + format(eobj.getRight());
			}
			case e instanceof Not:
			{
				val eobj = e as Not
				return "-"+ format(eobj.getExpression());
			}
			default:
			{
				return ""
			}
		}
	}
}