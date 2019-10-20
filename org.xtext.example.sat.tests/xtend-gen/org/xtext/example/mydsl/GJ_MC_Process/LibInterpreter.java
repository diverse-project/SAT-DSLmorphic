package org.xtext.example.mydsl.GJ_MC_Process;

import java.io.BufferedWriter;
import java.io.FileWriter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.GJ_MC_Process.DIMACSPrinter;

@SuppressWarnings("all")
public class LibInterpreter {
  public static boolean jarCallSat4j(final String filename, final EObject e) {
    try {
      String sat4jFilename = (filename + ".sat4j");
      LibInterpreter.writeSat4jFile(sat4jFilename, e);
      String commandline = ("java -jar org.sat4j.core.jar " + sat4jFilename);
      Runtime.getRuntime().exec(commandline);
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void writeSat4jFile(final String filename, final EObject e) {
    try {
      FileWriter _fileWriter = new FileWriter(filename);
      final BufferedWriter writer = new BufferedWriter(_fileWriter);
      writer.write(DIMACSPrinter.dimacsPrint(e));
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
