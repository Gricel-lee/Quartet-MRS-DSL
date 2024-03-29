/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myDsl.ProblemSpecifications#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ProblemSpecifications#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ProblemSpecifications#getRobots <em>Robots</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ProblemSpecifications#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ProblemSpecifications#getTopmissions <em>Topmissions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProblemSpecifications()
 * @model
 * @generated
 */
public interface ProblemSpecifications extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProblemSpecifications_Location()
   * @model containment="true"
   * @generated
   */
  EList<Location> getLocation();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProblemSpecifications_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

  /**
   * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Robots}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robots</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProblemSpecifications_Robots()
   * @model containment="true"
   * @generated
   */
  EList<Robots> getRobots();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProblemSpecifications_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

  /**
   * Returns the value of the '<em><b>Topmissions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.TopMissions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topmissions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProblemSpecifications_Topmissions()
   * @model containment="true"
   * @generated
   */
  EList<TopMissions> getTopmissions();

} // ProblemSpecifications
