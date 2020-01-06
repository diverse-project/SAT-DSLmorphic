package org.xtext.example.mydsl.GJ_MC_Process;

import java.util.HashMap;
import java.util.List;
import org.xtext.example.mydsl.GJ_MC_Process.SATUtils;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class DIMACSPrinter {
  private static final HashMap<Object, Object> numberIds = CollectionLiterals.<Object, Object>newHashMap();
  
  private static int nbClauses = 1;
  
  public static String dimacsFile(final EObject e) {
    String _xblockexpression = null;
    {
      DIMACSPrinter.numberIds.clear();
      DIMACSPrinter.nbClauses = 1;
      String dimacsClauses = DIMACSPrinter.dimacsPrint(e);
      if (((e instanceof Not) || (e instanceof Or))) {
        String _dimacsClauses = dimacsClauses;
        dimacsClauses = (_dimacsClauses + "0");
      } else {
        int _length = dimacsClauses.length();
        int _minus = (_length - 1);
        dimacsClauses = dimacsClauses.substring(0, _minus);
      }
      String _string = Integer.valueOf(DIMACSPrinter.numberIds.size()).toString();
      String _plus = ("p cnf " + _string);
      String _plus_1 = (_plus + " ");
      String _plus_2 = (_plus_1 + 
        Integer.valueOf(DIMACSPrinter.nbClauses));
      String _plus_3 = (_plus_2 + "\n");
      final String fileCore = (_plus_3 + dimacsClauses);
      _xblockexpression = fileCore;
    }
    return _xblockexpression;
  }
  
  public static String dimacsPrint(final EObject e) {
    boolean _matched = false;
    if ((e instanceof And)) {
      _matched=true;
      return DIMACSPrinter.dimacsPrintAnd(((And) e));
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        return DIMACSPrinter.dimacsPrintOr(((Or) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        return DIMACSPrinter.dimacsPrintNot(((Not) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Expression)) {
        _matched=true;
        return DIMACSPrinter.dimacsPrintExpression(((Expression) e));
      }
    }
    return "";
  }
  
  public static String dimacsPrintAnd(final And e) {
    String out = "";
    final List<Expression> clauses = SATUtils.getClauses(e);
    DIMACSPrinter.nbClauses = clauses.size();
    for (final Expression clause : clauses) {
      String _out = out;
      String _dimacsPrint = DIMACSPrinter.dimacsPrint(clause);
      String _plus = (_dimacsPrint + "0\n");
      out = (_out + _plus);
    }
    return out;
  }
  
  public static String dimacsPrintOr(final Or e) {
    String out = "";
    final List<Expression> atoms = SATUtils.getAtoms(e);
    for (final Expression atom : atoms) {
      String _out = out;
      String _dimacsPrint = DIMACSPrinter.dimacsPrint(atom);
      out = (_out + _dimacsPrint);
    }
    return out;
  }
  
  public static String dimacsPrintNot(final Not e) {
    String _dimacsPrint = DIMACSPrinter.dimacsPrint(e.getExpression());
    return ("-" + _dimacsPrint);
  }
  
  /**
   * static def String DIMACSPrint(BiImpl e){
   * return DIMACSPrint( Simplifier.simplify(e) );
   * }
   * static def String DIMACSPrint(Impl e){
   * return DIMACSPrint( Simplifier.simplify(e) );
   * }
   * static def String DIMACSPrint(Nand e){
   * return DIMACSPrint( Simplifier.simplify(e) );
   * }
   */
  public static String dimacsPrintExpression(final Expression e) {
    if (((e.getId() != null) && (e.getVal() == null))) {
      String _idNumber = DIMACSPrinter.getIdNumber(e.getId());
      return (_idNumber + " ");
    } else {
      if (((e.getId() == null) && (e.getVal() != null))) {
        return "const";
      } else {
        return "Error";
      }
    }
  }
  
  public static String getIdNumber(final String id) {
    boolean _containsKey = DIMACSPrinter.numberIds.containsKey(id);
    if (_containsKey) {
      Object _get = DIMACSPrinter.numberIds.get(id);
      return ((String) _get);
    } else {
      int _size = DIMACSPrinter.numberIds.size();
      DIMACSPrinter.numberIds.put(id, Integer.valueOf((_size + 1)).toString());
      return Integer.valueOf(DIMACSPrinter.numberIds.size()).toString();
    }
  }
}
