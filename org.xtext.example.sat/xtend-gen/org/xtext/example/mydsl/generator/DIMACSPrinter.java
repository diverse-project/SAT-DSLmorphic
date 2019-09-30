package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class DIMACSPrinter {
  private static final HashMap<Object, Object> numberIds = CollectionLiterals.<Object, Object>newHashMap();
  
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
    String _dimacsPrint = DIMACSPrinter.dimacsPrint(e.getLeft());
    String _plus = (_dimacsPrint + " 0\n");
    String _dimacsPrint_1 = DIMACSPrinter.dimacsPrint(e.getRight());
    String _plus_1 = (_plus + _dimacsPrint_1);
    return (_plus_1 + " 0");
  }
  
  public static String dimacsPrintOr(final Or e) {
    String _dimacsPrint = DIMACSPrinter.dimacsPrint(e.getLeft());
    String _plus = (_dimacsPrint + " ");
    String _dimacsPrint_1 = DIMACSPrinter.dimacsPrint(e.getRight());
    return (_plus + _dimacsPrint_1);
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
    if (((!Objects.equal(e.getId(), null)) && Objects.equal(e.getVal(), null))) {
      return DIMACSPrinter.getIdNumber(e.getId());
    } else {
      if ((Objects.equal(e.getId(), null) && (!Objects.equal(e.getVal(), null)))) {
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
