/**
 */
package patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Of Actions Dependent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.SetOfActionsDependent#getSetOfActions <em>Set Of Actions</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getSetOfActionsDependent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SetOfActionsDependent extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Of Actions</b></em>' reference list.
	 * The list contents are of type {@link patterns.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Of Actions</em>' reference list.
	 * @see patterns.PatternsPackage#getSetOfActionsDependent_SetOfActions()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getSetOfActions();

} // SetOfActionsDependent
