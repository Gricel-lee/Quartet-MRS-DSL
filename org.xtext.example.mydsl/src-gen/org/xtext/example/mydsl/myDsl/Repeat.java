/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Repeat#getMissions <em>Missions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Repeat#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends CompositePatterns
{
  /**
   * Returns the value of the '<em><b>Missions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missions</em>' containment reference.
   * @see #setMissions(Missions)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRepeat_Missions()
   * @model containment="true"
   * @generated
   */
  Missions getMissions();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Repeat#getMissions <em>Missions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Missions</em>' containment reference.
   * @see #getMissions()
   * @generated
   */
  void setMissions(Missions value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRepeat_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Repeat#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Repeat
