/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Wait#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Wait#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends SpecificationPatterns
{
  /**
   * Returns the value of the '<em><b>Locations</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWait_Locations()
   * @model
   * @generated
   */
  EList<Location> getLocations();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' reference.
   * @see #setCondition(Condition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWait_Condition()
   * @model
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Wait#getCondition <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

} // Wait
