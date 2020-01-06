package org.xtext.example.mydsl.GJ_MC_Process;

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
    e.setLeft(lhsReplacement);
    e.setRight(rhsReplacement);
    String _val = e.getLeft().getVal();
    boolean _tripleNotEquals = (_val != null);
    if (_tripleNotEquals) {
      String _val_1 = e.getLeft().getVal();
      boolean _equals = Objects.equal(_val_1, "true");
      if (_equals) {
        return e.getRight();
      } else {
        final Not not = SatFactory.eINSTANCE.createNot();
        not.setExpression(e.getRight());
        return not;
      }
    }
    String _val_2 = e.getRight().getVal();
    boolean _tripleNotEquals_1 = (_val_2 != null);
    if (_tripleNotEquals_1) {
      String _val_3 = e.getRight().getVal();
      boolean _equals_1 = Objects.equal(_val_3, "true");
      if (_equals_1) {
        return e.getLeft();
      } else {
        final Not not_1 = SatFactory.eINSTANCE.createNot();
        not_1.setExpression(e.getLeft());
        return not_1;
      }
    }
    final And andTrue = SatFactory.eINSTANCE.createAnd();
    final And andFalse = SatFactory.eINSTANCE.createAnd();
    final Not notLeft = SatFactory.eINSTANCE.createNot();
    final Not notRight = SatFactory.eINSTANCE.createNot();
    final Or or = SatFactory.eINSTANCE.createOr();
    andTrue.setLeft(EcoreUtil2.<Expression>copy(lhsReplacement));
    andTrue.setRight(EcoreUtil2.<Expression>copy(rhsReplacement));
    notLeft.setExpression(EcoreUtil2.<Expression>copy(lhsReplacement));
    notRight.setExpression(EcoreUtil2.<Expression>copy(rhsReplacement));
    andFalse.setLeft(notLeft);
    andFalse.setRight(notRight);
    or.setLeft(andTrue);
    or.setRight(andFalse);
    return or;
  }
  
  public static Expression simplify(final Impl e) {
    final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
    final Expression rhsReplacement = Simplifier.simplify(e.getRight());
    e.setLeft(lhsReplacement);
    e.setRight(rhsReplacement);
    String _val = e.getLeft().getVal();
    boolean _tripleNotEquals = (_val != null);
    if (_tripleNotEquals) {
      String _val_1 = e.getLeft().getVal();
      boolean _equals = Objects.equal(_val_1, "true");
      if (_equals) {
        return e.getRight();
      } else {
        final Expression exp = SatFactory.eINSTANCE.createExpression();
        exp.setVal("true");
        return exp;
      }
    }
    String _val_2 = e.getRight().getVal();
    boolean _tripleNotEquals_1 = (_val_2 != null);
    if (_tripleNotEquals_1) {
      String _val_3 = e.getRight().getVal();
      boolean _equals_1 = Objects.equal(_val_3, "true");
      if (_equals_1) {
        final Expression exp_1 = SatFactory.eINSTANCE.createExpression();
        exp_1.setVal("true");
        return exp_1;
      } else {
        final Not not = SatFactory.eINSTANCE.createNot();
        not.setExpression(e.getLeft());
        return not;
      }
    }
    final Or or = SatFactory.eINSTANCE.createOr();
    final Not not_1 = SatFactory.eINSTANCE.createNot();
    not_1.setExpression(lhsReplacement);
    or.setLeft(not_1);
    or.setRight(rhsReplacement);
    return or;
  }
  
  public static Expression simplify(final Nand e) {
    final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
    final Expression rhsReplacement = Simplifier.simplify(e.getRight());
    e.setLeft(lhsReplacement);
    e.setRight(rhsReplacement);
    String _val = e.getLeft().getVal();
    boolean _tripleNotEquals = (_val != null);
    if (_tripleNotEquals) {
      String _val_1 = e.getLeft().getVal();
      boolean _equals = Objects.equal(_val_1, "true");
      if (_equals) {
        return e.getRight();
      } else {
        Expression _left = e.getLeft();
        _left.setVal("true");
        return e.getLeft();
      }
    }
    String _val_2 = e.getRight().getVal();
    boolean _tripleNotEquals_1 = (_val_2 != null);
    if (_tripleNotEquals_1) {
      String _val_3 = e.getRight().getVal();
      boolean _equals_1 = Objects.equal(_val_3, "true");
      if (_equals_1) {
        return e.getLeft();
      } else {
        Expression _right = e.getRight();
        _right.setVal("true");
        return e.getRight();
      }
    }
    final And and = SatFactory.eINSTANCE.createAnd();
    final Not not = SatFactory.eINSTANCE.createNot();
    and.setLeft(lhsReplacement);
    and.setRight(rhsReplacement);
    not.setExpression(and);
    return not;
  }
  
  public static Expression simplify(final And e) {
    And _xblockexpression = null;
    {
      final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
      final Expression rhsReplacement = Simplifier.simplify(e.getRight());
      e.setLeft(lhsReplacement);
      e.setRight(rhsReplacement);
      String _val = e.getLeft().getVal();
      boolean _tripleNotEquals = (_val != null);
      if (_tripleNotEquals) {
        String _val_1 = e.getLeft().getVal();
        boolean _equals = Objects.equal(_val_1, "true");
        if (_equals) {
          return e.getRight();
        } else {
          return e.getLeft();
        }
      }
      String _val_2 = e.getRight().getVal();
      boolean _tripleNotEquals_1 = (_val_2 != null);
      if (_tripleNotEquals_1) {
        String _val_3 = e.getRight().getVal();
        boolean _equals_1 = Objects.equal(_val_3, "true");
        if (_equals_1) {
          return e.getLeft();
        } else {
          return e.getRight();
        }
      }
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
  
  public static Expression simplify(final Or e) {
    Or _xblockexpression = null;
    {
      final Expression lhsReplacement = Simplifier.simplify(e.getLeft());
      final Expression rhsReplacement = Simplifier.simplify(e.getRight());
      e.setLeft(lhsReplacement);
      e.setRight(rhsReplacement);
      String _val = e.getLeft().getVal();
      boolean _tripleNotEquals = (_val != null);
      if (_tripleNotEquals) {
        String _val_1 = e.getLeft().getVal();
        boolean _equals = Objects.equal(_val_1, "true");
        if (_equals) {
          return e.getLeft();
        } else {
          return e.getRight();
        }
      }
      String _val_2 = e.getRight().getVal();
      boolean _tripleNotEquals_1 = (_val_2 != null);
      if (_tripleNotEquals_1) {
        String _val_3 = e.getRight().getVal();
        boolean _equals_1 = Objects.equal(_val_3, "true");
        if (_equals_1) {
          return e.getRight();
        } else {
          return e.getLeft();
        }
      }
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
  
  public static Expression simplify(final Not e) {
    Not _xblockexpression = null;
    {
      final Expression expReplacement = Simplifier.simplify(e.getExpression());
      e.setExpression(expReplacement);
      String _val = e.getExpression().getVal();
      boolean _tripleNotEquals = (_val != null);
      if (_tripleNotEquals) {
        final Expression exp = SatFactory.eINSTANCE.createExpression();
        String _val_1 = e.getExpression().getVal();
        boolean _equals = Objects.equal(_val_1, "true");
        if (_equals) {
          exp.setVal("false");
        } else {
          exp.setVal("true");
        }
        return exp;
      }
      _xblockexpression = e;
    }
    return _xblockexpression;
  }
}
