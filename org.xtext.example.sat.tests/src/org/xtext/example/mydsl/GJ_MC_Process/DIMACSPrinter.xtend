package org.xtext.example.mydsl.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or

class DIMACSPrinter {
	
	//HashTable<String,Integer> numberIds = new HashTable<String, Integer>();
	static val numberIds = newHashMap();
	static var nbClauses = 1;
	
	static def String dimacsFile(EObject e){
		numberIds.clear
		nbClauses = 1
		var dimacsClauses = dimacsPrint(e)
		if(e instanceof Not || e instanceof Or){
			dimacsClauses += "0"
		} else {
			dimacsClauses = dimacsClauses.substring(0,dimacsClauses.length-1)
		}
		val fileCore = "p cnf " +
						numberIds.size.toString() + " " +
						nbClauses + "\n" +
						dimacsClauses
		fileCore
	}
	
	static def String dimacsPrint(EObject e){
		switch e{
			case e instanceof And    : return (e as And)   .dimacsPrintAnd
			case e instanceof Or     : return (e as Or)    .dimacsPrintOr
			case e instanceof Not    : return (e as Not)   .dimacsPrintNot
			/*
			case e instanceof BiImpl : return (e as BiImpl).DIMACSPrint
			case e instanceof Impl   : return (e as Impl)  .DIMACSPrint
			case e instanceof Nand   : return (e as Nand)  .DIMACSPrint	
			*/
			case e instanceof Expression : return (e as Expression) .dimacsPrintExpression
			default                  : return  ""
		}
	}
	static def String dimacsPrintAnd(And e){
		var out = ""
		
		val clauses = SATUtils.getClauses(e)
		
		nbClauses = clauses.size
		
		for(clause : clauses){
			out += dimacsPrint(clause) + "0\n"
		}
		
		return out;	
	}
	static def String dimacsPrintOr(Or e){
		//val leftLitteral = e.getLeft(); //necessarily litteral in CNF
		//val rightExpression = e.getRight();
		
		var out = ""
		
		val atoms = SATUtils.getAtoms(e)
		
		for(atom : atoms){
			out += dimacsPrint(atom)
		}
		
		return out;
	}
	static def String dimacsPrintNot(Not e){
		return "-"+dimacsPrint(e.getExpression());
	}
	/*
	static def String DIMACSPrint(BiImpl e){
		return DIMACSPrint( Simplifier.simplify(e) );
	}
	static def String DIMACSPrint(Impl e){
		return DIMACSPrint( Simplifier.simplify(e) );
	}
	static def String DIMACSPrint(Nand e){
		return DIMACSPrint( Simplifier.simplify(e) );
	}
	*/
	static def String dimacsPrintExpression(Expression e){
		if (e.getId() !== null && e.getVal() === null){
			return getIdNumber( e.getId() ) + " ";
		} else if (e.getId() === null && e.getVal() !== null){
			return "const"; //e.getVal();
		} else {
			return "Error";
		}
	}
	
	static def String getIdNumber(String id){
		if (numberIds.containsKey(id)){
			return numberIds.get(id) as String;
		}
		else {
			numberIds.put(id,(numberIds.size+1).toString())
			return numberIds.size.toString()
		}
		//return 1.toString();
	}
}