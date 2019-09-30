package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.BiImpl
import org.xtext.example.mydsl.sat.Impl
import org.xtext.example.mydsl.sat.Nand
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or

class Simplifier {
	static def EObject simplify(EObject e){
		switch e{
			case e instanceof BiImpl : return (e as BiImpl).simplify
			case e instanceof Impl   : return (e as Impl)  .simplify
			case e instanceof Nand   : return (e as Nand)  .simplify
			case e instanceof And    : return (e as And)   .simplify
			case e instanceof Or     : return (e as Or)    .simplify
			case e instanceof Not    : return (e as Not)   .simplify
			default                  : return  e
		}
	}
	
	static def EObject simplify(BiImpl e){
		e
	}
	
	static def EObject simplify(Impl e){
		e
	}
	
	static def EObject simplify(Nand e){
		e
	}
	
	static def EObject simplify(And e){
		e
	}
	
	static def EObject simplify(Or e){
		e
	}
	
	static def EObject simplify(Not e){
		e
	}
}