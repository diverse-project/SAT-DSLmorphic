package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class CryptoMiniSATCall
{
	
	static List<String> accepted_versions =  Arrays.asList("2.4.0", "3.1.0", "4.5.3", "5.6.8", "default");
	
	
	public static List<Object> DoIt(String file_dimacs_formula, String version) 
	{	

		check_version(version);
		String calling_name = "cryptominisat-" + version;

		
		
		String complete_output = "";
		try 
		{
			long start = System.currentTimeMillis();

			ProcessBuilder pb = new ProcessBuilder("./" + calling_name, file_dimacs_formula);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;

			
			String s = "";
			while((s = in.readLine()) != null)
			{
				// DEBUG
				// System.out.println(s);
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