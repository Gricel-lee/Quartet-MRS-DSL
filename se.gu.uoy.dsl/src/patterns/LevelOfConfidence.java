/**
 */
package patterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Of Confidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.LevelOfConfidence#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getLevelOfConfidence()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LevelOfConfidence extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(int)
	 * @see patterns.PatternsPackage#getLevelOfConfidence_Confidence()
	 * @model required="true"
	 * @generated
	 */
	int getConfidence();

	/**
	 * Sets the value of the '{@link patterns.LevelOfConfidence#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(int value);

} // LevelOfConfidence
