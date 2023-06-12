/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delayed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Delayed#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Delayed#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Delayed#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Delayed#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelayed()
 * @model
 * @generated
 */
public interface Delayed extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' reference.
   * @see #setCondition(Condition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelayed_Condition()
   * @model
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Delayed#getCondition <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelayed_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Delayed#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(SpecificationPatterns)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelayed_Pattern()
   * @model containment="true"
   * @generated
   */
  SpecificationPatterns getPattern();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Delayed#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(SpecificationPatterns value);

  /**
   * Returns the value of the '<em><b>Locations</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelayed_Locations()
   * @model
   * @generated
   */
  EList<Location> getLocations();

} // Delayed
