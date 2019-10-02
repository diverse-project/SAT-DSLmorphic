package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.sat.*

class CNFConverter {

	static def Expression CNFConvert_Simpl(Expression e) {

		switch e {
			case e instanceof BiImpl: {

				var exprg1 = CNFConvert_Simpl((e as BiImpl).getLeft);
				var exprd1 = CNFConvert_Simpl((e as BiImpl).getRight);

				var exprd2 = CNFConvert_Simpl((e as BiImpl).getRight);
				var exprg2 = CNFConvert_Simpl((e as BiImpl).getLeft);

				var and = SatFactory.eINSTANCE.createAnd;
				var impl1 = SatFactory.eINSTANCE.createImpl;
				var impl2 = SatFactory.eINSTANCE.createImpl;

				impl1.setLeft(exprg1);
				impl1.setRight(exprd1);
				impl2.setLeft(exprd2);
				impl2.setRight(exprg2);
				and.left = impl1;
				and.right = impl2;

				return CNFConvert_Simpl(and)
			}
			case e instanceof Impl: {

				var exprg = CNFConvert_Simpl((e as Impl).getLeft);
				var exprd = CNFConvert_Simpl((e as Impl).getRight);
				var or = SatFactory.eINSTANCE.createOr;
				var not = SatFactory.eINSTANCE.createNot;
				not.expression = exprg;
				or.left = not;
				or.right = exprd;
				return or
			}
			case e instanceof Or: {
				var or = SatFactory.eINSTANCE.createOr;
				or.left = CNFConvert_Simpl((e as Or).left);
				or.right = CNFConvert_Simpl((e as Or).right);
				return or;

			}
			case e instanceof And: {
				var and = SatFactory.eINSTANCE.createAnd;
				and.left = CNFConvert_Simpl((e as And).left);
				and.right = CNFConvert_Simpl((e as And).right);
				return and;

			}
			case e instanceof Nand: {

				var exprg = CNFConvert_Simpl((e as Nand).getLeft);
				var exprd = CNFConvert_Simpl((e as Nand).getRight);
				var and = SatFactory.eINSTANCE.createAnd;
				var not = SatFactory.eINSTANCE.createNot;
				and.left = exprg;
				and.right = exprd;
				not.expression = and;
				return not;

			}
			case e instanceof Not: {
				var not = SatFactory.eINSTANCE.createNot;
				not.expression = CNFConvert_Simpl((e as Not).expression);
				return not;
			}
			default: {
				var exp = SatFactory.eINSTANCE.createExpression;
				exp.id = e.id;
				exp.setVal(e.getVal);
				return exp;
			}
		}
	}

	static def Expression CNFConvert_Neg(Expression e) {

		switch e {
			case e instanceof Not: {

				var expr = (e as Not).expression;

				switch expr {
					case expr instanceof Not:{
						var expr1 = SatFactory.eINSTANCE.createExpression;
						expr1 = CNFConvert_Neg((expr as Not).expression)
						return expr1
					}
					case expr instanceof And: {
						var or = SatFactory.eINSTANCE.createOr;
						var not1 = SatFactory.eINSTANCE.createNot;
						var not2 = SatFactory.eINSTANCE.createNot;
						not1.expression = (expr as And).left;
						not2.expression = (expr as And).right;
						or.left = CNFConvert_Neg(not1);
						or.right = CNFConvert_Neg(not2);
						return or
					}
					case expr instanceof Or: {
						var and = SatFactory.eINSTANCE.createAnd;
						var not1 = SatFactory.eINSTANCE.createNot;
						var not2 = SatFactory.eINSTANCE.createNot;
						not1.expression = (expr as Or).left;
						not2.expression = (expr as Or).right;
						and.left = CNFConvert_Neg(not1);
						and.right = CNFConvert_Neg(not2);
						return and
					}
					default: {
						var not = SatFactory.eINSTANCE.createNot;
						not.expression = expr;
						return not;
					}
				}
			}
			case e instanceof Or: {
				var or = SatFactory.eINSTANCE.createOr;
				or.left = CNFConvert_Neg((e as Or).left);
				or.right = CNFConvert_Neg((e as Or).right);
				return or
			}
			case e instanceof And: {
				var and = SatFactory.eINSTANCE.createAnd;
				and.left = CNFConvert_Neg((e as And).left);
				and.right = CNFConvert_Neg((e as And).right);
				return and
			}
			default: {
				var exp = SatFactory.eINSTANCE.createExpression;
				exp.id = e.id;
				exp.setVal(e.getVal);
				return exp;
			}
		}
	}

	static def Expression CNFConvert_Distrib(Expression e) {

		switch e {
			case e instanceof Or: {
				var exprl1 = CNFConvert_Distrib((e as Or).left);
				var exprr1 = CNFConvert_Distrib((e as Or).right);
				var exprl2 = CNFConvert_Distrib((e as Or).left);
				var exprr2 = CNFConvert_Distrib((e as Or).right);
				
				if (exprl1 instanceof And) {
					var and = SatFactory.eINSTANCE.createAnd;
					var or1 = SatFactory.eINSTANCE.createOr;
					var or2 = SatFactory.eINSTANCE.createOr;
					or1.left = (exprl1 as And).left;
					or1.right = exprr1;
					or2.left = (exprl1 as And).right;
					or2.right = exprr2;
					and.left = CNFConvert_Distrib(or1);
					and.right = CNFConvert_Distrib(or2);
					return and
				// (X & Y) o (Z & K) = (X o (Z & K)) & (Y o (Z & K))
				// (X & Y) o (Z o K) = (X o (Z o K)) & (Y o (Z o K))
				// (X & Y) o z = (X o z) & (Y o z)
				
				} else if (exprr1 instanceof And) {
					var and = SatFactory.eINSTANCE.createAnd;
					var or1 = SatFactory.eINSTANCE.createOr;
					var or2 = SatFactory.eINSTANCE.createOr;
					or1.left = (exprr1 as And).left;
					or1.right = exprl1;
					or2.left = (exprr2 as And).right;
					or2.right = exprl2;
					and.left = CNFConvert_Distrib(or1);
					and.right = CNFConvert_Distrib(or2);
					return and
				// (X & Y) o (Z & K) = ((X & Y) o Z) & ((X & Y) o K)
				// (X o Y) o (Z & K) = ((X o Y) o Z)) & ((X o Y) o K))
				// y  o (Z & K) = (X o z) & (Y o z)
				} else {
					var or = SatFactory.eINSTANCE.createOr;
					or.left = exprl1;
					or.right = exprr1;
					return or
				}

			}
			case e instanceof And: {
				var and = SatFactory.eINSTANCE.createAnd;
				and.left = CNFConvert_Distrib((e as And).left);
				and.right = CNFConvert_Distrib((e as And).right);
				return and
			}
			case e instanceof Not: {
				var not = SatFactory.eINSTANCE.createNot;
				not.expression = CNFConvert_Distrib((e as Not).expression);
				return not
			}
			default:{
				var exp = SatFactory.eINSTANCE.createExpression;
				exp.id = e.id;
				exp.setVal(e.getVal);
				return exp;
			}
		}
	}

	static def Expression CNFConvert(Expression e) {
		return CNFConvert_Distrib(CNFConvert_Neg(CNFConvert_Simpl(e)))
	}
}
