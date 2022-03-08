/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.Missions;
import patterns.PatternsPackage;
import patterns.Within;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Within</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.WithinImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link patterns.impl.WithinImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link patterns.impl.WithinImpl#getType <em>Type</em>}</li>
 *   <li>{@link patterns.impl.WithinImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link patterns.impl.WithinImpl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link patterns.impl.WithinImpl#getReward <em>Reward</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithinImpl extends MinimalEObjectImpl.Container implements Within {
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
	 * The cached value of the '{@link #getMission() <em>Mission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected Missions mission;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected int value1 = VALUE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected int value2 = VALUE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReward() <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward()
	 * @generated
	 * @ordered
	 */
	protected static final String REWARD_EDEFAULT = "reward";

	/**
	 * The cached value of the '{@link #getReward() <em>Reward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward()
	 * @generated
	 * @ordered
	 */
	protected String reward = REWARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.WITHIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasure(String newMeasure) {
		String oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__MEASURE, oldMeasure, measure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Missions getMission() {
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMission(Missions newMission, NotificationChain msgs) {
		Missions oldMission = mission;
		mission = newMission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__MISSION, oldMission, newMission);
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
	public void setMission(Missions newMission) {
		if (newMission != mission) {
			NotificationChain msgs = null;
			if (mission != null)
				msgs = ((InternalEObject)mission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.WITHIN__MISSION, null, msgs);
			if (newMission != null)
				msgs = ((InternalEObject)newMission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.WITHIN__MISSION, null, msgs);
			msgs = basicSetMission(newMission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__MISSION, newMission, newMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue1(int newValue1) {
		int oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__VALUE1, oldValue1, value1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue2() {
		return value2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue2(int newValue2) {
		int oldValue2 = value2;
		value2 = newValue2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__VALUE2, oldValue2, value2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReward() {
		return reward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReward(String newReward) {
		String oldReward = reward;
		reward = newReward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.WITHIN__REWARD, oldReward, reward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.WITHIN__MISSION:
				return basicSetMission(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.WITHIN__MEASURE:
				return getMeasure();
			case PatternsPackage.WITHIN__MISSION:
				return getMission();
			case PatternsPackage.WITHIN__TYPE:
				return getType();
			case PatternsPackage.WITHIN__VALUE1:
				return getValue1();
			case PatternsPackage.WITHIN__VALUE2:
				return getValue2();
			case PatternsPackage.WITHIN__REWARD:
				return getReward();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.WITHIN__MEASURE:
				setMeasure((String)newValue);
				return;
			case PatternsPackage.WITHIN__MISSION:
				setMission((Missions)newValue);
				return;
			case PatternsPackage.WITHIN__TYPE:
				setType((String)newValue);
				return;
			case PatternsPackage.WITHIN__VALUE1:
				setValue1((Integer)newValue);
				return;
			case PatternsPackage.WITHIN__VALUE2:
				setValue2((Integer)newValue);
				return;
			case PatternsPackage.WITHIN__REWARD:
				setReward((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.WITHIN__MEASURE:
				setMeasure(MEASURE_EDEFAULT);
				return;
			case PatternsPackage.WITHIN__MISSION:
				setMission((Missions)null);
				return;
			case PatternsPackage.WITHIN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PatternsPackage.WITHIN__VALUE1:
				setValue1(VALUE1_EDEFAULT);
				return;
			case PatternsPackage.WITHIN__VALUE2:
				setValue2(VALUE2_EDEFAULT);
				return;
			case PatternsPackage.WITHIN__REWARD:
				setReward(REWARD_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.WITHIN__MEASURE:
				return MEASURE_EDEFAULT == null ? measure != null : !MEASURE_EDEFAULT.equals(measure);
			case PatternsPackage.WITHIN__MISSION:
				return mission != null;
			case PatternsPackage.WITHIN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PatternsPackage.WITHIN__VALUE1:
				return value1 != VALUE1_EDEFAULT;
			case PatternsPackage.WITHIN__VALUE2:
				return value2 != VALUE2_EDEFAULT;
			case PatternsPackage.WITHIN__REWARD:
				return REWARD_EDEFAULT == null ? reward != null : !REWARD_EDEFAULT.equals(reward);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (measure: ");
		result.append(measure);
		result.append(", type: ");
		result.append(type);
		result.append(", value1: ");
		result.append(value1);
		result.append(", value2: ");
		result.append(value2);
		result.append(", reward: ");
		result.append(reward);
		result.append(')');
		return result.toString();
	}

} //WithinImpl
