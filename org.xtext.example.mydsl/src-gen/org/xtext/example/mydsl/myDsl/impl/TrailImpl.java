/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Robots;
import org.xtext.example.mydsl.myDsl.Trail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TrailImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TrailImpl#getObjetToFollow <em>Objet To Follow</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TrailImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrailImpl extends CompositePatternsImpl implements Trail
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
   * The default value of the '{@link #getObjetToFollow() <em>Objet To Follow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjetToFollow()
   * @generated
   * @ordered
   */
  protected static final String OBJET_TO_FOLLOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjetToFollow() <em>Objet To Follow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjetToFollow()
   * @generated
   * @ordered
   */
  protected String objetToFollow = OBJET_TO_FOLLOW_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrailImpl()
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
    return MyDslPackage.Literals.TRAIL;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.TRAIL__ROBOTS, oldRobots, robots));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRAIL__ROBOTS, oldRobots, robots));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObjetToFollow()
  {
    return objetToFollow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjetToFollow(String newObjetToFollow)
  {
    String oldObjetToFollow = objetToFollow;
    objetToFollow = newObjetToFollow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRAIL__OBJET_TO_FOLLOW, oldObjetToFollow, objetToFollow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRAIL__VALUE, oldValue, value));
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
      case MyDslPackage.TRAIL__ROBOTS:
        if (resolve) return getRobots();
        return basicGetRobots();
      case MyDslPackage.TRAIL__OBJET_TO_FOLLOW:
        return getObjetToFollow();
      case MyDslPackage.TRAIL__VALUE:
        return getValue();
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
      case MyDslPackage.TRAIL__ROBOTS:
        setRobots((Robots)newValue);
        return;
      case MyDslPackage.TRAIL__OBJET_TO_FOLLOW:
        setObjetToFollow((String)newValue);
        return;
      case MyDslPackage.TRAIL__VALUE:
        setValue((Integer)newValue);
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
      case MyDslPackage.TRAIL__ROBOTS:
        setRobots((Robots)null);
        return;
      case MyDslPackage.TRAIL__OBJET_TO_FOLLOW:
        setObjetToFollow(OBJET_TO_FOLLOW_EDEFAULT);
        return;
      case MyDslPackage.TRAIL__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case MyDslPackage.TRAIL__ROBOTS:
        return robots != null;
      case MyDslPackage.TRAIL__OBJET_TO_FOLLOW:
        return OBJET_TO_FOLLOW_EDEFAULT == null ? objetToFollow != null : !OBJET_TO_FOLLOW_EDEFAULT.equals(objetToFollow);
      case MyDslPackage.TRAIL__VALUE:
        return value != VALUE_EDEFAULT;
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
    result.append(" (objetToFollow: ");
    result.append(objetToFollow);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //TrailImpl
