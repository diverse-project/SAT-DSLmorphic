package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class DimacsPrinter {
  public static String print(final EObject e) {
    String _format = DimacsPrinter.format(e);
    return (("c\n" + "p cnf \n") + _format);
  }
  
  public static String format(final EObject e) {
    boolean _matched = false;
    if ((e instanceof And)) {
      _matched=true;
      final And eobj = ((And) e);
      String _format = DimacsPrinter.format(eobj.getLeft());
      String _plus = (_format + "0\n");
      String _format_1 = DimacsPrinter.format(eobj.getRight());
      String _plus_1 = (_plus + _format_1);
      return (_plus_1 + " 0");
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        final Or eobj_1 = ((Or) e);
        String _format_2 = DimacsPrinter.format(eobj_1.getLeft());
        String _plus_2 = (_format_2 + " ");
        String _format_3 = DimacsPrinter.format(eobj_1.getRight());
        return (_plus_2 + _format_3);
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        final Not eobj_2 = ((Not) e);
        String _format_4 = DimacsPrinter.format(eobj_2.getExpression());
        return ("-" + _format_4);
      }
    }
    return "";
  }
}
