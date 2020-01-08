package org.xtext.example.msat.GJ_MC_Process

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.MSatFactory
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Or

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
		
		if(e.left.^val !== null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				val not = MSatFactory.eINSTANCE.createNot
				not.expression = e.right
				return not
			}
		}
		if(e.right.^val !== null){
			if(e.right.^val == "true"){
				return e.left
			} else {
				val not = MSatFactory.eINSTANCE.createNot
				not.expression = e.left
				return not
			}
		}
		
		val andTrue   = MSatFactory.eINSTANCE.createAnd
		val andFalse  = MSatFactory.eINSTANCE.createAnd
		val notLeft   = MSatFactory.eINSTANCE.createNot
		val notRight  = MSatFactory.eINSTANCE.createNot
		val or        = MSatFactory.eINSTANCE.createOr
		
		andTrue.left  = EcoreUtil2.copy(lhsReplacement)
		andTrue.right = EcoreUtil2.copy(rhsReplacement)
		
		notLeft.expression  = EcoreUtil2.copy(lhsReplacement)
		notRight.expression = EcoreUtil2.copy(rhsReplacement)
		
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
		
		if(e.left.^val !== null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				val exp = MSatFactory.eINSTANCE.createExpression
				exp.^val = "true"
				return exp
			}
		}
		if(e.right.^val !== null){
			if(e.right.^val == "true"){
				val exp = MSatFactory.eINSTANCE.createExpression
				exp.^val = "true"
				return exp
			} else {
				val not = MSatFactory.eINSTANCE.createNot
				not.expression = e.left
				return not
			}
		}
		
		val or  = MSatFactory.eINSTANCE.createOr
		val not = MSatFactory.eINSTANCE.createNot
		
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
		
		if(e.left.^val !== null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				e.left.^val = "true"
				return e.left
			}
		}
		if(e.right.^val !== null){
			if(e.right.^val == "true"){
				return e.left
			} else {
				e.right.^val = "true"
				return e.right
			}
		}
		
		val and = MSatFactory.eINSTANCE.createAnd
		val not = MSatFactory.eINSTANCE.createNot
		
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
		
		if(e.left.^val !== null){
			if(e.left.^val == "true"){
				return e.right
			} else {
				return e.left
			}
		}
		if(e.right.^val !== null){
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
		
		if(e.left.^val !== null){
			if(e.left.^val == "true"){
				return e.left
			} else {
				return e.right
			}
		}
		if(e.right.^val !== null){
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

		if(e.expression.^val !== null){
			val exp = MSatFactory.eINSTANCE.createExpression
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