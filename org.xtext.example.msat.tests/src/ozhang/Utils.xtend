package ozhang

import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.MSatFactory
import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.Or
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Impl
import java.util.Map

class Utils {
	
	def BiImpl operator_spaceship(Expression left, Expression right) {
		var biImpl = MSatFactory.eINSTANCE.createBiImpl
		biImpl.left = left
		biImpl.right = right
		return biImpl
	}
	
	def operator_doubleArrow(Expression left, Expression right) {
		var impl = MSatFactory.eINSTANCE.createImpl
		impl.left = left
		impl.right = right
		return impl
	}
	
	def And operator_multiply(Expression left, Expression right) {
		var and = MSatFactory.eINSTANCE.createAnd
		and.left = left
		and.right = right
		return and
	}
	
	def Or operator_plus(Expression left, Expression right) {
		var or = MSatFactory.eINSTANCE.createOr
		or.left = left
		or.right = right
		return or
	}
	
	def Nand operator_diamond(Expression left, Expression right) {
		var nand = MSatFactory.eINSTANCE.createNand
		nand.left = left
		nand.right = right
		return nand
	}
	
	def Not operator_not(Expression expr) {
		var not = MSatFactory.eINSTANCE.createNot
		not.expression = expr
		return not
	}
	
	def Expression deepCopy(Expression expr){
		return switch expr {
			case expr instanceof BiImpl : {
				var A = deepCopy((expr as BiImpl).left)
				var B = deepCopy((expr as BiImpl).right)
				deepCopy(A <=> B)
			}
			case expr instanceof Impl : {
				var A = deepCopy((expr as Impl).left)
				var B = deepCopy((expr as Impl).right)
				A => B
			}
			case expr instanceof Or : {
				var A = deepCopy((expr as Or).left)
				var B = deepCopy((expr as Or).right)
				A + B
			} 
			case expr instanceof And : {
				var A = deepCopy((expr as And).left)
				var B = deepCopy((expr as And).right)
				A * B
			}
			case expr instanceof Nand : {
				var A = deepCopy((expr as Nand).left)
				var B = deepCopy((expr as Nand).right)
				A <> B
			}
			case expr instanceof Not : {
				var A = deepCopy((expr as Not).expression)
				!A
			}
			default : {
				var A = MSatFactory.eINSTANCE.createExpression
				A.id = expr.id
				A
			}
		}
	}
	
	def Expression cnf(Expression expr) {
		return switch expr {
			case expr instanceof BiImpl : {
				var A = (expr as BiImpl).left
				var B = (expr as BiImpl).right
				var C = deepCopy(A)
				var D = deepCopy(B)
				cnf((A + B) * ((!C) + (!D)))
				}
			case expr instanceof Impl : {
				var A = (expr as Impl).left
				var B = (expr as Impl).right
				cnf((!A) + B)
			}
			case expr instanceof Or : {
				var A = cnf((expr as Or).left)
				var B = cnf((expr as Or).right)
				if (A instanceof And) {
					var C = deepCopy(B)
					cnf((B + A.left) * (C + A.right))
				} else if (B instanceof And) {
					var C = deepCopy(A)
					cnf((A + B.left) * (C + B.right))
				} else {
					A + B
				}
			}
			case expr instanceof And : {
				var A = cnf((expr as And).left)
				var B = cnf((expr as And).right)
				A * B
			}
			case expr instanceof Nand : {
				var A = cnf((expr as Nand).left)
				var B = cnf((expr as Nand).right)
				(!A) + (!B)
			}
			case expr instanceof Not : {
				var A = cnf((expr as Not).expression)
				!A
			}
			default : expr
		}
	}
	
	def String dimacs(Expression expr, Map<String,Integer> env) {
		return switch expr {
			case expr instanceof And : {
				var A = cnf((expr as And).left)
				var B = cnf((expr as And).right)
				dimacs(A, env) + ' 0\n' + dimacs(B, env) + ' 0'
			}
			case expr instanceof Or : {
				var A = cnf((expr as Or).left)
				var B = cnf((expr as Or).right)
				dimacs(A, env) + ' ' + dimacs(B, env)
			}
			case expr instanceof Not : {
				var A = (expr as Not).expression
				'-' + dimacs(A, env)
			}
			default : {
				var id = (expr as Expression).id
				if (env.containsKey(id)) {
					return env.get(id).toString
				} else {
					env.put(id, env.size+1)
					return (env.get(id)).toString
				}
			}
		}
	}
}