/**
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.projection.ProjectionRuntimeModule;
import org.xtext.projection.ProjectionStandaloneSetup;
import org.xtext.projection.ide.ProjectionIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ProjectionIdeSetup extends ProjectionStandaloneSetup {
  @Override
  public Injector createInjector() {
    ProjectionRuntimeModule _projectionRuntimeModule = new ProjectionRuntimeModule();
    ProjectionIdeModule _projectionIdeModule = new ProjectionIdeModule();
    return Guice.createInjector(Modules2.mixin(_projectionRuntimeModule, _projectionIdeModule));
  }
}
