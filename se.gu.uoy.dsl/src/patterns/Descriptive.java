/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Descriptive#getPattern <em>Pattern</em>}</li>
 *   <li>{@link patterns.Descriptive#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getDescriptive()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Descriptive extends Trigger {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(SpecificationPatterns)
	 * @see patterns.PatternsPackage#getDescriptive_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	SpecificationPatterns getPattern();

	/**
	 * Sets the value of the '{@link patterns.Descriptive#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(SpecificationPatterns value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see patterns.PatternsPackage#getDescriptive_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link patterns.Descriptive#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Descriptive
