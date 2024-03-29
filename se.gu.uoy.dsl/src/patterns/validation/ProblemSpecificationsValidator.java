/**
 *
 * $Id$
 */
package patterns.validation;

import org.eclipse.emf.common.util.EList;

import patterns.Action;
import patterns.CompositePatterns;
import patterns.Condition;
import patterns.ElementaryPatterns;
import patterns.Location;
import patterns.Robots;
import patterns.SpecificationPatterns;
import patterns.TopMissions;

/**
 * A sample validator interface for {@link patterns.ProblemSpecifications}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProblemSpecificationsValidator {
	boolean validate();

	boolean validateCondition(EList<Condition> value);
	boolean validateLocation(EList<Location> value);
	boolean validateAction(EList<Action> value);
	boolean validateRobots(EList<Robots> value);
	boolean validateTopmissions(EList<TopMissions> value);
	boolean validateElementaryPatterns(EList<ElementaryPatterns> value);
	boolean validateCompositePatterns(EList<CompositePatterns> value);
	boolean validateSpecificationPatterns(EList<SpecificationPatterns> value);
}
