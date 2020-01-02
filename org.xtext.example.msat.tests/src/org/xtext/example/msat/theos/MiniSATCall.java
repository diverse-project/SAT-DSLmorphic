package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MiniSATCall
{
	public static boolean DoIt(String file_dimacs_formula, String version, String parameters) 
	{	
		String complete_output = "";
		
		try 
		{
			List<String> full_command = new ArrayList<String>();
			full_command.add("./minisat-" + version);
			if (!parameters.equals(""))
			{
				full_command.add(parameters);
			}
			full_command.add(file_dimacs_formula);
			ProcessBuilder pb = new ProcessBuilder(full_command);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s = "";
			while((s = in.readLine()) != null)
			{
				// DEBUG
				System.out.println(s);
				if (s.contains("UNSATISFIABLE"))
				{
					return false;
				}
				else if (s.contains("SATISFIABLE"))
				{
					return true;
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
}