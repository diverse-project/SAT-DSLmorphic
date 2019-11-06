package org.xtext.example.mydsl.GJ_MC_Process;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class PrettyPrinter {
  public static String prettyPrint(final EObject e) {
    boolean _matched = false;
    if ((e instanceof And)) {
      _matched=true;
      return PrettyPrinter.prettyPrintAnd(((And) e));
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        return PrettyPrinter.prettyPrintOr(((Or) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        return PrettyPrinter.prettyPrintNot(((Not) e));
      }
    }
    if (!_matched) {
      if ((e instanceof BiImpl)) {
        _matched=true;
        return PrettyPrinter.prettyPrintBiImpl(((BiImpl) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        return PrettyPrinter.prettyPrintImpl(((Impl) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        return PrettyPrinter.prettyPrintNand(((Nand) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Expression)) {
        _matched=true;
        return PrettyPrinter.prettyPrintExpression(((Expression) e));
      }
    }
    return "";
  }
  
  public static String prettyPrintAnd(final And e) {
    String _prettyPrint = PrettyPrinter.prettyPrint(e.getLeft());
    String _plus = ("(" + _prettyPrint);
    String _plus_1 = (_plus + " ^ ");
    String _prettyPrint_1 = PrettyPrinter.prettyPrint(e.getRight());
    String _plus_2 = (_plus_1 + _prettyPrint_1);
    return (_plus_2 + ")");
  }
  
  public static String prettyPrintOr(final Or e) {
    String _prettyPrint = PrettyPrinter.prettyPrint(e.getLeft());
    String _plus = ("(" + _prettyPrint);
    String _plus_1 = (_plus + " v ");
    String _prettyPrint_1 = PrettyPrinter.prettyPrint(e.getRight());
    String _plus_2 = (_plus_1 + _prettyPrint_1);
    return (_plus_2 + ")");
  }
  
  public static String prettyPrintNot(final Not e) {
    String _prettyPrint = PrettyPrinter.prettyPrint(e.getExpression());
    String _plus = ("(!" + _prettyPrint);
    return (_plus + ")");
  }
  
  public static String prettyPrintBiImpl(final BiImpl e) {
    String _prettyPrint = PrettyPrinter.prettyPrint(e.getLeft());
    String _plus = ("(" + _prettyPrint);
    String _plus_1 = (_plus + " <=> ");
    String _prettyPrint_1 = PrettyPrinter.prettyPrint(e.getRight());
    String _plus_2 = (_plus_1 + _prettyPrint_1);
    return (_plus_2 + ")");
  }
  
  public static String prettyPrintImpl(final Impl e) {
    String _prettyPrint = PrettyPrinter.prettyPrint(e.getLeft());
    String _plus = ("(" + _prettyPrint);
    String _plus_1 = (_plus + " => ");
    String _prettyPrint_1 = PrettyPrinter.prettyPrint(e.getRight());
    String _plus_2 = (_plus_1 + _prettyPrint_1);
    return (_plus_2 + ")");
  }
  
  public static String prettyPrintNand(final Nand e) {
    String _prettyPrint = PrettyPrinter.prettyPrint(e.getLeft());
    String _plus = ("(" + _prettyPrint);
    String _plus_1 = (_plus + " | ");
    String _prettyPrint_1 = PrettyPrinter.prettyPrint(e.getRight());
    String _plus_2 = (_plus_1 + _prettyPrint_1);
    return (_plus_2 + ")");
  }
  
  public static String prettyPrintExpression(final Expression e) {
    if (((e.getId() != null) && (e.getVal() == null))) {
      return e.getId();
    } else {
      if (((e.getId() == null) && (e.getVal() != null))) {
        return e.getVal();
      } else {
        return "Error";
      }
    }
  }
}
