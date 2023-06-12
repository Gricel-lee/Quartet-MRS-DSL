/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.MissionDependent;
import patterns.Missions;
import patterns.PatternsPackage;
import patterns.Robots;
import patterns.Trail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.TrailImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link patterns.impl.TrailImpl#getObjetToFollow <em>Objet To Follow</em>}</li>
 *   <li>{@link patterns.impl.TrailImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link patterns.impl.TrailImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrailImpl extends MinimalEObjectImpl.Container implements Trail {
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
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected Robots robots;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.TRAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions getMissions() {
		return missions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissions(Missions newMissions, NotificationChain msgs) {
		Missions oldMissions = missions;
		missions = newMissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.TRAIL__MISSIONS, oldMissions, newMissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissions(Missions newMissions) {
		if (newMissions != missions) {
			NotificationChain msgs = null;
			if (missions != null)
				msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.TRAIL__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.TRAIL__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.TRAIL__MISSIONS, newMissions, newMissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjetToFollow() {
		return objetToFollow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetToFollow(String newObjetToFollow) {
		String oldObjetToFollow = objetToFollow;
		objetToFollow = newObjetToFollow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.TRAIL__OBJET_TO_FOLLOW, oldObjetToFollow, objetToFollow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.TRAIL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots getRobots() {
		if (robots != null && robots.eIsProxy()) {
			InternalEObject oldRobots = (InternalEObject)robots;
			robots = (Robots)eResolveProxy(oldRobots);
			if (robots != oldRobots) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.TRAIL__ROBOTS, oldRobots, robots));
			}
		}
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots basicGetRobots() {
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobots(Robots newRobots) {
		Robots oldRobots = robots;
		robots = newRobots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.TRAIL__ROBOTS, oldRobots, robots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.TRAIL__MISSIONS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.TRAIL__MISSIONS:
				return getMissions();
			case PatternsPackage.TRAIL__OBJET_TO_FOLLOW:
				return getObjetToFollow();
			case PatternsPackage.TRAIL__ROBOTS:
				if (resolve) return getRobots();
				return basicGetRobots();
			case PatternsPackage.TRAIL__VALUE:
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
			case PatternsPackage.TRAIL__MISSIONS:
				setMissions((Missions)newValue);
				return;
			case PatternsPackage.TRAIL__OBJET_TO_FOLLOW:
				setObjetToFollow((String)newValue);
				return;
			case PatternsPackage.TRAIL__ROBOTS:
				setRobots((Robots)newValue);
				return;
			case PatternsPackage.TRAIL__VALUE:
				setValue((Double)newValue);
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
			case PatternsPackage.TRAIL__MISSIONS:
				setMissions((Missions)null);
				return;
			case PatternsPackage.TRAIL__OBJET_TO_FOLLOW:
				setObjetToFollow(OBJET_TO_FOLLOW_EDEFAULT);
				return;
			case PatternsPackage.TRAIL__ROBOTS:
				setRobots((Robots)null);
				return;
			case PatternsPackage.TRAIL__VALUE:
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
			case PatternsPackage.TRAIL__MISSIONS:
				return missions != null;
			case PatternsPackage.TRAIL__OBJET_TO_FOLLOW:
				return OBJET_TO_FOLLOW_EDEFAULT == null ? objetToFollow != null : !OBJET_TO_FOLLOW_EDEFAULT.equals(objetToFollow);
			case PatternsPackage.TRAIL__ROBOTS:
				return robots != null;
			case PatternsPackage.TRAIL__VALUE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MissionDependent.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.TRAIL__MISSIONS: return PatternsPackage.MISSION_DEPENDENT__MISSIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MissionDependent.class) {
			switch (baseFeatureID) {
				case PatternsPackage.MISSION_DEPENDENT__MISSIONS: return PatternsPackage.TRAIL__MISSIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (objetToFollow: ");
		result.append(objetToFollow);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TrailImpl
