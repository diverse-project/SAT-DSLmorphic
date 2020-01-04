package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Sat4JJARCall
{
	

	static List<String> accepted_versions =  Arrays.asList("2.0.0", "2.2.3", "2.3.1");

	public static List<Object> DoIt(String file_dimacs_formula, String version) 
	{
		int TIMEOUT = 600000;
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
			final Process p = pb.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			
			Timer t = new Timer();
		    t.schedule(new TimerTask() {

		        @Override
		        public void run() {
		        	try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            p.destroy();
		        }
		    }, TIMEOUT);
		    
		    
			int status = p.waitFor();
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;
			
			System.out.println("Exited with status: " + status);
			
			if (timeElapsed > TIMEOUT + 50)
			{
				return Arrays.asList(false, -1l);
			}
			
			boolean result = false;
			
			String s = "";
			while((s = in.readLine()) != null)
			{
				if (s.contains("UNSATISFIABLE"))
				{
					result = false;
					break;
				}
				else if (s.contains("SATISFIABLE"))
				{
					result = true;
					break;
				}
				
			    //System.out.println(s);
			}
			
			return Arrays.asList(result, timeElapsed);
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
