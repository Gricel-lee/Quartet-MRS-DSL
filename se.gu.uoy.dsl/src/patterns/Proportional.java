/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proportional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Proportional#getMission1 <em>Mission1</em>}</li>
 *   <li>{@link patterns.Proportional#getMission2 <em>Mission2</em>}</li>
 *   <li>{@link patterns.Proportional#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getProportional()
 * @model
 * @generated
 */
public interface Proportional extends CompositePatterns {
	/**
	 * Returns the value of the '<em><b>Mission1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission1</em>' containment reference.
	 * @see #setMission1(Missions)
	 * @see patterns.PatternsPackage#getProportional_Mission1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Missions getMission1();

	/**
	 * Sets the value of the '{@link patterns.Proportional#getMission1 <em>Mission1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission1</em>' containment reference.
	 * @see #getMission1()
	 * @generated
	 */
	void setMission1(Missions value);

	/**
	 * Returns the value of the '<em><b>Mission2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission2</em>' containment reference.
	 * @see #setMission2(Missions)
	 * @see patterns.PatternsPackage#getProportional_Mission2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Missions getMission2();

	/**
	 * Sets the value of the '{@link patterns.Proportional#getMission2 <em>Mission2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission2</em>' containment reference.
	 * @see #getMission2()
	 * @generated
	 */
	void setMission2(Missions value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see patterns.PatternsPackage#getProportional_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link patterns.Proportional#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Proportional
