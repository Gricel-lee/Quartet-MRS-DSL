/**
 */
package patterns.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import patterns.Composition;
import patterns.CompositionOperator;
import patterns.Missions;
import patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.CompositionImpl#getBinaryType <em>Binary Type</em>}</li>
 *   <li>{@link patterns.impl.CompositionImpl#getMiss1 <em>Miss1</em>}</li>
 *   <li>{@link patterns.impl.CompositionImpl#getMiss2 <em>Miss2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends MinimalEObjectImpl.Container implements Composition {
	/**
	 * The default value of the '{@link #getBinaryType() <em>Binary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryType()
	 * @generated
	 * @ordered
	 */
	protected static final CompositionOperator BINARY_TYPE_EDEFAULT = CompositionOperator.AND;

	/**
	 * The cached value of the '{@link #getBinaryType() <em>Binary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryType()
	 * @generated
	 * @ordered
	 */
	protected CompositionOperator binaryType = BINARY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMiss1() <em>Miss1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiss1()
	 * @generated
	 * @ordered
	 */
	protected Missions miss1;

	/**
	 * The cached value of the '{@link #getMiss2() <em>Miss2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiss2()
	 * @generated
	 * @ordered
	 */
	protected Missions miss2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionOperator getBinaryType() {
		return binaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryType(CompositionOperator newBinaryType) {
		CompositionOperator oldBinaryType = binaryType;
		binaryType = newBinaryType == null ? BINARY_TYPE_EDEFAULT : newBinaryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.COMPOSITION__BINARY_TYPE, oldBinaryType, binaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions getMiss1() {
		if (miss1 != null && miss1.eIsProxy()) {
			InternalEObject oldMiss1 = (InternalEObject)miss1;
			miss1 = (Missions)eResolveProxy(oldMiss1);
			if (miss1 != oldMiss1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.COMPOSITION__MISS1, oldMiss1, miss1));
			}
		}
		return miss1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions basicGetMiss1() {
		return miss1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiss1(Missions newMiss1) {
		Missions oldMiss1 = miss1;
		miss1 = newMiss1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.COMPOSITION__MISS1, oldMiss1, miss1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions getMiss2() {
		if (miss2 != null && miss2.eIsProxy()) {
			InternalEObject oldMiss2 = (InternalEObject)miss2;
			miss2 = (Missions)eResolveProxy(oldMiss2);
			if (miss2 != oldMiss2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.COMPOSITION__MISS2, oldMiss2, miss2));
			}
		}
		return miss2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missions basicGetMiss2() {
		return miss2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiss2(Missions newMiss2) {
		Missions oldMiss2 = miss2;
		miss2 = newMiss2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.COMPOSITION__MISS2, oldMiss2, miss2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.COMPOSITION__BINARY_TYPE:
				return getBinaryType();
			case PatternsPackage.COMPOSITION__MISS1:
				if (resolve) return getMiss1();
				return basicGetMiss1();
			case PatternsPackage.COMPOSITION__MISS2:
				if (resolve) return getMiss2();
				return basicGetMiss2();
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
			case PatternsPackage.COMPOSITION__BINARY_TYPE:
				setBinaryType((CompositionOperator)newValue);
				return;
			case PatternsPackage.COMPOSITION__MISS1:
				setMiss1((Missions)newValue);
				return;
			case PatternsPackage.COMPOSITION__MISS2:
				setMiss2((Missions)newValue);
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
			case PatternsPackage.COMPOSITION__BINARY_TYPE:
				setBinaryType(BINARY_TYPE_EDEFAULT);
				return;
			case PatternsPackage.COMPOSITION__MISS1:
				setMiss1((Missions)null);
				return;
			case PatternsPackage.COMPOSITION__MISS2:
				setMiss2((Missions)null);
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
			case PatternsPackage.COMPOSITION__BINARY_TYPE:
				return binaryType != BINARY_TYPE_EDEFAULT;
			case PatternsPackage.COMPOSITION__MISS1:
				return miss1 != null;
			case PatternsPackage.COMPOSITION__MISS2:
				return miss2 != null;
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
		result.append(" (binaryType: ");
		result.append(binaryType);
		result.append(')');
		return result.toString();
	}

} //CompositionImpl
