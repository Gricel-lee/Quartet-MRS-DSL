/**
 */
package patterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Missions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.TopMissions#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getTopMissions()
 * @model
 * @generated
 */
public interface TopMissions extends EObject {
	/**
	 * Returns the value of the '<em><b>Mission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' reference.
	 * @see #setMission(Missions)
	 * @see patterns.PatternsPackage#getTopMissions_Mission()
	 * @model required="true"
	 * @generated
	 */
	Missions getMission();

	/**
	 * Sets the value of the '{@link patterns.TopMissions#getMission <em>Mission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission</em>' reference.
	 * @see #getMission()
	 * @generated
	 */
	void setMission(Missions value);

} // TopMissions
