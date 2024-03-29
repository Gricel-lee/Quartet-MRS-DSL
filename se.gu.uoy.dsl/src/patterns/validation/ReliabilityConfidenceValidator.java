/**
 *
 * $Id$
 */
package patterns.validation;


/**
 * A sample validator interface for {@link patterns.ReliabilityConfidence}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ReliabilityConfidenceValidator {
	boolean validate();

	boolean validateMeasure(String value);
	boolean validateValue(int value);
	boolean validateType1(String value);
	boolean validateType2(String value);
}
