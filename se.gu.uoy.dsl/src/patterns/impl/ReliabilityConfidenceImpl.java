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
import patterns.ReliabilityConfidence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reliability Confidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ReliabilityConfidenceImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link patterns.impl.ReliabilityConfidenceImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link patterns.impl.ReliabilityConfidenceImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link patterns.impl.ReliabilityConfidenceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link patterns.impl.ReliabilityConfidenceImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link patterns.impl.ReliabilityConfidenceImpl#getType2 <em>Type2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReliabilityConfidenceImpl extends MinimalEObjectImpl.Container implements ReliabilityConfidence {
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
	 * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected String type1 = TYPE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType2() <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType2()
	 * @generated
	 * @ordered
	 */
	protected String type2 = TYPE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityConfidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.RELIABILITY_CONFIDENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS, oldMissions, newMissions);
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
				msgs = ((InternalEObject)missions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS, null, msgs);
			if (newMissions != null)
				msgs = ((InternalEObject)newMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS, null, msgs);
			msgs = basicSetMissions(newMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS, newMissions, newMissions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE, oldConfidence, confidence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__MEASURE, oldMeasure, measure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType1() {
		return type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType1(String newType1) {
		String oldType1 = type1;
		type1 = newType1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__TYPE1, oldType1, type1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType2() {
		return type2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType2(String newType2) {
		String oldType2 = type2;
		type2 = newType2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.RELIABILITY_CONFIDENCE__TYPE2, oldType2, type2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS:
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
			case PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS:
				return getMissions();
			case PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE:
				return getConfidence();
			case PatternsPackage.RELIABILITY_CONFIDENCE__MEASURE:
				return getMeasure();
			case PatternsPackage.RELIABILITY_CONFIDENCE__VALUE:
				return getValue();
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE1:
				return getType1();
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE2:
				return getType2();
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
			case PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS:
				setMissions((Missions)newValue);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE:
				setConfidence((Integer)newValue);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__MEASURE:
				setMeasure((String)newValue);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__VALUE:
				setValue((Integer)newValue);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE1:
				setType1((String)newValue);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE2:
				setType2((String)newValue);
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
			case PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS:
				setMissions((Missions)null);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__MEASURE:
				setMeasure(MEASURE_EDEFAULT);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE1:
				setType1(TYPE1_EDEFAULT);
				return;
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE2:
				setType2(TYPE2_EDEFAULT);
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
			case PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS:
				return missions != null;
			case PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE:
				return confidence != CONFIDENCE_EDEFAULT;
			case PatternsPackage.RELIABILITY_CONFIDENCE__MEASURE:
				return MEASURE_EDEFAULT == null ? measure != null : !MEASURE_EDEFAULT.equals(measure);
			case PatternsPackage.RELIABILITY_CONFIDENCE__VALUE:
				return value != VALUE_EDEFAULT;
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE1:
				return TYPE1_EDEFAULT == null ? type1 != null : !TYPE1_EDEFAULT.equals(type1);
			case PatternsPackage.RELIABILITY_CONFIDENCE__TYPE2:
				return TYPE2_EDEFAULT == null ? type2 != null : !TYPE2_EDEFAULT.equals(type2);
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
				case PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS: return PatternsPackage.MISSION_DEPENDENT__MISSIONS;
				default: return -1;
			}
		}
		if (baseClass == LevelOfConfidence.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE: return PatternsPackage.LEVEL_OF_CONFIDENCE__CONFIDENCE;
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
				case PatternsPackage.MISSION_DEPENDENT__MISSIONS: return PatternsPackage.RELIABILITY_CONFIDENCE__MISSIONS;
				default: return -1;
			}
		}
		if (baseClass == LevelOfConfidence.class) {
			switch (baseFeatureID) {
				case PatternsPackage.LEVEL_OF_CONFIDENCE__CONFIDENCE: return PatternsPackage.RELIABILITY_CONFIDENCE__CONFIDENCE;
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
		result.append(", measure: ");
		result.append(measure);
		result.append(", value: ");
		result.append(value);
		result.append(", type1: ");
		result.append(type1);
		result.append(", type2: ");
		result.append(type2);
		result.append(')');
		return result.toString();
	}

} //ReliabilityConfidenceImpl
