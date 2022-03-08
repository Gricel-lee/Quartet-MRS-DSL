/**
 */
package patterns.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import patterns.Accrue;
import patterns.Action;
import patterns.ActionDependent;
import patterns.ActionEnd;
import patterns.After;
import patterns.AlmostAt;
import patterns.AtLeast;
import patterns.AtMost;
import patterns.Avoid;
import patterns.AvoidanceVisit;
import patterns.ComplexMissions;
import patterns.CompositePatterns;
import patterns.Composition;
import patterns.CompositionOperator;
import patterns.Condition;
import patterns.ConditionBased;
import patterns.ConditionDependent;
import patterns.Conditional;
import patterns.Conservation;
import patterns.Counteract;
import patterns.DeadlineAt;
import patterns.Delayed;
import patterns.Descriptive;
import patterns.Deviation;
import patterns.ElementaryPatterns;
import patterns.End;
import patterns.Equidistance;
import patterns.Event;
import patterns.Exactly;
import patterns.ExactlyAt;
import patterns.Execute;
import patterns.Fair;
import patterns.GreaterThan;
import patterns.Less;
import patterns.LessThan;
import patterns.LevelOfConfidence;
import patterns.Location;
import patterns.LocationDependent;
import patterns.LocationEvent;
import patterns.Maintain;
import patterns.Maximize;
import patterns.Minimize;
import patterns.MissionDependent;
import patterns.MissionOperation;
import patterns.Missions;
import patterns.Negation;
import patterns.Order;
import patterns.Patrol;
import patterns.PatternsFactory;
import patterns.PatternsPackage;
import patterns.Pause;
import patterns.Preservation;
import patterns.ProblemSpecifications;
import patterns.Proportional;
import patterns.React;
import patterns.Relaxed;
import patterns.ReliabilityConfidence;
import patterns.Repeat;
import patterns.RepeatEvery;
import patterns.Restricted;
import patterns.ResumeIf;
import patterns.Robots;
import patterns.Secure;
import patterns.Sequence;
import patterns.Sequencing;
import patterns.SetOfActionsDependent;
import patterns.ShallMissions;
import patterns.Simple;
import patterns.SpecificationPatterns;
import patterns.StrictOrder;
import patterns.StrictlyWithin;
import patterns.Timed;
import patterns.Timeout;
import patterns.TopMissions;
import patterns.Trail;
import patterns.Trigger;
import patterns.Visit1;
import patterns.Visit2;
import patterns.Wait;
import patterns.Within;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationPatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visit1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSpecificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avoidanceVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visit2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counteractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryPatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atMostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atLeastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictlyWithinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositePatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shallMissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexMissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionDependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionDependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumeIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equidistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationDependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityConfidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOfConfidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relaxedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass almostAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactlyAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proportionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOfActionsDependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topMissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see patterns.PatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternsPackageImpl() {
		super(eNS_URI, PatternsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternsPackage init() {
		if (isInited) return (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPatternsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PatternsPackageImpl thePatternsPackage = registeredPatternsPackage instanceof PatternsPackageImpl ? (PatternsPackageImpl)registeredPatternsPackage : new PatternsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePatternsPackage.createPackageContents();

		// Initialize created meta-data
		thePatternsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
		return thePatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecificationPatterns() {
		return specificationPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecificationPatterns_Locations() {
		return (EReference)specificationPatternsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecificationPatterns_Type() {
		return (EAttribute)specificationPatternsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisit1() {
		return visit1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemSpecifications() {
		return problemSpecificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_Condition() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_Location() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_Action() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_Robots() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_Topmissions() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_ElementaryPatterns() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_CompositePatterns() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProblemSpecifications_SpecificationPatterns() {
		return (EReference)problemSpecificationsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrictOrder() {
		return strictOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatrol() {
		return patrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvoidanceVisit() {
		return avoidanceVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestricted() {
		return restrictedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestricted_Number() {
		return (EAttribute)restrictedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationEvent() {
		return locationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationEvent_Robots() {
		return (EReference)locationEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationEvent_Location() {
		return (EReference)locationEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Name() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Condition() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobots() {
		return robotsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobots_Name() {
		return (EAttribute)robotsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFair() {
		return fairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisit2() {
		return visit2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLess() {
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExactly() {
		return exactlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvoid() {
		return avoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAfter() {
		return afterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionBased() {
		return conditionBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionBased_Condition() {
		return (EReference)conditionBasedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionBased_Locationevent() {
		return (EReference)conditionBasedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrigger_Condition() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrigger_Locationevent() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptive() {
		return descriptiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptive_Pattern() {
		return (EReference)descriptiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptive_Action() {
		return (EReference)descriptiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReact() {
		return reactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounteract() {
		return counteractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaximize() {
		return maximizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximize_Reward() {
		return (EAttribute)maximizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementaryPatterns() {
		return elementaryPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementaryPatterns_Measure() {
		return (EAttribute)elementaryPatternsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementaryPatterns_Mission() {
		return (EReference)elementaryPatternsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementaryPatterns_Type() {
		return (EAttribute)elementaryPatternsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLessThan_Value() {
		return (EAttribute)lessThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinimize() {
		return minimizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtMost() {
		return atMostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtMost_Value() {
		return (EAttribute)atMostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtMost_Reward() {
		return (EAttribute)atMostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtLeast() {
		return atLeastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtLeast_Value() {
		return (EAttribute)atLeastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGreaterThan_Value() {
		return (EAttribute)greaterThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWithin() {
		return withinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWithin_Value1() {
		return (EAttribute)withinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWithin_Value2() {
		return (EAttribute)withinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWithin_Reward() {
		return (EAttribute)withinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrictlyWithin() {
		return strictlyWithinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrictlyWithin_Value1() {
		return (EAttribute)strictlyWithinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrictlyWithin_Value2() {
		return (EAttribute)strictlyWithinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositePatterns() {
		return compositePatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMissions() {
		return missionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShallMissions() {
		return shallMissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShallMissions_Id() {
		return (EAttribute)shallMissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShallMissions_MovementPatterns() {
		return (EReference)shallMissionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShallMissions_Robots() {
		return (EReference)shallMissionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionEnd() {
		return actionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionEnd_Description() {
		return (EAttribute)actionEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionEnd_Action() {
		return (EReference)actionEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelayed() {
		return delayedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplexMissions() {
		return complexMissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplexMissions_Composition() {
		return (EReference)complexMissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMissionOperation() {
		return missionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNegation_Not() {
		return (EReference)negationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_BinaryType() {
		return (EAttribute)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Miss1() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Miss2() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConservation() {
		return conservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConservation_Measure() {
		return (EAttribute)conservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreservation() {
		return preservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreservation_Measure() {
		return (EAttribute)preservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreservation_Value1() {
		return (EAttribute)preservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreservation_Value2() {
		return (EAttribute)preservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeatEvery() {
		return repeatEveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimed() {
		return timedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimed_T() {
		return (EAttribute)timedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionDependent() {
		return conditionDependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionDependent_Condition() {
		return (EReference)conditionDependentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionDependent_Locationevent() {
		return (EReference)conditionDependentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionDependent() {
		return actionDependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionDependent_Action() {
		return (EReference)actionDependentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMissionDependent() {
		return missionDependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMissionDependent_Missions() {
		return (EReference)missionDependentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaintain() {
		return maintainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnd_Value() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResumeIf() {
		return resumeIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccrue() {
		return accrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccrue_Measure() {
		return (EAttribute)accrueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccrue_Robots() {
		return (EReference)accrueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecure() {
		return secureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquidistance() {
		return equidistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquidistance_Location1() {
		return (EReference)equidistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquidistance_Location2() {
		return (EReference)equidistanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquidistance_Distance() {
		return (EAttribute)equidistanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquidistance_Robots1() {
		return (EReference)equidistanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquidistance_Robots2() {
		return (EReference)equidistanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquidistance_Robots() {
		return (EReference)equidistanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrail() {
		return trailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrail_ObjetToFollow() {
		return (EAttribute)trailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrail_Value() {
		return (EAttribute)trailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrail_Robots() {
		return (EReference)trailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationDependent() {
		return locationDependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationDependent_Locations() {
		return (EReference)locationDependentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPause() {
		return pauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPause_Value() {
		return (EAttribute)pauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeout() {
		return timeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeout_Value() {
		return (EAttribute)timeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReliabilityConfidence() {
		return reliabilityConfidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReliabilityConfidence_Measure() {
		return (EAttribute)reliabilityConfidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReliabilityConfidence_Value() {
		return (EAttribute)reliabilityConfidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReliabilityConfidence_Type1() {
		return (EAttribute)reliabilityConfidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReliabilityConfidence_Type2() {
		return (EAttribute)reliabilityConfidenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevelOfConfidence() {
		return levelOfConfidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelOfConfidence_Confidence() {
		return (EAttribute)levelOfConfidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelaxed() {
		return relaxedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlmostAt() {
		return almostAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExactlyAt() {
		return exactlyAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeadlineAt() {
		return deadlineAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProportional() {
		return proportionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProportional_Mission1() {
		return (EReference)proportionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProportional_Mission2() {
		return (EReference)proportionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProportional_Value() {
		return (EAttribute)proportionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecute() {
		return executeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecute_Robots() {
		return (EReference)executeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetOfActionsDependent() {
		return setOfActionsDependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetOfActionsDependent_SetOfActions() {
		return (EReference)setOfActionsDependentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequencing() {
		return sequencingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviation() {
		return deviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepeat_Value() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopMissions() {
		return topMissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopMissions_Mission() {
		return (EReference)topMissionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompositionOperator() {
		return compositionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternsFactory getPatternsFactory() {
		return (PatternsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specificationPatternsEClass = createEClass(SPECIFICATION_PATTERNS);
		createEReference(specificationPatternsEClass, SPECIFICATION_PATTERNS__LOCATIONS);
		createEAttribute(specificationPatternsEClass, SPECIFICATION_PATTERNS__TYPE);

		visit1EClass = createEClass(VISIT1);

		problemSpecificationsEClass = createEClass(PROBLEM_SPECIFICATIONS);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__CONDITION);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__LOCATION);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__ACTION);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__ROBOTS);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__TOPMISSIONS);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS);
		createEReference(problemSpecificationsEClass, PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NAME);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);

		sequenceEClass = createEClass(SEQUENCE);

		orderEClass = createEClass(ORDER);

		strictOrderEClass = createEClass(STRICT_ORDER);

		patrolEClass = createEClass(PATROL);

		avoidanceVisitEClass = createEClass(AVOIDANCE_VISIT);

		restrictedEClass = createEClass(RESTRICTED);
		createEAttribute(restrictedEClass, RESTRICTED__NUMBER);

		conditionalEClass = createEClass(CONDITIONAL);

		locationEventEClass = createEClass(LOCATION_EVENT);
		createEReference(locationEventEClass, LOCATION_EVENT__ROBOTS);
		createEReference(locationEventEClass, LOCATION_EVENT__LOCATION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);
		createEAttribute(eventEClass, EVENT__CONDITION);

		robotsEClass = createEClass(ROBOTS);
		createEAttribute(robotsEClass, ROBOTS__NAME);

		fairEClass = createEClass(FAIR);

		visit2EClass = createEClass(VISIT2);

		lessEClass = createEClass(LESS);

		exactlyEClass = createEClass(EXACTLY);

		simpleEClass = createEClass(SIMPLE);

		avoidEClass = createEClass(AVOID);

		afterEClass = createEClass(AFTER);

		conditionBasedEClass = createEClass(CONDITION_BASED);
		createEReference(conditionBasedEClass, CONDITION_BASED__CONDITION);
		createEReference(conditionBasedEClass, CONDITION_BASED__LOCATIONEVENT);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__CONDITION);
		createEReference(triggerEClass, TRIGGER__LOCATIONEVENT);

		waitEClass = createEClass(WAIT);

		descriptiveEClass = createEClass(DESCRIPTIVE);
		createEReference(descriptiveEClass, DESCRIPTIVE__PATTERN);
		createEReference(descriptiveEClass, DESCRIPTIVE__ACTION);

		reactEClass = createEClass(REACT);

		counteractEClass = createEClass(COUNTERACT);

		maximizeEClass = createEClass(MAXIMIZE);
		createEAttribute(maximizeEClass, MAXIMIZE__REWARD);

		elementaryPatternsEClass = createEClass(ELEMENTARY_PATTERNS);
		createEAttribute(elementaryPatternsEClass, ELEMENTARY_PATTERNS__MEASURE);
		createEReference(elementaryPatternsEClass, ELEMENTARY_PATTERNS__MISSION);
		createEAttribute(elementaryPatternsEClass, ELEMENTARY_PATTERNS__TYPE);

		lessThanEClass = createEClass(LESS_THAN);
		createEAttribute(lessThanEClass, LESS_THAN__VALUE);

		minimizeEClass = createEClass(MINIMIZE);

		atMostEClass = createEClass(AT_MOST);
		createEAttribute(atMostEClass, AT_MOST__VALUE);
		createEAttribute(atMostEClass, AT_MOST__REWARD);

		atLeastEClass = createEClass(AT_LEAST);
		createEAttribute(atLeastEClass, AT_LEAST__VALUE);

		greaterThanEClass = createEClass(GREATER_THAN);
		createEAttribute(greaterThanEClass, GREATER_THAN__VALUE);

		withinEClass = createEClass(WITHIN);
		createEAttribute(withinEClass, WITHIN__VALUE1);
		createEAttribute(withinEClass, WITHIN__VALUE2);
		createEAttribute(withinEClass, WITHIN__REWARD);

		strictlyWithinEClass = createEClass(STRICTLY_WITHIN);
		createEAttribute(strictlyWithinEClass, STRICTLY_WITHIN__VALUE1);
		createEAttribute(strictlyWithinEClass, STRICTLY_WITHIN__VALUE2);

		compositePatternsEClass = createEClass(COMPOSITE_PATTERNS);

		missionsEClass = createEClass(MISSIONS);

		shallMissionsEClass = createEClass(SHALL_MISSIONS);
		createEAttribute(shallMissionsEClass, SHALL_MISSIONS__ID);
		createEReference(shallMissionsEClass, SHALL_MISSIONS__MOVEMENT_PATTERNS);
		createEReference(shallMissionsEClass, SHALL_MISSIONS__ROBOTS);

		actionEndEClass = createEClass(ACTION_END);
		createEAttribute(actionEndEClass, ACTION_END__DESCRIPTION);
		createEReference(actionEndEClass, ACTION_END__ACTION);

		delayedEClass = createEClass(DELAYED);

		complexMissionsEClass = createEClass(COMPLEX_MISSIONS);
		createEReference(complexMissionsEClass, COMPLEX_MISSIONS__COMPOSITION);

		missionOperationEClass = createEClass(MISSION_OPERATION);

		negationEClass = createEClass(NEGATION);
		createEReference(negationEClass, NEGATION__NOT);

		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__BINARY_TYPE);
		createEReference(compositionEClass, COMPOSITION__MISS1);
		createEReference(compositionEClass, COMPOSITION__MISS2);

		conservationEClass = createEClass(CONSERVATION);
		createEAttribute(conservationEClass, CONSERVATION__MEASURE);

		preservationEClass = createEClass(PRESERVATION);
		createEAttribute(preservationEClass, PRESERVATION__MEASURE);
		createEAttribute(preservationEClass, PRESERVATION__VALUE1);
		createEAttribute(preservationEClass, PRESERVATION__VALUE2);

		repeatEveryEClass = createEClass(REPEAT_EVERY);

		timedEClass = createEClass(TIMED);
		createEAttribute(timedEClass, TIMED__T);

		conditionDependentEClass = createEClass(CONDITION_DEPENDENT);
		createEReference(conditionDependentEClass, CONDITION_DEPENDENT__CONDITION);
		createEReference(conditionDependentEClass, CONDITION_DEPENDENT__LOCATIONEVENT);

		actionDependentEClass = createEClass(ACTION_DEPENDENT);
		createEReference(actionDependentEClass, ACTION_DEPENDENT__ACTION);

		missionDependentEClass = createEClass(MISSION_DEPENDENT);
		createEReference(missionDependentEClass, MISSION_DEPENDENT__MISSIONS);

		maintainEClass = createEClass(MAINTAIN);

		endEClass = createEClass(END);
		createEAttribute(endEClass, END__VALUE);

		resumeIfEClass = createEClass(RESUME_IF);

		accrueEClass = createEClass(ACCRUE);
		createEAttribute(accrueEClass, ACCRUE__MEASURE);
		createEReference(accrueEClass, ACCRUE__ROBOTS);

		secureEClass = createEClass(SECURE);

		equidistanceEClass = createEClass(EQUIDISTANCE);
		createEReference(equidistanceEClass, EQUIDISTANCE__LOCATION1);
		createEReference(equidistanceEClass, EQUIDISTANCE__LOCATION2);
		createEAttribute(equidistanceEClass, EQUIDISTANCE__DISTANCE);
		createEReference(equidistanceEClass, EQUIDISTANCE__ROBOTS1);
		createEReference(equidistanceEClass, EQUIDISTANCE__ROBOTS2);
		createEReference(equidistanceEClass, EQUIDISTANCE__ROBOTS);

		trailEClass = createEClass(TRAIL);
		createEAttribute(trailEClass, TRAIL__OBJET_TO_FOLLOW);
		createEAttribute(trailEClass, TRAIL__VALUE);
		createEReference(trailEClass, TRAIL__ROBOTS);

		locationDependentEClass = createEClass(LOCATION_DEPENDENT);
		createEReference(locationDependentEClass, LOCATION_DEPENDENT__LOCATIONS);

		pauseEClass = createEClass(PAUSE);
		createEAttribute(pauseEClass, PAUSE__VALUE);

		timeoutEClass = createEClass(TIMEOUT);
		createEAttribute(timeoutEClass, TIMEOUT__VALUE);

		reliabilityConfidenceEClass = createEClass(RELIABILITY_CONFIDENCE);
		createEAttribute(reliabilityConfidenceEClass, RELIABILITY_CONFIDENCE__MEASURE);
		createEAttribute(reliabilityConfidenceEClass, RELIABILITY_CONFIDENCE__VALUE);
		createEAttribute(reliabilityConfidenceEClass, RELIABILITY_CONFIDENCE__TYPE1);
		createEAttribute(reliabilityConfidenceEClass, RELIABILITY_CONFIDENCE__TYPE2);

		levelOfConfidenceEClass = createEClass(LEVEL_OF_CONFIDENCE);
		createEAttribute(levelOfConfidenceEClass, LEVEL_OF_CONFIDENCE__CONFIDENCE);

		relaxedEClass = createEClass(RELAXED);

		almostAtEClass = createEClass(ALMOST_AT);

		exactlyAtEClass = createEClass(EXACTLY_AT);

		deadlineAtEClass = createEClass(DEADLINE_AT);

		proportionalEClass = createEClass(PROPORTIONAL);
		createEReference(proportionalEClass, PROPORTIONAL__MISSION1);
		createEReference(proportionalEClass, PROPORTIONAL__MISSION2);
		createEAttribute(proportionalEClass, PROPORTIONAL__VALUE);

		executeEClass = createEClass(EXECUTE);
		createEReference(executeEClass, EXECUTE__ROBOTS);

		setOfActionsDependentEClass = createEClass(SET_OF_ACTIONS_DEPENDENT);
		createEReference(setOfActionsDependentEClass, SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS);

		sequencingEClass = createEClass(SEQUENCING);

		deviationEClass = createEClass(DEVIATION);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__VALUE);

		topMissionsEClass = createEClass(TOP_MISSIONS);
		createEReference(topMissionsEClass, TOP_MISSIONS__MISSION);

		// Create enums
		compositionOperatorEEnum = createEEnum(COMPOSITION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		visit1EClass.getESuperTypes().add(this.getSpecificationPatterns());
		sequenceEClass.getESuperTypes().add(this.getVisit1());
		sequenceEClass.getESuperTypes().add(this.getPatrol());
		orderEClass.getESuperTypes().add(this.getVisit1());
		orderEClass.getESuperTypes().add(this.getPatrol());
		strictOrderEClass.getESuperTypes().add(this.getVisit1());
		strictOrderEClass.getESuperTypes().add(this.getPatrol());
		patrolEClass.getESuperTypes().add(this.getSpecificationPatterns());
		avoidanceVisitEClass.getESuperTypes().add(this.getSpecificationPatterns());
		restrictedEClass.getESuperTypes().add(this.getAvoidanceVisit());
		conditionalEClass.getESuperTypes().add(this.getAvoidanceVisit());
		locationEventEClass.getESuperTypes().add(this.getCondition());
		eventEClass.getESuperTypes().add(this.getCondition());
		fairEClass.getESuperTypes().add(this.getVisit1());
		fairEClass.getESuperTypes().add(this.getPatrol());
		visit2EClass.getESuperTypes().add(this.getRestricted());
		lessEClass.getESuperTypes().add(this.getRestricted());
		exactlyEClass.getESuperTypes().add(this.getRestricted());
		simpleEClass.getESuperTypes().add(this.getConditional());
		avoidEClass.getESuperTypes().add(this.getConditionBased());
		afterEClass.getESuperTypes().add(this.getConditionBased());
		conditionBasedEClass.getESuperTypes().add(this.getConditional());
		triggerEClass.getESuperTypes().add(this.getSpecificationPatterns());
		waitEClass.getESuperTypes().add(this.getTrigger());
		descriptiveEClass.getESuperTypes().add(this.getTrigger());
		reactEClass.getESuperTypes().add(this.getDescriptive());
		counteractEClass.getESuperTypes().add(this.getDescriptive());
		maximizeEClass.getESuperTypes().add(this.getElementaryPatterns());
		elementaryPatternsEClass.getESuperTypes().add(this.getMissions());
		lessThanEClass.getESuperTypes().add(this.getElementaryPatterns());
		minimizeEClass.getESuperTypes().add(this.getElementaryPatterns());
		atMostEClass.getESuperTypes().add(this.getElementaryPatterns());
		atLeastEClass.getESuperTypes().add(this.getElementaryPatterns());
		greaterThanEClass.getESuperTypes().add(this.getElementaryPatterns());
		withinEClass.getESuperTypes().add(this.getElementaryPatterns());
		strictlyWithinEClass.getESuperTypes().add(this.getElementaryPatterns());
		compositePatternsEClass.getESuperTypes().add(this.getMissions());
		shallMissionsEClass.getESuperTypes().add(this.getMissions());
		actionEndEClass.getESuperTypes().add(this.getCondition());
		delayedEClass.getESuperTypes().add(this.getReact());
		delayedEClass.getESuperTypes().add(this.getCounteract());
		complexMissionsEClass.getESuperTypes().add(this.getMissions());
		negationEClass.getESuperTypes().add(this.getMissionOperation());
		compositionEClass.getESuperTypes().add(this.getMissionOperation());
		conservationEClass.getESuperTypes().add(this.getCompositePatterns());
		conservationEClass.getESuperTypes().add(this.getMissionDependent());
		preservationEClass.getESuperTypes().add(this.getCompositePatterns());
		preservationEClass.getESuperTypes().add(this.getMissionDependent());
		repeatEveryEClass.getESuperTypes().add(this.getCompositePatterns());
		repeatEveryEClass.getESuperTypes().add(this.getTimed());
		repeatEveryEClass.getESuperTypes().add(this.getMissionDependent());
		maintainEClass.getESuperTypes().add(this.getCompositePatterns());
		maintainEClass.getESuperTypes().add(this.getConditionDependent());
		maintainEClass.getESuperTypes().add(this.getMissionDependent());
		endEClass.getESuperTypes().add(this.getCompositePatterns());
		endEClass.getESuperTypes().add(this.getConditionDependent());
		endEClass.getESuperTypes().add(this.getMissionDependent());
		resumeIfEClass.getESuperTypes().add(this.getCompositePatterns());
		resumeIfEClass.getESuperTypes().add(this.getConditionDependent());
		resumeIfEClass.getESuperTypes().add(this.getMissionDependent());
		accrueEClass.getESuperTypes().add(this.getCompositePatterns());
		accrueEClass.getESuperTypes().add(this.getMissionDependent());
		secureEClass.getESuperTypes().add(this.getCompositePatterns());
		secureEClass.getESuperTypes().add(this.getLocationDependent());
		equidistanceEClass.getESuperTypes().add(this.getCompositePatterns());
		equidistanceEClass.getESuperTypes().add(this.getMissionDependent());
		trailEClass.getESuperTypes().add(this.getCompositePatterns());
		trailEClass.getESuperTypes().add(this.getMissionDependent());
		pauseEClass.getESuperTypes().add(this.getCompositePatterns());
		pauseEClass.getESuperTypes().add(this.getTimed());
		pauseEClass.getESuperTypes().add(this.getMissionDependent());
		timeoutEClass.getESuperTypes().add(this.getCompositePatterns());
		timeoutEClass.getESuperTypes().add(this.getTimed());
		timeoutEClass.getESuperTypes().add(this.getMissionDependent());
		reliabilityConfidenceEClass.getESuperTypes().add(this.getCompositePatterns());
		reliabilityConfidenceEClass.getESuperTypes().add(this.getMissionDependent());
		reliabilityConfidenceEClass.getESuperTypes().add(this.getLevelOfConfidence());
		relaxedEClass.getESuperTypes().add(this.getCompositePatterns());
		relaxedEClass.getESuperTypes().add(this.getMissionDependent());
		relaxedEClass.getESuperTypes().add(this.getLevelOfConfidence());
		almostAtEClass.getESuperTypes().add(this.getCompositePatterns());
		almostAtEClass.getESuperTypes().add(this.getTimed());
		almostAtEClass.getESuperTypes().add(this.getMissionDependent());
		exactlyAtEClass.getESuperTypes().add(this.getCompositePatterns());
		exactlyAtEClass.getESuperTypes().add(this.getTimed());
		exactlyAtEClass.getESuperTypes().add(this.getMissionDependent());
		deadlineAtEClass.getESuperTypes().add(this.getCompositePatterns());
		deadlineAtEClass.getESuperTypes().add(this.getTimed());
		deadlineAtEClass.getESuperTypes().add(this.getMissionDependent());
		proportionalEClass.getESuperTypes().add(this.getCompositePatterns());
		executeEClass.getESuperTypes().add(this.getCompositePatterns());
		executeEClass.getESuperTypes().add(this.getSetOfActionsDependent());
		sequencingEClass.getESuperTypes().add(this.getCompositePatterns());
		sequencingEClass.getESuperTypes().add(this.getSetOfActionsDependent());
		deviationEClass.getESuperTypes().add(this.getCompositePatterns());
		deviationEClass.getESuperTypes().add(this.getSetOfActionsDependent());
		repeatEClass.getESuperTypes().add(this.getCompositePatterns());
		repeatEClass.getESuperTypes().add(this.getMissionDependent());

		// Initialize classes, features, and operations; add parameters
		initEClass(specificationPatternsEClass, SpecificationPatterns.class, "SpecificationPatterns", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationPatterns_Locations(), this.getLocation(), null, "locations", null, 0, -1, SpecificationPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationPatterns_Type(), ecorePackage.getEString(), "type", null, 0, 1, SpecificationPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visit1EClass, Visit1.class, "Visit1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(problemSpecificationsEClass, ProblemSpecifications.class, "ProblemSpecifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblemSpecifications_Condition(), this.getCondition(), null, "condition", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_Location(), this.getLocation(), null, "location", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_Action(), this.getAction(), null, "action", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_Robots(), this.getRobots(), null, "robots", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_Topmissions(), this.getTopMissions(), null, "topmissions", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_ElementaryPatterns(), this.getElementaryPatterns(), null, "elementaryPatterns", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_CompositePatterns(), this.getCompositePatterns(), null, "compositePatterns", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecifications_SpecificationPatterns(), this.getSpecificationPatterns(), null, "specificationPatterns", null, 0, -1, ProblemSpecifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strictOrderEClass, StrictOrder.class, "StrictOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patrolEClass, Patrol.class, "Patrol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avoidanceVisitEClass, AvoidanceVisit.class, "AvoidanceVisit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restrictedEClass, Restricted.class, "Restricted", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestricted_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Restricted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEventEClass, LocationEvent.class, "LocationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationEvent_Robots(), this.getRobots(), null, "robots", null, 1, 1, LocationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationEvent_Location(), this.getLocation(), null, "location", null, 1, 1, LocationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotsEClass, Robots.class, "Robots", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobots_Name(), ecorePackage.getEString(), "name", null, 0, 1, Robots.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fairEClass, Fair.class, "Fair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visit2EClass, Visit2.class, "Visit2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEClass, Less.class, "Less", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exactlyEClass, Exactly.class, "Exactly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avoidEClass, Avoid.class, "Avoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(afterEClass, After.class, "After", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionBasedEClass, ConditionBased.class, "ConditionBased", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionBased_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionBased.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionBased_Locationevent(), this.getLocationEvent(), null, "locationevent", null, 0, 1, ConditionBased.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Condition(), this.getCondition(), null, "condition", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Locationevent(), this.getLocationEvent(), null, "locationevent", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveEClass, Descriptive.class, "Descriptive", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptive_Pattern(), this.getSpecificationPatterns(), null, "pattern", null, 0, 1, Descriptive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptive_Action(), this.getAction(), null, "action", null, 0, 1, Descriptive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactEClass, React.class, "React", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(counteractEClass, Counteract.class, "Counteract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maximizeEClass, Maximize.class, "Maximize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximize_Reward(), ecorePackage.getEString(), "reward", "reward", 0, 1, Maximize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryPatternsEClass, ElementaryPatterns.class, "ElementaryPatterns", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementaryPatterns_Measure(), ecorePackage.getEString(), "measure", null, 1, 1, ElementaryPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementaryPatterns_Mission(), this.getMissions(), null, "mission", null, 0, 1, ElementaryPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryPatterns_Type(), ecorePackage.getEString(), "type", null, 1, 1, ElementaryPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLessThan_Value(), ecorePackage.getEInt(), "value", null, 1, 1, LessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimizeEClass, Minimize.class, "Minimize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atMostEClass, AtMost.class, "AtMost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtMost_Value(), ecorePackage.getEInt(), "value", null, 1, 1, AtMost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtMost_Reward(), ecorePackage.getEString(), "reward", "reward", 0, 1, AtMost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atLeastEClass, AtLeast.class, "AtLeast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtLeast_Value(), ecorePackage.getEInt(), "value", null, 1, 1, AtLeast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGreaterThan_Value(), ecorePackage.getEInt(), "value", null, 1, 1, GreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(withinEClass, Within.class, "Within", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWithin_Value1(), ecorePackage.getEInt(), "value1", null, 1, 1, Within.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithin_Value2(), ecorePackage.getEInt(), "value2", null, 1, 1, Within.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithin_Reward(), ecorePackage.getEString(), "reward", "reward", 0, 1, Within.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strictlyWithinEClass, StrictlyWithin.class, "StrictlyWithin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrictlyWithin_Value1(), ecorePackage.getEInt(), "value1", null, 1, 1, StrictlyWithin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrictlyWithin_Value2(), ecorePackage.getEInt(), "value2", null, 1, 1, StrictlyWithin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositePatternsEClass, CompositePatterns.class, "CompositePatterns", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(missionsEClass, Missions.class, "Missions", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shallMissionsEClass, ShallMissions.class, "ShallMissions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShallMissions_Id(), ecorePackage.getEString(), "id", null, 0, 1, ShallMissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShallMissions_MovementPatterns(), this.getSpecificationPatterns(), null, "movementPatterns", null, 0, -1, ShallMissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShallMissions_Robots(), this.getRobots(), null, "robots", null, 1, 1, ShallMissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEndEClass, ActionEnd.class, "ActionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionEnd_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionEnd_Action(), this.getAction(), null, "action", null, 1, 1, ActionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayedEClass, Delayed.class, "Delayed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexMissionsEClass, ComplexMissions.class, "ComplexMissions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexMissions_Composition(), this.getMissionOperation(), null, "composition", null, 1, 1, ComplexMissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionOperationEClass, MissionOperation.class, "MissionOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegation_Not(), this.getMissions(), null, "not", null, 1, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_BinaryType(), this.getCompositionOperator(), "binaryType", null, 0, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Miss1(), this.getMissions(), null, "miss1", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Miss2(), this.getMissions(), null, "miss2", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conservationEClass, Conservation.class, "Conservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConservation_Measure(), ecorePackage.getEString(), "measure", null, 1, 1, Conservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preservationEClass, Preservation.class, "Preservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreservation_Measure(), ecorePackage.getEString(), "measure", null, 1, 1, Preservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreservation_Value1(), ecorePackage.getEInt(), "value1", null, 1, 1, Preservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreservation_Value2(), ecorePackage.getEInt(), "value2", null, 1, 1, Preservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEveryEClass, RepeatEvery.class, "RepeatEvery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedEClass, Timed.class, "Timed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimed_T(), ecorePackage.getEInt(), "t", null, 1, 1, Timed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionDependentEClass, ConditionDependent.class, "ConditionDependent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionDependent_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionDependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionDependent_Locationevent(), this.getLocationEvent(), null, "locationevent", null, 0, -1, ConditionDependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDependentEClass, ActionDependent.class, "ActionDependent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDependent_Action(), this.getAction(), null, "action", null, 1, 1, ActionDependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionDependentEClass, MissionDependent.class, "MissionDependent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMissionDependent_Missions(), this.getMissions(), null, "missions", null, 1, 1, MissionDependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maintainEClass, Maintain.class, "Maintain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnd_Value(), ecorePackage.getEInt(), "value", null, 1, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resumeIfEClass, ResumeIf.class, "ResumeIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accrueEClass, Accrue.class, "Accrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccrue_Measure(), ecorePackage.getEString(), "measure", null, 1, 1, Accrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccrue_Robots(), this.getRobots(), null, "robots", null, 1, 1, Accrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secureEClass, Secure.class, "Secure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equidistanceEClass, Equidistance.class, "Equidistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquidistance_Location1(), this.getLocation(), null, "location1", null, 0, 1, Equidistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquidistance_Location2(), this.getLocation(), null, "location2", null, 0, 1, Equidistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquidistance_Distance(), ecorePackage.getEInt(), "distance", null, 1, 1, Equidistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquidistance_Robots1(), this.getRobots(), null, "robots1", null, 1, 1, Equidistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquidistance_Robots2(), this.getRobots(), null, "robots2", null, 1, 1, Equidistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquidistance_Robots(), this.getRobots(), null, "robots", null, 1, 1, Equidistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trailEClass, Trail.class, "Trail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrail_ObjetToFollow(), ecorePackage.getEString(), "objetToFollow", null, 1, 1, Trail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrail_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Trail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrail_Robots(), this.getRobots(), null, "robots", null, 1, 1, Trail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationDependentEClass, LocationDependent.class, "LocationDependent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationDependent_Locations(), this.getLocation(), null, "locations", null, 1, -1, LocationDependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pauseEClass, Pause.class, "Pause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPause_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Pause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeoutEClass, Timeout.class, "Timeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeout_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Timeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reliabilityConfidenceEClass, ReliabilityConfidence.class, "ReliabilityConfidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReliabilityConfidence_Measure(), ecorePackage.getEString(), "measure", null, 1, 1, ReliabilityConfidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliabilityConfidence_Value(), ecorePackage.getEInt(), "value", null, 1, 1, ReliabilityConfidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliabilityConfidence_Type1(), ecorePackage.getEString(), "type1", null, 1, 1, ReliabilityConfidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliabilityConfidence_Type2(), ecorePackage.getEString(), "type2", null, 1, 1, ReliabilityConfidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelOfConfidenceEClass, LevelOfConfidence.class, "LevelOfConfidence", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelOfConfidence_Confidence(), ecorePackage.getEInt(), "confidence", null, 1, 1, LevelOfConfidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relaxedEClass, Relaxed.class, "Relaxed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(almostAtEClass, AlmostAt.class, "AlmostAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exactlyAtEClass, ExactlyAt.class, "ExactlyAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadlineAtEClass, DeadlineAt.class, "DeadlineAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proportionalEClass, Proportional.class, "Proportional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProportional_Mission1(), this.getMissions(), null, "mission1", null, 1, 1, Proportional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProportional_Mission2(), this.getMissions(), null, "mission2", null, 1, 1, Proportional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProportional_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Proportional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executeEClass, Execute.class, "Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecute_Robots(), this.getRobots(), null, "robots", null, 1, 1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setOfActionsDependentEClass, SetOfActionsDependent.class, "SetOfActionsDependent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOfActionsDependent_SetOfActions(), this.getAction(), null, "setOfActions", null, 1, -1, SetOfActionsDependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequencingEClass, Sequencing.class, "Sequencing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviationEClass, Deviation.class, "Deviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topMissionsEClass, TopMissions.class, "TopMissions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopMissions_Mission(), this.getMissions(), null, "mission", null, 1, 1, TopMissions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(compositionOperatorEEnum, CompositionOperator.class, "CompositionOperator");
		addEEnumLiteral(compositionOperatorEEnum, CompositionOperator.AND);
		addEEnumLiteral(compositionOperatorEEnum, CompositionOperator.OR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //PatternsPackageImpl
