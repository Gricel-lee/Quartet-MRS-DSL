/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Composition#getBinaryType <em>Binary Type</em>}</li>
 *   <li>{@link patterns.Composition#getMiss1 <em>Miss1</em>}</li>
 *   <li>{@link patterns.Composition#getMiss2 <em>Miss2</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends MissionOperation {
	/**
	 * Returns the value of the '<em><b>Binary Type</b></em>' attribute.
	 * The literals are from the enumeration {@link patterns.CompositionOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Type</em>' attribute.
	 * @see patterns.CompositionOperator
	 * @see #setBinaryType(CompositionOperator)
	 * @see patterns.PatternsPackage#getComposition_BinaryType()
	 * @model
	 * @generated
	 */
	CompositionOperator getBinaryType();

	/**
	 * Sets the value of the '{@link patterns.Composition#getBinaryType <em>Binary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Type</em>' attribute.
	 * @see patterns.CompositionOperator
	 * @see #getBinaryType()
	 * @generated
	 */
	void setBinaryType(CompositionOperator value);

	/**
	 * Returns the value of the '<em><b>Miss1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss1</em>' reference.
	 * @see #setMiss1(Missions)
	 * @see patterns.PatternsPackage#getComposition_Miss1()
	 * @model required="true"
	 * @generated
	 */
	Missions getMiss1();

	/**
	 * Sets the value of the '{@link patterns.Composition#getMiss1 <em>Miss1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miss1</em>' reference.
	 * @see #getMiss1()
	 * @generated
	 */
	void setMiss1(Missions value);

	/**
	 * Returns the value of the '<em><b>Miss2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss2</em>' reference.
	 * @see #setMiss2(Missions)
	 * @see patterns.PatternsPackage#getComposition_Miss2()
	 * @model required="true"
	 * @generated
	 */
	Missions getMiss2();

	/**
	 * Sets the value of the '{@link patterns.Composition#getMiss2 <em>Miss2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miss2</em>' reference.
	 * @see #getMiss2()
	 * @generated
	 */
	void setMiss2(Missions value);

} // Composition
