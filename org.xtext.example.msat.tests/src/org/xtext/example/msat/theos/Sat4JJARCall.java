package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Sat4JJARCall
{
	

	static List<String> accepted_versions =  Arrays.asList("2.0.0", "2.2.3", "2.3.1");

	public static List<Object> DoIt(String file_dimacs_formula, String version) 
	{
		String TIMEOUT = "600";
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
			List<String> full_command = new ArrayList<String>();
			full_command.add("timeout");
			full_command.add(TIMEOUT);
			full_command.add("java");
			full_command.add("-jar");
			full_command.add(calling_name);
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
				if (s.contains("Total wall clock time"))
				{
					cut_str = s.substring(0, s.length() - 1).split(" ");
					real_time = Float.parseFloat(cut_str[cut_str.length-1]);
				}
				else if (s.contains("UNSATISFIABLE"))
				{
					result = false;
				}
				else if (s.contains("SATISFIABLE"))
				{
					result = true;
				}
				else if (s.contains("UNKNOWN"))
				{
					return Arrays.asList(false, -1f);
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
