package org.xtext.example.mydsl.GJ_MC_Tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

@SuppressWarnings("all")
public class Sat4jLauncher {
  public static boolean interpretationSat4j() {
    ISolver solver = SolverFactory.newDefault();
    solver.setTimeout(3600);
    DimacsReader reader = new DimacsReader(solver);
    PrintWriter out = new PrintWriter(System.out, true);
    try {
      IProblem problem = reader.parseInstance("foo.csv");
      boolean _isSatisfiable = problem.isSatisfiable();
      if (_isSatisfiable) {
        System.out.println("Satisfiable !");
        reader.decode(problem.model(), out);
      } else {
        System.out.println("Unsatisfiable !");
      }
    } catch (final Throwable _t) {
      if (_t instanceof FileNotFoundException) {
        final FileNotFoundException e = (FileNotFoundException)_t;
        e.printStackTrace();
      } else if (_t instanceof ParseFormatException) {
        final ParseFormatException e_1 = (ParseFormatException)_t;
        e_1.printStackTrace();
      } else if (_t instanceof IOException) {
        final IOException e_2 = (IOException)_t;
        e_2.printStackTrace();
      } else if (_t instanceof ContradictionException) {
        System.out.println("Unsatisfiable (trivial)!");
      } else if (_t instanceof TimeoutException) {
        System.out.println("Timeout, sorry!");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return true;
  }
}
