/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Equidistance;
import org.xtext.example.mydsl.myDsl.Missions;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Robots;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equidistance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EquidistanceImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EquidistanceImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EquidistanceImpl#getRobots1 <em>Robots1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EquidistanceImpl#getRobots2 <em>Robots2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquidistanceImpl extends CompositePatternsImpl implements Equidistance
{
  /**
   * The cached value of the '{@link #getRobots() <em>Robots</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobots()
   * @generated
   * @ordered
   */
  protected Robots robots;

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
   * The cached value of the '{@link #getRobots1() <em>Robots1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobots1()
   * @generated
   * @ordered
   */
  protected Robots robots1;

  /**
   * The cached value of the '{@link #getRobots2() <em>Robots2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobots2()
   * @generated
   * @ordered
   */
  protected Robots robots2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquidistanceImpl()
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
    return MyDslPackage.Literals.EQUIDISTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robots getRobots()
  {
    if (robots != null && robots.eIsProxy())
    {
      InternalEObject oldRobots = (InternalEObject)robots;
      robots = (Robots)eResolveProxy(oldRobots);
      if (robots != oldRobots)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.EQUIDISTANCE__ROBOTS, oldRobots, robots));
      }
    }
    return robots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robots basicGetRobots()
  {
    return robots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRobots(Robots newRobots)
  {
    Robots oldRobots = robots;
    robots = newRobots;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUIDISTANCE__ROBOTS, oldRobots, robots));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUIDISTANCE__MISSIONS, oldMissions, newMissions);
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
        msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQUIDISTANCE__MISSIONS, null, msgs);
      if (newMissions != null)
        msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQUIDISTANCE__MISSIONS, null, msgs);
      msgs = basicSetMissions(newMissions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUIDISTANCE__MISSIONS, newMissions, newMissions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robots getRobots1()
  {
    if (robots1 != null && robots1.eIsProxy())
    {
      InternalEObject oldRobots1 = (InternalEObject)robots1;
      robots1 = (Robots)eResolveProxy(oldRobots1);
      if (robots1 != oldRobots1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.EQUIDISTANCE__ROBOTS1, oldRobots1, robots1));
      }
    }
    return robots1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robots basicGetRobots1()
  {
    return robots1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRobots1(Robots newRobots1)
  {
    Robots oldRobots1 = robots1;
    robots1 = newRobots1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUIDISTANCE__ROBOTS1, oldRobots1, robots1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robots getRobots2()
  {
    if (robots2 != null && robots2.eIsProxy())
    {
      InternalEObject oldRobots2 = (InternalEObject)robots2;
      robots2 = (Robots)eResolveProxy(oldRobots2);
      if (robots2 != oldRobots2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.EQUIDISTANCE__ROBOTS2, oldRobots2, robots2));
      }
    }
    return robots2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robots basicGetRobots2()
  {
    return robots2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRobots2(Robots newRobots2)
  {
    Robots oldRobots2 = robots2;
    robots2 = newRobots2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUIDISTANCE__ROBOTS2, oldRobots2, robots2));
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
      case MyDslPackage.EQUIDISTANCE__MISSIONS:
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
      case MyDslPackage.EQUIDISTANCE__ROBOTS:
        if (resolve) return getRobots();
        return basicGetRobots();
      case MyDslPackage.EQUIDISTANCE__MISSIONS:
        return getMissions();
      case MyDslPackage.EQUIDISTANCE__ROBOTS1:
        if (resolve) return getRobots1();
        return basicGetRobots1();
      case MyDslPackage.EQUIDISTANCE__ROBOTS2:
        if (resolve) return getRobots2();
        return basicGetRobots2();
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
      case MyDslPackage.EQUIDISTANCE__ROBOTS:
        setRobots((Robots)newValue);
        return;
      case MyDslPackage.EQUIDISTANCE__MISSIONS:
        setMissions((Missions)newValue);
        return;
      case MyDslPackage.EQUIDISTANCE__ROBOTS1:
        setRobots1((Robots)newValue);
        return;
      case MyDslPackage.EQUIDISTANCE__ROBOTS2:
        setRobots2((Robots)newValue);
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
      case MyDslPackage.EQUIDISTANCE__ROBOTS:
        setRobots((Robots)null);
        return;
      case MyDslPackage.EQUIDISTANCE__MISSIONS:
        setMissions((Missions)null);
        return;
      case MyDslPackage.EQUIDISTANCE__ROBOTS1:
        setRobots1((Robots)null);
        return;
      case MyDslPackage.EQUIDISTANCE__ROBOTS2:
        setRobots2((Robots)null);
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
      case MyDslPackage.EQUIDISTANCE__ROBOTS:
        return robots != null;
      case MyDslPackage.EQUIDISTANCE__MISSIONS:
        return missions != null;
      case MyDslPackage.EQUIDISTANCE__ROBOTS1:
        return robots1 != null;
      case MyDslPackage.EQUIDISTANCE__ROBOTS2:
        return robots2 != null;
    }
    return super.eIsSet(featureID);
  }

} //EquidistanceImpl
