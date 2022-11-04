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

import patterns.Condition;
import patterns.ConditionDependent;
import patterns.LocationEvent;
import patterns.MissionDependent;
import patterns.Missions;
import patterns.PatternsPackage;
import patterns.ResumeIf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ResumeIfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link patterns.impl.ResumeIfImpl#getLocationevent <em>Locationevent</em>}</li>
 *   <li>{@link patterns.impl.ResumeIfImpl#getMissions <em>Missions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResumeIfImpl extends MinimalEObjectImpl.Container implements ResumeIf {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getLocationevent() <em>Locationevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationevent()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationEvent> locationevent;

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
	protected ResumeIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.RESUME_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (Condition)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.RESUME_IF__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RESUME_IF__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationEvent> getLocationevent() {
		if (locationevent == null) {
			locationevent = new EObjectContainmentEList<LocationEvent>(LocationEvent.class, this, PatternsPackage.RESUME_IF__LOCATIONEVENT);
		}
		return locationevent;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.RESUME_IF__MISSIONS, oldMissions, newMissions);
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
				msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.RESUME_IF__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.RESUME_IF__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RESUME_IF__MISSIONS, newMissions, newMissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.RESUME_IF__LOCATIONEVENT:
				return ((InternalEList<?>)getLocationevent()).basicRemove(otherEnd, msgs);
			case PatternsPackage.RESUME_IF__MISSIONS:
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
			case PatternsPackage.RESUME_IF__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case PatternsPackage.RESUME_IF__LOCATIONEVENT:
				return getLocationevent();
			case PatternsPackage.RESUME_IF__MISSIONS:
				return getMissions();
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
			case PatternsPackage.RESUME_IF__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternsPackage.RESUME_IF__LOCATIONEVENT:
				getLocationevent().clear();
				getLocationevent().addAll((Collection<? extends LocationEvent>)newValue);
				return;
			case PatternsPackage.RESUME_IF__MISSIONS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.RESUME_IF__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternsPackage.RESUME_IF__LOCATIONEVENT:
				getLocationevent().clear();
				return;
			case PatternsPackage.RESUME_IF__MISSIONS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.RESUME_IF__CONDITION:
				return condition != null;
			case PatternsPackage.RESUME_IF__LOCATIONEVENT:
				return locationevent != null && !locationevent.isEmpty();
			case PatternsPackage.RESUME_IF__MISSIONS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConditionDependent.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.RESUME_IF__CONDITION: return PatternsPackage.CONDITION_DEPENDENT__CONDITION;
				case PatternsPackage.RESUME_IF__LOCATIONEVENT: return PatternsPackage.CONDITION_DEPENDENT__LOCATIONEVENT;
				default: return -1;
			}
		}
		if (baseClass == MissionDependent.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.RESUME_IF__MISSIONS: return PatternsPackage.MISSION_DEPENDENT__MISSIONS;
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
		if (baseClass == ConditionDependent.class) {
			switch (baseFeatureID) {
				case PatternsPackage.CONDITION_DEPENDENT__CONDITION: return PatternsPackage.RESUME_IF__CONDITION;
				case PatternsPackage.CONDITION_DEPENDENT__LOCATIONEVENT: return PatternsPackage.RESUME_IF__LOCATIONEVENT;
				default: return -1;
			}
		}
		if (baseClass == MissionDependent.class) {
			switch (baseFeatureID) {
				case PatternsPackage.MISSION_DEPENDENT__MISSIONS: return PatternsPackage.RESUME_IF__MISSIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResumeIfImpl
