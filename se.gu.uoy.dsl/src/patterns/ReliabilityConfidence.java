/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability Confidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ReliabilityConfidence#getMeasure <em>Measure</em>}</li>
 *   <li>{@link patterns.ReliabilityConfidence#getType1 <em>Type1</em>}</li>
 *   <li>{@link patterns.ReliabilityConfidence#getType2 <em>Type2</em>}</li>
 *   <li>{@link patterns.ReliabilityConfidence#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getReliabilityConfidence()
 * @model
 * @generated
 */
public interface ReliabilityConfidence extends CompositePatterns, MissionDependent, LevelOfConfidence {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see #setMeasure(String)
	 * @see patterns.PatternsPackage#getReliabilityConfidence_Measure()
	 * @model required="true"
	 * @generated
	 */
	String getMeasure();

	/**
	 * Sets the value of the '{@link patterns.ReliabilityConfidence#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see patterns.PatternsPackage#getReliabilityConfidence_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link patterns.ReliabilityConfidence#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type1</em>' attribute.
	 * @see #setType1(String)
	 * @see patterns.PatternsPackage#getReliabilityConfidence_Type1()
	 * @model required="true"
	 * @generated
	 */
	String getType1();

	/**
	 * Sets the value of the '{@link patterns.ReliabilityConfidence#getType1 <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type1</em>' attribute.
	 * @see #getType1()
	 * @generated
	 */
	void setType1(String value);

	/**
	 * Returns the value of the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type2</em>' attribute.
	 * @see #setType2(String)
	 * @see patterns.PatternsPackage#getReliabilityConfidence_Type2()
	 * @model required="true"
	 * @generated
	 */
	String getType2();

	/**
	 * Sets the value of the '{@link patterns.ReliabilityConfidence#getType2 <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type2</em>' attribute.
	 * @see #getType2()
	 * @generated
	 */
	void setType2(String value);

} // ReliabilityConfidence
