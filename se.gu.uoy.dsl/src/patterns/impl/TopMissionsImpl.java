/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.Missions;
import patterns.PatternsPackage;
import patterns.TopMissions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Missions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.TopMissionsImpl#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopMissionsImpl extends MinimalEObjectImpl.Container implements TopMissions {
	/**
	 * The cached value of the '{@link #getMission() <em>Mission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected Missions mission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopMissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.TOP_MISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Missions getMission() {
		if (mission != null && mission.eIsProxy()) {
			InternalEObject oldMission = (InternalEObject)mission;
			mission = (Missions)eResolveProxy(oldMission);
			if (mission != oldMission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.TOP_MISSIONS__MISSION, oldMission, mission));
			}
		}
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions basicGetMission() {
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMission(Missions newMission) {
		Missions oldMission = mission;
		mission = newMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.TOP_MISSIONS__MISSION, oldMission, mission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.TOP_MISSIONS__MISSION:
				if (resolve) return getMission();
				return basicGetMission();
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
			case PatternsPackage.TOP_MISSIONS__MISSION:
				setMission((Missions)newValue);
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
			case PatternsPackage.TOP_MISSIONS__MISSION:
				setMission((Missions)null);
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
			case PatternsPackage.TOP_MISSIONS__MISSION:
				return mission != null;
		}
		return super.eIsSet(featureID);
	}

} //TopMissionsImpl
