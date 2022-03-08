/**
 */
package patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maximize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.Maximize#getReward <em>Reward</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getMaximize()
 * @model
 * @generated
 */
public interface Maximize extends ElementaryPatterns {
	/**
	 * Returns the value of the '<em><b>Reward</b></em>' attribute.
	 * The default value is <code>"reward"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward</em>' attribute.
	 * @see #setReward(String)
	 * @see patterns.PatternsPackage#getMaximize_Reward()
	 * @model default="reward"
	 * @generated
	 */
	String getReward();

	/**
	 * Sets the value of the '{@link patterns.Maximize#getReward <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward</em>' attribute.
	 * @see #getReward()
	 * @generated
	 */
	void setReward(String value);

} // Maximize
