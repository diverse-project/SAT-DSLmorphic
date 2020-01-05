package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniSATCall
{
	static List<String> accepted_versions =  Arrays.asList("1.14.0", "2.2.0", "default");

	
	public static List<Object> DoIt(String file_dimacs_formula, String version, String parameters) 
	{	
		String TIMEOUT = "600";
		
		check_version(version);
		String calling_name = "minisat-" + version;

		
		String complete_output = "";
		
		try 
		{
			List<String> full_command = new ArrayList<String>();
			full_command.add("timeout");
			full_command.add(TIMEOUT);
			full_command.add("./" + calling_name);
			if (!parameters.equals(""))
			{
				full_command.add(parameters);
			}
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
				// DEBUG
				//System.out.println(s);
				if (s.contains("CPU time"))
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
				else if (s.contains("Trivial problem"))
				{
					real_time = 0f;
				}
				
			    //System.out.println(s);
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