package org.xtext.example.msat.CoudrayThuillier.utils

import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Or
import org.xtext.example.mydsl1.mSat.util.MSatSwitch
import org.xtext.example.mydsl1.mSat.impl.MSatFactoryImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.xtext.example.mydsl1.mSat.Not

class CNFConverter {

	def static Expression convert_to_CNF(Expression e) {
		var impl_simplifier = new OpSimplifier
		var not_simplifier = new NotSimplifier
		var distrib_simplifier = new DistribSimplifier
		var const_simplifier = new ConstSimplifier

		return const_simplifier.doSwitch(
			distrib_simplifier.doSwitch(
				not_simplifier.doSwitch(
					impl_simplifier.doSwitch(e)
				)
			)
		)
	}
}

class OpSimplifier extends MSatSwitch<Expression> {
	override Expression caseAnd(And e) {
		e.left = this.doSwitch(e.left)
		e.right = this.doSwitch(e.right)
		return e
	}

	override Expression caseOr(Or e) {
		e.left = this.doSwitch(e.left)
		e.right = this.doSwitch(e.right)
		return e
	}

	override Expression caseNand(Nand e) {
		var left = this.doSwitch(e.left)
		var right = this.doSwitch(e.right)
		var and = MSatFactoryImpl.eINSTANCE.createAnd
		and.left = left
		and.right = right
		var not_and = MSatFactoryImpl.eINSTANCE.createNot
		not_and.expression = and
		return not_and
	}

	override Expression caseImpl(Impl e) {
		var left = this.doSwitch(e.left)
		var right = this.doSwitch(e.right)
		var not_left = MSatFactoryImpl.eINSTANCE.createNot
		not_left.expression = EcoreUtil.copy(left)
		var not_left_or_right = MSatFactoryImpl.eINSTANCE.createOr
		not_left_or_right.left = not_left
		not_left_or_right.right = EcoreUtil.copy(right)
		return not_left_or_right
	}

	override Expression caseBiImpl(BiImpl e) {
		var left = e.left
		var right = e.right
		var impl_1 = MSatFactoryImpl.eINSTANCE.createImpl
		impl_1.left = EcoreUtil.copy(left)
		impl_1.right = EcoreUtil.copy(right)
		var impl_2 = MSatFactoryImpl.eINSTANCE.createImpl
		impl_2.left = EcoreUtil.copy(right)
		impl_2.right = EcoreUtil.copy(left)
		var and = MSatFactoryImpl.eINSTANCE.createAnd
		and.left = caseImpl(impl_1)
		and.right = caseImpl(impl_2)
		return and
	}

	override Expression caseExpression(Expression e) {
		return e
	}

	override Expression caseNot(Not e) {
		e.expression = this.doSwitch(e.expression)
		return e
	}
}

class NotSimplifier extends MSatSwitch<Expression> {
	override Expression caseAnd(And e) {
		e.left = this.doSwitch(e.left)
		e.right = this.doSwitch(e.right)
		return e
	}

	override Expression caseOr(Or e) {
		e.left = this.doSwitch(e.left)
		e.right = this.doSwitch(e.right)
		return e
	}

	override Expression caseExpression(Expression e) {
		return e
	}

	override Expression caseNot(Not e) {
		var not_find_simplifier = new NotFindSimplifier
		return not_find_simplifier.doSwitch(e.expression)
	}
}

class NotFindSimplifier extends MSatSwitch<Expression> {
	override Expression caseAnd(And e) {
		var left = e.left
		var right = e.right
		var not_left = MSatFactoryImpl.eINSTANCE.createNot
		not_left.expression = left
		var not_right = MSatFactoryImpl.eINSTANCE.createNot
		not_right.expression = right
		var or = MSatFactoryImpl.eINSTANCE.createOr
		var not_simplifier = new NotSimplifier
		or.left = not_simplifier.doSwitch(not_left)
		or.right = not_simplifier.doSwitch(not_right)
		return or
	}

	override Expression caseOr(Or e) {
		var left = e.left
		var right = e.right
		var not_left = MSatFactoryImpl.eINSTANCE.createNot
		not_left.expression = left
		var not_right = MSatFactoryImpl.eINSTANCE.createNot
		not_right.expression = right
		var and = MSatFactoryImpl.eINSTANCE.createAnd
		var not_simplifier = new NotSimplifier
		and.left = not_simplifier.doSwitch(not_left)
		and.right = not_simplifier.doSwitch(not_right)
		return and
	}

	override Expression caseExpression(Expression e) {
		var not = MSatFactoryImpl.eINSTANCE.createNot
		not.expression = e
		return not
	}

	override Expression caseNot(Not e) {
		var not_simplifier = new NotSimplifier
		return not_simplifier.doSwitch(e.expression)
	}
}

class DistribSimplifier extends MSatSwitch<Expression> {
	override Expression caseAnd(And e) {
		return e
	}

	override Expression caseOr(Or e) {
		var left = this.doSwitch(e.left)
		var right = this.doSwitch(e.right)

		if (left instanceof And) {
			var and = MSatFactoryImpl.eINSTANCE.createAnd
			var or1 = MSatFactoryImpl.eINSTANCE.createOr
			var or2 = MSatFactoryImpl.eINSTANCE.createOr
			or1.left = EcoreUtil.copy((left as And).left)
			or1.right = EcoreUtil.copy(right)
			or2.left = EcoreUtil.copy((left as And).right)
			or2.right = EcoreUtil.copy(right)
			and.left = this.doSwitch(or1);
			and.right = this.doSwitch(or2);
			return and
		}

		if (right instanceof And) {
			e.left = right
			e.right = left
			return this.doSwitch(e)
		}

		e.left = left
		e.right = right
		return e
	}

	override Expression caseExpression(Expression e) {
		return e
	}

	override Expression caseNot(Not e) {
		e.expression = this.doSwitch(e.expression)
		return e
	}
}

class ConstSimplifier extends MSatSwitch<Expression> {
	override Expression caseAnd(And e) {
		var left = this.doSwitch(e.left)
		var right = this.doSwitch(e.right)

		if (left.^val !== null) {
			if (left.^val.equalsIgnoreCase("false")) {
				return left
			} else {
				return right
			}
		}

		if (right.^val !== null) {
			if (right.^val.equalsIgnoreCase("false")) {
				return right
			} else {
				return left
			}
		}

		e.left = left
		e.right = right
		return e
	}

	override Expression caseOr(Or e) {
		var left = this.doSwitch(e.left)
		var right = this.doSwitch(e.right)

		if (left.^val !== null) {
			if (left.^val.equalsIgnoreCase("true")) {
				return left
			} else {
				return right
			}
		}

		if (right.^val !== null) {
			if (right.^val.equalsIgnoreCase("true")) {
				return right
			} else {
				return left
			}
		}

		e.left = left
		e.right = right
		return e
	}

	override Expression caseExpression(Expression e) {
		return e
	}

	override Expression caseNot(Not e) {
		var expr = this.doSwitch(e.expression)

		if (expr.^val !== null) {
			if (expr.^val.equalsIgnoreCase("true")) {
				expr.^val = "false"
			} else {
				expr.^val = "true"
			}
			return expr
		}

		e.expression = expr
		return e
	}
}
