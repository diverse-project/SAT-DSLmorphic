package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.BiImpl
import org.xtext.example.mydsl.sat.Expression
import org.xtext.example.mydsl.sat.Impl
import org.xtext.example.mydsl.sat.Nand
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or
import org.xtext.example.mydsl.sat.SatFactory

class Simplifier {
	static def Expression simplify(EObject e){
		switch e{
			case e instanceof BiImpl : return (e as BiImpl).simplify
			case e instanceof Impl   : return (e as Impl)  .simplify
			case e instanceof Nand   : return (e as Nand)  .simplify
			case e instanceof And    : return (e as And)   .simplify
			case e instanceof Or     : return (e as Or)    .simplify
			case e instanceof Not    : return (e as Not)   .simplify
			default                  : return  e as Expression
		}
	}
	
	static def Expression simplify(BiImpl e){
		val lhsReplacement = simplify(e.left)
		val rhsReplacement = simplify(e.right)
		
		e.left = lhsReplacement
		e.right = rhsReplacement
		
		if(e.left.^val != null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				val not = SatFactory.eINSTANCE.createNot
				not.expression = e.right
				return not
			}
		}
		if(e.right.^val != null){
			if(e.right.^val == "true"){
				return e.left
			} else {
				val not = SatFactory.eINSTANCE.createNot
				not.expression = e.left
				return not
			}
		}
		
		val andTrue   = SatFactory.eINSTANCE.createAnd
		val andFalse  = SatFactory.eINSTANCE.createAnd
		val notLeft   = SatFactory.eINSTANCE.createNot
		val notRight  = SatFactory.eINSTANCE.createNot
		val or        = SatFactory.eINSTANCE.createOr
		
		andTrue.left = lhsReplacement
		andTrue.right = rhsReplacement
		
		notLeft.expression  = lhsReplacement
		notRight.expression = rhsReplacement
		
		andFalse.left = notLeft
		andFalse.right = notRight
		
		or.left = andTrue
		or.right = andFalse
		
		return or
	}
	
	static def Expression simplify(Impl e){
		val lhsReplacement = simplify(e.left)
		val rhsReplacement = simplify(e.right)
		
		e.left = lhsReplacement
		e.right = rhsReplacement
		
		if(e.left.^val != null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				val exp = SatFactory.eINSTANCE.createExpression
				exp.^val = "true"
				return exp
			}
		}
		if(e.right.^val != null){
			if(e.right.^val == "true"){
				val exp = SatFactory.eINSTANCE.createExpression
				exp.^val = "true"
				return exp
			} else {
				val not = SatFactory.eINSTANCE.createNot
				not.expression = e.left
				return not
			}
		}
		
		val or  = SatFactory.eINSTANCE.createOr
		val not = SatFactory.eINSTANCE.createNot
		
		not.expression = lhsReplacement
		
		or.left = not
		or.right = rhsReplacement
		
		return or
	}
	
	static def Expression simplify(Nand e){
		val lhsReplacement = simplify(e.left)
		val rhsReplacement = simplify(e.right)
		
		e.left = lhsReplacement
		e.right = rhsReplacement
		
		if(e.left.^val != null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				return e.left
			}
		}
		if(e.right.^val != null){
			if(e.right.^val == "true"){
				return e.left
			} else {
				return e.right
			}
		}
		
		val and = SatFactory.eINSTANCE.createAnd
		val not = SatFactory.eINSTANCE.createNot
		
		and.left = lhsReplacement
		and.right = rhsReplacement
		not.expression = and
		
		return not
	}
	
	static def Expression simplify(And e){
		val lhsReplacement = simplify(e.left)
		val rhsReplacement = simplify(e.right)
		
		e.left = lhsReplacement
		e.right = rhsReplacement
		
		if(e.left.^val != null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				return e.left
			}
		}
		if(e.right.^val != null){
			if(e.right.^val == "true"){
				return e.left
			} else {
				return e.right
			}
		}
		e
	}
	
	static def Expression simplify(Or e){
		val lhsReplacement = simplify(e.left)
		val rhsReplacement = simplify(e.right)
		
		e.left = lhsReplacement
		e.right = rhsReplacement
		
		if(e.left.^val != null){
			if(e.left.^val == "true"){
				return e.left
			} else {
				return e.right
			}
		}
		if(e.right.^val != null){
			if(e.right.^val == "true"){
				return e.right
			} else {
				return e.left
			}
		}
		e
	}
	
	static def Expression simplify(Not e){
		val expReplacement = simplify(e.expression)
		
		e.expression = expReplacement

		if(e.expression.^val != null){
			val exp = SatFactory.eINSTANCE.createExpression
			if(e.expression.^val == "true"){
				exp.^val="false"
			} else {
				exp.^val="true"
			}
			return exp
		}
		e
	}
}