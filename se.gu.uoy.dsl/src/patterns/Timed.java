/**
 */
package patterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Timed#getT <em>T</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getTimed()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Timed extends EObject {
	/**
	 * Returns the value of the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' attribute.
	 * @see #setT(int)
	 * @see patterns.PatternsPackage#getTimed_T()
	 * @model required="true"
	 * @generated
	 */
	int getT();

	/**
	 * Sets the value of the '{@link patterns.Timed#getT <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' attribute.
	 * @see #getT()
	 * @generated
	 */
	void setT(int value);

} // Timed
