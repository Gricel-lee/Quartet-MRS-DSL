/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability Confidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getMissions <em>Missions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getType2 <em>Type2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReliabilityConfidence()
 * @model
 * @generated
 */
public interface ReliabilityConfidence extends CompositePatterns
{
  /**
   * Returns the value of the '<em><b>Missions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missions</em>' containment reference.
   * @see #setMissions(Missions)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReliabilityConfidence_Missions()
   * @model containment="true"
   * @generated
   */
  Missions getMissions();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getMissions <em>Missions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Missions</em>' containment reference.
   * @see #getMissions()
   * @generated
   */
  void setMissions(Missions value);

  /**
   * Returns the value of the '<em><b>Type1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type1</em>' attribute.
   * @see #setType1(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReliabilityConfidence_Type1()
   * @model
   * @generated
   */
  String getType1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getType1 <em>Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type1</em>' attribute.
   * @see #getType1()
   * @generated
   */
  void setType1(String value);

  /**
   * Returns the value of the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' attribute.
   * @see #setMeasure(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReliabilityConfidence_Measure()
   * @model
   * @generated
   */
  String getMeasure();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getMeasure <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' attribute.
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(String value);

  /**
   * Returns the value of the '<em><b>Type2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type2</em>' attribute.
   * @see #setType2(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReliabilityConfidence_Type2()
   * @model
   * @generated
   */
  String getType2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getType2 <em>Type2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type2</em>' attribute.
   * @see #getType2()
   * @generated
   */
  void setType2(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReliabilityConfidence_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReliabilityConfidence#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

} // ReliabilityConfidence
