package org.xtext.example.mydsl.GJ_MC_Process;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.GJ_MC_Process.SATUtils;

@SuppressWarnings("all")
public class StandaloneInterpreter {
  public static boolean jarCallSat4j(final String filename, final EObject e) {
    try {
      String commandline = "";
      if ((e == null)) {
        commandline = ("java -jar org.sat4j.core.jar " + filename);
      } else {
        String sat4jFilename = "formula.sat4j";
        SATUtils.writeSat4jFile(sat4jFilename, e);
        commandline = ("java -jar org.sat4j.core.jar " + sat4jFilename);
      }
      Runtime.getRuntime().exec(commandline);
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
