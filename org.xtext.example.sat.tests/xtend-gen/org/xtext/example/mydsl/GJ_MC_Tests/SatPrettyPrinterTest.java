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
import org.xtext.example.mydsl.GJ_MC_Process.PrettyPrinter;
import org.xtext.example.mydsl.sat.Model;
import org.xtext.example.mydsl.tests.SatInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(SatInjectorProvider.class)
@SuppressWarnings("all")
public class SatPrettyPrinterTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void basicVarTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "A";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
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
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "(A ^ B)";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicOrTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A v B");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "(A v B)";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicImplTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A => B");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "(A => B)";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicBiImplTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A <=> B");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "(A <=> B)";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void basicNandTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A | B");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "(A | B)";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void complexPriorityTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("solver sat4j-java");
      _builder.newLine();
      _builder.append("A => B^C vD");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      final String prettyPrinted = PrettyPrinter.prettyPrint(result.getExpression());
      final String oracle = "(A => ((B ^ C) v D))";
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      boolean _equals = Objects.equal(prettyPrinted, oracle);
      Assertions.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
