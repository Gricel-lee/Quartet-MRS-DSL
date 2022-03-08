/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equidistance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Equidistance#getLocation1 <em>Location1</em>}</li>
 *   <li>{@link patterns.Equidistance#getLocation2 <em>Location2</em>}</li>
 *   <li>{@link patterns.Equidistance#getDistance <em>Distance</em>}</li>
 *   <li>{@link patterns.Equidistance#getRobots1 <em>Robots1</em>}</li>
 *   <li>{@link patterns.Equidistance#getRobots2 <em>Robots2</em>}</li>
 *   <li>{@link patterns.Equidistance#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getEquidistance()
 * @model
 * @generated
 */
public interface Equidistance extends CompositePatterns, MissionDependent {
	/**
	 * Returns the value of the '<em><b>Location1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location1</em>' reference.
	 * @see #setLocation1(Location)
	 * @see patterns.PatternsPackage#getEquidistance_Location1()
	 * @model
	 * @generated
	 */
	Location getLocation1();

	/**
	 * Sets the value of the '{@link patterns.Equidistance#getLocation1 <em>Location1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location1</em>' reference.
	 * @see #getLocation1()
	 * @generated
	 */
	void setLocation1(Location value);

	/**
	 * Returns the value of the '<em><b>Location2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location2</em>' reference.
	 * @see #setLocation2(Location)
	 * @see patterns.PatternsPackage#getEquidistance_Location2()
	 * @model
	 * @generated
	 */
	Location getLocation2();

	/**
	 * Sets the value of the '{@link patterns.Equidistance#getLocation2 <em>Location2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location2</em>' reference.
	 * @see #getLocation2()
	 * @generated
	 */
	void setLocation2(Location value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see patterns.PatternsPackage#getEquidistance_Distance()
	 * @model required="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link patterns.Equidistance#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Robots1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots1</em>' reference.
	 * @see #setRobots1(Robots)
	 * @see patterns.PatternsPackage#getEquidistance_Robots1()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots1();

	/**
	 * Sets the value of the '{@link patterns.Equidistance#getRobots1 <em>Robots1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots1</em>' reference.
	 * @see #getRobots1()
	 * @generated
	 */
	void setRobots1(Robots value);

	/**
	 * Returns the value of the '<em><b>Robots2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots2</em>' reference.
	 * @see #setRobots2(Robots)
	 * @see patterns.PatternsPackage#getEquidistance_Robots2()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots2();

	/**
	 * Sets the value of the '{@link patterns.Equidistance#getRobots2 <em>Robots2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots2</em>' reference.
	 * @see #getRobots2()
	 * @generated
	 */
	void setRobots2(Robots value);

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference.
	 * @see #setRobots(Robots)
	 * @see patterns.PatternsPackage#getEquidistance_Robots()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots();

	/**
	 * Sets the value of the '{@link patterns.Equidistance#getRobots <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots</em>' reference.
	 * @see #getRobots()
	 * @generated
	 */
	void setRobots(Robots value);

} // Equidistance
