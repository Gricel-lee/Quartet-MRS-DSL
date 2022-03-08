/**
 */
package patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Dependent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ConditionDependent#getCondition <em>Condition</em>}</li>
 *   <li>{@link patterns.ConditionDependent#getLocationevent <em>Locationevent</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getConditionDependent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConditionDependent extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see patterns.PatternsPackage#getConditionDependent_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link patterns.ConditionDependent#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Locationevent</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.LocationEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationevent</em>' containment reference list.
	 * @see patterns.PatternsPackage#getConditionDependent_Locationevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationEvent> getLocationevent();

} // ConditionDependent
