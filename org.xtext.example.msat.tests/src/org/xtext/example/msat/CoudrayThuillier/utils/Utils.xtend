package org.xtext.example.msat.CoudrayThuillier.utils

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.regex.Pattern

class Utils {
	
	static def String execute_command(String command) {
		var StringBuffer output = new StringBuffer()
		var Process p
		try {
			// Execute the command
			var String[] cmd = #["/bin/sh", "-c", command]
			p = Runtime.getRuntime.exec(cmd)
			p.waitFor
			// Read the output
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
	
	static def long mean (long [] times) {
		var mean_v = 0 as long
		for (var i = 0; i < times.length; i++) {
			mean_v = mean_v + times.get(i)
		}
		mean_v = mean_v / times.length
		return mean_v
	}
	
	static def long standard_deviation (long [] times) {
		var squared_mean_v = Math.pow(mean(times), 2) as long
		var mean_of_square_v = 0 as long
		for (var i = 0; i < times.length; i++) {
			mean_of_square_v = mean_of_square_v + (Math.pow(times.get(i), 2) as long)
		}
		mean_of_square_v = mean_of_square_v / times.length
		return Math.sqrt((mean_of_square_v - squared_mean_v) as double) as long
	}
	
}