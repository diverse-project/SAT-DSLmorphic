package org.xtext.example.msat.GJ_MC_Process

import java.util.ArrayList
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

class ConjunctiveNormalForm {
	static def Expression toCleanCNF(EObject e){
		e.toCNF.cleanDouble
	}
	
	static def Expression toCNF(EObject e){
		switch e{
			case e instanceof BiImpl : return (e as BiImpl).toCNF
			case e instanceof Impl   : return (e as Impl)  .toCNF
			case e instanceof Nand   : return (e as Nand)  .toCNF
			case e instanceof And    : return (e as And)   .toCNF
			case e instanceof Or     : return (e as Or)    .toCNF
			case e instanceof Not    : return (e as Not)   .toCNF
			default                  : return  e as Expression
		}
	}
	
	static def Expression toCNF(BiImpl e){
		e
	}
	
	static def Expression toCNF(Impl e){
		e
	}
	
	static def Expression toCNF(Nand e){
		e
	}
	
	static def Expression toCNF(And e){
		e.left = toCNF(e.left)
		e.right = toCNF(e.right)
		e
	}
	
	static def Expression toCNF(Or e){
		val lhsReplacement = toCNF(e.left)
		val rhsReplacement = toCNF(e.right)
		val clausesP = SATUtils.getClauses(lhsReplacement)
		val clausesQ = SATUtils.getClauses(rhsReplacement)
		
		val generatedClauses = new ArrayList<Expression>()
		
		for(p : clausesP){
			for(q : clausesQ){
				var or = MSatFactory.eINSTANCE.createOr
				or.left = EcoreUtil2.copy(p)
				or.right = EcoreUtil2.copy(q)
				generatedClauses.add(or)
			}
		}
		
		while(generatedClauses.size > 1){
			val p = generatedClauses.head
			generatedClauses.remove(0)
			val q = generatedClauses.head
			generatedClauses.remove(0)
			var and = MSatFactory.eINSTANCE.createAnd
			and.left = p
			and.right = q
			generatedClauses.add(and)
		}
		return generatedClauses.head
	}
	
	static def Expression toCNF(Not e){
		if(e.expression instanceof Not){
			return toCNF( (e.expression as Not).expression )
		}
		if(e.expression instanceof And){
			val or       = MSatFactory.eINSTANCE.createOr
			val notLeft  = MSatFactory.eINSTANCE.createNot
			val notRight = MSatFactory.eINSTANCE.createNot
			
			notLeft.expression  = (e.expression as And).left
			notRight.expression = (e.expression as And).right
			
			or.left  = notLeft
			or.right = notRight
			
			val cnf = toCNF(or)
			return cnf
		}
		if(e.expression instanceof Or){
			val and      = MSatFactory.eINSTANCE.createAnd
			val notLeft  = MSatFactory.eINSTANCE.createNot
			val notRight = MSatFactory.eINSTANCE.createNot
			
			notLeft.expression  = (e.expression as Or).left
			notRight.expression = (e.expression as Or).right
			
			and.left  = notLeft
			and.right = notRight
			
			val cnf = toCNF(and)
			return cnf
		}
		e
	}
	
	static def Expression cleanDouble(Expression e){
		if(e instanceof And){
			
			val clauses = SATUtils.getClauses(e)
			for(var i = 0; i < clauses.length; i++){
				clauses.set(i,cleanDouble(clauses.get(i)))
			}
			
			for(var i = 0; i < clauses.length; i++){
				for(var j = i+1; j < clauses.length; j++){
					if(EcoreUtil2.equals(clauses.get(i),clauses.get(j))){
						clauses.remove(j)
						j--
					}
				}
			}
			
			while(clauses.size > 1){
				val p = clauses.head
				clauses.remove(0)
				val q = clauses.head
				clauses.remove(0)
				var and = MSatFactory.eINSTANCE.createAnd
				and.left = p
				and.right = q
				clauses.add(and)
			}
			return clauses.head
		}
		if(e instanceof Or){			
			val atoms = SATUtils.getAtoms(e)
			
			for(var i = 0; i < atoms.length; i++){
				for(var j = i+1; j < atoms.length; j++){
					if(EcoreUtil2.equals(atoms.get(i),atoms.get(j))){
						atoms.remove(j)
						j--
					}
				}
			}
			
			while(atoms.size > 1){
				val p = atoms.head
				atoms.remove(0)
				val q = atoms.head
				atoms.remove(0)
				var or = MSatFactory.eINSTANCE.createOr
				or.left = p
				or.right = q
				atoms.add(or)
			}
			return atoms.head
		}
		e
	}
}