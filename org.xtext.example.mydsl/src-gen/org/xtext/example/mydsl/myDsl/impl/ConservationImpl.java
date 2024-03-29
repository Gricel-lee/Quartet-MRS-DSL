/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Conservation;
import org.xtext.example.mydsl.myDsl.Missions;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConservationImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConservationImpl#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConservationImpl extends CompositePatternsImpl implements Conservation
{
  /**
   * The default value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
  protected static final String MEASURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
  protected String measure = MEASURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissions()
   * @generated
   * @ordered
   */
  protected Missions missions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConservationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.CONSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMeasure()
  {
    return measure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMeasure(String newMeasure)
  {
    String oldMeasure = measure;
    measure = newMeasure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSERVATION__MEASURE, oldMeasure, measure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Missions getMissions()
  {
    return missions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMissions(Missions newMissions, NotificationChain msgs)
  {
    Missions oldMissions = missions;
    missions = newMissions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSERVATION__MISSIONS, oldMissions, newMissions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMissions(Missions newMissions)
  {
    if (newMissions != missions)
    {
      NotificationChain msgs = null;
      if (missions != null)
        msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSERVATION__MISSIONS, null, msgs);
      if (newMissions != null)
        msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSERVATION__MISSIONS, null, msgs);
      msgs = basicSetMissions(newMissions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSERVATION__MISSIONS, newMissions, newMissions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.CONSERVATION__MISSIONS:
        return basicSetMissions(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.CONSERVATION__MEASURE:
        return getMeasure();
      case MyDslPackage.CONSERVATION__MISSIONS:
        return getMissions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CONSERVATION__MEASURE:
        setMeasure((String)newValue);
        return;
      case MyDslPackage.CONSERVATION__MISSIONS:
        setMissions((Missions)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CONSERVATION__MEASURE:
        setMeasure(MEASURE_EDEFAULT);
        return;
      case MyDslPackage.CONSERVATION__MISSIONS:
        setMissions((Missions)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CONSERVATION__MEASURE:
        return MEASURE_EDEFAULT == null ? measure != null : !MEASURE_EDEFAULT.equals(measure);
      case MyDslPackage.CONSERVATION__MISSIONS:
        return missions != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (measure: ");
    result.append(measure);
    result.append(')');
    return result.toString();
  }

} //ConservationImpl
