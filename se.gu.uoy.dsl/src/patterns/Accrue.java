/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accrue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Accrue#getMeasure <em>Measure</em>}</li>
 *   <li>{@link patterns.Accrue#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getAccrue()
 * @model
 * @generated
 */
public interface Accrue extends CompositePatterns, MissionDependent {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see #setMeasure(String)
	 * @see patterns.PatternsPackage#getAccrue_Measure()
	 * @model required="true"
	 * @generated
	 */
	String getMeasure();

	/**
	 * Sets the value of the '{@link patterns.Accrue#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference.
	 * @see #setRobots(Robots)
	 * @see patterns.PatternsPackage#getAccrue_Robots()
	 * @model required="true"
	 * @generated
	 */
	Robots getRobots();

	/**
	 * Sets the value of the '{@link patterns.Accrue#getRobots <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robots</em>' reference.
	 * @see #getRobots()
	 * @generated
	 */
	void setRobots(Robots value);

} // Accrue
