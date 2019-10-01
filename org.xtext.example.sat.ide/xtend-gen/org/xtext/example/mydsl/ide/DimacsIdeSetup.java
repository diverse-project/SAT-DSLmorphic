/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.DimacsRuntimeModule;
import org.xtext.example.mydsl.DimacsStandaloneSetup;
import org.xtext.example.mydsl.ide.DimacsIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DimacsIdeSetup extends DimacsStandaloneSetup {
  @Override
  public Injector createInjector() {
    DimacsRuntimeModule _dimacsRuntimeModule = new DimacsRuntimeModule();
    DimacsIdeModule _dimacsIdeModule = new DimacsIdeModule();
    return Guice.createInjector(Modules2.mixin(_dimacsRuntimeModule, _dimacsIdeModule));
  }
}
