/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Missions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ComplexMissions#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getComplexMissions()
 * @model
 * @generated
 */
public interface ComplexMissions extends Missions {
	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(MissionOperation)
	 * @see patterns.PatternsPackage#getComplexMissions_Composition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MissionOperation getComposition();

	/**
	 * Sets the value of the '{@link patterns.ComplexMissions#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(MissionOperation value);

} // ComplexMissions
