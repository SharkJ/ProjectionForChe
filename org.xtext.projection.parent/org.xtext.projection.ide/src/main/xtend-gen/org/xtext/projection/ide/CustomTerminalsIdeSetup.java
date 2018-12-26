/**
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.projection.CustomTerminalsRuntimeModule;
import org.xtext.projection.CustomTerminalsStandaloneSetup;
import org.xtext.projection.ide.CustomTerminalsIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CustomTerminalsIdeSetup extends CustomTerminalsStandaloneSetup {
  @Override
  public Injector createInjector() {
    CustomTerminalsRuntimeModule _customTerminalsRuntimeModule = new CustomTerminalsRuntimeModule();
    CustomTerminalsIdeModule _customTerminalsIdeModule = new CustomTerminalsIdeModule();
    return Guice.createInjector(Modules2.mixin(_customTerminalsRuntimeModule, _customTerminalsIdeModule));
  }
}
