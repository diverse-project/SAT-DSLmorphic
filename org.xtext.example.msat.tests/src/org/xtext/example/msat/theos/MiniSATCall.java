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
		
		check_version(version);
		String calling_name = "minisat-" + version;

		
		String complete_output = "";
		
		try 
		{
			List<String> full_command = new ArrayList<String>();
			full_command.add("./" + calling_name);
			if (!parameters.equals(""))
			{
				full_command.add(parameters);
			}
			full_command.add(file_dimacs_formula);

			
			long start = System.currentTimeMillis();
			
			ProcessBuilder pb = new ProcessBuilder(full_command);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;

			
			String s = "";
			while((s = in.readLine()) != null)
			{
				// DEBUG
				//System.out.println(s);
				if (s.contains("UNSATISFIABLE"))
				{
					return Arrays.asList(false, timeElapsed);
				}
				else if (s.contains("SATISFIABLE"))
				{
					return Arrays.asList(true, timeElapsed);
				}
				
			    //System.out.println(s);
			}
			int status = p.waitFor();
			System.out.println("Exited with status: " + status);
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