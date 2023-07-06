/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Execute#getRobots <em>Robots</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Execute#getSetOfActions <em>Set Of Actions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecute()
 * @model
 * @generated
 */
public interface Execute extends Missions, CompositePatterns
{
  /**
   * Returns the value of the '<em><b>Robots</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robots</em>' reference.
   * @see #setRobots(Robots)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecute_Robots()
   * @model
   * @generated
   */
  Robots getRobots();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Execute#getRobots <em>Robots</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Robots</em>' reference.
   * @see #getRobots()
   * @generated
   */
  void setRobots(Robots value);

  /**
   * Returns the value of the '<em><b>Set Of Actions</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Of Actions</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecute_SetOfActions()
   * @model
   * @generated
   */
  EList<Action> getSetOfActions();

} // Execute
