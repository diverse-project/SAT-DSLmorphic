package org.xtext.example.mydsl.generator;

import java.util.HashMap;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class DIMACSConverter {
  private static int ClausesCount = 0;
  
  private static int Counter = 1;
  
  private static HashMap<String, Integer> Vars = new HashMap<String, Integer>();
  
  private static void countClauses(final Expression e) {
    boolean _matched = false;
    if ((e instanceof And)) {
      _matched=true;
      DIMACSConverter.countClauses(((And) e).getLeft());
      DIMACSConverter.countClauses(((And) e).getRight());
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        DIMACSConverter.ClausesCount++;
        DIMACSConverter.countVar(((Or) e).getLeft());
        DIMACSConverter.countVar(((Or) e).getRight());
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        DIMACSConverter.countVar(((Not) e).getExpression());
      }
    }
    if (!_matched) {
      boolean _containsKey = DIMACSConverter.Vars.containsKey(e.getId().toString());
      boolean _not = (!_containsKey);
      if (_not) {
        DIMACSConverter.Vars.put(e.getId().toString(), Integer.valueOf(DIMACSConverter.Counter));
        DIMACSConverter.Counter++;
      }
    }
  }
  
  private static void countVar(final Expression e) {
    boolean _matched = false;
    if ((e instanceof Or)) {
      _matched=true;
      DIMACSConverter.countVar(((Or) e).getLeft());
      DIMACSConverter.countVar(((Or) e).getRight());
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        DIMACSConverter.countVar(((Not) e).getExpression());
      }
    }
    if (!_matched) {
      boolean _containsKey = DIMACSConverter.Vars.containsKey(e.getId().toString());
      boolean _not = (!_containsKey);
      if (_not) {
        DIMACSConverter.Vars.put(e.getId().toString(), Integer.valueOf(DIMACSConverter.Counter));
        DIMACSConverter.Counter++;
      }
    }
  }
  
  private static String writeExpr(final Expression e) {
    String output = "";
    boolean _matched = false;
    if ((e instanceof And)) {
      _matched=true;
      String _output = output;
      String _writeExpr = DIMACSConverter.writeExpr(((And) e).getLeft());
      output = (_output + _writeExpr);
      String _output_1 = output;
      String _writeExpr_1 = DIMACSConverter.writeExpr(((And) e).getRight());
      output = (_output_1 + _writeExpr_1);
    }
    if (!_matched) {
      String _output_2 = output;
      String _writeClause = DIMACSConverter.writeClause(e);
      String _plus = ("\n" + _writeClause);
      String _plus_1 = (_plus + "0");
      output = (_output_2 + _plus_1);
    }
    return output;
  }
  
  private static String writeClause(final Expression e) {
    String output = "";
    boolean _matched = false;
    if ((e instanceof Or)) {
      _matched=true;
      String _output = output;
      String _writeClause = DIMACSConverter.writeClause(((Or) e).getLeft());
      output = (_output + _writeClause);
      String _output_1 = output;
      String _writeClause_1 = DIMACSConverter.writeClause(((Or) e).getRight());
      output = (_output_1 + _writeClause_1);
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        String _output_2 = output;
        Integer _get = DIMACSConverter.Vars.get(((Not) e).getExpression().getId().toString());
        String _plus = ("-" + _get);
        String _plus_1 = (_plus + " ");
        output = (_output_2 + _plus_1);
      }
    }
    if (!_matched) {
      String _output_3 = output;
      Integer _get_1 = DIMACSConverter.Vars.get(e.getId().toString());
      String _plus_2 = (_get_1 + " ");
      output = (_output_3 + _plus_2);
    }
    return output;
  }
  
  public static String toDIMACS(final Expression e) {
    DIMACSConverter.ClausesCount = 0;
    DIMACSConverter.Counter = 1;
    DIMACSConverter.Vars.clear();
    DIMACSConverter.countClauses(e);
    int _size = DIMACSConverter.Vars.size();
    String _plus = ("p cnf " + Integer.valueOf(_size));
    String _plus_1 = (_plus + " ");
    String _plus_2 = (_plus_1 + Integer.valueOf(DIMACSConverter.ClausesCount));
    String _writeExpr = DIMACSConverter.writeExpr(e);
    String output = (_plus_2 + _writeExpr);
    return output;
  }
}
