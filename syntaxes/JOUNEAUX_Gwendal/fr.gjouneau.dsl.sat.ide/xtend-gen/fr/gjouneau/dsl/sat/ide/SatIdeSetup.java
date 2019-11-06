/**
 * generated by Xtext 2.19.0
 */
package fr.gjouneau.dsl.sat.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.gjouneau.dsl.sat.SatRuntimeModule;
import fr.gjouneau.dsl.sat.SatStandaloneSetup;
import fr.gjouneau.dsl.sat.ide.SatIdeModule;
import org.eclipse.xtext.util.Modules2;

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
