/*
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractProjectionValidator extends CustomTerminalsValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.xtext.projection.projection.ProjectionPackage.eINSTANCE);
		return result;
	}
}
