package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CryptoMiniSATCall
{
	public static boolean DoIt(String file_dimacs_formula) 
	{	
		String complete_output = "";
		try 
		{
			ProcessBuilder pb = new ProcessBuilder("./cryptominisat-5.6.8", file_dimacs_formula);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s = "";
			while((s = in.readLine()) != null)
			{
				// DEBUG
				// System.out.println(s);
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