package org.xtext.example.msat.CoudrayThuillier.utils

import java.io.PrintStream
import java.io.File
import java.util.Scanner

class IEDimacs {

	static def void export_dimacs(String filepath, String dimacs) {
		var fout = new PrintStream(new File(filepath))
		fout.println(dimacs)
		fout.close
	}
	
	static def String import_dimacs(String filepath) {
		var Scanner sc = new Scanner(new File(filepath))
		sc.useDelimiter("\\Z")
		return sc.next
	}

}
