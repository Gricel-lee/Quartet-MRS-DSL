/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.Equidistance;
import patterns.Location;
import patterns.MissionDependent;
import patterns.Missions;
import patterns.PatternsPackage;
import patterns.Robots;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equidistance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.EquidistanceImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link patterns.impl.EquidistanceImpl#getLocation1 <em>Location1</em>}</li>
 *   <li>{@link patterns.impl.EquidistanceImpl#getLocation2 <em>Location2</em>}</li>
 *   <li>{@link patterns.impl.EquidistanceImpl#getRobots1 <em>Robots1</em>}</li>
 *   <li>{@link patterns.impl.EquidistanceImpl#getRobots2 <em>Robots2</em>}</li>
 *   <li>{@link patterns.impl.EquidistanceImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link patterns.impl.EquidistanceImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquidistanceImpl extends MinimalEObjectImpl.Container implements Equidistance {
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
	 * The cached value of the '{@link #getLocation1() <em>Location1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation1()
	 * @generated
	 * @ordered
	 */
	protected Location location1;

	/**
	 * The cached value of the '{@link #getLocation2() <em>Location2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation2()
	 * @generated
	 * @ordered
	 */
	protected Location location2;

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
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected Robots robots;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquidistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.EQUIDISTANCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__MISSIONS, oldMissions, newMissions);
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
				msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.EQUIDISTANCE__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.EQUIDISTANCE__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__MISSIONS, newMissions, newMissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation1() {
		if (location1 != null && location1.eIsProxy()) {
			InternalEObject oldLocation1 = (InternalEObject)location1;
			location1 = (Location)eResolveProxy(oldLocation1);
			if (location1 != oldLocation1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.EQUIDISTANCE__LOCATION1, oldLocation1, location1));
			}
		}
		return location1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation1() {
		return location1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation1(Location newLocation1) {
		Location oldLocation1 = location1;
		location1 = newLocation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__LOCATION1, oldLocation1, location1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation2() {
		if (location2 != null && location2.eIsProxy()) {
			InternalEObject oldLocation2 = (InternalEObject)location2;
			location2 = (Location)eResolveProxy(oldLocation2);
			if (location2 != oldLocation2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.EQUIDISTANCE__LOCATION2, oldLocation2, location2));
			}
		}
		return location2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation2() {
		return location2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation2(Location newLocation2) {
		Location oldLocation2 = location2;
		location2 = newLocation2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__LOCATION2, oldLocation2, location2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots getRobots1() {
		if (robots1 != null && robots1.eIsProxy()) {
			InternalEObject oldRobots1 = (InternalEObject)robots1;
			robots1 = (Robots)eResolveProxy(oldRobots1);
			if (robots1 != oldRobots1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.EQUIDISTANCE__ROBOTS1, oldRobots1, robots1));
			}
		}
		return robots1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots basicGetRobots1() {
		return robots1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobots1(Robots newRobots1) {
		Robots oldRobots1 = robots1;
		robots1 = newRobots1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__ROBOTS1, oldRobots1, robots1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots getRobots2() {
		if (robots2 != null && robots2.eIsProxy()) {
			InternalEObject oldRobots2 = (InternalEObject)robots2;
			robots2 = (Robots)eResolveProxy(oldRobots2);
			if (robots2 != oldRobots2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.EQUIDISTANCE__ROBOTS2, oldRobots2, robots2));
			}
		}
		return robots2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots basicGetRobots2() {
		return robots2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobots2(Robots newRobots2) {
		Robots oldRobots2 = robots2;
		robots2 = newRobots2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__ROBOTS2, oldRobots2, robots2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.EQUIDISTANCE__ROBOTS, oldRobots, robots));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EQUIDISTANCE__ROBOTS, oldRobots, robots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.EQUIDISTANCE__MISSIONS:
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
			case PatternsPackage.EQUIDISTANCE__MISSIONS:
				return getMissions();
			case PatternsPackage.EQUIDISTANCE__LOCATION1:
				if (resolve) return getLocation1();
				return basicGetLocation1();
			case PatternsPackage.EQUIDISTANCE__LOCATION2:
				if (resolve) return getLocation2();
				return basicGetLocation2();
			case PatternsPackage.EQUIDISTANCE__ROBOTS1:
				if (resolve) return getRobots1();
				return basicGetRobots1();
			case PatternsPackage.EQUIDISTANCE__ROBOTS2:
				if (resolve) return getRobots2();
				return basicGetRobots2();
			case PatternsPackage.EQUIDISTANCE__ROBOTS:
				if (resolve) return getRobots();
				return basicGetRobots();
			case PatternsPackage.EQUIDISTANCE__DISTANCE:
				return getDistance();
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
			case PatternsPackage.EQUIDISTANCE__MISSIONS:
				setMissions((Missions)newValue);
				return;
			case PatternsPackage.EQUIDISTANCE__LOCATION1:
				setLocation1((Location)newValue);
				return;
			case PatternsPackage.EQUIDISTANCE__LOCATION2:
				setLocation2((Location)newValue);
				return;
			case PatternsPackage.EQUIDISTANCE__ROBOTS1:
				setRobots1((Robots)newValue);
				return;
			case PatternsPackage.EQUIDISTANCE__ROBOTS2:
				setRobots2((Robots)newValue);
				return;
			case PatternsPackage.EQUIDISTANCE__ROBOTS:
				setRobots((Robots)newValue);
				return;
			case PatternsPackage.EQUIDISTANCE__DISTANCE:
				setDistance((Double)newValue);
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
			case PatternsPackage.EQUIDISTANCE__MISSIONS:
				setMissions((Missions)null);
				return;
			case PatternsPackage.EQUIDISTANCE__LOCATION1:
				setLocation1((Location)null);
				return;
			case PatternsPackage.EQUIDISTANCE__LOCATION2:
				setLocation2((Location)null);
				return;
			case PatternsPackage.EQUIDISTANCE__ROBOTS1:
				setRobots1((Robots)null);
				return;
			case PatternsPackage.EQUIDISTANCE__ROBOTS2:
				setRobots2((Robots)null);
				return;
			case PatternsPackage.EQUIDISTANCE__ROBOTS:
				setRobots((Robots)null);
				return;
			case PatternsPackage.EQUIDISTANCE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
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
			case PatternsPackage.EQUIDISTANCE__MISSIONS:
				return missions != null;
			case PatternsPackage.EQUIDISTANCE__LOCATION1:
				return location1 != null;
			case PatternsPackage.EQUIDISTANCE__LOCATION2:
				return location2 != null;
			case PatternsPackage.EQUIDISTANCE__ROBOTS1:
				return robots1 != null;
			case PatternsPackage.EQUIDISTANCE__ROBOTS2:
				return robots2 != null;
			case PatternsPackage.EQUIDISTANCE__ROBOTS:
				return robots != null;
			case PatternsPackage.EQUIDISTANCE__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
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
				case PatternsPackage.EQUIDISTANCE__MISSIONS: return PatternsPackage.MISSION_DEPENDENT__MISSIONS;
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
				case PatternsPackage.MISSION_DEPENDENT__MISSIONS: return PatternsPackage.EQUIDISTANCE__MISSIONS;
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
		result.append(" (distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //EquidistanceImpl
