package org.xtext.example.mydsl.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class SATUtils {
  public static List<Expression> getClauses(final Expression e) {
    ArrayList<Expression> _xblockexpression = null;
    {
      ArrayList<Expression> out = new ArrayList<Expression>();
      if ((!(e instanceof And))) {
        out.add(e);
        return out;
      }
      final And and = ((And) e);
      out.addAll(SATUtils.getClauses(and.getLeft()));
      out.addAll(SATUtils.getClauses(and.getRight()));
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  public static List<Expression> getAtoms(final Expression e) {
    ArrayList<Expression> out = new ArrayList<Expression>();
    if ((e instanceof Not)) {
      Expression _expression = ((Not)e).getExpression();
      if ((_expression instanceof Expression)) {
        out.add(e);
        return out;
      }
      out.addAll(SATUtils.getAtoms(((Not)e).getExpression()));
      return out;
    }
    if ((e instanceof And)) {
      final And binop = ((And) e);
      out.addAll(SATUtils.getAtoms(binop.getLeft()));
      out.addAll(SATUtils.getAtoms(binop.getRight()));
      return out;
    }
    if ((e instanceof Or)) {
      final Or binop_1 = ((Or) e);
      out.addAll(SATUtils.getAtoms(binop_1.getLeft()));
      out.addAll(SATUtils.getAtoms(binop_1.getRight()));
      return out;
    }
    out.add(e);
    return out;
  }
  
  public static boolean equals(final EObject e1, final EObject e2) {
    return EcoreUtil2.equals(e1, e2);
  }
}
