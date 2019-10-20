package org.xtext.example.mydsl.GJ_MC_Process;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.GJ_MC_Process.LibInterpreter;
import org.xtext.example.mydsl.GJ_MC_Process.Sat4JCompiler;
import org.xtext.example.mydsl.sat.File;
import org.xtext.example.mydsl.sat.Model;
import org.xtext.example.mydsl.sat.Solver;

@SuppressWarnings("all")
public class Sat4jLauncher {
  public static Boolean launch(final EObject e) {
    boolean _xblockexpression = false;
    {
      final Model model = ((Model) e);
      File _file = model.getFile();
      boolean _tripleEquals = (_file == null);
      if (_tripleEquals) {
      }
      boolean _switchResult = false;
      Solver _solver = model.getSolver();
      boolean _matched = false;
      Solver _solver_1 = model.getSolver();
      boolean _equals = Objects.equal(_solver_1, Solver.SAT4J_JAVA);
      if (_equals) {
        _matched=true;
        boolean _xifexpression = false;
        File _file_1 = model.getFile();
        boolean _tripleEquals_1 = (_file_1 == null);
        if (_tripleEquals_1) {
          _xifexpression = LibInterpreter.interpret("");
        } else {
          _xifexpression = LibInterpreter.interpret("");
        }
        _switchResult = _xifexpression;
      }
      if (!_matched) {
        Solver _solver_2 = model.getSolver();
        boolean _equals_1 = Objects.equal(_solver_2, Solver.SAT4J_JAR);
        if (_equals_1) {
          _matched=true;
          InputOutput.println();
        }
      }
      if (!_matched) {
        Solver _solver_3 = model.getSolver();
        boolean _equals_2 = Objects.equal(_solver_3, Solver.SAT4J_COMP);
        if (_equals_2) {
          _matched=true;
          Sat4JCompiler.compile("");
        }
      }
      _xblockexpression = _switchResult;
    }
    return Boolean.valueOf(_xblockexpression);
  }
}
