package org.xtext.example.mydsl.generator


import org.xtext.example.mydsl.sat.*

class CNFConverter {
	
	
	static def Expression CNFConvert(Expression e) {
		
 	
		switch e {
			case e instanceof BiImpl : { 
				 var exprg = CNFConvert((e as BiImpl).getLeft);
				 var exprd = CNFConvert((e as BiImpl).getRight);
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
				
				 var exprg = CNFConvert((e as Impl).getLeft);
				 var exprd = CNFConvert((e as Impl).getRight);
				 var or = SatFactory.eINSTANCE.createOr;
				 var not = SatFactory.eINSTANCE.createNot;
				 not.expression = exprg; or.left = not; or.right = exprd;
				 return or
			}
				
			case e instanceof Or : { 
				(e as Or).left = CNFConvert((e as Or).left);
				(e as Or).right = CNFConvert((e as Or).right);
				return e;
				
				}
				
			case e instanceof And : {
				(e as And).left = CNFConvert((e as And).left);
				(e as And).right = CNFConvert((e as And).right);
				return e;
				
				}
				
			case e instanceof Nand : {
				
				
				 var exprg = CNFConvert((e as Nand).getLeft);
				 var exprd = CNFConvert((e as Nand).getRight);
				 var and = SatFactory.eINSTANCE.createAnd;
				 var not = SatFactory.eINSTANCE.createNot;
				 and.left = exprg; and.right = exprd;
				 not.expression = and;
				 return not;
				
			}
				
			case e instanceof Not : {
				(e as Not).expression = CNFConvert((e as Not).expression);
				return e;
			}
				
			
			default : return e
				
			}
		
	}
}