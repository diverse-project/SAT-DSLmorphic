package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class Simplifier {
  public static EObject simplify(final EObject e) {
    boolean _matched = false;
    if ((e instanceof BiImpl)) {
      _matched=true;
      return Simplifier.simplify(((BiImpl) e));
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        return Simplifier.simplify(((Impl) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        return Simplifier.simplify(((Nand) e));
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        return Simplifier.simplify(((And) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        return Simplifier.simplify(((Or) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        return Simplifier.simplify(((Not) e));
      }
    }
    return e;
  }
  
  public static EObject simplify(final BiImpl e) {
    return e;
  }
  
  public static EObject simplify(final Impl e) {
    return e;
  }
  
  public static EObject simplify(final Nand e) {
    return e;
  }
  
  public static EObject simplify(final And e) {
    return e;
  }
  
  public static EObject simplify(final Or e) {
    return e;
  }
  
  public static EObject simplify(final Not e) {
    return e;
  }
}
