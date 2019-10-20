package org.xtext.example.mydsl.tests

import java.io.File
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

class Method3
{
	static def DoIt(String file_dimacs_formula) 
	{	
		Files.copy(Paths.get(file_dimacs_formula),
				   Paths.get('''../SatSatSat.core/«file_dimacs_formula»'''),
				   StandardCopyOption.REPLACE_EXISTING
		);
		val generated_file_name = "../SatSatSat.core/src/main/java/SatSatSat/SatSatSat/core/App.java"
		val fileWriter = new FileWriter(new File(generated_file_name));
		fileWriter.write('''
		package SatSatSat.SatSatSat.core;
		
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.io.PrintWriter;
		
		import org.sat4j.minisat.SolverFactory;
		import org.sat4j.reader.DimacsReader;
		import org.sat4j.reader.ParseFormatException;
		import org.sat4j.reader.Reader;
		import org.sat4j.specs.ContradictionException;
		import org.sat4j.specs.IProblem;
		import org.sat4j.specs.ISolver;
		import org.sat4j.specs.TimeoutException;
		
		public class App
		{
			public static void main( String[] args )
			{
					System.out.println("heyo?");
					
					// SAT! SAT! SAT!
					ISolver solver = SolverFactory.newDefault();
			        solver.setTimeout(3600); // 1 hour timeout
			        Reader reader = new DimacsReader(solver);
			        PrintWriter out = new PrintWriter(System.out,true);
			        try {
			            IProblem problem = reader.parseInstance("«file_dimacs_formula»");
			            if (problem.isSatisfiable()) {
			                System.out.println("Satisfiable !");
			                reader.decode(problem.model(),out);
			            } else {
			                System.out.println("Unsatisfiable !");
			            }
			            System.out.println("ok");
			        } catch (FileNotFoundException e) {
			        	System.out.println("file not found");
			        } catch (ParseFormatException e) {
			        	System.out.println("ParseFormatException");
			        } catch (IOException e) {
			        	System.out.println("IOExcpetion");
			        } catch (ContradictionException e) {
			            System.out.println("Unsatisfiable (trivial)!");
			        } catch (TimeoutException e) {
			            System.out.println("Timeout, sorry!");
			        }
			        
			        
			        System.out.println("fini");
			}
		}
		''');
		fileWriter.close();
	}
}
