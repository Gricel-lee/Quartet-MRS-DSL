/**
 *
 * $Id$
 */
package patterns.validation;

import patterns.Robots;

/**
 * A sample validator interface for {@link patterns.Trail}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrailValidator {
	boolean validate();

	boolean validateObjetToFollow(String value);
	boolean validateValue(int value);
	boolean validateRobots(Robots value);
}
