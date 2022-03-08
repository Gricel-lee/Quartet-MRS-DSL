/**
 */
package patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import patterns.PatternsPackage;
import patterns.Robots;
import patterns.ShallMissions;
import patterns.SpecificationPatterns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shall Missions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ShallMissionsImpl#getId <em>Id</em>}</li>
 *   <li>{@link patterns.impl.ShallMissionsImpl#getMovementPatterns <em>Movement Patterns</em>}</li>
 *   <li>{@link patterns.impl.ShallMissionsImpl#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShallMissionsImpl extends MinimalEObjectImpl.Container implements ShallMissions {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMovementPatterns() <em>Movement Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificationPatterns> movementPatterns;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShallMissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.SHALL_MISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.SHALL_MISSIONS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecificationPatterns> getMovementPatterns() {
		if (movementPatterns == null) {
			movementPatterns = new EObjectContainmentEList<SpecificationPatterns>(SpecificationPatterns.class, this, PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS);
		}
		return movementPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robots getRobots() {
		if (robots != null && robots.eIsProxy()) {
			InternalEObject oldRobots = (InternalEObject)robots;
			robots = (Robots)eResolveProxy(oldRobots);
			if (robots != oldRobots) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.SHALL_MISSIONS__ROBOTS, oldRobots, robots));
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
	@Override
	public void setRobots(Robots newRobots) {
		Robots oldRobots = robots;
		robots = newRobots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.SHALL_MISSIONS__ROBOTS, oldRobots, robots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS:
				return ((InternalEList<?>)getMovementPatterns()).basicRemove(otherEnd, msgs);
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
			case PatternsPackage.SHALL_MISSIONS__ID:
				return getId();
			case PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS:
				return getMovementPatterns();
			case PatternsPackage.SHALL_MISSIONS__ROBOTS:
				if (resolve) return getRobots();
				return basicGetRobots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.SHALL_MISSIONS__ID:
				setId((String)newValue);
				return;
			case PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS:
				getMovementPatterns().clear();
				getMovementPatterns().addAll((Collection<? extends SpecificationPatterns>)newValue);
				return;
			case PatternsPackage.SHALL_MISSIONS__ROBOTS:
				setRobots((Robots)newValue);
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
			case PatternsPackage.SHALL_MISSIONS__ID:
				setId(ID_EDEFAULT);
				return;
			case PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS:
				getMovementPatterns().clear();
				return;
			case PatternsPackage.SHALL_MISSIONS__ROBOTS:
				setRobots((Robots)null);
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
			case PatternsPackage.SHALL_MISSIONS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PatternsPackage.SHALL_MISSIONS__MOVEMENT_PATTERNS:
				return movementPatterns != null && !movementPatterns.isEmpty();
			case PatternsPackage.SHALL_MISSIONS__ROBOTS:
				return robots != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ShallMissionsImpl
