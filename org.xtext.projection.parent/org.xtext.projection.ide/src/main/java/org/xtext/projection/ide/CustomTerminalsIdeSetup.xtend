/*
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.projection.CustomTerminalsRuntimeModule
import org.xtext.projection.CustomTerminalsStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CustomTerminalsIdeSetup extends CustomTerminalsStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CustomTerminalsRuntimeModule, new CustomTerminalsIdeModule))
	}
	
}