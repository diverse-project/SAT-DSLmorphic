package org.xtext.example.mydsl.GJ_MC_Process;

import java.util.ArrayList;
import java.util.List;
import org.xtext.example.mydsl.GJ_MC_Process.SATUtils;
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
  public static Expression toCleanCNF(final EObject e) {
    return ConjunctiveNormalForm.cleanDouble(ConjunctiveNormalForm.toCNF(e));
  }
  
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
    final List<Expression> clausesP = SATUtils.getClauses(lhsReplacement);
    final List<Expression> clausesQ = SATUtils.getClauses(rhsReplacement);
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
  
  public static Expression cleanDouble(final Expression e) {
    Expression _xblockexpression = null;
    {
      if ((e instanceof And)) {
        final List<Expression> clauses = SATUtils.getClauses(e);
        for (int i = 0; (i < ((Object[])Conversions.unwrapArray(clauses, Object.class)).length); i++) {
          clauses.set(i, ConjunctiveNormalForm.cleanDouble(clauses.get(i)));
        }
        for (int i = 0; (i < ((Object[])Conversions.unwrapArray(clauses, Object.class)).length); i++) {
          for (int j = (i + 1); (j < ((Object[])Conversions.unwrapArray(clauses, Object.class)).length); j++) {
            boolean _equals = EcoreUtil2.equals(clauses.get(i), clauses.get(j));
            if (_equals) {
              clauses.remove(j);
              j--;
            }
          }
        }
        while ((clauses.size() > 1)) {
          {
            final Expression p = IterableExtensions.<Expression>head(clauses);
            clauses.remove(0);
            final Expression q = IterableExtensions.<Expression>head(clauses);
            clauses.remove(0);
            And and = SatFactory.eINSTANCE.createAnd();
            and.setLeft(p);
            and.setRight(q);
            clauses.add(and);
          }
        }
        return IterableExtensions.<Expression>head(clauses);
      }
      if ((e instanceof Or)) {
        final List<Expression> atoms = SATUtils.getAtoms(e);
        for (int i = 0; (i < ((Object[])Conversions.unwrapArray(atoms, Object.class)).length); i++) {
          for (int j = (i + 1); (j < ((Object[])Conversions.unwrapArray(atoms, Object.class)).length); j++) {
            boolean _equals = EcoreUtil2.equals(atoms.get(i), atoms.get(j));
            if (_equals) {
              atoms.remove(j);
              j--;
            }
          }
        }
        while ((atoms.size() > 1)) {
          {
            final Expression p = IterableExtensions.<Expression>head(atoms);
            atoms.remove(0);
            final Expression q = IterableExtensions.<Expression>head(atoms);
            atoms.remove(0);
            Or or = SatFactory.eINSTANCE.createOr();
            or.setLeft(p);
            or.setRight(q);
            atoms.add(or);
          }
        }
        return IterableExtensions.<Expression>head(atoms);
      }
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
}
