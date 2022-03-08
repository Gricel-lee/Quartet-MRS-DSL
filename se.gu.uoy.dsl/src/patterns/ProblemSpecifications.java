/**
 */
package patterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patterns.ProblemSpecifications#getCondition <em>Condition</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getLocation <em>Location</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getAction <em>Action</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getRobots <em>Robots</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getTopmissions <em>Topmissions</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getElementaryPatterns <em>Elementary Patterns</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getCompositePatterns <em>Composite Patterns</em>}</li>
 *   <li>{@link patterns.ProblemSpecifications#getSpecificationPatterns <em>Specification Patterns</em>}</li>
 * </ul>
 *
 * @see patterns.PatternsPackage#getProblemSpecifications()
 * @model
 * @generated
 */
public interface ProblemSpecifications extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getCondition();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.Robots}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_Robots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robots> getRobots();

	/**
	 * Returns the value of the '<em><b>Topmissions</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.TopMissions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topmissions</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_Topmissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopMissions> getTopmissions();

	/**
	 * Returns the value of the '<em><b>Elementary Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.ElementaryPatterns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementary Patterns</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_ElementaryPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementaryPatterns> getElementaryPatterns();

	/**
	 * Returns the value of the '<em><b>Composite Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.CompositePatterns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Patterns</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_CompositePatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositePatterns> getCompositePatterns();

	/**
	 * Returns the value of the '<em><b>Specification Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link patterns.SpecificationPatterns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Patterns</em>' containment reference list.
	 * @see patterns.PatternsPackage#getProblemSpecifications_SpecificationPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecificationPatterns> getSpecificationPatterns();

} // ProblemSpecifications
