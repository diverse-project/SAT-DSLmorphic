package org.xtext.example.msat.CoudrayThuillier.utils

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.regex.Pattern

class Utils {
	
	static def String execute_command(String command) {
		var StringBuffer output = new StringBuffer()
		var Process p
		try {
			p = Runtime.getRuntime.exec(command)
			p.waitFor
			var BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			var String line = ""
			while ((line = reader.readLine) !== null) {
				output.append(line + "\n")
			}
		} catch (Exception e) {
			e.printStackTrace
		}
		return output.toString
	}
	
	static def boolean is_in_output (String output, String test) {
		var sat_pattern = Pattern.compile(test)
		var matcher = sat_pattern.matcher(output)
		return matcher.find
	}
}