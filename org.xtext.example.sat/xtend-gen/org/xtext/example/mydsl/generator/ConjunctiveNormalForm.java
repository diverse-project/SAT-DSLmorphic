package org.xtext.example.mydsl.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;
import org.xtext.example.mydsl.sat.SatFactory;

@SuppressWarnings("all")
public class ConjunctiveNormalForm {
  public static Expression toCNF(final EObject e) {
    boolean _matched = false;
    if ((e instanceof BiImpl)) {
      _matched=true;
      return ConjunctiveNormalForm.toCNF(((BiImpl) e));
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        return ConjunctiveNormalForm.toCNF(((Impl) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        return ConjunctiveNormalForm.toCNF(((Nand) e));
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        return ConjunctiveNormalForm.toCNF(((And) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        return ConjunctiveNormalForm.toCNF(((Or) e));
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        return ConjunctiveNormalForm.toCNF(((Not) e));
      }
    }
    return ((Expression) e);
  }
  
  public static Expression toCNF(final BiImpl e) {
    return e;
  }
  
  public static Expression toCNF(final Impl e) {
    return e;
  }
  
  public static Expression toCNF(final Nand e) {
    return e;
  }
  
  public static Expression toCNF(final And e) {
    And _xblockexpression = null;
    {
      e.setLeft(ConjunctiveNormalForm.toCNF(e.getLeft()));
      e.setRight(ConjunctiveNormalForm.toCNF(e.getRight()));
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
  
  public static Expression toCNF(final Or e) {
    final Expression lhsReplacement = ConjunctiveNormalForm.toCNF(e.getLeft());
    final Expression rhsReplacement = ConjunctiveNormalForm.toCNF(e.getRight());
    final List<Expression> clausesP = ConjunctiveNormalForm.getClauses(lhsReplacement);
    final List<Expression> clausesQ = ConjunctiveNormalForm.getClauses(rhsReplacement);
    final ArrayList<Expression> generatedClauses = new ArrayList<Expression>();
    for (final Expression p : clausesP) {
      for (final Expression q : clausesQ) {
        {
          Or or = SatFactory.eINSTANCE.createOr();
          or.setLeft(EcoreUtil2.<Expression>copy(p));
          or.setRight(EcoreUtil2.<Expression>copy(q));
          generatedClauses.add(or);
        }
      }
    }
    while ((generatedClauses.size() > 1)) {
      {
        final Expression p_1 = IterableExtensions.<Expression>head(generatedClauses);
        generatedClauses.remove(0);
        final Expression q_1 = IterableExtensions.<Expression>head(generatedClauses);
        generatedClauses.remove(0);
        And and = SatFactory.eINSTANCE.createAnd();
        and.setLeft(p_1);
        and.setRight(q_1);
        generatedClauses.add(and);
      }
    }
    return IterableExtensions.<Expression>head(generatedClauses);
  }
  
  public static Expression toCNF(final Not e) {
    Not _xblockexpression = null;
    {
      Expression _expression = e.getExpression();
      if ((_expression instanceof Not)) {
        Expression _expression_1 = e.getExpression();
        return ConjunctiveNormalForm.toCNF(((Not) _expression_1).getExpression());
      }
      Expression _expression_2 = e.getExpression();
      if ((_expression_2 instanceof And)) {
        final Or or = SatFactory.eINSTANCE.createOr();
        final Not notLeft = SatFactory.eINSTANCE.createNot();
        final Not notRight = SatFactory.eINSTANCE.createNot();
        Expression _expression_3 = e.getExpression();
        notLeft.setExpression(((And) _expression_3).getLeft());
        Expression _expression_4 = e.getExpression();
        notRight.setExpression(((And) _expression_4).getRight());
        or.setLeft(notLeft);
        or.setRight(notRight);
        final Expression cnf = ConjunctiveNormalForm.toCNF(or);
        return cnf;
      }
      Expression _expression_5 = e.getExpression();
      if ((_expression_5 instanceof Or)) {
        final And and = SatFactory.eINSTANCE.createAnd();
        final Not notLeft_1 = SatFactory.eINSTANCE.createNot();
        final Not notRight_1 = SatFactory.eINSTANCE.createNot();
        Expression _expression_6 = e.getExpression();
        notLeft_1.setExpression(((Or) _expression_6).getLeft());
        Expression _expression_7 = e.getExpression();
        notRight_1.setExpression(((Or) _expression_7).getRight());
        and.setLeft(notLeft_1);
        and.setRight(notRight_1);
        final Expression cnf_1 = ConjunctiveNormalForm.toCNF(and);
        return cnf_1;
      }
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
  
  public static List<Expression> getClauses(final Expression e) {
    ArrayList<Expression> _xblockexpression = null;
    {
      ArrayList<Expression> out = new ArrayList<Expression>();
      if ((!(e instanceof And))) {
        out.add(e);
        return out;
      }
      final And and = ((And) e);
      out.addAll(ConjunctiveNormalForm.getClauses(and.getLeft()));
      out.addAll(ConjunctiveNormalForm.getClauses(and.getRight()));
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
}
