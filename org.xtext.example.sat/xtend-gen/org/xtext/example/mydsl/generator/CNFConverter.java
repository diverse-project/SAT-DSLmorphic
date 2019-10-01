package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;
import org.xtext.example.mydsl.sat.SatFactory;

@SuppressWarnings("all")
public class CNFConverter {
  public static Expression CNFConvert(final Expression e) {
    boolean _matched = false;
    if ((e instanceof BiImpl)) {
      _matched=true;
      Expression exprg = CNFConverter.CNFConvert(((BiImpl) e).getLeft());
      Expression exprd = CNFConverter.CNFConvert(((BiImpl) e).getRight());
      And and = SatFactory.eINSTANCE.createAnd();
      Or or1 = SatFactory.eINSTANCE.createOr();
      Or or2 = SatFactory.eINSTANCE.createOr();
      Not notg = SatFactory.eINSTANCE.createNot();
      Not notd = SatFactory.eINSTANCE.createNot();
      notg.setExpression(exprg);
      notd.setExpression(exprd);
      or1.setLeft(notg);
      or1.setRight(exprd);
      or2.setLeft(notd);
      or2.setRight(exprg);
      and.setLeft(or1);
      and.setRight(or2);
      return and;
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        Expression exprg_1 = CNFConverter.CNFConvert(((Impl) e).getLeft());
        Expression exprd_1 = CNFConverter.CNFConvert(((Impl) e).getRight());
        Or or = SatFactory.eINSTANCE.createOr();
        Not not = SatFactory.eINSTANCE.createNot();
        not.setExpression(exprg_1);
        or.setLeft(not);
        or.setRight(exprd_1);
        return or;
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        ((Or) e).setLeft(CNFConverter.CNFConvert(((Or) e).getLeft()));
        ((Or) e).setRight(CNFConverter.CNFConvert(((Or) e).getRight()));
        return e;
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        ((And) e).setLeft(CNFConverter.CNFConvert(((And) e).getLeft()));
        ((And) e).setRight(CNFConverter.CNFConvert(((And) e).getRight()));
        return e;
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        Expression exprg_2 = CNFConverter.CNFConvert(((Nand) e).getLeft());
        Expression exprd_2 = CNFConverter.CNFConvert(((Nand) e).getRight());
        And and_1 = SatFactory.eINSTANCE.createAnd();
        Not not_1 = SatFactory.eINSTANCE.createNot();
        and_1.setLeft(exprg_2);
        and_1.setRight(exprd_2);
        not_1.setExpression(and_1);
        return not_1;
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        ((Not) e).setExpression(CNFConverter.CNFConvert(((Not) e).getExpression()));
        return e;
      }
    }
    return e;
  }
}
