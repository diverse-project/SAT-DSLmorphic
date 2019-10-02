package org.xtext.example.mydsl.generator


import org.xtext.example.mydsl.sat.*

class CNFConverter {
	
	
	static def Expression CNFConvert_Simpl(Expression e) {
		
 	
		switch e {
			case e instanceof BiImpl : { 
				 var exprg = CNFConvert_Simpl((e as BiImpl).getLeft);
				 var exprd = CNFConvert_Simpl((e as BiImpl).getRight);
				 var and = SatFactory.eINSTANCE.createAnd;
				 var or1 = SatFactory.eINSTANCE.createOr;
				 var or2 = SatFactory.eINSTANCE.createOr;
				 var notg = SatFactory.eINSTANCE.createNot;
				 var notd = SatFactory.eINSTANCE.createNot;
				 notg.expression = exprg; notd.expression = exprd;
				 or1.left = notg; or1.right = exprd;
				 or2.left = notd; or2.right = exprg;
				 and.left = or1; and.right = or2;
				 return and;
				}
			case e instanceof Impl : {
				
				 var exprg = CNFConvert_Simpl((e as Impl).getLeft);
				 var exprd = CNFConvert_Simpl((e as Impl).getRight);
				 var or = SatFactory.eINSTANCE.createOr;
				 var not = SatFactory.eINSTANCE.createNot;
				 not.expression = exprg; or.left = not; or.right = exprd;
				 return or
			}
				
			case e instanceof Or : { 
				(e as Or).left = CNFConvert_Simpl((e as Or).left);
				(e as Or).right = CNFConvert_Simpl((e as Or).right);
				return e;
				
				}
				
			case e instanceof And : {
				(e as And).left = CNFConvert_Simpl((e as And).left);
				(e as And).right = CNFConvert_Simpl((e as And).right);
				return e;
				
				}
				
			case e instanceof Nand : {
				
				
				 var exprg = CNFConvert_Simpl((e as Nand).getLeft);
				 var exprd = CNFConvert_Simpl((e as Nand).getRight);
				 var and = SatFactory.eINSTANCE.createAnd;
				 var not = SatFactory.eINSTANCE.createNot;
				 and.left = exprg; and.right = exprd;
				 not.expression = and;
				 return not;
				
			}
				
			case e instanceof Not : {
				(e as Not).expression = CNFConvert_Simpl((e as Not).expression);
				return e;
			}
				
			
			default : return e
				
			}
		
	}
	
	static def Expression CNFConvert_Neg( Expression e){
		
		switch e {
			
			case e instanceof Not: {
				
				var expr = (e as Not).expression;
				
				switch expr {
					
					case expr instanceof Not :
						return CNFConvert_Neg(expr)
					
					case expr instanceof And : {
						
				 		var or = SatFactory.eINSTANCE.createOr;
						var not1 = SatFactory.eINSTANCE.createNot;
						var not2 = SatFactory.eINSTANCE.createNot;
						not1.expression = (expr as And).left;
						not2.expression = (expr as And).right;
				 		or.left = CNFConvert_Neg(not1);
				 		or.right = CNFConvert_Neg(not2);
				 		return or
					}
					
					case expr instanceof Or : {
						
				 		var and = SatFactory.eINSTANCE.createAnd;
						var not1 = SatFactory.eINSTANCE.createNot;
						var not2 = SatFactory.eINSTANCE.createNot;
						not1.expression = (expr as Or).left;
						not2.expression = (expr as Or).right;
				 		and.left = CNFConvert_Neg(not1);
				 		and.right = CNFConvert_Neg(not2);
				 		return and
					}
				}
			}
			
			case e instanceof Or:{
				(e as Or).left = CNFConvert_Neg((e as Or).left);
				(e as Or).right = CNFConvert_Neg((e as Or).right);
				return e
			}
			
			case e instanceof And:{
				(e as And).left = CNFConvert_Neg((e as And).left);
				(e as And).right = CNFConvert_Neg((e as And).right);
				return e
			}
			
			default : return e
		}
	}
	
	static def Expression CNFConvert_Distrib(Expression e){
		
		switch e {
			
			case e instanceof Or :{
				var exprl = CNFConvert_Distrib((e as Or).left);
				var exprr = CNFConvert_Distrib((e as Or).right);
				if (exprl instanceof And){
					var and = SatFactory.eINSTANCE.createAnd;
			 		var or1 = SatFactory.eINSTANCE.createOr;
			 		var or2 = SatFactory.eINSTANCE.createOr;
			 		or1.left = (exprl as And).left;
			 		or1.right = exprr;
			 		or2.left = (exprl as And).right;
			 		or2.right = exprr;
			 		and.left = CNFConvert_Distrib(or1);
			 		and.right = CNFConvert_Distrib(or2);
			 		return and
					//(X & Y) o (Z & K) = (X o (Z & K)) & (Y o (Z & K))
					//(X & Y) o (Z o K) = (X o (Z o K)) & (Y o (Z o K))
					//(X & Y) o z = (X o z) & (Y o z)
				}
				else if (exprr instanceof And){
					var and = SatFactory.eINSTANCE.createAnd;
			 		var or1 = SatFactory.eINSTANCE.createOr;
			 		var or2 = SatFactory.eINSTANCE.createOr;
			 		or1.left = (exprl as And).left;
			 		or1.right = exprr;
			 		or2.left = (exprl as And).right;
			 		or2.right = exprr;
			 		and.left = CNFConvert_Distrib(or1);
			 		and.right = CNFConvert_Distrib(or2);
			 		return and
					//(X & Y) o (Z & K) = ((X & Y) o Z) & ((X & Y) o K)
					//(X o Y) o (Z & K) = ((X o Y) o Z)) & ((X o Y) o K))
					//     y  o (Z & K) = (X o z) & (Y o z)
				}
				else {
					return e
				}
				
			}
			
			case e instanceof And : {
				(e as And).left = CNFConvert_Distrib((e as And).left);
				(e as And).right = CNFConvert_Distrib((e as And).right);
				return e
			}
			
			default : return e
			
		}
	}
	
	static def Expression CNFConvert(Expression e){
		return CNFConvert_Simpl( CNFConvert_Neg( CNFConvert_Distrib(e)))
	}
}