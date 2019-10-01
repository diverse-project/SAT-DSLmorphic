/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.sat.ui.internal.SatActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DimacsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(SatActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		SatActivator activator = SatActivator.getInstance();
		return activator != null ? activator.getInjector(SatActivator.ORG_XTEXT_EXAMPLE_MYDSL_DIMACS) : null;
	}

}
