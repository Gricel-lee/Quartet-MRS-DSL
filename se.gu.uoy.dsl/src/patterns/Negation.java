/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Negation#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends MissionOperation {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Missions)
	 * @see patterns.PatternsPackage#getNegation_Not()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Missions getNot();

	/**
	 * Sets the value of the '{@link patterns.Negation#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Missions value);

} // Negation
