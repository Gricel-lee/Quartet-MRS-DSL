/**
 */
package patterns;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shall Missions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ShallMissions#getId <em>Id</em>}</li>
 *   <li>{@link patterns.ShallMissions#getMovementPatterns <em>Movement Patterns</em>}</li>
 *   <li>{@link patterns.ShallMissions#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getShallMissions()
 * @model
 * @generated
 */
public interface ShallMissions extends Missions {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see patterns.PatternsPackage#getShallMissions_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link patterns.ShallMissions#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Movement Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.SpecificationPatterns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Patterns</em>' containment reference list.
	 * @see patterns.PatternsPackage#getShallMissions_MovementPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecificationPatterns> getMovementPatterns();

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference.
	 * @see #setRobots(Robots)
	 * @see patterns.PatternsPackage#getShallMissions_Robots()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots();

	/**
	 * Sets the value of the '{@link patterns.ShallMissions#getRobots <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots</em>' reference.
	 * @see #getRobots()
	 * @generated
	 */
	void setRobots(Robots value);

} // ShallMissions
