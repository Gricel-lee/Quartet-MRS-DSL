/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Conservation#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getConservation()
 * @model
 * @generated
 */
public interface Conservation extends CompositePatterns, MissionDependent {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see #setMeasure(String)
	 * @see patterns.PatternsPackage#getConservation_Measure()
	 * @model required="true"
	 * @generated
	 */
	String getMeasure();

	/**
	 * Sets the value of the '{@link patterns.Conservation#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(String value);

} // Conservation
