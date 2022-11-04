/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Most</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.AtMost#getValue <em>Value</em>}</li>
 *   <li>{@link patterns.AtMost#getReward <em>Reward</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getAtMost()
 * @model
 * @generated
 */
public interface AtMost extends ElementaryPatterns {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see patterns.PatternsPackage#getAtMost_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link patterns.AtMost#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Reward</b></em>' attribute.
	 * The default value is <code>"reward"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward</em>' attribute.
	 * @see #setReward(String)
	 * @see patterns.PatternsPackage#getAtMost_Reward()
	 * @model default="reward"
	 * @generated
	 */
	String getReward();

	/**
	 * Sets the value of the '{@link patterns.AtMost#getReward <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward</em>' attribute.
	 * @see #getReward()
	 * @generated
	 */
	void setReward(String value);

} // AtMost
