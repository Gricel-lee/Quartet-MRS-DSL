/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Timeout#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getTimeout()
 * @model
 * @generated
 */
public interface Timeout extends CompositePatterns, Timed, MissionDependent {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see patterns.PatternsPackage#getTimeout_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link patterns.Timeout#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Timeout
