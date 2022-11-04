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
import patterns.End;
import patterns.LocationEvent;
import patterns.MissionDependent;
import patterns.Missions;
import patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.EndImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link patterns.impl.EndImpl#getLocationevent <em>Locationevent</em>}</li>
 *   <li>{@link patterns.impl.EndImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link patterns.impl.EndImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndImpl extends MinimalEObjectImpl.Container implements End {
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
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.END;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.END__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.END__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationEvent> getLocationevent() {
		if (locationevent == null) {
			locationevent = new EObjectContainmentEList<LocationEvent>(LocationEvent.class, this, PatternsPackage.END__LOCATIONEVENT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.END__MISSIONS, oldMissions, newMissions);
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
				msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.END__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.END__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.END__MISSIONS, newMissions, newMissions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.END__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.END__LOCATIONEVENT:
				return ((InternalEList<?>)getLocationevent()).basicRemove(otherEnd, msgs);
			case PatternsPackage.END__MISSIONS:
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
			case PatternsPackage.END__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case PatternsPackage.END__LOCATIONEVENT:
				return getLocationevent();
			case PatternsPackage.END__MISSIONS:
				return getMissions();
			case PatternsPackage.END__VALUE:
				return getValue();
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
			case PatternsPackage.END__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternsPackage.END__LOCATIONEVENT:
				getLocationevent().clear();
				getLocationevent().addAll((Collection<? extends LocationEvent>)newValue);
				return;
			case PatternsPackage.END__MISSIONS:
				setMissions((Missions)newValue);
				return;
			case PatternsPackage.END__VALUE:
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
			case PatternsPackage.END__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternsPackage.END__LOCATIONEVENT:
				getLocationevent().clear();
				return;
			case PatternsPackage.END__MISSIONS:
				setMissions((Missions)null);
				return;
			case PatternsPackage.END__VALUE:
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
			case PatternsPackage.END__CONDITION:
				return condition != null;
			case PatternsPackage.END__LOCATIONEVENT:
				return locationevent != null && !locationevent.isEmpty();
			case PatternsPackage.END__MISSIONS:
				return missions != null;
			case PatternsPackage.END__VALUE:
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
		if (baseClass == ConditionDependent.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.END__CONDITION: return PatternsPackage.CONDITION_DEPENDENT__CONDITION;
				case PatternsPackage.END__LOCATIONEVENT: return PatternsPackage.CONDITION_DEPENDENT__LOCATIONEVENT;
				default: return -1;
			}
		}
		if (baseClass == MissionDependent.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.END__MISSIONS: return PatternsPackage.MISSION_DEPENDENT__MISSIONS;
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
				case PatternsPackage.CONDITION_DEPENDENT__CONDITION: return PatternsPackage.END__CONDITION;
				case PatternsPackage.CONDITION_DEPENDENT__LOCATIONEVENT: return PatternsPackage.END__LOCATIONEVENT;
				default: return -1;
			}
		}
		if (baseClass == MissionDependent.class) {
			switch (baseFeatureID) {
				case PatternsPackage.MISSION_DEPENDENT__MISSIONS: return PatternsPackage.END__MISSIONS;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EndImpl
