/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getReward <em>Reward</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementaryPatterns()
 * @model
 * @generated
 */
public interface ElementaryPatterns extends Missions
{
  /**
   * Returns the value of the '<em><b>Reward</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reward</em>' attribute.
   * @see #setReward(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementaryPatterns_Reward()
   * @model
   * @generated
   */
  String getReward();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getReward <em>Reward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reward</em>' attribute.
   * @see #getReward()
   * @generated
   */
  void setReward(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementaryPatterns_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' attribute.
   * @see #setMeasure(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementaryPatterns_Measure()
   * @model
   * @generated
   */
  String getMeasure();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getMeasure <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' attribute.
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(String value);

  /**
   * Returns the value of the '<em><b>Mission</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mission</em>' containment reference.
   * @see #setMission(Missions)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementaryPatterns_Mission()
   * @model containment="true"
   * @generated
   */
  Missions getMission();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ElementaryPatterns#getMission <em>Mission</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mission</em>' containment reference.
   * @see #getMission()
   * @generated
   */
  void setMission(Missions value);

} // ElementaryPatterns
