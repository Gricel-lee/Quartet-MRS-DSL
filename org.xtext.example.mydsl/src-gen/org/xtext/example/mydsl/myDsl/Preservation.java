/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Preservation#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Preservation#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Preservation#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Preservation#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPreservation()
 * @model
 * @generated
 */
public interface Preservation extends CompositePatterns
{
  /**
   * Returns the value of the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' attribute.
   * @see #setMeasure(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPreservation_Measure()
   * @model
   * @generated
   */
  String getMeasure();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Preservation#getMeasure <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' attribute.
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(String value);

  /**
   * Returns the value of the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value1</em>' attribute.
   * @see #setValue1(double)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPreservation_Value1()
   * @model
   * @generated
   */
  double getValue1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Preservation#getValue1 <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value1</em>' attribute.
   * @see #getValue1()
   * @generated
   */
  void setValue1(double value);

  /**
   * Returns the value of the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value2</em>' attribute.
   * @see #setValue2(double)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPreservation_Value2()
   * @model
   * @generated
   */
  double getValue2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Preservation#getValue2 <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value2</em>' attribute.
   * @see #getValue2()
   * @generated
   */
  void setValue2(double value);

  /**
   * Returns the value of the '<em><b>Missions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missions</em>' containment reference.
   * @see #setMissions(Missions)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPreservation_Missions()
   * @model containment="true"
   * @generated
   */
  Missions getMissions();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Preservation#getMissions <em>Missions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Missions</em>' containment reference.
   * @see #getMissions()
   * @generated
   */
  void setMissions(Missions value);

} // Preservation
