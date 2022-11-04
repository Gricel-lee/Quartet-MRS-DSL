/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.ComplexMissions;
import patterns.MissionOperation;
import patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Missions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ComplexMissionsImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexMissionsImpl extends MinimalEObjectImpl.Container implements ComplexMissions {
	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected MissionOperation composition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexMissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.COMPLEX_MISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionOperation getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(MissionOperation newComposition, NotificationChain msgs) {
		MissionOperation oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.COMPLEX_MISSIONS__COMPOSITION, oldComposition, newComposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(MissionOperation newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.COMPLEX_MISSIONS__COMPOSITION, null, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.COMPLEX_MISSIONS__COMPOSITION, null, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.COMPLEX_MISSIONS__COMPOSITION, newComposition, newComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.COMPLEX_MISSIONS__COMPOSITION:
				return basicSetComposition(null, msgs);
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
			case PatternsPackage.COMPLEX_MISSIONS__COMPOSITION:
				return getComposition();
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
			case PatternsPackage.COMPLEX_MISSIONS__COMPOSITION:
				setComposition((MissionOperation)newValue);
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
			case PatternsPackage.COMPLEX_MISSIONS__COMPOSITION:
				setComposition((MissionOperation)null);
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
			case PatternsPackage.COMPLEX_MISSIONS__COMPOSITION:
				return composition != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexMissionsImpl
