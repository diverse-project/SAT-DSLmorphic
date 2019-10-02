package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.BiImpl
import org.xtext.example.mydsl.sat.Impl
import org.xtext.example.mydsl.sat.Nand
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or
import org.eclipse.emf.ecore.EObject

class PrettyPrinter {
	static def String print(EObject e)
	{
		switch e 
		{
			case e instanceof And:
			{
				val eobj = e as And
				return "(" + print(eobj.getLeft()) + "&&" + print(eobj.getRight()) + ")";
			}
			case e instanceof Or:
			{
				val eobj = e as Or
				return "(" + print(eobj.getLeft()) + "||" + print(eobj.getRight()) + ")";
			}
			case e instanceof Not:
			{
				val eobj = e as Not
				return "( !"+ print(eobj.getExpression()) + ")";
			}
			case e instanceof Impl:
			{
				val eobj = e as Impl
				return "(" + print(eobj.getLeft()) + "->" + print(eobj.getRight()) + ")";
			}
			case e instanceof BiImpl:
			{
				val eobj = e as BiImpl
				return "(" + print(eobj.getLeft()) + "<->" + print(eobj.getRight()) + ")";
			}
			case e instanceof Nand:
			{
				val eobj = e as Nand
				return "(" + print(eobj.getLeft()) + "!&" + print(eobj.getRight()) + ")";
			}
			case e instanceof Expression:
			{
				val eobj = e as Expression
				return " " + eobj.getId() + "=" + eobj.getVal();
			}
			default:
			{
				return ""
			}
		}
	}
}