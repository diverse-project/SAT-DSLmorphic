package org.xtext.example.msat.theos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MiniSATCall
{
	static List<String> accepted_versions =  Arrays.asList("1.14.0", "2.2.0", "default");

	
	public static List<Object> DoIt(String file_dimacs_formula, String version, String parameters) 
	{	
		int TIMEOUT = 600000;
		
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
				// DEBUG
				//System.out.println(s);
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