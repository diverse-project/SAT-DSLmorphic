package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
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
      return PrettyPrinter.prettyPrint(((And) e));
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        return PrettyPrinter.prettyPrint(((Or) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        return PrettyPrinter.prettyPrint(((Not) e));
      }
    }
    if (!_matched) {
      if ((e instanceof BiImpl)) {
        _matched=true;
        return PrettyPrinter.prettyPrint(((BiImpl) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        return PrettyPrinter.prettyPrint(((Impl) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        return PrettyPrinter.prettyPrint(((Nand) e));
      }
    }
    return "";
  }
  
  public static String prettyPrint(final And e) {
    return null;
  }
  
  public static String prettyPrint(final Or e) {
    return null;
  }
  
  public static String prettyPrint(final Not e) {
    return null;
  }
}
