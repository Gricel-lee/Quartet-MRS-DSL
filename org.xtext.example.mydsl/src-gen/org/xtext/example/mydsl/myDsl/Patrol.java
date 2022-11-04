/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patrol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Patrol#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Patrol#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPatrol()
 * @model
 * @generated
 */
public interface Patrol extends SpecificationPatterns
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPatrol_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Patrol#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Locations</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPatrol_Locations()
   * @model
   * @generated
   */
  EList<Location> getLocations();

} // Patrol
