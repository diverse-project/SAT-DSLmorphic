package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.satt.And;
import org.xtext.example.mydsl.satt.BiImpl;
import org.xtext.example.mydsl.satt.Expression;
import org.xtext.example.mydsl.satt.FILE;
import org.xtext.example.mydsl.satt.Impl;
import org.xtext.example.mydsl.satt.Nand;
import org.xtext.example.mydsl.satt.Not;
import org.xtext.example.mydsl.satt.Or;
import org.xtext.example.mydsl.satt.Sat;
import org.xtext.example.mydsl.tests.Methode1;
import org.xtext.example.mydsl.tests.Methode2;
import org.xtext.example.mydsl.tests.SattInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(SattInjectorProvider.class)
@SuppressWarnings("all")
public class Mein {
  @Inject
  private ParseHelper<Sat> parseHelper;
  
  @Test
  public void main() {
    this.create_file();
  }
  
  public Object create_file() {
    try {
      Object _xblockexpression = null;
      {
        final String input = "fomula2.satt";
        byte[] _readAllBytes = Files.readAllBytes(Paths.get(input));
        final String text = new String(_readAllBytes, StandardCharsets.UTF_8);
        final Sat ast = this.parseHelper.parse(text);
        InputOutput.<String>print("text read : ");
        InputOutput.<String>println(text);
        InputOutput.println();
        final String dimacs_formula = this.read_entry(ast);
        final String call_method = this.get_call_method(ast);
        InputOutput.<String>print("dimcas fomula : \n");
        InputOutput.<String>println(dimacs_formula);
        InputOutput.println();
        InputOutput.<String>print("call method : ");
        InputOutput.<String>println(call_method);
        InputOutput.println();
        final String filename_of_formula = "output.cnf";
        File _file = new File(filename_of_formula);
        final FileWriter fileWriter = new FileWriter(_file);
        fileWriter.write(dimacs_formula);
        fileWriter.close();
        Object _switchResult = null;
        boolean _matched = false;
        boolean _equals = call_method.equals("sat4j-java");
        if (_equals) {
          _matched=true;
          InputOutput.<String>println("calling sat4j from java code.");
          Methode1.DoIt(filename_of_formula);
        }
        if (!_matched) {
          boolean _equals_1 = call_method.equals("sat4j-jar");
          if (_equals_1) {
            _matched=true;
            InputOutput.<String>println("calling sat4j from jar");
            Methode2.DoIt(filename_of_formula);
          }
        }
        if (!_matched) {
          boolean _equals_2 = call_method.equals("sat4j-maven");
          if (_equals_2) {
            _matched=true;
            _switchResult = null;
          }
        }
        _xblockexpression = _switchResult;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String read_entry(final Sat ast) {
    try {
      EObject _source = ast.getSource();
      boolean _matched = false;
      EObject _source_1 = ast.getSource();
      if ((_source_1 instanceof FILE)) {
        _matched=true;
        EObject _source_2 = ast.getSource();
        final String filename = ((FILE) _source_2).getFile();
        byte[] _readAllBytes = Files.readAllBytes(Paths.get(filename));
        return new String(_readAllBytes, StandardCharsets.UTF_8);
      }
      if (!_matched) {
        EObject _source_3 = ast.getSource();
        if ((_source_3 instanceof Expression)) {
          _matched=true;
          EObject _source_4 = ast.getSource();
          return this.prop_to_dimacs(((EObject) _source_4));
        }
      }
      {
        InputOutput.<String>println("OUPS, ERREURRRRRRRRRRR");
        return "";
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String get_call_method(final Sat ast) {
    return ast.getCallMethod().getLiteral();
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
