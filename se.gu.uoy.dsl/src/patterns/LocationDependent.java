/**
 */
package patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Dependent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.LocationDependent#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getLocationDependent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LocationDependent extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link patterns.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see patterns.PatternsPackage#getLocationDependent_Locations()
	 * @model required="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // LocationDependent
