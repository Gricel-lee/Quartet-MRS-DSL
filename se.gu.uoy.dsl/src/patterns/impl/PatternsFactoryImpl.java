/**
 */
package patterns.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import patterns.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsFactoryImpl extends EFactoryImpl implements PatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternsFactory init() {
		try {
			PatternsFactory thePatternsFactory = (PatternsFactory)EPackage.Registry.INSTANCE.getEFactory(PatternsPackage.eNS_URI);
			if (thePatternsFactory != null) {
				return thePatternsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatternsPackage.VISIT1: return createVisit1();
			case PatternsPackage.PROBLEM_SPECIFICATIONS: return createProblemSpecifications();
			case PatternsPackage.LOCATION: return createLocation();
			case PatternsPackage.ACTION: return createAction();
			case PatternsPackage.SEQUENCE: return createSequence();
			case PatternsPackage.ORDER: return createOrder();
			case PatternsPackage.STRICT_ORDER: return createStrictOrder();
			case PatternsPackage.PATROL: return createPatrol();
			case PatternsPackage.LOCATION_EVENT: return createLocationEvent();
			case PatternsPackage.EVENT: return createEvent();
			case PatternsPackage.ROBOTS: return createRobots();
			case PatternsPackage.FAIR: return createFair();
			case PatternsPackage.VISIT2: return createVisit2();
			case PatternsPackage.LESS: return createLess();
			case PatternsPackage.EXACTLY: return createExactly();
			case PatternsPackage.SIMPLE: return createSimple();
			case PatternsPackage.AVOID: return createAvoid();
			case PatternsPackage.AFTER: return createAfter();
			case PatternsPackage.WAIT: return createWait();
			case PatternsPackage.REACT: return createReact();
			case PatternsPackage.COUNTERACT: return createCounteract();
			case PatternsPackage.MAXIMIZE: return createMaximize();
			case PatternsPackage.LESS_THAN: return createLessThan();
			case PatternsPackage.MINIMIZE: return createMinimize();
			case PatternsPackage.AT_MOST: return createAtMost();
			case PatternsPackage.AT_LEAST: return createAtLeast();
			case PatternsPackage.GREATER_THAN: return createGreaterThan();
			case PatternsPackage.WITHIN: return createWithin();
			case PatternsPackage.STRICTLY_WITHIN: return createStrictlyWithin();
			case PatternsPackage.SHALL_MISSIONS: return createShallMissions();
			case PatternsPackage.ACTION_END: return createActionEnd();
			case PatternsPackage.DELAYED: return createDelayed();
			case PatternsPackage.COMPLEX_MISSIONS: return createComplexMissions();
			case PatternsPackage.NEGATION: return createNegation();
			case PatternsPackage.COMPOSITION: return createComposition();
			case PatternsPackage.CONSERVATION: return createConservation();
			case PatternsPackage.PRESERVATION: return createPreservation();
			case PatternsPackage.REPEAT_EVERY: return createRepeatEvery();
			case PatternsPackage.MAINTAIN: return createMaintain();
			case PatternsPackage.END: return createEnd();
			case PatternsPackage.RESUME_IF: return createResumeIf();
			case PatternsPackage.ACCRUE: return createAccrue();
			case PatternsPackage.SECURE: return createSecure();
			case PatternsPackage.EQUIDISTANCE: return createEquidistance();
			case PatternsPackage.TRAIL: return createTrail();
			case PatternsPackage.PAUSE: return createPause();
			case PatternsPackage.TIMEOUT: return createTimeout();
			case PatternsPackage.RELIABILITY_CONFIDENCE: return createReliabilityConfidence();
			case PatternsPackage.RELAXED: return createRelaxed();
			case PatternsPackage.ALMOST_AT: return createAlmostAt();
			case PatternsPackage.EXACTLY_AT: return createExactlyAt();
			case PatternsPackage.DEADLINE_AT: return createDeadlineAt();
			case PatternsPackage.PROPORTIONAL: return createProportional();
			case PatternsPackage.EXECUTE: return createExecute();
			case PatternsPackage.SEQUENCING: return createSequencing();
			case PatternsPackage.DEVIATION: return createDeviation();
			case PatternsPackage.REPEAT: return createRepeat();
			case PatternsPackage.TOP_MISSIONS: return createTopMissions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PatternsPackage.COMPOSITION_OPERATOR:
				return createCompositionOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PatternsPackage.COMPOSITION_OPERATOR:
				return convertCompositionOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visit1 createVisit1() {
		Visit1Impl visit1 = new Visit1Impl();
		return visit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSpecifications createProblemSpecifications() {
		ProblemSpecificationsImpl problemSpecifications = new ProblemSpecificationsImpl();
		return problemSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictOrder createStrictOrder() {
		StrictOrderImpl strictOrder = new StrictOrderImpl();
		return strictOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patrol createPatrol() {
		PatrolImpl patrol = new PatrolImpl();
		return patrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationEvent createLocationEvent() {
		LocationEventImpl locationEvent = new LocationEventImpl();
		return locationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots createRobots() {
		RobotsImpl robots = new RobotsImpl();
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fair createFair() {
		FairImpl fair = new FairImpl();
		return fair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visit2 createVisit2() {
		Visit2Impl visit2 = new Visit2Impl();
		return visit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exactly createExactly() {
		ExactlyImpl exactly = new ExactlyImpl();
		return exactly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avoid createAvoid() {
		AvoidImpl avoid = new AvoidImpl();
		return avoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public After createAfter() {
		AfterImpl after = new AfterImpl();
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public React createReact() {
		ReactImpl react = new ReactImpl();
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counteract createCounteract() {
		CounteractImpl counteract = new CounteractImpl();
		return counteract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maximize createMaximize() {
		MaximizeImpl maximize = new MaximizeImpl();
		return maximize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minimize createMinimize() {
		MinimizeImpl minimize = new MinimizeImpl();
		return minimize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtMost createAtMost() {
		AtMostImpl atMost = new AtMostImpl();
		return atMost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtLeast createAtLeast() {
		AtLeastImpl atLeast = new AtLeastImpl();
		return atLeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Within createWithin() {
		WithinImpl within = new WithinImpl();
		return within;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictlyWithin createStrictlyWithin() {
		StrictlyWithinImpl strictlyWithin = new StrictlyWithinImpl();
		return strictlyWithin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShallMissions createShallMissions() {
		ShallMissionsImpl shallMissions = new ShallMissionsImpl();
		return shallMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnd createActionEnd() {
		ActionEndImpl actionEnd = new ActionEndImpl();
		return actionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delayed createDelayed() {
		DelayedImpl delayed = new DelayedImpl();
		return delayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMissions createComplexMissions() {
		ComplexMissionsImpl complexMissions = new ComplexMissionsImpl();
		return complexMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conservation createConservation() {
		ConservationImpl conservation = new ConservationImpl();
		return conservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preservation createPreservation() {
		PreservationImpl preservation = new PreservationImpl();
		return preservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatEvery createRepeatEvery() {
		RepeatEveryImpl repeatEvery = new RepeatEveryImpl();
		return repeatEvery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maintain createMaintain() {
		MaintainImpl maintain = new MaintainImpl();
		return maintain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResumeIf createResumeIf() {
		ResumeIfImpl resumeIf = new ResumeIfImpl();
		return resumeIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accrue createAccrue() {
		AccrueImpl accrue = new AccrueImpl();
		return accrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secure createSecure() {
		SecureImpl secure = new SecureImpl();
		return secure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equidistance createEquidistance() {
		EquidistanceImpl equidistance = new EquidistanceImpl();
		return equidistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trail createTrail() {
		TrailImpl trail = new TrailImpl();
		return trail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pause createPause() {
		PauseImpl pause = new PauseImpl();
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeout createTimeout() {
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityConfidence createReliabilityConfidence() {
		ReliabilityConfidenceImpl reliabilityConfidence = new ReliabilityConfidenceImpl();
		return reliabilityConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relaxed createRelaxed() {
		RelaxedImpl relaxed = new RelaxedImpl();
		return relaxed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlmostAt createAlmostAt() {
		AlmostAtImpl almostAt = new AlmostAtImpl();
		return almostAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactlyAt createExactlyAt() {
		ExactlyAtImpl exactlyAt = new ExactlyAtImpl();
		return exactlyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineAt createDeadlineAt() {
		DeadlineAtImpl deadlineAt = new DeadlineAtImpl();
		return deadlineAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proportional createProportional() {
		ProportionalImpl proportional = new ProportionalImpl();
		return proportional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execute createExecute() {
		ExecuteImpl execute = new ExecuteImpl();
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequencing createSequencing() {
		SequencingImpl sequencing = new SequencingImpl();
		return sequencing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation createDeviation() {
		DeviationImpl deviation = new DeviationImpl();
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopMissions createTopMissions() {
		TopMissionsImpl topMissions = new TopMissionsImpl();
		return topMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionOperator createCompositionOperatorFromString(EDataType eDataType, String initialValue) {
		CompositionOperator result = CompositionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsPackage getPatternsPackage() {
		return (PatternsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternsPackage getPackage() {
		return PatternsPackage.eINSTANCE;
	}

} //PatternsFactoryImpl
