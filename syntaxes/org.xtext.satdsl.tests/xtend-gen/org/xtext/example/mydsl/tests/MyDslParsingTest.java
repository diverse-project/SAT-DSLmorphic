/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.tests.MyDslInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  private ParseHelper<Expression> parseHelper;
  
  @Test
  public void loadModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eResource is undefined for the type Expression"
      + "\nerrors cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\njoin cannot be resolved");
  }
}
