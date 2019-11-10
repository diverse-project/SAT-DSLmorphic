package org.xtext.example.mydsl1.tests.dera;

import java.io.File;
import java.io.IOException;

import org.xtext.example.mydsl1.mSat.Expression;

import com.google.common.io.Files;

public class Utils {
	public static String DEFAULT_FILENAME = "tmp.cnf";
	
	public static void createFileFromFormula(Expression expr) {
		String content = DimacsPrinter.dimacsPrinter(expr);
		try {
			Files.write(content.getBytes(), new File(DEFAULT_FILENAME));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
