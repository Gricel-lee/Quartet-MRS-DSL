/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strictly Within</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.StrictlyWithin#getValue1 <em>Value1</em>}</li>
 *   <li>{@link patterns.StrictlyWithin#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getStrictlyWithin()
 * @model
 * @generated
 */
public interface StrictlyWithin extends ElementaryPatterns {
	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(double)
	 * @see patterns.PatternsPackage#getStrictlyWithin_Value1()
	 * @model required="true"
	 * @generated
	 */
	double getValue1();

	/**
	 * Sets the value of the '{@link patterns.StrictlyWithin#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(double value);

	/**
	 * Returns the value of the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' attribute.
	 * @see #setValue2(double)
	 * @see patterns.PatternsPackage#getStrictlyWithin_Value2()
	 * @model required="true"
	 * @generated
	 */
	double getValue2();

	/**
	 * Sets the value of the '{@link patterns.StrictlyWithin#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(double value);

} // StrictlyWithin
