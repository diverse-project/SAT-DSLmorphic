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
      Expression exprg1 = CNFConverter.CNFConvert_Simpl(((BiImpl) e).getLeft());
      Expression exprd1 = CNFConverter.CNFConvert_Simpl(((BiImpl) e).getRight());
      Expression exprd2 = CNFConverter.CNFConvert_Simpl(((BiImpl) e).getRight());
      Expression exprg2 = CNFConverter.CNFConvert_Simpl(((BiImpl) e).getLeft());
      And and = SatFactory.eINSTANCE.createAnd();
      Impl impl1 = SatFactory.eINSTANCE.createImpl();
      Impl impl2 = SatFactory.eINSTANCE.createImpl();
      impl1.setLeft(exprg1);
      impl1.setRight(exprd1);
      impl2.setLeft(exprd2);
      impl2.setRight(exprg2);
      and.setLeft(impl1);
      and.setRight(impl2);
      return CNFConverter.CNFConvert_Simpl(and);
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        Expression exprg = CNFConverter.CNFConvert_Simpl(((Impl) e).getLeft());
        Expression exprd = CNFConverter.CNFConvert_Simpl(((Impl) e).getRight());
        Or or = SatFactory.eINSTANCE.createOr();
        Not not = SatFactory.eINSTANCE.createNot();
        not.setExpression(exprg);
        or.setLeft(not);
        or.setRight(exprd);
        return or;
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        Or or_1 = SatFactory.eINSTANCE.createOr();
        or_1.setLeft(CNFConverter.CNFConvert_Simpl(((Or) e).getLeft()));
        or_1.setRight(CNFConverter.CNFConvert_Simpl(((Or) e).getRight()));
        return or_1;
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        And and_1 = SatFactory.eINSTANCE.createAnd();
        and_1.setLeft(CNFConverter.CNFConvert_Simpl(((And) e).getLeft()));
        and_1.setRight(CNFConverter.CNFConvert_Simpl(((And) e).getRight()));
        return and_1;
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        Expression exprg_1 = CNFConverter.CNFConvert_Simpl(((Nand) e).getLeft());
        Expression exprd_1 = CNFConverter.CNFConvert_Simpl(((Nand) e).getRight());
        And and_2 = SatFactory.eINSTANCE.createAnd();
        Not not_1 = SatFactory.eINSTANCE.createNot();
        and_2.setLeft(exprg_1);
        and_2.setRight(exprd_1);
        not_1.setExpression(and_2);
        return not_1;
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        Not not_2 = SatFactory.eINSTANCE.createNot();
        not_2.setExpression(CNFConverter.CNFConvert_Simpl(((Not) e).getExpression()));
        return not_2;
      }
    }
    {
      Expression exp = SatFactory.eINSTANCE.createExpression();
      exp.setId(e.getId());
      exp.setVal(e.getVal());
      return exp;
    }
  }
  
  public static Expression CNFConvert_Neg(final Expression e) {
    boolean _matched = false;
    if ((e instanceof Not)) {
      _matched=true;
      Expression expr = ((Not) e).getExpression();
      boolean _matched_1 = false;
      if ((expr instanceof Not)) {
        _matched_1=true;
        Expression expr1 = SatFactory.eINSTANCE.createExpression();
        expr1 = CNFConverter.CNFConvert_Neg(((Not) expr).getExpression());
        return expr1;
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
      {
        Not not = SatFactory.eINSTANCE.createNot();
        not.setExpression(expr);
        return not;
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        Or or_1 = SatFactory.eINSTANCE.createOr();
        or_1.setLeft(CNFConverter.CNFConvert_Neg(((Or) e).getLeft()));
        or_1.setRight(CNFConverter.CNFConvert_Neg(((Or) e).getRight()));
        return or_1;
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        And and_1 = SatFactory.eINSTANCE.createAnd();
        and_1.setLeft(CNFConverter.CNFConvert_Neg(((And) e).getLeft()));
        and_1.setRight(CNFConverter.CNFConvert_Neg(((And) e).getRight()));
        return and_1;
      }
    }
    {
      Expression exp = SatFactory.eINSTANCE.createExpression();
      exp.setId(e.getId());
      exp.setVal(e.getVal());
      return exp;
    }
  }
  
  public static Expression CNFConvert_Distrib(final Expression e) {
    boolean _matched = false;
    if ((e instanceof Or)) {
      _matched=true;
      Expression exprl1 = CNFConverter.CNFConvert_Distrib(((Or) e).getLeft());
      Expression exprr1 = CNFConverter.CNFConvert_Distrib(((Or) e).getRight());
      Expression exprl2 = CNFConverter.CNFConvert_Distrib(((Or) e).getLeft());
      Expression exprr2 = CNFConverter.CNFConvert_Distrib(((Or) e).getRight());
      if ((exprl1 instanceof And)) {
        And and = SatFactory.eINSTANCE.createAnd();
        Or or1 = SatFactory.eINSTANCE.createOr();
        Or or2 = SatFactory.eINSTANCE.createOr();
        or1.setLeft(((And) exprl1).getLeft());
        or1.setRight(exprr1);
        or2.setLeft(((And) exprl1).getRight());
        or2.setRight(exprr2);
        and.setLeft(CNFConverter.CNFConvert_Distrib(or1));
        and.setRight(CNFConverter.CNFConvert_Distrib(or2));
        return and;
      } else {
        if ((exprr1 instanceof And)) {
          And and_1 = SatFactory.eINSTANCE.createAnd();
          Or or1_1 = SatFactory.eINSTANCE.createOr();
          Or or2_1 = SatFactory.eINSTANCE.createOr();
          or1_1.setLeft(((And) exprr1).getLeft());
          or1_1.setRight(exprl1);
          or2_1.setLeft(((And) exprr2).getRight());
          or2_1.setRight(exprl2);
          and_1.setLeft(CNFConverter.CNFConvert_Distrib(or1_1));
          and_1.setRight(CNFConverter.CNFConvert_Distrib(or2_1));
          return and_1;
        } else {
          Or or = SatFactory.eINSTANCE.createOr();
          or.setLeft(exprl1);
          or.setRight(exprr1);
          return or;
        }
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        And and_2 = SatFactory.eINSTANCE.createAnd();
        and_2.setLeft(CNFConverter.CNFConvert_Distrib(((And) e).getLeft()));
        and_2.setRight(CNFConverter.CNFConvert_Distrib(((And) e).getRight()));
        return and_2;
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        Not not = SatFactory.eINSTANCE.createNot();
        not.setExpression(CNFConverter.CNFConvert_Distrib(((Not) e).getExpression()));
        return not;
      }
    }
    {
      Expression exp = SatFactory.eINSTANCE.createExpression();
      exp.setId(e.getId());
      exp.setVal(e.getVal());
      return exp;
    }
  }
  
  public static Expression CNFConvert(final Expression e) {
    return CNFConverter.CNFConvert_Distrib(CNFConverter.CNFConvert_Neg(CNFConverter.CNFConvert_Simpl(e)));
  }
}
