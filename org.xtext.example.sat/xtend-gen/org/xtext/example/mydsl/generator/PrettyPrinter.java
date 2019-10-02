package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class PrettyPrinter {
  public static String print(final EObject e) {
    boolean _matched = false;
    if ((e instanceof And)) {
      _matched=true;
      final And eobj = ((And) e);
      String _print = PrettyPrinter.print(eobj.getLeft());
      String _plus = ("(" + _print);
      String _plus_1 = (_plus + "&&");
      String _print_1 = PrettyPrinter.print(eobj.getRight());
      String _plus_2 = (_plus_1 + _print_1);
      return (_plus_2 + ")");
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        final Or eobj_1 = ((Or) e);
        String _print_2 = PrettyPrinter.print(eobj_1.getLeft());
        String _plus_3 = ("(" + _print_2);
        String _plus_4 = (_plus_3 + "||");
        String _print_3 = PrettyPrinter.print(eobj_1.getRight());
        String _plus_5 = (_plus_4 + _print_3);
        return (_plus_5 + ")");
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        final Not eobj_2 = ((Not) e);
        String _print_4 = PrettyPrinter.print(eobj_2.getExpression());
        String _plus_6 = ("( !" + _print_4);
        return (_plus_6 + ")");
      }
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        final Impl eobj_3 = ((Impl) e);
        String _print_5 = PrettyPrinter.print(eobj_3.getLeft());
        String _plus_7 = ("(" + _print_5);
        String _plus_8 = (_plus_7 + "->");
        String _print_6 = PrettyPrinter.print(eobj_3.getRight());
        String _plus_9 = (_plus_8 + _print_6);
        return (_plus_9 + ")");
      }
    }
    if (!_matched) {
      if ((e instanceof BiImpl)) {
        _matched=true;
        final BiImpl eobj_4 = ((BiImpl) e);
        String _print_7 = PrettyPrinter.print(eobj_4.getLeft());
        String _plus_10 = ("(" + _print_7);
        String _plus_11 = (_plus_10 + "<->");
        String _print_8 = PrettyPrinter.print(eobj_4.getRight());
        String _plus_12 = (_plus_11 + _print_8);
        return (_plus_12 + ")");
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        final Nand eobj_5 = ((Nand) e);
        String _print_9 = PrettyPrinter.print(eobj_5.getLeft());
        String _plus_13 = ("(" + _print_9);
        String _plus_14 = (_plus_13 + "!&");
        String _print_10 = PrettyPrinter.print(eobj_5.getRight());
        String _plus_15 = (_plus_14 + _print_10);
        return (_plus_15 + ")");
      }
    }
    if (!_matched) {
      if ((e instanceof Expression)) {
        _matched=true;
        final Expression eobj_6 = ((Expression) e);
        String _id = eobj_6.getId();
        String _plus_16 = (" " + _id);
        String _plus_17 = (_plus_16 + "=");
        String _val = eobj_6.getVal();
        return (_plus_17 + _val);
      }
    }
    return "";
  }
}
