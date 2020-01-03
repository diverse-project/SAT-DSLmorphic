package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Sat4JJARCall
{
	

	static List<String> accepted_versions =  Arrays.asList("2.0.0", "2.2.3", "2.3.1");

	public static List<Object> DoIt(String file_dimacs_formula, String version) 
	{
		/*
		ProcessBuilder pb = new ProcessBuilder("java", "-jar", "absolute path upto jar");
		Process p = pb.start();
		
		File commands = new File("absolute path to inputs file");
		File dirOut = new File("absolute path to outputs file");
		File dirErr = new File("absolute path to error file");

		dirProcess.redirectInput(commands);
		dirProcess.redirectOutput(dirOut);
		dirProcess.redirectError(dirErr);
		*/
		
		if(version == "default")
		{
			version = "2.3.1";
		}
		check_version(version);
		String calling_name = "org.sat4j.core-" + version + ".jar";
		
		
		String complete_output = "";
		try 
		{
			long start = System.currentTimeMillis();
			ProcessBuilder pb = new ProcessBuilder("java", "-jar", calling_name, file_dimacs_formula);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;
			String s = "";
			while((s = in.readLine()) != null)
			{
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
	
		throw new Error("calling jar failed");	
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
