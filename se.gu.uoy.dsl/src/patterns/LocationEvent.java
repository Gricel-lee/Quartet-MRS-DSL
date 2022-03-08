/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.LocationEvent#getRobots <em>Robots</em>}</li>
 *   <li>{@link patterns.LocationEvent#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getLocationEvent()
 * @model
 * @generated
 */
public interface LocationEvent extends Condition {
	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference.
	 * @see #setRobots(Robots)
	 * @see patterns.PatternsPackage#getLocationEvent_Robots()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots();

	/**
	 * Sets the value of the '{@link patterns.LocationEvent#getRobots <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots</em>' reference.
	 * @see #getRobots()
	 * @generated
	 */
	void setRobots(Robots value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see patterns.PatternsPackage#getLocationEvent_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link patterns.LocationEvent#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // LocationEvent
