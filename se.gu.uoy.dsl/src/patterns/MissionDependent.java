/**
 */
package patterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Dependent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.MissionDependent#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getMissionDependent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MissionDependent extends EObject {
	/**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference.
	 * @see #setMissions(Missions)
	 * @see patterns.PatternsPackage#getMissionDependent_Missions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Missions getMissions();

	/**
	 * Sets the value of the '{@link patterns.MissionDependent#getMissions <em>Missions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missions</em>' containment reference.
	 * @see #getMissions()
	 * @generated
	 */
	void setMissions(Missions value);

} // MissionDependent
