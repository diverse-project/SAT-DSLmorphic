package org.xtext.example.mydsl.GJ_MC_Process;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.GJ_MC_Process.LibInterpreter;
import org.xtext.example.mydsl.GJ_MC_Process.SATUtils;
import org.xtext.example.mydsl.GJ_MC_Process.Sat4JCompiler;
import org.xtext.example.mydsl.GJ_MC_Process.StandaloneInterpreter;
import org.xtext.example.mydsl.sat.File;
import org.xtext.example.mydsl.sat.Model;
import org.xtext.example.mydsl.sat.Solver;

@SuppressWarnings("all")
public class Sat4jLauncher {
  public static Object launch(final EObject e) {
    Object _xblockexpression = null;
    {
      final Model model = ((Model) e);
      Object _switchResult = null;
      Solver _solver = model.getSolver();
      boolean _matched = false;
      Solver _solver_1 = model.getSolver();
      boolean _equals = Objects.equal(_solver_1, Solver.SAT4J_JAVA);
      if (_equals) {
        _matched=true;
        boolean _xifexpression = false;
        File _file = model.getFile();
        boolean _tripleEquals = (_file == null);
        if (_tripleEquals) {
          boolean _xblockexpression_1 = false;
          {
            SATUtils.writeSat4jFile("formula.dimacs", model.getExpression());
            _xblockexpression_1 = LibInterpreter.interpret("formula.dimacs");
          }
          _xifexpression = _xblockexpression_1;
        } else {
          _xifexpression = LibInterpreter.interpret(model.getFile().getPath());
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
      if (!_matched) {
        Solver _solver_2 = model.getSolver();
        boolean _equals_1 = Objects.equal(_solver_2, Solver.SAT4J_JAR);
        if (_equals_1) {
          _matched=true;
          String _xifexpression_1 = null;
          File _file_1 = model.getFile();
          boolean _tripleEquals_1 = (_file_1 == null);
          if (_tripleEquals_1) {
            _xifexpression_1 = "";
          } else {
            _xifexpression_1 = model.getFile().getPath();
          }
          _switchResult = StandaloneInterpreter.jarCallSat4j(_xifexpression_1, model.getExpression());
        }
      }
      if (!_matched) {
        Solver _solver_3 = model.getSolver();
        boolean _equals_2 = Objects.equal(_solver_3, Solver.SAT4J_COMP);
        if (_equals_2) {
          _matched=true;
          Process _xifexpression_2 = null;
          File _file_2 = model.getFile();
          boolean _tripleEquals_2 = (_file_2 == null);
          if (_tripleEquals_2) {
            Process _xblockexpression_2 = null;
            {
              SATUtils.writeSat4jFile("formula.dimacs", model.getExpression());
              _xblockexpression_2 = Sat4JCompiler.compile("formula.dimacs");
            }
            _xifexpression_2 = _xblockexpression_2;
          } else {
            _xifexpression_2 = Sat4JCompiler.compile(model.getFile().getPath());
          }
          _switchResult = _xifexpression_2;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
