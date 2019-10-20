package org.xtext.example.mydsl.GJ_MC_Process

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or

class SATUtils {
	static def List<Expression> getClauses(Expression e){
		var out = new ArrayList()
		if(!(e instanceof And)){
			out.add(e)
			return out
		}
		val and = e as And
		out.addAll(getClauses(and.left))
		out.addAll(getClauses(and.right))
		out
	}
	
	static def List<Expression> getAtoms(Expression e){
		var out = new ArrayList()
		if(e instanceof Not){
			if(e.expression instanceof Expression){
				out.add(e)
				return out
			}
			out.addAll(getAtoms(e.expression))
			return out
		}
		if(e instanceof And){
			val binop = e as And
			out.addAll(getAtoms(binop.left))
			out.addAll(getAtoms(binop.right))
			return out
		}
		if(e instanceof Or){
			val binop = e as Or
			out.addAll(getAtoms(binop.left))
			out.addAll(getAtoms(binop.right))
			return out
		}
		out.add(e)
		return out
	}
	
	static def equals(EObject e1, EObject e2){
		EcoreUtil2.equals(e1, e2)
	}
}