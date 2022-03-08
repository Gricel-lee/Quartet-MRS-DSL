/**
 */
package patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import patterns.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see patterns.PatternsPackage
 * @generated
 */
public class PatternsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PatternsPackage.SPECIFICATION_PATTERNS: {
				SpecificationPatterns specificationPatterns = (SpecificationPatterns)theEObject;
				T result = caseSpecificationPatterns(specificationPatterns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.VISIT1: {
				Visit1 visit1 = (Visit1)theEObject;
				T result = caseVisit1(visit1);
				if (result == null) result = caseSpecificationPatterns(visit1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PROBLEM_SPECIFICATIONS: {
				ProblemSpecifications problemSpecifications = (ProblemSpecifications)theEObject;
				T result = caseProblemSpecifications(problemSpecifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseVisit1(sequence);
				if (result == null) result = casePatrol(sequence);
				if (result == null) result = caseSpecificationPatterns(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = caseVisit1(order);
				if (result == null) result = casePatrol(order);
				if (result == null) result = caseSpecificationPatterns(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.STRICT_ORDER: {
				StrictOrder strictOrder = (StrictOrder)theEObject;
				T result = caseStrictOrder(strictOrder);
				if (result == null) result = caseVisit1(strictOrder);
				if (result == null) result = casePatrol(strictOrder);
				if (result == null) result = caseSpecificationPatterns(strictOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PATROL: {
				Patrol patrol = (Patrol)theEObject;
				T result = casePatrol(patrol);
				if (result == null) result = caseSpecificationPatterns(patrol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.AVOIDANCE_VISIT: {
				AvoidanceVisit avoidanceVisit = (AvoidanceVisit)theEObject;
				T result = caseAvoidanceVisit(avoidanceVisit);
				if (result == null) result = caseSpecificationPatterns(avoidanceVisit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.RESTRICTED: {
				Restricted restricted = (Restricted)theEObject;
				T result = caseRestricted(restricted);
				if (result == null) result = caseAvoidanceVisit(restricted);
				if (result == null) result = caseSpecificationPatterns(restricted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseAvoidanceVisit(conditional);
				if (result == null) result = caseSpecificationPatterns(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.LOCATION_EVENT: {
				LocationEvent locationEvent = (LocationEvent)theEObject;
				T result = caseLocationEvent(locationEvent);
				if (result == null) result = caseCondition(locationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseCondition(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ROBOTS: {
				Robots robots = (Robots)theEObject;
				T result = caseRobots(robots);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.FAIR: {
				Fair fair = (Fair)theEObject;
				T result = caseFair(fair);
				if (result == null) result = caseVisit1(fair);
				if (result == null) result = casePatrol(fair);
				if (result == null) result = caseSpecificationPatterns(fair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.VISIT2: {
				Visit2 visit2 = (Visit2)theEObject;
				T result = caseVisit2(visit2);
				if (result == null) result = caseRestricted(visit2);
				if (result == null) result = caseAvoidanceVisit(visit2);
				if (result == null) result = caseSpecificationPatterns(visit2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseRestricted(less);
				if (result == null) result = caseAvoidanceVisit(less);
				if (result == null) result = caseSpecificationPatterns(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.EXACTLY: {
				Exactly exactly = (Exactly)theEObject;
				T result = caseExactly(exactly);
				if (result == null) result = caseRestricted(exactly);
				if (result == null) result = caseAvoidanceVisit(exactly);
				if (result == null) result = caseSpecificationPatterns(exactly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SIMPLE: {
				Simple simple = (Simple)theEObject;
				T result = caseSimple(simple);
				if (result == null) result = caseConditional(simple);
				if (result == null) result = caseAvoidanceVisit(simple);
				if (result == null) result = caseSpecificationPatterns(simple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.AVOID: {
				Avoid avoid = (Avoid)theEObject;
				T result = caseAvoid(avoid);
				if (result == null) result = caseConditionBased(avoid);
				if (result == null) result = caseConditional(avoid);
				if (result == null) result = caseAvoidanceVisit(avoid);
				if (result == null) result = caseSpecificationPatterns(avoid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.AFTER: {
				After after = (After)theEObject;
				T result = caseAfter(after);
				if (result == null) result = caseConditionBased(after);
				if (result == null) result = caseConditional(after);
				if (result == null) result = caseAvoidanceVisit(after);
				if (result == null) result = caseSpecificationPatterns(after);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CONDITION_BASED: {
				ConditionBased conditionBased = (ConditionBased)theEObject;
				T result = caseConditionBased(conditionBased);
				if (result == null) result = caseConditional(conditionBased);
				if (result == null) result = caseAvoidanceVisit(conditionBased);
				if (result == null) result = caseSpecificationPatterns(conditionBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseSpecificationPatterns(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseTrigger(wait);
				if (result == null) result = caseSpecificationPatterns(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.DESCRIPTIVE: {
				Descriptive descriptive = (Descriptive)theEObject;
				T result = caseDescriptive(descriptive);
				if (result == null) result = caseTrigger(descriptive);
				if (result == null) result = caseSpecificationPatterns(descriptive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.REACT: {
				React react = (React)theEObject;
				T result = caseReact(react);
				if (result == null) result = caseDescriptive(react);
				if (result == null) result = caseTrigger(react);
				if (result == null) result = caseSpecificationPatterns(react);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.COUNTERACT: {
				Counteract counteract = (Counteract)theEObject;
				T result = caseCounteract(counteract);
				if (result == null) result = caseDescriptive(counteract);
				if (result == null) result = caseTrigger(counteract);
				if (result == null) result = caseSpecificationPatterns(counteract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.MAXIMIZE: {
				Maximize maximize = (Maximize)theEObject;
				T result = caseMaximize(maximize);
				if (result == null) result = caseElementaryPatterns(maximize);
				if (result == null) result = caseMissions(maximize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ELEMENTARY_PATTERNS: {
				ElementaryPatterns elementaryPatterns = (ElementaryPatterns)theEObject;
				T result = caseElementaryPatterns(elementaryPatterns);
				if (result == null) result = caseMissions(elementaryPatterns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseElementaryPatterns(lessThan);
				if (result == null) result = caseMissions(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.MINIMIZE: {
				Minimize minimize = (Minimize)theEObject;
				T result = caseMinimize(minimize);
				if (result == null) result = caseElementaryPatterns(minimize);
				if (result == null) result = caseMissions(minimize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.AT_MOST: {
				AtMost atMost = (AtMost)theEObject;
				T result = caseAtMost(atMost);
				if (result == null) result = caseElementaryPatterns(atMost);
				if (result == null) result = caseMissions(atMost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.AT_LEAST: {
				AtLeast atLeast = (AtLeast)theEObject;
				T result = caseAtLeast(atLeast);
				if (result == null) result = caseElementaryPatterns(atLeast);
				if (result == null) result = caseMissions(atLeast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseElementaryPatterns(greaterThan);
				if (result == null) result = caseMissions(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.WITHIN: {
				Within within = (Within)theEObject;
				T result = caseWithin(within);
				if (result == null) result = caseElementaryPatterns(within);
				if (result == null) result = caseMissions(within);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.STRICTLY_WITHIN: {
				StrictlyWithin strictlyWithin = (StrictlyWithin)theEObject;
				T result = caseStrictlyWithin(strictlyWithin);
				if (result == null) result = caseElementaryPatterns(strictlyWithin);
				if (result == null) result = caseMissions(strictlyWithin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.COMPOSITE_PATTERNS: {
				CompositePatterns compositePatterns = (CompositePatterns)theEObject;
				T result = caseCompositePatterns(compositePatterns);
				if (result == null) result = caseMissions(compositePatterns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.MISSIONS: {
				Missions missions = (Missions)theEObject;
				T result = caseMissions(missions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SHALL_MISSIONS: {
				ShallMissions shallMissions = (ShallMissions)theEObject;
				T result = caseShallMissions(shallMissions);
				if (result == null) result = caseMissions(shallMissions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ACTION_END: {
				ActionEnd actionEnd = (ActionEnd)theEObject;
				T result = caseActionEnd(actionEnd);
				if (result == null) result = caseCondition(actionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.DELAYED: {
				Delayed delayed = (Delayed)theEObject;
				T result = caseDelayed(delayed);
				if (result == null) result = caseReact(delayed);
				if (result == null) result = caseCounteract(delayed);
				if (result == null) result = caseDescriptive(delayed);
				if (result == null) result = caseTrigger(delayed);
				if (result == null) result = caseSpecificationPatterns(delayed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.COMPLEX_MISSIONS: {
				ComplexMissions complexMissions = (ComplexMissions)theEObject;
				T result = caseComplexMissions(complexMissions);
				if (result == null) result = caseMissions(complexMissions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.MISSION_OPERATION: {
				MissionOperation missionOperation = (MissionOperation)theEObject;
				T result = caseMissionOperation(missionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.NEGATION: {
				Negation negation = (Negation)theEObject;
				T result = caseNegation(negation);
				if (result == null) result = caseMissionOperation(negation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseMissionOperation(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CONSERVATION: {
				Conservation conservation = (Conservation)theEObject;
				T result = caseConservation(conservation);
				if (result == null) result = caseCompositePatterns(conservation);
				if (result == null) result = caseMissionDependent(conservation);
				if (result == null) result = caseMissions(conservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PRESERVATION: {
				Preservation preservation = (Preservation)theEObject;
				T result = casePreservation(preservation);
				if (result == null) result = caseCompositePatterns(preservation);
				if (result == null) result = caseMissionDependent(preservation);
				if (result == null) result = caseMissions(preservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.REPEAT_EVERY: {
				RepeatEvery repeatEvery = (RepeatEvery)theEObject;
				T result = caseRepeatEvery(repeatEvery);
				if (result == null) result = caseCompositePatterns(repeatEvery);
				if (result == null) result = caseTimed(repeatEvery);
				if (result == null) result = caseMissionDependent(repeatEvery);
				if (result == null) result = caseMissions(repeatEvery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.TIMED: {
				Timed timed = (Timed)theEObject;
				T result = caseTimed(timed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CONDITION_DEPENDENT: {
				ConditionDependent conditionDependent = (ConditionDependent)theEObject;
				T result = caseConditionDependent(conditionDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ACTION_DEPENDENT: {
				ActionDependent actionDependent = (ActionDependent)theEObject;
				T result = caseActionDependent(actionDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.MISSION_DEPENDENT: {
				MissionDependent missionDependent = (MissionDependent)theEObject;
				T result = caseMissionDependent(missionDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.MAINTAIN: {
				Maintain maintain = (Maintain)theEObject;
				T result = caseMaintain(maintain);
				if (result == null) result = caseCompositePatterns(maintain);
				if (result == null) result = caseConditionDependent(maintain);
				if (result == null) result = caseMissionDependent(maintain);
				if (result == null) result = caseMissions(maintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseCompositePatterns(end);
				if (result == null) result = caseConditionDependent(end);
				if (result == null) result = caseMissionDependent(end);
				if (result == null) result = caseMissions(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.RESUME_IF: {
				ResumeIf resumeIf = (ResumeIf)theEObject;
				T result = caseResumeIf(resumeIf);
				if (result == null) result = caseCompositePatterns(resumeIf);
				if (result == null) result = caseConditionDependent(resumeIf);
				if (result == null) result = caseMissionDependent(resumeIf);
				if (result == null) result = caseMissions(resumeIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ACCRUE: {
				Accrue accrue = (Accrue)theEObject;
				T result = caseAccrue(accrue);
				if (result == null) result = caseCompositePatterns(accrue);
				if (result == null) result = caseMissionDependent(accrue);
				if (result == null) result = caseMissions(accrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SECURE: {
				Secure secure = (Secure)theEObject;
				T result = caseSecure(secure);
				if (result == null) result = caseCompositePatterns(secure);
				if (result == null) result = caseLocationDependent(secure);
				if (result == null) result = caseMissions(secure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.EQUIDISTANCE: {
				Equidistance equidistance = (Equidistance)theEObject;
				T result = caseEquidistance(equidistance);
				if (result == null) result = caseCompositePatterns(equidistance);
				if (result == null) result = caseMissionDependent(equidistance);
				if (result == null) result = caseMissions(equidistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.TRAIL: {
				Trail trail = (Trail)theEObject;
				T result = caseTrail(trail);
				if (result == null) result = caseCompositePatterns(trail);
				if (result == null) result = caseMissionDependent(trail);
				if (result == null) result = caseMissions(trail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.LOCATION_DEPENDENT: {
				LocationDependent locationDependent = (LocationDependent)theEObject;
				T result = caseLocationDependent(locationDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PAUSE: {
				Pause pause = (Pause)theEObject;
				T result = casePause(pause);
				if (result == null) result = caseCompositePatterns(pause);
				if (result == null) result = caseTimed(pause);
				if (result == null) result = caseMissionDependent(pause);
				if (result == null) result = caseMissions(pause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.TIMEOUT: {
				Timeout timeout = (Timeout)theEObject;
				T result = caseTimeout(timeout);
				if (result == null) result = caseCompositePatterns(timeout);
				if (result == null) result = caseTimed(timeout);
				if (result == null) result = caseMissionDependent(timeout);
				if (result == null) result = caseMissions(timeout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.RELIABILITY_CONFIDENCE: {
				ReliabilityConfidence reliabilityConfidence = (ReliabilityConfidence)theEObject;
				T result = caseReliabilityConfidence(reliabilityConfidence);
				if (result == null) result = caseCompositePatterns(reliabilityConfidence);
				if (result == null) result = caseMissionDependent(reliabilityConfidence);
				if (result == null) result = caseLevelOfConfidence(reliabilityConfidence);
				if (result == null) result = caseMissions(reliabilityConfidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.LEVEL_OF_CONFIDENCE: {
				LevelOfConfidence levelOfConfidence = (LevelOfConfidence)theEObject;
				T result = caseLevelOfConfidence(levelOfConfidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.RELAXED: {
				Relaxed relaxed = (Relaxed)theEObject;
				T result = caseRelaxed(relaxed);
				if (result == null) result = caseCompositePatterns(relaxed);
				if (result == null) result = caseMissionDependent(relaxed);
				if (result == null) result = caseLevelOfConfidence(relaxed);
				if (result == null) result = caseMissions(relaxed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ALMOST_AT: {
				AlmostAt almostAt = (AlmostAt)theEObject;
				T result = caseAlmostAt(almostAt);
				if (result == null) result = caseCompositePatterns(almostAt);
				if (result == null) result = caseTimed(almostAt);
				if (result == null) result = caseMissionDependent(almostAt);
				if (result == null) result = caseMissions(almostAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.EXACTLY_AT: {
				ExactlyAt exactlyAt = (ExactlyAt)theEObject;
				T result = caseExactlyAt(exactlyAt);
				if (result == null) result = caseCompositePatterns(exactlyAt);
				if (result == null) result = caseTimed(exactlyAt);
				if (result == null) result = caseMissionDependent(exactlyAt);
				if (result == null) result = caseMissions(exactlyAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.DEADLINE_AT: {
				DeadlineAt deadlineAt = (DeadlineAt)theEObject;
				T result = caseDeadlineAt(deadlineAt);
				if (result == null) result = caseCompositePatterns(deadlineAt);
				if (result == null) result = caseTimed(deadlineAt);
				if (result == null) result = caseMissionDependent(deadlineAt);
				if (result == null) result = caseMissions(deadlineAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PROPORTIONAL: {
				Proportional proportional = (Proportional)theEObject;
				T result = caseProportional(proportional);
				if (result == null) result = caseCompositePatterns(proportional);
				if (result == null) result = caseMissions(proportional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.EXECUTE: {
				Execute execute = (Execute)theEObject;
				T result = caseExecute(execute);
				if (result == null) result = caseCompositePatterns(execute);
				if (result == null) result = caseSetOfActionsDependent(execute);
				if (result == null) result = caseMissions(execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SET_OF_ACTIONS_DEPENDENT: {
				SetOfActionsDependent setOfActionsDependent = (SetOfActionsDependent)theEObject;
				T result = caseSetOfActionsDependent(setOfActionsDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SEQUENCING: {
				Sequencing sequencing = (Sequencing)theEObject;
				T result = caseSequencing(sequencing);
				if (result == null) result = caseCompositePatterns(sequencing);
				if (result == null) result = caseSetOfActionsDependent(sequencing);
				if (result == null) result = caseMissions(sequencing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.DEVIATION: {
				Deviation deviation = (Deviation)theEObject;
				T result = caseDeviation(deviation);
				if (result == null) result = caseCompositePatterns(deviation);
				if (result == null) result = caseSetOfActionsDependent(deviation);
				if (result == null) result = caseMissions(deviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.REPEAT: {
				Repeat repeat = (Repeat)theEObject;
				T result = caseRepeat(repeat);
				if (result == null) result = caseCompositePatterns(repeat);
				if (result == null) result = caseMissionDependent(repeat);
				if (result == null) result = caseMissions(repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.TOP_MISSIONS: {
				TopMissions topMissions = (TopMissions)theEObject;
				T result = caseTopMissions(topMissions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationPatterns(SpecificationPatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visit1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visit1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisit1(Visit1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Specifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Specifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSpecifications(ProblemSpecifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strict Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strict Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrictOrder(StrictOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patrol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patrol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatrol(Patrol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avoidance Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avoidance Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvoidanceVisit(AvoidanceVisit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestricted(Restricted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationEvent(LocationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robots</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robots</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobots(Robots object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFair(Fair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visit2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visit2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisit2(Visit2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exactly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exactly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactly(Exactly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple(Simple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avoid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avoid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvoid(Avoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfter(After object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionBased(ConditionBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptive(Descriptive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>React</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>React</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReact(React object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counteract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counteract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounteract(Counteract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximize(Maximize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryPatterns(ElementaryPatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimize(Minimize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Most</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Most</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtMost(AtMost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Least</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Least</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtLeast(AtLeast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Within</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithin(Within object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strictly Within</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strictly Within</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrictlyWithin(StrictlyWithin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositePatterns(CompositePatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissions(Missions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shall Missions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shall Missions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShallMissions(ShallMissions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEnd(ActionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delayed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delayed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayed(Delayed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Missions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Missions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexMissions(ComplexMissions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionOperation(MissionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConservation(Conservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreservation(Preservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Every</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Every</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatEvery(RepeatEvery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimed(Timed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionDependent(ConditionDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDependent(ActionDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissionDependent(MissionDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintain(Maintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resume If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resume If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResumeIf(ResumeIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accrue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accrue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccrue(Accrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecure(Secure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equidistance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equidistance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquidistance(Equidistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrail(Trail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationDependent(LocationDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePause(Pause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeout(Timeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability Confidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliabilityConfidence(ReliabilityConfidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Of Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Of Confidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelOfConfidence(LevelOfConfidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relaxed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relaxed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelaxed(Relaxed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Almost At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Almost At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlmostAt(AlmostAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exactly At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exactly At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactlyAt(ExactlyAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineAt(DeadlineAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proportional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proportional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProportional(Proportional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecute(Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Of Actions Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Of Actions Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOfActionsDependent(SetOfActionsDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequencing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequencing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencing(Sequencing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviation(Deviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Missions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Missions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopMissions(TopMissions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PatternsSwitch
