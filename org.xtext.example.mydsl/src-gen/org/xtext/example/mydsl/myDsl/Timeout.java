/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Timeout#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Timeout#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTimeout()
 * @model
 * @generated
 */
public interface Timeout extends CompositePatterns
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTimeout_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Timeout#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Missions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missions</em>' containment reference.
   * @see #setMissions(Missions)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTimeout_Missions()
   * @model containment="true"
   * @generated
   */
  Missions getMissions();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Timeout#getMissions <em>Missions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Missions</em>' containment reference.
   * @see #getMissions()
   * @generated
   */
  void setMissions(Missions value);

} // Timeout
