package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.satt.And;
import org.xtext.example.mydsl.satt.BiImpl;
import org.xtext.example.mydsl.satt.Expression;
import org.xtext.example.mydsl.satt.Impl;
import org.xtext.example.mydsl.satt.Nand;
import org.xtext.example.mydsl.satt.Not;
import org.xtext.example.mydsl.satt.Or;
import org.xtext.example.mydsl.tests.SattInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(SattInjectorProvider.class)
@SuppressWarnings("all")
public class Mein {
  @Inject
  private /* ParseHelper<SAT> */Object parseHelper;
  
  @Test
  public void main() {
    InputOutput.<String>println("oui");
    this.create_file();
  }
  
  public void create_file() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Mein.parseHelper refers to the missing type SAT"
      + "\nThe method read_entry(SAT) from the type Mein refers to the missing type SAT"
      + "\nThe method get_call_method(SAT) from the type Mein refers to the missing type Object");
  }
  
  public String read_entry(final /* SAT */Object ast) {
    throw new Error("Unresolved compilation problems:"
      + "\nast.source cannot be resolved to a type."
      + "\nsource cannot be resolved"
      + "\nsource cannot be resolved"
      + "\nsource cannot be resolved"
      + "\nsource cannot be resolved"
      + "\nsource cannot be resolved");
  }
  
  public Object get_call_method(final /* SAT */Object ast) {
    throw new Error("Unresolved compilation problems:"
      + "\ncallMethod cannot be resolved");
  }
  
  public String prop_to_dimacs(final EObject formule) {
    String _xblockexpression = null;
    {
      Mein.tab_symb.clear();
      Mein.populate_tab_symb(formule);
      int _size = Mein.tab_symb.size();
      String _plus = ("p cnf " + Integer.valueOf(_size));
      String _plus_1 = (_plus + " ");
      int _count_clauses = this.count_clauses(formule);
      String _plus_2 = (_plus_1 + Integer.valueOf(_count_clauses));
      String _plus_3 = (_plus_2 + "\n");
      String _write_clauses = this.write_clauses(formule);
      String _plus_4 = (_plus_3 + _write_clauses);
      _xblockexpression = (_plus_4 + " 0");
    }
    return _xblockexpression;
  }
  
  public String write_clauses(final EObject formule) {
    String _switchResult = null;
    boolean _matched = false;
    if ((formule instanceof Or)) {
      _matched=true;
      String _write_clauses = this.write_clauses(((Or) formule).getLeft());
      String _plus = (_write_clauses + " ");
      String _write_clauses_1 = this.write_clauses(((Or) formule).getRight());
      _switchResult = (_plus + _write_clauses_1);
    }
    if (!_matched) {
      if ((formule instanceof And)) {
        _matched=true;
        String _write_clauses_2 = this.write_clauses(((And) formule).getLeft());
        String _plus_1 = (_write_clauses_2 + " 0\n");
        String _write_clauses_3 = this.write_clauses(((And) formule).getRight());
        _switchResult = (_plus_1 + _write_clauses_3);
      }
    }
    if (!_matched) {
      if ((formule instanceof Not)) {
        _matched=true;
        String _write_clauses_4 = this.write_clauses(((Not) formule).getExpression());
        _switchResult = ("-" + _write_clauses_4);
      }
    }
    if (!_matched) {
      String _xifexpression = null;
      String _id = ((Expression) formule).getId();
      boolean _tripleNotEquals = (_id != null);
      if (_tripleNotEquals) {
        int _indexOf = Mein.tab_symb.indexOf(((Expression) formule).getId());
        int _plus_2 = (_indexOf + 1);
        _xifexpression = ("" + Integer.valueOf(_plus_2));
      } else {
        _xifexpression = "ERROR";
      }
      _switchResult = _xifexpression;
    }
    return _switchResult;
  }
  
  private static ArrayList<String> tab_symb = new ArrayList<String>();
  
  public static int populate_tab_symb(final EObject formule) {
    int _switchResult = (int) 0;
    boolean _matched = false;
    if ((formule instanceof Or)) {
      _matched=true;
      int _populate_tab_symb = Mein.populate_tab_symb(((Or) formule).getLeft());
      int _populate_tab_symb_1 = Mein.populate_tab_symb(((Or) formule).getRight());
      _switchResult = (_populate_tab_symb + _populate_tab_symb_1);
    }
    if (!_matched) {
      if ((formule instanceof And)) {
        _matched=true;
        int _populate_tab_symb_2 = Mein.populate_tab_symb(((And) formule).getLeft());
        int _populate_tab_symb_3 = Mein.populate_tab_symb(((And) formule).getRight());
        _switchResult = (_populate_tab_symb_2 + _populate_tab_symb_3);
      }
    }
    if (!_matched) {
      if ((formule instanceof Not)) {
        _matched=true;
        _switchResult = Mein.populate_tab_symb(((Not) formule).getExpression());
      }
    }
    if (!_matched) {
      int _xifexpression = (int) 0;
      String _id = ((Expression) formule).getId();
      boolean _tripleNotEquals = (_id != null);
      if (_tripleNotEquals) {
        int _xblockexpression = (int) 0;
        {
          String id = ((Expression) formule).getId();
          int _xifexpression_1 = (int) 0;
          boolean _contains = Mein.tab_symb.contains(id);
          boolean _not = (!_contains);
          if (_not) {
            int _xblockexpression_1 = (int) 0;
            {
              Mein.tab_symb.add(id);
              _xblockexpression_1 = 1;
            }
            _xifexpression_1 = _xblockexpression_1;
          } else {
            _xifexpression_1 = 0;
          }
          _xblockexpression = _xifexpression_1;
        }
        _xifexpression = _xblockexpression;
      } else {
        _xifexpression = 0;
      }
      _switchResult = _xifexpression;
    }
    return _switchResult;
  }
  
  public int count_clauses(final EObject formule) {
    int _xifexpression = (int) 0;
    if ((formule instanceof And)) {
      int _count_clauses = this.count_clauses(((And) formule).getRight());
      int _count_clauses_1 = this.count_clauses(((And) formule).getLeft());
      _xifexpression = (_count_clauses + _count_clauses_1);
    } else {
      _xifexpression = 1;
    }
    return _xifexpression;
  }
  
  public void pretty_print(final EObject formule) {
    boolean _matched = false;
    if ((formule instanceof BiImpl)) {
      _matched=true;
      InputOutput.<String>print("(");
      this.pretty_print(((BiImpl) formule).getLeft());
      InputOutput.<String>print(" <-> ");
      this.pretty_print(((BiImpl) formule).getRight());
      InputOutput.<String>print(")");
    }
    if (!_matched) {
      if ((formule instanceof Impl)) {
        _matched=true;
        InputOutput.<String>print("(");
        this.pretty_print(((Impl) formule).getLeft());
        InputOutput.<String>print(" -> ");
        this.pretty_print(((Impl) formule).getRight());
        InputOutput.<String>print(")");
      }
    }
    if (!_matched) {
      if ((formule instanceof Or)) {
        _matched=true;
        InputOutput.<String>print("(");
        this.pretty_print(((Or) formule).getLeft());
        InputOutput.<String>print(" OR ");
        this.pretty_print(((Or) formule).getRight());
        InputOutput.<String>print(")");
      }
    }
    if (!_matched) {
      if ((formule instanceof And)) {
        _matched=true;
        InputOutput.<String>print("(");
        this.pretty_print(((And) formule).getLeft());
        InputOutput.<String>print(" AND ");
        this.pretty_print(((And) formule).getRight());
        InputOutput.<String>print(")");
      }
    }
    if (!_matched) {
      if ((formule instanceof Nand)) {
        _matched=true;
        InputOutput.<String>print("(");
        this.pretty_print(((Nand) formule).getLeft());
        InputOutput.<String>print(" NAND ");
        this.pretty_print(((Nand) formule).getRight());
        InputOutput.<String>print(")");
      }
    }
    if (!_matched) {
      if ((formule instanceof Not)) {
        _matched=true;
        InputOutput.<String>print("(");
        InputOutput.<String>print("NOT ");
        this.pretty_print(((Not) formule).getExpression());
        InputOutput.<String>print(")");
      }
    }
    if (!_matched) {
      {
        String _id = ((Expression) formule).getId();
        boolean _tripleNotEquals = (_id != null);
        if (_tripleNotEquals) {
          InputOutput.<String>print(((Expression) formule).getId());
        }
        String _val = ((Expression) formule).getVal();
        boolean _tripleNotEquals_1 = (_val != null);
        if (_tripleNotEquals_1) {
          InputOutput.<String>print(((Expression) formule).getVal());
        }
      }
    }
  }
}
