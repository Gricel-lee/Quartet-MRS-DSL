/**
 */
package patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import patterns.Action;
import patterns.Deviation;
import patterns.PatternsPackage;
import patterns.SetOfActionsDependent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.DeviationImpl#getSetOfActions <em>Set Of Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviationImpl extends MinimalEObjectImpl.Container implements Deviation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.DEVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getSetOfActions() {
		if (setOfActions == null) {
			setOfActions = new EObjectResolvingEList<Action>(Action.class, this, PatternsPackage.DEVIATION__SET_OF_ACTIONS);
		}
		return setOfActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.DEVIATION__SET_OF_ACTIONS:
				return getSetOfActions();
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
			case PatternsPackage.DEVIATION__SET_OF_ACTIONS:
				getSetOfActions().clear();
				getSetOfActions().addAll((Collection<? extends Action>)newValue);
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
			case PatternsPackage.DEVIATION__SET_OF_ACTIONS:
				getSetOfActions().clear();
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
			case PatternsPackage.DEVIATION__SET_OF_ACTIONS:
				return setOfActions != null && !setOfActions.isEmpty();
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
				case PatternsPackage.DEVIATION__SET_OF_ACTIONS: return PatternsPackage.SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS;
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
				case PatternsPackage.SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS: return PatternsPackage.DEVIATION__SET_OF_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DeviationImpl
