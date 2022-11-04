/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restricted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Restricted#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getRestricted()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Restricted extends AvoidanceVisit {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(double)
	 * @see patterns.PatternsPackage#getRestricted_Number()
	 * @model required="true"
	 * @generated
	 */
	double getNumber();

	/**
	 * Sets the value of the '{@link patterns.Restricted#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(double value);

} // Restricted
