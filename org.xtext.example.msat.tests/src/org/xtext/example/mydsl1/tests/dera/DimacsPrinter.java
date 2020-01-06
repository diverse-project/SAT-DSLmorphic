package org.xtext.example.mydsl1.tests.dera;

import org.xtext.example.mydsl1.mSat.Expression;

public class DimacsPrinter {

	public static String dimacsPrinter(Expression expr) {
		DimacsPrinterUtils dimacs = new DimacsPrinterUtils();
		dimacs.doSwitch(expr);
		return dimacs.toString();
		
	}
	
}