/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide;

import org.xtext.example.mydsl.SatRuntimeModule;
import org.xtext.example.mydsl.SatStandaloneSetup;
import org.xtext.example.mydsl.ide.SatIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SatIdeSetup extends SatStandaloneSetup {
  @Override
  public Injector createInjector() {
    SatRuntimeModule _satRuntimeModule = new SatRuntimeModule();
    SatIdeModule _satIdeModule = new SatIdeModule();
    return Guice.createInjector(Modules2.mixin(_satRuntimeModule, _satIdeModule));
  }
}
