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
import patterns.Proportional;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proportional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ProportionalImpl#getMission1 <em>Mission1</em>}</li>
 *   <li>{@link patterns.impl.ProportionalImpl#getMission2 <em>Mission2</em>}</li>
 *   <li>{@link patterns.impl.ProportionalImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProportionalImpl extends MinimalEObjectImpl.Container implements Proportional {
	/**
	 * The cached value of the '{@link #getMission1() <em>Mission1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission1()
	 * @generated
	 * @ordered
	 */
	protected Missions mission1;

	/**
	 * The cached value of the '{@link #getMission2() <em>Mission2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission2()
	 * @generated
	 * @ordered
	 */
	protected Missions mission2;

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
	protected ProportionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PROPORTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions getMission1() {
		return mission1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMission1(Missions newMission1, NotificationChain msgs) {
		Missions oldMission1 = mission1;
		mission1 = newMission1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.PROPORTIONAL__MISSION1, oldMission1, newMission1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMission1(Missions newMission1) {
		if (newMission1 != mission1) {
			NotificationChain msgs = null;
			if (mission1 != null)
				msgs = ((InternalEObject)mission1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.PROPORTIONAL__MISSION1, null, msgs);
			if (newMission1 != null)
				msgs = ((InternalEObject)newMission1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.PROPORTIONAL__MISSION1, null, msgs);
			msgs = basicSetMission1(newMission1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PROPORTIONAL__MISSION1, newMission1, newMission1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions getMission2() {
		return mission2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMission2(Missions newMission2, NotificationChain msgs) {
		Missions oldMission2 = mission2;
		mission2 = newMission2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.PROPORTIONAL__MISSION2, oldMission2, newMission2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMission2(Missions newMission2) {
		if (newMission2 != mission2) {
			NotificationChain msgs = null;
			if (mission2 != null)
				msgs = ((InternalEObject)mission2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.PROPORTIONAL__MISSION2, null, msgs);
			if (newMission2 != null)
				msgs = ((InternalEObject)newMission2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.PROPORTIONAL__MISSION2, null, msgs);
			msgs = basicSetMission2(newMission2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PROPORTIONAL__MISSION2, newMission2, newMission2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PROPORTIONAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.PROPORTIONAL__MISSION1:
				return basicSetMission1(null, msgs);
			case PatternsPackage.PROPORTIONAL__MISSION2:
				return basicSetMission2(null, msgs);
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
			case PatternsPackage.PROPORTIONAL__MISSION1:
				return getMission1();
			case PatternsPackage.PROPORTIONAL__MISSION2:
				return getMission2();
			case PatternsPackage.PROPORTIONAL__VALUE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.PROPORTIONAL__MISSION1:
				setMission1((Missions)newValue);
				return;
			case PatternsPackage.PROPORTIONAL__MISSION2:
				setMission2((Missions)newValue);
				return;
			case PatternsPackage.PROPORTIONAL__VALUE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.PROPORTIONAL__MISSION1:
				setMission1((Missions)null);
				return;
			case PatternsPackage.PROPORTIONAL__MISSION2:
				setMission2((Missions)null);
				return;
			case PatternsPackage.PROPORTIONAL__VALUE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.PROPORTIONAL__MISSION1:
				return mission1 != null;
			case PatternsPackage.PROPORTIONAL__MISSION2:
				return mission2 != null;
			case PatternsPackage.PROPORTIONAL__VALUE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ProportionalImpl
