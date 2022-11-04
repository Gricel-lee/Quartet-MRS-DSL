/**
 */
package patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import patterns.Action;
import patterns.Execute;
import patterns.PatternsPackage;
import patterns.Robots;
import patterns.SetOfActionsDependent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ExecuteImpl#getSetOfActions <em>Set Of Actions</em>}</li>
 *   <li>{@link patterns.impl.ExecuteImpl#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteImpl extends MinimalEObjectImpl.Container implements Execute {
	/**
	 * The cached value of the '{@link #getSetOfActions() <em>Set Of Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetOfActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> setOfActions;

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
	protected ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getSetOfActions() {
		if (setOfActions == null) {
			setOfActions = new EObjectResolvingEList<Action>(Action.class, this, PatternsPackage.EXECUTE__SET_OF_ACTIONS);
		}
		return setOfActions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.EXECUTE__ROBOTS, oldRobots, robots));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.EXECUTE__ROBOTS, oldRobots, robots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.EXECUTE__SET_OF_ACTIONS:
				return getSetOfActions();
			case PatternsPackage.EXECUTE__ROBOTS:
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
			case PatternsPackage.EXECUTE__SET_OF_ACTIONS:
				getSetOfActions().clear();
				getSetOfActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PatternsPackage.EXECUTE__ROBOTS:
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
			case PatternsPackage.EXECUTE__SET_OF_ACTIONS:
				getSetOfActions().clear();
				return;
			case PatternsPackage.EXECUTE__ROBOTS:
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
			case PatternsPackage.EXECUTE__SET_OF_ACTIONS:
				return setOfActions != null && !setOfActions.isEmpty();
			case PatternsPackage.EXECUTE__ROBOTS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SetOfActionsDependent.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.EXECUTE__SET_OF_ACTIONS: return PatternsPackage.SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS;
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
		if (baseClass == SetOfActionsDependent.class) {
			switch (baseFeatureID) {
				case PatternsPackage.SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS: return PatternsPackage.EXECUTE__SET_OF_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExecuteImpl
