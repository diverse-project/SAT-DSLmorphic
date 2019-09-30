package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;
import org.xtext.example.mydsl.sat.SatFactory;

@SuppressWarnings("all")
public class Simplifier {
  public static Expression simplify(final EObject e) {
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
    return ((Expression) e);
  }
  
  public static Expression simplify(final BiImpl e) {
    final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
    final Expression rhsReplacement = Simplifier.simplify(e.getRight());
    final And andTrue = SatFactory.eINSTANCE.createAnd();
    final And andFalse = SatFactory.eINSTANCE.createAnd();
    final Not notLeft = SatFactory.eINSTANCE.createNot();
    final Not notRight = SatFactory.eINSTANCE.createNot();
    final Or or = SatFactory.eINSTANCE.createOr();
    andTrue.setLeft(lhsReplacement);
    andTrue.setRight(rhsReplacement);
    notLeft.setExpression(lhsReplacement);
    notRight.setExpression(rhsReplacement);
    andFalse.setLeft(notLeft);
    andFalse.setRight(notRight);
    or.setLeft(andTrue);
    or.setRight(andFalse);
    return or;
  }
  
  public static Expression simplify(final Impl e) {
    final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
    final Expression rhsReplacement = Simplifier.simplify(e.getRight());
    final Or or = SatFactory.eINSTANCE.createOr();
    final Not not = SatFactory.eINSTANCE.createNot();
    not.setExpression(lhsReplacement);
    or.setLeft(not);
    or.setRight(rhsReplacement);
    return or;
  }
  
  public static Expression simplify(final Nand e) {
    final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
    final Expression rhsReplacement = Simplifier.simplify(e.getRight());
    final And and = SatFactory.eINSTANCE.createAnd();
    final Not not = SatFactory.eINSTANCE.createNot();
    and.setLeft(lhsReplacement);
    and.setRight(rhsReplacement);
    not.setExpression(and);
    return not;
  }
  
  public static Expression simplify(final And e) {
    return e;
  }
  
  public static Expression simplify(final Or e) {
    return e;
  }
  
  public static Expression simplify(final Not e) {
    return e;
  }
}
