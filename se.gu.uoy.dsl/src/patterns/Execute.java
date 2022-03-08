/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Execute#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getExecute()
 * @model
 * @generated
 */
public interface Execute extends CompositePatterns, SetOfActionsDependent {
	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference.
	 * @see #setRobots(Robots)
	 * @see patterns.PatternsPackage#getExecute_Robots()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots();

	/**
	 * Sets the value of the '{@link patterns.Execute#getRobots <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots</em>' reference.
	 * @see #getRobots()
	 * @generated
	 */
	void setRobots(Robots value);

} // Execute
