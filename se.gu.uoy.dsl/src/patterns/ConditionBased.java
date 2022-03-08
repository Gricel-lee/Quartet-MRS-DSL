/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Based</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ConditionBased#getCondition <em>Condition</em>}</li>
 *   <li>{@link patterns.ConditionBased#getLocationevent <em>Locationevent</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getConditionBased()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConditionBased extends Conditional {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see patterns.PatternsPackage#getConditionBased_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link patterns.ConditionBased#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationevent</em>' containment reference.
	 * @see #setLocationevent(LocationEvent)
	 * @see patterns.PatternsPackage#getConditionBased_Locationevent()
	 * @model containment="true"
	 * @generated
	 */
	LocationEvent getLocationevent();

	/**
	 * Sets the value of the '{@link patterns.ConditionBased#getLocationevent <em>Locationevent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locationevent</em>' containment reference.
	 * @see #getLocationevent()
	 * @generated
	 */
	void setLocationevent(LocationEvent value);

} // ConditionBased
