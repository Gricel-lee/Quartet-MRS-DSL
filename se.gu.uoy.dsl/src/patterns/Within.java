/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Within</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Within#getValue1 <em>Value1</em>}</li>
 *   <li>{@link patterns.Within#getValue2 <em>Value2</em>}</li>
 *   <li>{@link patterns.Within#getReward <em>Reward</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getWithin()
 * @model
 * @generated
 */
public interface Within extends ElementaryPatterns {
	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(double)
	 * @see patterns.PatternsPackage#getWithin_Value1()
	 * @model required="true"
	 * @generated
	 */
	double getValue1();

	/**
	 * Sets the value of the '{@link patterns.Within#getValue1 <em>Value1</em>}' attribute.
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
	 * @see patterns.PatternsPackage#getWithin_Value2()
	 * @model required="true"
	 * @generated
	 */
	double getValue2();

	/**
	 * Sets the value of the '{@link patterns.Within#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(double value);

	/**
	 * Returns the value of the '<em><b>Reward</b></em>' attribute.
	 * The default value is <code>"reward"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward</em>' attribute.
	 * @see #setReward(String)
	 * @see patterns.PatternsPackage#getWithin_Reward()
	 * @model default="reward"
	 * @generated
	 */
	String getReward();

	/**
	 * Sets the value of the '{@link patterns.Within#getReward <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward</em>' attribute.
	 * @see #getReward()
	 * @generated
	 */
	void setReward(String value);

} // Within
