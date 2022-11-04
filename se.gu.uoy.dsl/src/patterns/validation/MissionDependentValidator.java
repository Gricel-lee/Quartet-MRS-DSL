/**
 *
 * $Id$
 */
package patterns.validation;

import patterns.Missions;

/**
 * A sample validator interface for {@link patterns.MissionDependent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MissionDependentValidator {
	boolean validate();

	boolean validateMissions(Missions value);
}
