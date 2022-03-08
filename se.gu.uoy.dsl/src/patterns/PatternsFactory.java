/**
 */
package patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsFactory eINSTANCE = patterns.impl.PatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Visit1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visit1</em>'.
	 * @generated
	 */
	Visit1 createVisit1();

	/**
	 * Returns a new object of class '<em>Problem Specifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Specifications</em>'.
	 * @generated
	 */
	ProblemSpecifications createProblemSpecifications();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Strict Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strict Order</em>'.
	 * @generated
	 */
	StrictOrder createStrictOrder();

	/**
	 * Returns a new object of class '<em>Patrol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patrol</em>'.
	 * @generated
	 */
	Patrol createPatrol();

	/**
	 * Returns a new object of class '<em>Location Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Event</em>'.
	 * @generated
	 */
	LocationEvent createLocationEvent();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Robots</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robots</em>'.
	 * @generated
	 */
	Robots createRobots();

	/**
	 * Returns a new object of class '<em>Fair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fair</em>'.
	 * @generated
	 */
	Fair createFair();

	/**
	 * Returns a new object of class '<em>Visit2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visit2</em>'.
	 * @generated
	 */
	Visit2 createVisit2();

	/**
	 * Returns a new object of class '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less</em>'.
	 * @generated
	 */
	Less createLess();

	/**
	 * Returns a new object of class '<em>Exactly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exactly</em>'.
	 * @generated
	 */
	Exactly createExactly();

	/**
	 * Returns a new object of class '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple</em>'.
	 * @generated
	 */
	Simple createSimple();

	/**
	 * Returns a new object of class '<em>Avoid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avoid</em>'.
	 * @generated
	 */
	Avoid createAvoid();

	/**
	 * Returns a new object of class '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After</em>'.
	 * @generated
	 */
	After createAfter();

	/**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
	Wait createWait();

	/**
	 * Returns a new object of class '<em>React</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>React</em>'.
	 * @generated
	 */
	React createReact();

	/**
	 * Returns a new object of class '<em>Counteract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counteract</em>'.
	 * @generated
	 */
	Counteract createCounteract();

	/**
	 * Returns a new object of class '<em>Maximize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maximize</em>'.
	 * @generated
	 */
	Maximize createMaximize();

	/**
	 * Returns a new object of class '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than</em>'.
	 * @generated
	 */
	LessThan createLessThan();

	/**
	 * Returns a new object of class '<em>Minimize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimize</em>'.
	 * @generated
	 */
	Minimize createMinimize();

	/**
	 * Returns a new object of class '<em>At Most</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Most</em>'.
	 * @generated
	 */
	AtMost createAtMost();

	/**
	 * Returns a new object of class '<em>At Least</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Least</em>'.
	 * @generated
	 */
	AtLeast createAtLeast();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns a new object of class '<em>Within</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Within</em>'.
	 * @generated
	 */
	Within createWithin();

	/**
	 * Returns a new object of class '<em>Strictly Within</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strictly Within</em>'.
	 * @generated
	 */
	StrictlyWithin createStrictlyWithin();

	/**
	 * Returns a new object of class '<em>Shall Missions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shall Missions</em>'.
	 * @generated
	 */
	ShallMissions createShallMissions();

	/**
	 * Returns a new object of class '<em>Action End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action End</em>'.
	 * @generated
	 */
	ActionEnd createActionEnd();

	/**
	 * Returns a new object of class '<em>Delayed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delayed</em>'.
	 * @generated
	 */
	Delayed createDelayed();

	/**
	 * Returns a new object of class '<em>Complex Missions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Missions</em>'.
	 * @generated
	 */
	ComplexMissions createComplexMissions();

	/**
	 * Returns a new object of class '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negation</em>'.
	 * @generated
	 */
	Negation createNegation();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns a new object of class '<em>Conservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conservation</em>'.
	 * @generated
	 */
	Conservation createConservation();

	/**
	 * Returns a new object of class '<em>Preservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preservation</em>'.
	 * @generated
	 */
	Preservation createPreservation();

	/**
	 * Returns a new object of class '<em>Repeat Every</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Every</em>'.
	 * @generated
	 */
	RepeatEvery createRepeatEvery();

	/**
	 * Returns a new object of class '<em>Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintain</em>'.
	 * @generated
	 */
	Maintain createMaintain();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Resume If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resume If</em>'.
	 * @generated
	 */
	ResumeIf createResumeIf();

	/**
	 * Returns a new object of class '<em>Accrue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accrue</em>'.
	 * @generated
	 */
	Accrue createAccrue();

	/**
	 * Returns a new object of class '<em>Secure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure</em>'.
	 * @generated
	 */
	Secure createSecure();

	/**
	 * Returns a new object of class '<em>Equidistance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equidistance</em>'.
	 * @generated
	 */
	Equidistance createEquidistance();

	/**
	 * Returns a new object of class '<em>Trail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trail</em>'.
	 * @generated
	 */
	Trail createTrail();

	/**
	 * Returns a new object of class '<em>Pause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pause</em>'.
	 * @generated
	 */
	Pause createPause();

	/**
	 * Returns a new object of class '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout</em>'.
	 * @generated
	 */
	Timeout createTimeout();

	/**
	 * Returns a new object of class '<em>Reliability Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reliability Confidence</em>'.
	 * @generated
	 */
	ReliabilityConfidence createReliabilityConfidence();

	/**
	 * Returns a new object of class '<em>Relaxed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relaxed</em>'.
	 * @generated
	 */
	Relaxed createRelaxed();

	/**
	 * Returns a new object of class '<em>Almost At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Almost At</em>'.
	 * @generated
	 */
	AlmostAt createAlmostAt();

	/**
	 * Returns a new object of class '<em>Exactly At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exactly At</em>'.
	 * @generated
	 */
	ExactlyAt createExactlyAt();

	/**
	 * Returns a new object of class '<em>Deadline At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadline At</em>'.
	 * @generated
	 */
	DeadlineAt createDeadlineAt();

	/**
	 * Returns a new object of class '<em>Proportional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proportional</em>'.
	 * @generated
	 */
	Proportional createProportional();

	/**
	 * Returns a new object of class '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute</em>'.
	 * @generated
	 */
	Execute createExecute();

	/**
	 * Returns a new object of class '<em>Sequencing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequencing</em>'.
	 * @generated
	 */
	Sequencing createSequencing();

	/**
	 * Returns a new object of class '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deviation</em>'.
	 * @generated
	 */
	Deviation createDeviation();

	/**
	 * Returns a new object of class '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat</em>'.
	 * @generated
	 */
	Repeat createRepeat();

	/**
	 * Returns a new object of class '<em>Top Missions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Missions</em>'.
	 * @generated
	 */
	TopMissions createTopMissions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternsPackage getPatternsPackage();

} //PatternsFactory
