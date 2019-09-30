package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.BiImpl
import org.xtext.example.mydsl.sat.Impl
import org.xtext.example.mydsl.sat.Nand
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or

class PrettyPrinter {
	static def String prettyPrint(EObject e){
		switch e{
			case e instanceof And    : return (e as And)   .prettyPrint
			case e instanceof Or     : return (e as Or)    .prettyPrint
			case e instanceof Not    : return (e as Not)   .prettyPrint
			case e instanceof BiImpl : return (e as BiImpl).prettyPrint
			case e instanceof Impl   : return (e as Impl)  .prettyPrint
			case e instanceof Nand   : return (e as Nand)  .prettyPrint	
			default                  : return  ""
		}
	}
	static def String prettyPrint(And e){
		
	}
	static def String prettyPrint(Or e){
		
	}
	static def String prettyPrint(Not e){
		
	}
}