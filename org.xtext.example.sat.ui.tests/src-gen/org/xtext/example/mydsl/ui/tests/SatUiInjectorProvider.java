/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.sat.ui.internal.SatActivator;

public class SatUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SatActivator.getInstance().getInjector("org.xtext.example.mydsl.Sat");
	}

}
