/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.LevelOfConfidence;
import patterns.MissionDependent;
import patterns.Missions;
import patterns.PatternsPackage;
import patterns.Relaxed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relaxed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.RelaxedImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link patterns.impl.RelaxedImpl#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelaxedImpl extends MinimalEObjectImpl.Container implements Relaxed {
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
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final int CONFIDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected int confidence = CONFIDENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelaxedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.RELAXED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.RELAXED__MISSIONS, oldMissions, newMissions);
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
	public void setMissions(Missions newMissions) {
		if (newMissions != missions) {
			NotificationChain msgs = null;
			if (missions != null)
				msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.RELAXED__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.RELAXED__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELAXED__MISSIONS, newMissions, newMissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(int newConfidence) {
		int oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELAXED__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.RELAXED__MISSIONS:
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
			case PatternsPackage.RELAXED__MISSIONS:
				return getMissions();
			case PatternsPackage.RELAXED__CONFIDENCE:
				return getConfidence();
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
			case PatternsPackage.RELAXED__MISSIONS:
				setMissions((Missions)newValue);
				return;
			case PatternsPackage.RELAXED__CONFIDENCE:
				setConfidence((Integer)newValue);
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
			case PatternsPackage.RELAXED__MISSIONS:
				setMissions((Missions)null);
				return;
			case PatternsPackage.RELAXED__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
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
			case PatternsPackage.RELAXED__MISSIONS:
				return missions != null;
			case PatternsPackage.RELAXED__CONFIDENCE:
				return confidence != CONFIDENCE_EDEFAULT;
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
				case PatternsPackage.RELAXED__MISSIONS: return PatternsPackage.MISSION_DEPENDENT__MISSIONS;
				default: return -1;
			}
		}
		if (baseClass == LevelOfConfidence.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.RELAXED__CONFIDENCE: return PatternsPackage.LEVEL_OF_CONFIDENCE__CONFIDENCE;
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
				case PatternsPackage.MISSION_DEPENDENT__MISSIONS: return PatternsPackage.RELAXED__MISSIONS;
				default: return -1;
			}
		}
		if (baseClass == LevelOfConfidence.class) {
			switch (baseFeatureID) {
				case PatternsPackage.LEVEL_OF_CONFIDENCE__CONFIDENCE: return PatternsPackage.RELAXED__CONFIDENCE;
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
		result.append(" (confidence: ");
		result.append(confidence);
		result.append(')');
		return result.toString();
	}

} //RelaxedImpl
