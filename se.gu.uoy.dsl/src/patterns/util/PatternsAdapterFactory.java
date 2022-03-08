/**
 */
package patterns.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import patterns.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see patterns.PatternsPackage
 * @generated
 */
public class PatternsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternsSwitch<Adapter> modelSwitch =
		new PatternsSwitch<Adapter>() {
			@Override
			public Adapter caseSpecificationPatterns(SpecificationPatterns object) {
				return createSpecificationPatternsAdapter();
			}
			@Override
			public Adapter caseVisit1(Visit1 object) {
				return createVisit1Adapter();
			}
			@Override
			public Adapter caseProblemSpecifications(ProblemSpecifications object) {
				return createProblemSpecificationsAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseStrictOrder(StrictOrder object) {
				return createStrictOrderAdapter();
			}
			@Override
			public Adapter casePatrol(Patrol object) {
				return createPatrolAdapter();
			}
			@Override
			public Adapter caseAvoidanceVisit(AvoidanceVisit object) {
				return createAvoidanceVisitAdapter();
			}
			@Override
			public Adapter caseRestricted(Restricted object) {
				return createRestrictedAdapter();
			}
			@Override
			public Adapter caseConditional(Conditional object) {
				return createConditionalAdapter();
			}
			@Override
			public Adapter caseLocationEvent(LocationEvent object) {
				return createLocationEventAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseRobots(Robots object) {
				return createRobotsAdapter();
			}
			@Override
			public Adapter caseFair(Fair object) {
				return createFairAdapter();
			}
			@Override
			public Adapter caseVisit2(Visit2 object) {
				return createVisit2Adapter();
			}
			@Override
			public Adapter caseLess(Less object) {
				return createLessAdapter();
			}
			@Override
			public Adapter caseExactly(Exactly object) {
				return createExactlyAdapter();
			}
			@Override
			public Adapter caseSimple(Simple object) {
				return createSimpleAdapter();
			}
			@Override
			public Adapter caseAvoid(Avoid object) {
				return createAvoidAdapter();
			}
			@Override
			public Adapter caseAfter(After object) {
				return createAfterAdapter();
			}
			@Override
			public Adapter caseConditionBased(ConditionBased object) {
				return createConditionBasedAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseWait(Wait object) {
				return createWaitAdapter();
			}
			@Override
			public Adapter caseDescriptive(Descriptive object) {
				return createDescriptiveAdapter();
			}
			@Override
			public Adapter caseReact(React object) {
				return createReactAdapter();
			}
			@Override
			public Adapter caseCounteract(Counteract object) {
				return createCounteractAdapter();
			}
			@Override
			public Adapter caseMaximize(Maximize object) {
				return createMaximizeAdapter();
			}
			@Override
			public Adapter caseElementaryPatterns(ElementaryPatterns object) {
				return createElementaryPatternsAdapter();
			}
			@Override
			public Adapter caseLessThan(LessThan object) {
				return createLessThanAdapter();
			}
			@Override
			public Adapter caseMinimize(Minimize object) {
				return createMinimizeAdapter();
			}
			@Override
			public Adapter caseAtMost(AtMost object) {
				return createAtMostAdapter();
			}
			@Override
			public Adapter caseAtLeast(AtLeast object) {
				return createAtLeastAdapter();
			}
			@Override
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseWithin(Within object) {
				return createWithinAdapter();
			}
			@Override
			public Adapter caseStrictlyWithin(StrictlyWithin object) {
				return createStrictlyWithinAdapter();
			}
			@Override
			public Adapter caseCompositePatterns(CompositePatterns object) {
				return createCompositePatternsAdapter();
			}
			@Override
			public Adapter caseMissions(Missions object) {
				return createMissionsAdapter();
			}
			@Override
			public Adapter caseShallMissions(ShallMissions object) {
				return createShallMissionsAdapter();
			}
			@Override
			public Adapter caseActionEnd(ActionEnd object) {
				return createActionEndAdapter();
			}
			@Override
			public Adapter caseDelayed(Delayed object) {
				return createDelayedAdapter();
			}
			@Override
			public Adapter caseComplexMissions(ComplexMissions object) {
				return createComplexMissionsAdapter();
			}
			@Override
			public Adapter caseMissionOperation(MissionOperation object) {
				return createMissionOperationAdapter();
			}
			@Override
			public Adapter caseNegation(Negation object) {
				return createNegationAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseConservation(Conservation object) {
				return createConservationAdapter();
			}
			@Override
			public Adapter casePreservation(Preservation object) {
				return createPreservationAdapter();
			}
			@Override
			public Adapter caseRepeatEvery(RepeatEvery object) {
				return createRepeatEveryAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseConditionDependent(ConditionDependent object) {
				return createConditionDependentAdapter();
			}
			@Override
			public Adapter caseActionDependent(ActionDependent object) {
				return createActionDependentAdapter();
			}
			@Override
			public Adapter caseMissionDependent(MissionDependent object) {
				return createMissionDependentAdapter();
			}
			@Override
			public Adapter caseMaintain(Maintain object) {
				return createMaintainAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseResumeIf(ResumeIf object) {
				return createResumeIfAdapter();
			}
			@Override
			public Adapter caseAccrue(Accrue object) {
				return createAccrueAdapter();
			}
			@Override
			public Adapter caseSecure(Secure object) {
				return createSecureAdapter();
			}
			@Override
			public Adapter caseEquidistance(Equidistance object) {
				return createEquidistanceAdapter();
			}
			@Override
			public Adapter caseTrail(Trail object) {
				return createTrailAdapter();
			}
			@Override
			public Adapter caseLocationDependent(LocationDependent object) {
				return createLocationDependentAdapter();
			}
			@Override
			public Adapter casePause(Pause object) {
				return createPauseAdapter();
			}
			@Override
			public Adapter caseTimeout(Timeout object) {
				return createTimeoutAdapter();
			}
			@Override
			public Adapter caseReliabilityConfidence(ReliabilityConfidence object) {
				return createReliabilityConfidenceAdapter();
			}
			@Override
			public Adapter caseLevelOfConfidence(LevelOfConfidence object) {
				return createLevelOfConfidenceAdapter();
			}
			@Override
			public Adapter caseRelaxed(Relaxed object) {
				return createRelaxedAdapter();
			}
			@Override
			public Adapter caseAlmostAt(AlmostAt object) {
				return createAlmostAtAdapter();
			}
			@Override
			public Adapter caseExactlyAt(ExactlyAt object) {
				return createExactlyAtAdapter();
			}
			@Override
			public Adapter caseDeadlineAt(DeadlineAt object) {
				return createDeadlineAtAdapter();
			}
			@Override
			public Adapter caseProportional(Proportional object) {
				return createProportionalAdapter();
			}
			@Override
			public Adapter caseExecute(Execute object) {
				return createExecuteAdapter();
			}
			@Override
			public Adapter caseSetOfActionsDependent(SetOfActionsDependent object) {
				return createSetOfActionsDependentAdapter();
			}
			@Override
			public Adapter caseSequencing(Sequencing object) {
				return createSequencingAdapter();
			}
			@Override
			public Adapter caseDeviation(Deviation object) {
				return createDeviationAdapter();
			}
			@Override
			public Adapter caseRepeat(Repeat object) {
				return createRepeatAdapter();
			}
			@Override
			public Adapter caseTopMissions(TopMissions object) {
				return createTopMissionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link patterns.SpecificationPatterns <em>Specification Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.SpecificationPatterns
	 * @generated
	 */
	public Adapter createSpecificationPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Visit1 <em>Visit1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Visit1
	 * @generated
	 */
	public Adapter createVisit1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ProblemSpecifications <em>Problem Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ProblemSpecifications
	 * @generated
	 */
	public Adapter createProblemSpecificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.StrictOrder <em>Strict Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.StrictOrder
	 * @generated
	 */
	public Adapter createStrictOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Patrol <em>Patrol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Patrol
	 * @generated
	 */
	public Adapter createPatrolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.AvoidanceVisit <em>Avoidance Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.AvoidanceVisit
	 * @generated
	 */
	public Adapter createAvoidanceVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Restricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Restricted
	 * @generated
	 */
	public Adapter createRestrictedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Conditional
	 * @generated
	 */
	public Adapter createConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.LocationEvent <em>Location Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.LocationEvent
	 * @generated
	 */
	public Adapter createLocationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Robots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Robots
	 * @generated
	 */
	public Adapter createRobotsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Fair <em>Fair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Fair
	 * @generated
	 */
	public Adapter createFairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Visit2 <em>Visit2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Visit2
	 * @generated
	 */
	public Adapter createVisit2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Exactly <em>Exactly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Exactly
	 * @generated
	 */
	public Adapter createExactlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Avoid <em>Avoid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Avoid
	 * @generated
	 */
	public Adapter createAvoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.After
	 * @generated
	 */
	public Adapter createAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ConditionBased <em>Condition Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ConditionBased
	 * @generated
	 */
	public Adapter createConditionBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Descriptive <em>Descriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Descriptive
	 * @generated
	 */
	public Adapter createDescriptiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.React <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.React
	 * @generated
	 */
	public Adapter createReactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Counteract <em>Counteract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Counteract
	 * @generated
	 */
	public Adapter createCounteractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Maximize <em>Maximize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Maximize
	 * @generated
	 */
	public Adapter createMaximizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ElementaryPatterns <em>Elementary Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ElementaryPatterns
	 * @generated
	 */
	public Adapter createElementaryPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Minimize <em>Minimize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Minimize
	 * @generated
	 */
	public Adapter createMinimizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.AtMost <em>At Most</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.AtMost
	 * @generated
	 */
	public Adapter createAtMostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.AtLeast <em>At Least</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.AtLeast
	 * @generated
	 */
	public Adapter createAtLeastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Within <em>Within</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Within
	 * @generated
	 */
	public Adapter createWithinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.StrictlyWithin <em>Strictly Within</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.StrictlyWithin
	 * @generated
	 */
	public Adapter createStrictlyWithinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.CompositePatterns <em>Composite Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.CompositePatterns
	 * @generated
	 */
	public Adapter createCompositePatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Missions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Missions
	 * @generated
	 */
	public Adapter createMissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ShallMissions <em>Shall Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ShallMissions
	 * @generated
	 */
	public Adapter createShallMissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ActionEnd <em>Action End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ActionEnd
	 * @generated
	 */
	public Adapter createActionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Delayed <em>Delayed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Delayed
	 * @generated
	 */
	public Adapter createDelayedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ComplexMissions <em>Complex Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ComplexMissions
	 * @generated
	 */
	public Adapter createComplexMissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.MissionOperation <em>Mission Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.MissionOperation
	 * @generated
	 */
	public Adapter createMissionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Conservation <em>Conservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Conservation
	 * @generated
	 */
	public Adapter createConservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Preservation <em>Preservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Preservation
	 * @generated
	 */
	public Adapter createPreservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.RepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.RepeatEvery
	 * @generated
	 */
	public Adapter createRepeatEveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Timed
	 * @generated
	 */
	public Adapter createTimedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ConditionDependent <em>Condition Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ConditionDependent
	 * @generated
	 */
	public Adapter createConditionDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ActionDependent <em>Action Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ActionDependent
	 * @generated
	 */
	public Adapter createActionDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.MissionDependent <em>Mission Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.MissionDependent
	 * @generated
	 */
	public Adapter createMissionDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Maintain <em>Maintain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Maintain
	 * @generated
	 */
	public Adapter createMaintainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ResumeIf <em>Resume If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ResumeIf
	 * @generated
	 */
	public Adapter createResumeIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Accrue <em>Accrue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Accrue
	 * @generated
	 */
	public Adapter createAccrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Secure <em>Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Secure
	 * @generated
	 */
	public Adapter createSecureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Equidistance <em>Equidistance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Equidistance
	 * @generated
	 */
	public Adapter createEquidistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Trail <em>Trail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Trail
	 * @generated
	 */
	public Adapter createTrailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.LocationDependent <em>Location Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.LocationDependent
	 * @generated
	 */
	public Adapter createLocationDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Pause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Pause
	 * @generated
	 */
	public Adapter createPauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ReliabilityConfidence <em>Reliability Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ReliabilityConfidence
	 * @generated
	 */
	public Adapter createReliabilityConfidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.LevelOfConfidence <em>Level Of Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.LevelOfConfidence
	 * @generated
	 */
	public Adapter createLevelOfConfidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Relaxed <em>Relaxed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Relaxed
	 * @generated
	 */
	public Adapter createRelaxedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.AlmostAt <em>Almost At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.AlmostAt
	 * @generated
	 */
	public Adapter createAlmostAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.ExactlyAt <em>Exactly At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.ExactlyAt
	 * @generated
	 */
	public Adapter createExactlyAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.DeadlineAt <em>Deadline At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.DeadlineAt
	 * @generated
	 */
	public Adapter createDeadlineAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Proportional <em>Proportional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Proportional
	 * @generated
	 */
	public Adapter createProportionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Execute
	 * @generated
	 */
	public Adapter createExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.SetOfActionsDependent <em>Set Of Actions Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.SetOfActionsDependent
	 * @generated
	 */
	public Adapter createSetOfActionsDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Sequencing <em>Sequencing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Sequencing
	 * @generated
	 */
	public Adapter createSequencingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Deviation
	 * @generated
	 */
	public Adapter createDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patterns.TopMissions <em>Top Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patterns.TopMissions
	 * @generated
	 */
	public Adapter createTopMissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PatternsAdapterFactory
