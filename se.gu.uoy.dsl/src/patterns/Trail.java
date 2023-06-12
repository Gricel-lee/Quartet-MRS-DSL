/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Trail#getObjetToFollow <em>Objet To Follow</em>}</li>
 *   <li>{@link patterns.Trail#getRobots <em>Robots</em>}</li>
 *   <li>{@link patterns.Trail#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getTrail()
 * @model
 * @generated
 */
public interface Trail extends CompositePatterns, MissionDependent {
	/**
	 * Returns the value of the '<em><b>Objet To Follow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet To Follow</em>' attribute.
	 * @see #setObjetToFollow(String)
	 * @see patterns.PatternsPackage#getTrail_ObjetToFollow()
	 * @model required="true"
	 * @generated
	 */
	String getObjetToFollow();

	/**
	 * Sets the value of the '{@link patterns.Trail#getObjetToFollow <em>Objet To Follow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet To Follow</em>' attribute.
	 * @see #getObjetToFollow()
	 * @generated
	 */
	void setObjetToFollow(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see patterns.PatternsPackage#getTrail_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link patterns.Trail#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference.
	 * @see #setRobots(Robots)
	 * @see patterns.PatternsPackage#getTrail_Robots()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots();

	/**
	 * Sets the value of the '{@link patterns.Trail#getRobots <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots</em>' reference.
	 * @see #getRobots()
	 * @generated
	 */
	void setRobots(Robots value);

} // Trail
