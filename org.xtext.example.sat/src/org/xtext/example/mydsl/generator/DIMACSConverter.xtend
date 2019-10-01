package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.sat.*
import java.util.HashMap

class DIMACSConverter {
	
	 private static int ClausesCount = 0;
	 private static int Counter = 1;
	 private static HashMap<String,Integer> Vars = new HashMap;
	 	
	 private static def void countClauses(Expression e) {
		switch e {
				
			case e instanceof And : {
				countClauses( (e as And).getLeft);
				countClauses( (e as And).getRight);
				}
				
			case e instanceof Or :  {
				ClausesCount ++;
				countVar( (e as Or).getLeft);
				countVar( (e as Or).getRight);
				}
				
			case e instanceof Not :
				countVar((e as Not).getExpression)
			
			default : 
				if (!Vars.containsKey(e.getId.toString)) { Vars.put(e.getId.toString,Counter); Counter++;} 				
				
		}
	}
		
		private static def void countVar(Expression e){
			switch e {
				
				case e instanceof Or :  {
				countVar( (e as Or).getLeft);
				countVar( (e as Or).getRight);
				}
				
				case e instanceof Not :
					countVar((e as Not).getExpression)	
				
				default : 
				if (!Vars.containsKey(e.getId.toString)) { Vars.put(e.getId.toString,Counter); Counter++;} 
				
			}
		}
		
		private static def String writeExpr(Expression e){
			var output = "";
			switch e {
				
				case e instanceof And :  {
				output += writeExpr( (e as And).getLeft);
				output += writeExpr( (e as And).getRight);
				}
				
				default : 
					output += "\n" + writeClause(e) + "0"
			}
			return output;
		}
		
		private static def String writeClause( Expression e){
			var output = "";
			switch e {
				
				case e instanceof Or :  {
				output += writeClause( (e as Or).getLeft);
				output += writeClause( (e as Or).getRight);
				}
				
				case e instanceof Not :
					output += "-" + Vars.get((e as Not).getExpression.getId.toString) + " "
				
				default : 
					output += Vars.get(e.getId.toString) + " "
			}
			return output;
		}
		
		static def String toDIMACS( Expression e){
			ClausesCount = 0;
			Counter = 1;
	 		Vars.clear;
			countClauses(e);
			var output = "p cnf " + Vars.size + " " + ClausesCount + writeExpr(e);			
			return output
		}
}