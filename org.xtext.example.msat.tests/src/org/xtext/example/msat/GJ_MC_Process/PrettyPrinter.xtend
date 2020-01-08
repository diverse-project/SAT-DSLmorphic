package org.xtext.example.msat.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Or

class PrettyPrinter {
	static def String prettyPrint(EObject e){
		switch e{
			case e instanceof And    : return (e as And)   .prettyPrintAnd
			case e instanceof Or     : return (e as Or)    .prettyPrintOr
			case e instanceof Not    : return (e as Not)   .prettyPrintNot
			case e instanceof BiImpl : return (e as BiImpl).prettyPrintBiImpl
			case e instanceof Impl   : return (e as Impl)  .prettyPrintImpl
			case e instanceof Nand   : return (e as Nand)  .prettyPrintNand	
			case e instanceof Expression : return (e as Expression) .prettyPrintExpression
			default                  : return ""
		}
	}
	static def String prettyPrintAnd(And e){
		return "("+prettyPrint(e.getLeft())+" ^ "+prettyPrint(e.getRight())+")";	
	}
	static def String prettyPrintOr(Or e){
		return "("+prettyPrint(e.getLeft())+" v "+prettyPrint(e.getRight())+")";
	}
	static def String prettyPrintNot(Not e){
		return "(!"+prettyPrint(e.getExpression())+")";
	}
	static def String prettyPrintBiImpl(BiImpl e){
		return "("+prettyPrint(e.getLeft())+" <=> "+prettyPrint(e.getRight())+")";
	}
	static def String prettyPrintImpl(Impl e){
		return "("+prettyPrint(e.getLeft())+" => "+prettyPrint(e.getRight())+")";
	}
	static def String prettyPrintNand(Nand e){
		return "("+prettyPrint(e.getLeft())+" | "+prettyPrint(e.getRight())+")";
	}
	
	static def String prettyPrintExpression(Expression e){
		if (e.getId() !== null && e.getVal() === null){
			return e.getId();
		} else if (e.getId() === null && e.getVal() !== null){
			return e.getVal();
		} else {
			return "Error"
		}
	}
}