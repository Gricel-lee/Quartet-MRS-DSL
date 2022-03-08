/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ElementaryPatterns#getMeasure <em>Measure</em>}</li>
 *   <li>{@link patterns.ElementaryPatterns#getMission <em>Mission</em>}</li>
 *   <li>{@link patterns.ElementaryPatterns#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getElementaryPatterns()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementaryPatterns extends Missions {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see #setMeasure(String)
	 * @see patterns.PatternsPackage#getElementaryPatterns_Measure()
	 * @model required="true"
	 * @generated
	 */
	String getMeasure();

	/**
	 * Sets the value of the '{@link patterns.ElementaryPatterns#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' containment reference.
	 * @see #setMission(Missions)
	 * @see patterns.PatternsPackage#getElementaryPatterns_Mission()
	 * @model containment="true"
	 * @generated
	 */
	Missions getMission();

	/**
	 * Sets the value of the '{@link patterns.ElementaryPatterns#getMission <em>Mission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission</em>' containment reference.
	 * @see #getMission()
	 * @generated
	 */
	void setMission(Missions value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see patterns.PatternsPackage#getElementaryPatterns_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link patterns.ElementaryPatterns#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ElementaryPatterns
