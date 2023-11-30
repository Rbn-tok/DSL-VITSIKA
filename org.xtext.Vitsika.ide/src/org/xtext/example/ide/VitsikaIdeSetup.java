/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.VitsikaRuntimeModule;
import org.xtext.example.VitsikaStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class VitsikaIdeSetup extends VitsikaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new VitsikaRuntimeModule(), new VitsikaIdeModule()));
	}
	
}