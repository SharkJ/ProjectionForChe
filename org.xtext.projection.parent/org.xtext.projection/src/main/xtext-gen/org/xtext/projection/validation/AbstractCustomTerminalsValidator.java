/*
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractCustomTerminalsValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.projection.customTerminals.CustomTerminalsPackage.eINSTANCE);
		return result;
	}
}
