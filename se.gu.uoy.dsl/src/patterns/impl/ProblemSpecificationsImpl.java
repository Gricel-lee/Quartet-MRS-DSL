/**
 */
package patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import patterns.Action;
import patterns.CompositePatterns;
import patterns.Condition;
import patterns.ElementaryPatterns;
import patterns.Location;
import patterns.PatternsPackage;
import patterns.ProblemSpecifications;
import patterns.Robots;
import patterns.SpecificationPatterns;
import patterns.TopMissions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Specifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getAction <em>Action</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getTopmissions <em>Topmissions</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getElementaryPatterns <em>Elementary Patterns</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getCompositePatterns <em>Composite Patterns</em>}</li>
 *   <li>{@link patterns.impl.ProblemSpecificationsImpl#getSpecificationPatterns <em>Specification Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblemSpecificationsImpl extends MinimalEObjectImpl.Container implements ProblemSpecifications {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<Robots> robots;

	/**
	 * The cached value of the '{@link #getTopmissions() <em>Topmissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopmissions()
	 * @generated
	 * @ordered
	 */
	protected EList<TopMissions> topmissions;

	/**
	 * The cached value of the '{@link #getElementaryPatterns() <em>Elementary Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryPatterns> elementaryPatterns;

	/**
	 * The cached value of the '{@link #getCompositePatterns() <em>Composite Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositePatterns> compositePatterns;

	/**
	 * The cached value of the '{@link #getSpecificationPatterns() <em>Specification Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificationPatterns> specificationPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSpecificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PROBLEM_SPECIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Condition>(Condition.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Robots> getRobots() {
		if (robots == null) {
			robots = new EObjectContainmentEList<Robots>(Robots.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS);
		}
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TopMissions> getTopmissions() {
		if (topmissions == null) {
			topmissions = new EObjectContainmentEList<TopMissions>(TopMissions.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS);
		}
		return topmissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementaryPatterns> getElementaryPatterns() {
		if (elementaryPatterns == null) {
			elementaryPatterns = new EObjectContainmentEList<ElementaryPatterns>(ElementaryPatterns.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS);
		}
		return elementaryPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositePatterns> getCompositePatterns() {
		if (compositePatterns == null) {
			compositePatterns = new EObjectContainmentEList<CompositePatterns>(CompositePatterns.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS);
		}
		return compositePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecificationPatterns> getSpecificationPatterns() {
		if (specificationPatterns == null) {
			specificationPatterns = new EObjectContainmentEList<SpecificationPatterns>(SpecificationPatterns.class, this, PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS);
		}
		return specificationPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS:
				return ((InternalEList<?>)getRobots()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS:
				return ((InternalEList<?>)getTopmissions()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS:
				return ((InternalEList<?>)getElementaryPatterns()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS:
				return ((InternalEList<?>)getCompositePatterns()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS:
				return ((InternalEList<?>)getSpecificationPatterns()).basicRemove(otherEnd, msgs);
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
			case PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION:
				return getCondition();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION:
				return getLocation();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION:
				return getAction();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS:
				return getRobots();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS:
				return getTopmissions();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS:
				return getElementaryPatterns();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS:
				return getCompositePatterns();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS:
				return getSpecificationPatterns();
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
			case PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS:
				getRobots().clear();
				getRobots().addAll((Collection<? extends Robots>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS:
				getTopmissions().clear();
				getTopmissions().addAll((Collection<? extends TopMissions>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS:
				getElementaryPatterns().clear();
				getElementaryPatterns().addAll((Collection<? extends ElementaryPatterns>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS:
				getCompositePatterns().clear();
				getCompositePatterns().addAll((Collection<? extends CompositePatterns>)newValue);
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS:
				getSpecificationPatterns().clear();
				getSpecificationPatterns().addAll((Collection<? extends SpecificationPatterns>)newValue);
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
			case PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION:
				getCondition().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION:
				getLocation().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION:
				getAction().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS:
				getRobots().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS:
				getTopmissions().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS:
				getElementaryPatterns().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS:
				getCompositePatterns().clear();
				return;
			case PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS:
				getSpecificationPatterns().clear();
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
			case PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION:
				return condition != null && !condition.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION:
				return location != null && !location.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION:
				return action != null && !action.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS:
				return robots != null && !robots.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS:
				return topmissions != null && !topmissions.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS:
				return elementaryPatterns != null && !elementaryPatterns.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS:
				return compositePatterns != null && !compositePatterns.isEmpty();
			case PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS:
				return specificationPatterns != null && !specificationPatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProblemSpecificationsImpl
