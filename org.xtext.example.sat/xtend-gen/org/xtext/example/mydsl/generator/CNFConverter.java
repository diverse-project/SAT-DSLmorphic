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
  public static Expression CNFConvert_Simpl(final Expression e) {
    boolean _matched = false;
    if ((e instanceof BiImpl)) {
      _matched=true;
      Expression exprg = CNFConverter.CNFConvert_Simpl(((BiImpl) e).getLeft());
      Expression exprd = CNFConverter.CNFConvert_Simpl(((BiImpl) e).getRight());
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
        Expression exprg_1 = CNFConverter.CNFConvert_Simpl(((Impl) e).getLeft());
        Expression exprd_1 = CNFConverter.CNFConvert_Simpl(((Impl) e).getRight());
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
        ((Or) e).setLeft(CNFConverter.CNFConvert_Simpl(((Or) e).getLeft()));
        ((Or) e).setRight(CNFConverter.CNFConvert_Simpl(((Or) e).getRight()));
        return e;
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        ((And) e).setLeft(CNFConverter.CNFConvert_Simpl(((And) e).getLeft()));
        ((And) e).setRight(CNFConverter.CNFConvert_Simpl(((And) e).getRight()));
        return e;
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        Expression exprg_2 = CNFConverter.CNFConvert_Simpl(((Nand) e).getLeft());
        Expression exprd_2 = CNFConverter.CNFConvert_Simpl(((Nand) e).getRight());
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
        ((Not) e).setExpression(CNFConverter.CNFConvert_Simpl(((Not) e).getExpression()));
        return e;
      }
    }
    return e;
  }
  
  public static Expression CNFConvert_Neg(final Expression e) {
    boolean _matched = false;
    if ((e instanceof Not)) {
      _matched=true;
      Expression expr = ((Not) e).getExpression();
      boolean _matched_1 = false;
      if ((expr instanceof Not)) {
        _matched_1=true;
        return CNFConverter.CNFConvert_Neg(expr);
      }
      if (!_matched_1) {
        if ((expr instanceof And)) {
          _matched_1=true;
          Or or = SatFactory.eINSTANCE.createOr();
          Not not1 = SatFactory.eINSTANCE.createNot();
          Not not2 = SatFactory.eINSTANCE.createNot();
          not1.setExpression(((And) expr).getLeft());
          not2.setExpression(((And) expr).getRight());
          or.setLeft(CNFConverter.CNFConvert_Neg(not1));
          or.setRight(CNFConverter.CNFConvert_Neg(not2));
          return or;
        }
      }
      if (!_matched_1) {
        if ((expr instanceof Or)) {
          _matched_1=true;
          And and = SatFactory.eINSTANCE.createAnd();
          Not not1_1 = SatFactory.eINSTANCE.createNot();
          Not not2_1 = SatFactory.eINSTANCE.createNot();
          not1_1.setExpression(((Or) expr).getLeft());
          not2_1.setExpression(((Or) expr).getRight());
          and.setLeft(CNFConverter.CNFConvert_Neg(not1_1));
          and.setRight(CNFConverter.CNFConvert_Neg(not2_1));
          return and;
        }
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        ((Or) e).setLeft(CNFConverter.CNFConvert_Neg(((Or) e).getLeft()));
        ((Or) e).setRight(CNFConverter.CNFConvert_Neg(((Or) e).getRight()));
        return e;
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        ((And) e).setLeft(CNFConverter.CNFConvert_Neg(((And) e).getLeft()));
        ((And) e).setRight(CNFConverter.CNFConvert_Neg(((And) e).getRight()));
        return e;
      }
    }
    if (!_matched) {
      return e;
    }
    return null;
  }
  
  public static Expression CNFConvert_Distrib(final Expression e) {
    boolean _matched = false;
    if ((e instanceof Or)) {
      _matched=true;
      Expression exprl = CNFConverter.CNFConvert_Distrib(((Or) e).getLeft());
      Expression exprr = CNFConverter.CNFConvert_Distrib(((Or) e).getRight());
      if ((exprl instanceof And)) {
        And and = SatFactory.eINSTANCE.createAnd();
        Or or1 = SatFactory.eINSTANCE.createOr();
        Or or2 = SatFactory.eINSTANCE.createOr();
        or1.setLeft(((And) exprl).getLeft());
        or1.setRight(exprr);
        or2.setLeft(((And) exprl).getRight());
        or2.setRight(exprr);
        and.setLeft(CNFConverter.CNFConvert_Distrib(or1));
        and.setRight(CNFConverter.CNFConvert_Distrib(or2));
        return and;
      } else {
        if ((exprr instanceof And)) {
          And and_1 = SatFactory.eINSTANCE.createAnd();
          Or or1_1 = SatFactory.eINSTANCE.createOr();
          Or or2_1 = SatFactory.eINSTANCE.createOr();
          or1_1.setLeft(((And) exprl).getLeft());
          or1_1.setRight(exprr);
          or2_1.setLeft(((And) exprl).getRight());
          or2_1.setRight(exprr);
          and_1.setLeft(CNFConverter.CNFConvert_Distrib(or1_1));
          and_1.setRight(CNFConverter.CNFConvert_Distrib(or2_1));
          return and_1;
        } else {
          return e;
        }
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        ((And) e).setLeft(CNFConverter.CNFConvert_Distrib(((And) e).getLeft()));
        ((And) e).setRight(CNFConverter.CNFConvert_Distrib(((And) e).getRight()));
        return e;
      }
    }
    return e;
  }
  
  public static Expression CNFConvert(final Expression e) {
    return CNFConverter.CNFConvert_Simpl(CNFConverter.CNFConvert_Neg(CNFConverter.CNFConvert_Distrib(e)));
  }
}
