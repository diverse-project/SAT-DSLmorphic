package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CryptoMiniSATCall
{
	
	static List<String> accepted_versions =  Arrays.asList("2.4.0", "3.1.0", "4.5.3", "5.6.8", "default");
	
	
	public static List<Object> DoIt(String file_dimacs_formula, String version) 
	{	
		String TIMEOUT = "600";

		check_version(version);
		String calling_name = "cryptominisat-" + version;

		
		
		String complete_output = "";
		try 
		{
			List<String> full_command = new ArrayList<String>();
			full_command.add("timeout");
			full_command.add(TIMEOUT);
			full_command.add("./" + calling_name);
			full_command.add(file_dimacs_formula);

			ProcessBuilder pb = new ProcessBuilder(full_command);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

			boolean result = false;
			float real_time = -1f;
			String[] cut_str;
			
			String s = "";
			while((s = in.readLine()) != null)
			{
				if (s.contains("CPU time") || s.contains("Total time"))
				{
					cut_str = s.substring(0, s.length() - 1).split(" ");
					real_time = Float.parseFloat(cut_str[cut_str.length-1]);
				}
				if (s.contains("UNSATISFIABLE"))
				{
					result = false;
				}
				else if (s.contains("SATISFIABLE"))
				{
					result = true;
				}
			}
			
			int status = p.waitFor();
			
			System.out.println("Exited with status: " + status);
			
			return Arrays.asList(result, real_time);
		}
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
	
		throw new Error("calling bin failed");
	}
	
	static void check_version(String version)
	{
		for (String v : accepted_versions)
		{
			if (v.equals(version))
				return;
		}
		throw new Error ("Unsupported version " + version + ". Only supported versions are " + (accepted_versions));
	}
}