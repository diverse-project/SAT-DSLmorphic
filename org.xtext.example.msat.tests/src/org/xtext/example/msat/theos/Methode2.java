package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Methode2
{
	public static void DoIt(String file_dimacs_formula) 
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
		
		try 
		{
			ProcessBuilder pb = new ProcessBuilder("java", "-jar", "org.sat4j.core.jar", file_dimacs_formula);
			Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s = "";
			while((s = in.readLine()) != null){
			    System.out.println(s);
			}
			int status = p.waitFor();
			System.out.println("Exited with status: " + status);
		}
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
		{
			
		}
	}
}
