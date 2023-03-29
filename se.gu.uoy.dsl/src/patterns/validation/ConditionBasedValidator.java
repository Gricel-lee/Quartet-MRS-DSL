/**
 *
 * $Id$
 */
package patterns.validation;

import patterns.Condition;
import patterns.LocationEvent;

/**
 * A sample validator interface for {@link patterns.ConditionBased}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConditionBasedValidator {
	boolean validate();

	boolean validateCondition(Condition value);
	boolean validateLocationevent(LocationEvent value);
}