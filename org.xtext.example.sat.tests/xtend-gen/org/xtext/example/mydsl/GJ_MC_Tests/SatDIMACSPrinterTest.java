package org.xtext.example.mydsl.GJ_MC_Tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.GJ_MC_Process.DIMACSPrinter;
import org.xtext.example.mydsl.sat.Model;
import org.xtext.example.mydsl.tests.SatInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(SatInjectorProvider.class)
@SuppressWarnings("all")
public class SatDIMACSPrinterTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void basicOrTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A v B");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String dimacsPrinted = DIMACSPrinter.dimacsFile(result.getExpression());
      final String oracle = "p cnf 2 1\n1 2 0";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(dimacsPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicNegTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("!A");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String dimacsPrinted = DIMACSPrinter.dimacsFile(result.getExpression());
      final String oracle = "p cnf 1 1\n-1 0";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(dimacsPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicAndTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A ^ B");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String dimacsPrinted = DIMACSPrinter.dimacsFile(result.getExpression());
      final String oracle = "p cnf 2 2\n1 0\n2 0";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(dimacsPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicIterationTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A ^ A");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String dimacsPrinted = DIMACSPrinter.dimacsFile(result.getExpression());
      final String oracle = "p cnf 1 2\n1 0\n1 0";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(dimacsPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void complexCNFTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("(A v B v C) ^ (A v !C) ^ (!B)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String dimacsPrinted = DIMACSPrinter.dimacsFile(result.getExpression());
      final String oracle = "p cnf 3 3\n1 2 3 0\n1 -3 0\n-2 0";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(dimacsPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
