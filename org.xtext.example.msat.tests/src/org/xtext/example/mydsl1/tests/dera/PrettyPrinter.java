package org.xtext.example.mydsl1.tests.dera;

import org.xtext.example.mydsl1.mSat.Expression;

public class PrettyPrinter {

	public static String prettyPrinter(Expression expression) {
		PrettyPrinterUtils prettyPrinter = new PrettyPrinterUtils();
		return prettyPrinter.doSwitch(expression);
	}

}
