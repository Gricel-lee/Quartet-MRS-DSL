/**
 */
package patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see patterns.PatternsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/patterns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link patterns.SpecificationPatterns <em>Specification Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.SpecificationPatterns
	 * @see patterns.impl.PatternsPackageImpl#getSpecificationPatterns()
	 * @generated
	 */
	int SPECIFICATION_PATTERNS = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PATTERNS__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PATTERNS__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Specification Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PATTERNS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specification Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PATTERNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.Visit1Impl <em>Visit1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.Visit1Impl
	 * @see patterns.impl.PatternsPackageImpl#getVisit1()
	 * @generated
	 */
	int VISIT1 = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT1__LOCATIONS = SPECIFICATION_PATTERNS__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT1__TYPE = SPECIFICATION_PATTERNS__TYPE;

	/**
	 * The number of structural features of the '<em>Visit1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT1_FEATURE_COUNT = SPECIFICATION_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visit1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT1_OPERATION_COUNT = SPECIFICATION_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ProblemSpecificationsImpl <em>Problem Specifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ProblemSpecificationsImpl
	 * @see patterns.impl.PatternsPackageImpl#getProblemSpecifications()
	 * @generated
	 */
	int PROBLEM_SPECIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__ROBOTS = 3;

	/**
	 * The feature id for the '<em><b>Topmissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__TOPMISSIONS = 4;

	/**
	 * The feature id for the '<em><b>Elementary Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS = 5;

	/**
	 * The feature id for the '<em><b>Composite Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS = 6;

	/**
	 * The feature id for the '<em><b>Specification Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS = 7;

	/**
	 * The number of structural features of the '<em>Problem Specifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Problem Specifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.LocationImpl
	 * @see patterns.impl.PatternsPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ActionImpl
	 * @see patterns.impl.PatternsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.SequenceImpl
	 * @see patterns.impl.PatternsPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__LOCATIONS = VISIT1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPE = VISIT1__TYPE;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = VISIT1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = VISIT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.OrderImpl
	 * @see patterns.impl.PatternsPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 6;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LOCATIONS = VISIT1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TYPE = VISIT1__TYPE;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = VISIT1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = VISIT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.StrictOrderImpl <em>Strict Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.StrictOrderImpl
	 * @see patterns.impl.PatternsPackageImpl#getStrictOrder()
	 * @generated
	 */
	int STRICT_ORDER = 7;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDER__LOCATIONS = VISIT1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDER__TYPE = VISIT1__TYPE;

	/**
	 * The number of structural features of the '<em>Strict Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDER_FEATURE_COUNT = VISIT1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strict Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDER_OPERATION_COUNT = VISIT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.PatrolImpl <em>Patrol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.PatrolImpl
	 * @see patterns.impl.PatternsPackageImpl#getPatrol()
	 * @generated
	 */
	int PATROL = 8;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROL__LOCATIONS = SPECIFICATION_PATTERNS__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROL__TYPE = SPECIFICATION_PATTERNS__TYPE;

	/**
	 * The number of structural features of the '<em>Patrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROL_FEATURE_COUNT = SPECIFICATION_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Patrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROL_OPERATION_COUNT = SPECIFICATION_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.AvoidanceVisit <em>Avoidance Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.AvoidanceVisit
	 * @see patterns.impl.PatternsPackageImpl#getAvoidanceVisit()
	 * @generated
	 */
	int AVOIDANCE_VISIT = 9;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_VISIT__LOCATIONS = SPECIFICATION_PATTERNS__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_VISIT__TYPE = SPECIFICATION_PATTERNS__TYPE;

	/**
	 * The number of structural features of the '<em>Avoidance Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_VISIT_FEATURE_COUNT = SPECIFICATION_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avoidance Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_VISIT_OPERATION_COUNT = SPECIFICATION_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Restricted <em>Restricted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Restricted
	 * @see patterns.impl.PatternsPackageImpl#getRestricted()
	 * @generated
	 */
	int RESTRICTED = 10;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED__LOCATIONS = AVOIDANCE_VISIT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED__TYPE = AVOIDANCE_VISIT__TYPE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED__NUMBER = AVOIDANCE_VISIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Restricted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_FEATURE_COUNT = AVOIDANCE_VISIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Restricted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_OPERATION_COUNT = AVOIDANCE_VISIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Conditional <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Conditional
	 * @see patterns.impl.PatternsPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 11;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__LOCATIONS = AVOIDANCE_VISIT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__TYPE = AVOIDANCE_VISIT__TYPE;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = AVOIDANCE_VISIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_COUNT = AVOIDANCE_VISIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Condition
	 * @see patterns.impl.PatternsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.LocationEventImpl <em>Location Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.LocationEventImpl
	 * @see patterns.impl.PatternsPackageImpl#getLocationEvent()
	 * @generated
	 */
	int LOCATION_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__ROBOTS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__LOCATION = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.EventImpl
	 * @see patterns.impl.PatternsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONDITION = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.RobotsImpl <em>Robots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.RobotsImpl
	 * @see patterns.impl.PatternsPackageImpl#getRobots()
	 * @generated
	 */
	int ROBOTS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Robots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Robots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.FairImpl <em>Fair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.FairImpl
	 * @see patterns.impl.PatternsPackageImpl#getFair()
	 * @generated
	 */
	int FAIR = 16;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR__LOCATIONS = VISIT1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR__TYPE = VISIT1__TYPE;

	/**
	 * The number of structural features of the '<em>Fair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_FEATURE_COUNT = VISIT1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_OPERATION_COUNT = VISIT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.Visit2Impl <em>Visit2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.Visit2Impl
	 * @see patterns.impl.PatternsPackageImpl#getVisit2()
	 * @generated
	 */
	int VISIT2 = 17;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT2__LOCATIONS = RESTRICTED__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT2__TYPE = RESTRICTED__TYPE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT2__NUMBER = RESTRICTED__NUMBER;

	/**
	 * The number of structural features of the '<em>Visit2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT2_FEATURE_COUNT = RESTRICTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visit2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT2_OPERATION_COUNT = RESTRICTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.LessImpl
	 * @see patterns.impl.PatternsPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 18;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LOCATIONS = RESTRICTED__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__TYPE = RESTRICTED__TYPE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__NUMBER = RESTRICTED__NUMBER;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = RESTRICTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = RESTRICTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ExactlyImpl <em>Exactly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ExactlyImpl
	 * @see patterns.impl.PatternsPackageImpl#getExactly()
	 * @generated
	 */
	int EXACTLY = 19;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY__LOCATIONS = RESTRICTED__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY__TYPE = RESTRICTED__TYPE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY__NUMBER = RESTRICTED__NUMBER;

	/**
	 * The number of structural features of the '<em>Exactly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_FEATURE_COUNT = RESTRICTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exactly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_OPERATION_COUNT = RESTRICTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.SimpleImpl
	 * @see patterns.impl.PatternsPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 20;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__LOCATIONS = CONDITIONAL__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TYPE = CONDITIONAL__TYPE;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = CONDITIONAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.ConditionBased <em>Condition Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.ConditionBased
	 * @see patterns.impl.PatternsPackageImpl#getConditionBased()
	 * @generated
	 */
	int CONDITION_BASED = 23;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED__LOCATIONS = CONDITIONAL__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED__TYPE = CONDITIONAL__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED__CONDITION = CONDITIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED__LOCATIONEVENT = CONDITIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_OPERATION_COUNT = CONDITIONAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.AvoidImpl <em>Avoid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.AvoidImpl
	 * @see patterns.impl.PatternsPackageImpl#getAvoid()
	 * @generated
	 */
	int AVOID = 21;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID__LOCATIONS = CONDITION_BASED__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID__TYPE = CONDITION_BASED__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID__CONDITION = CONDITION_BASED__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID__LOCATIONEVENT = CONDITION_BASED__LOCATIONEVENT;

	/**
	 * The number of structural features of the '<em>Avoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_FEATURE_COUNT = CONDITION_BASED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OPERATION_COUNT = CONDITION_BASED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.AfterImpl
	 * @see patterns.impl.PatternsPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 22;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__LOCATIONS = CONDITION_BASED__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__TYPE = CONDITION_BASED__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__CONDITION = CONDITION_BASED__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__LOCATIONEVENT = CONDITION_BASED__LOCATIONEVENT;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = CONDITION_BASED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_OPERATION_COUNT = CONDITION_BASED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Trigger <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Trigger
	 * @see patterns.impl.PatternsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 24;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__LOCATIONS = SPECIFICATION_PATTERNS__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = SPECIFICATION_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION = SPECIFICATION_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__LOCATIONEVENT = SPECIFICATION_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = SPECIFICATION_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = SPECIFICATION_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.WaitImpl
	 * @see patterns.impl.PatternsPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 25;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__LOCATIONS = TRIGGER__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TYPE = TRIGGER__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__CONDITION = TRIGGER__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__LOCATIONEVENT = TRIGGER__LOCATIONEVENT;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Descriptive <em>Descriptive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Descriptive
	 * @see patterns.impl.PatternsPackageImpl#getDescriptive()
	 * @generated
	 */
	int DESCRIPTIVE = 26;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__LOCATIONS = TRIGGER__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__TYPE = TRIGGER__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__CONDITION = TRIGGER__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__LOCATIONEVENT = TRIGGER__LOCATIONEVENT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__PATTERN = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__ACTION = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Descriptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Descriptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ReactImpl <em>React</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ReactImpl
	 * @see patterns.impl.PatternsPackageImpl#getReact()
	 * @generated
	 */
	int REACT = 27;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__LOCATIONS = DESCRIPTIVE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__TYPE = DESCRIPTIVE__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__CONDITION = DESCRIPTIVE__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__LOCATIONEVENT = DESCRIPTIVE__LOCATIONEVENT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__PATTERN = DESCRIPTIVE__PATTERN;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT__ACTION = DESCRIPTIVE__ACTION;

	/**
	 * The number of structural features of the '<em>React</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FEATURE_COUNT = DESCRIPTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>React</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_OPERATION_COUNT = DESCRIPTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.CounteractImpl <em>Counteract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.CounteractImpl
	 * @see patterns.impl.PatternsPackageImpl#getCounteract()
	 * @generated
	 */
	int COUNTERACT = 28;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT__LOCATIONS = DESCRIPTIVE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT__TYPE = DESCRIPTIVE__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT__CONDITION = DESCRIPTIVE__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT__LOCATIONEVENT = DESCRIPTIVE__LOCATIONEVENT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT__PATTERN = DESCRIPTIVE__PATTERN;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT__ACTION = DESCRIPTIVE__ACTION;

	/**
	 * The number of structural features of the '<em>Counteract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT_FEATURE_COUNT = DESCRIPTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Counteract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTERACT_OPERATION_COUNT = DESCRIPTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Missions <em>Missions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Missions
	 * @see patterns.impl.PatternsPackageImpl#getMissions()
	 * @generated
	 */
	int MISSIONS = 39;

	/**
	 * The number of structural features of the '<em>Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.ElementaryPatterns <em>Elementary Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.ElementaryPatterns
	 * @see patterns.impl.PatternsPackageImpl#getElementaryPatterns()
	 * @generated
	 */
	int ELEMENTARY_PATTERNS = 30;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_PATTERNS__MEASURE = MISSIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_PATTERNS__MISSION = MISSIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_PATTERNS__TYPE = MISSIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Elementary Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_PATTERNS_FEATURE_COUNT = MISSIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Elementary Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_PATTERNS_OPERATION_COUNT = MISSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.MaximizeImpl <em>Maximize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.MaximizeImpl
	 * @see patterns.impl.PatternsPackageImpl#getMaximize()
	 * @generated
	 */
	int MAXIMIZE = 29;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMIZE__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMIZE__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMIZE__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMIZE__REWARD = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maximize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMIZE_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maximize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMIZE_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.LessThanImpl
	 * @see patterns.impl.PatternsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 31;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__VALUE = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.MinimizeImpl <em>Minimize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.MinimizeImpl
	 * @see patterns.impl.PatternsPackageImpl#getMinimize()
	 * @generated
	 */
	int MINIMIZE = 32;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMIZE__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMIZE__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMIZE__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The number of structural features of the '<em>Minimize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMIZE_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minimize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMIZE_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.AtMostImpl <em>At Most</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.AtMostImpl
	 * @see patterns.impl.PatternsPackageImpl#getAtMost()
	 * @generated
	 */
	int AT_MOST = 33;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST__VALUE = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST__REWARD = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>At Most</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>At Most</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.AtLeastImpl <em>At Least</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.AtLeastImpl
	 * @see patterns.impl.PatternsPackageImpl#getAtLeast()
	 * @generated
	 */
	int AT_LEAST = 34;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST__VALUE = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>At Least</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>At Least</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.GreaterThanImpl
	 * @see patterns.impl.PatternsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 35;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__VALUE = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.WithinImpl <em>Within</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.WithinImpl
	 * @see patterns.impl.PatternsPackageImpl#getWithin()
	 * @generated
	 */
	int WITHIN = 36;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN__VALUE1 = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN__VALUE2 = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN__REWARD = ELEMENTARY_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Within</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Within</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.StrictlyWithinImpl <em>Strictly Within</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.StrictlyWithinImpl
	 * @see patterns.impl.PatternsPackageImpl#getStrictlyWithin()
	 * @generated
	 */
	int STRICTLY_WITHIN = 37;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN__MEASURE = ELEMENTARY_PATTERNS__MEASURE;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN__MISSION = ELEMENTARY_PATTERNS__MISSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN__TYPE = ELEMENTARY_PATTERNS__TYPE;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN__VALUE1 = ELEMENTARY_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN__VALUE2 = ELEMENTARY_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Strictly Within</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN_FEATURE_COUNT = ELEMENTARY_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Strictly Within</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTLY_WITHIN_OPERATION_COUNT = ELEMENTARY_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.CompositePatterns <em>Composite Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.CompositePatterns
	 * @see patterns.impl.PatternsPackageImpl#getCompositePatterns()
	 * @generated
	 */
	int COMPOSITE_PATTERNS = 38;

	/**
	 * The number of structural features of the '<em>Composite Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PATTERNS_FEATURE_COUNT = MISSIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PATTERNS_OPERATION_COUNT = MISSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ShallMissionsImpl <em>Shall Missions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ShallMissionsImpl
	 * @see patterns.impl.PatternsPackageImpl#getShallMissions()
	 * @generated
	 */
	int SHALL_MISSIONS = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALL_MISSIONS__ID = MISSIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Movement Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALL_MISSIONS__MOVEMENT_PATTERNS = MISSIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALL_MISSIONS__ROBOTS = MISSIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shall Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALL_MISSIONS_FEATURE_COUNT = MISSIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shall Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHALL_MISSIONS_OPERATION_COUNT = MISSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ActionEndImpl <em>Action End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ActionEndImpl
	 * @see patterns.impl.PatternsPackageImpl#getActionEnd()
	 * @generated
	 */
	int ACTION_END = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__DESCRIPTION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__ACTION = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.DelayedImpl <em>Delayed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.DelayedImpl
	 * @see patterns.impl.PatternsPackageImpl#getDelayed()
	 * @generated
	 */
	int DELAYED = 42;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__LOCATIONS = REACT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__TYPE = REACT__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__CONDITION = REACT__CONDITION;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__LOCATIONEVENT = REACT__LOCATIONEVENT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__PATTERN = REACT__PATTERN;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__ACTION = REACT__ACTION;

	/**
	 * The number of structural features of the '<em>Delayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FEATURE_COUNT = REACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_OPERATION_COUNT = REACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ComplexMissionsImpl <em>Complex Missions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ComplexMissionsImpl
	 * @see patterns.impl.PatternsPackageImpl#getComplexMissions()
	 * @generated
	 */
	int COMPLEX_MISSIONS = 43;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_MISSIONS__COMPOSITION = MISSIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_MISSIONS_FEATURE_COUNT = MISSIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_MISSIONS_OPERATION_COUNT = MISSIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.MissionOperation <em>Mission Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.MissionOperation
	 * @see patterns.impl.PatternsPackageImpl#getMissionOperation()
	 * @generated
	 */
	int MISSION_OPERATION = 44;

	/**
	 * The number of structural features of the '<em>Mission Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mission Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.NegationImpl
	 * @see patterns.impl.PatternsPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 45;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__NOT = MISSION_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = MISSION_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_OPERATION_COUNT = MISSION_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.CompositionImpl
	 * @see patterns.impl.PatternsPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 46;

	/**
	 * The feature id for the '<em><b>Binary Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__BINARY_TYPE = MISSION_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Miss1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MISS1 = MISSION_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Miss2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MISS2 = MISSION_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = MISSION_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = MISSION_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ConservationImpl <em>Conservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ConservationImpl
	 * @see patterns.impl.PatternsPackageImpl#getConservation()
	 * @generated
	 */
	int CONSERVATION = 47;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSERVATION__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSERVATION__MEASURE = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSERVATION_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSERVATION_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.PreservationImpl <em>Preservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.PreservationImpl
	 * @see patterns.impl.PatternsPackageImpl#getPreservation()
	 * @generated
	 */
	int PRESERVATION = 48;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVATION__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVATION__MEASURE = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVATION__VALUE1 = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVATION__VALUE2 = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Preservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVATION_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Preservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVATION_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.RepeatEveryImpl <em>Repeat Every</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.RepeatEveryImpl
	 * @see patterns.impl.PatternsPackageImpl#getRepeatEvery()
	 * @generated
	 */
	int REPEAT_EVERY = 49;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__T = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Every</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat Every</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_EVERY_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.Timed <em>Timed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.Timed
	 * @see patterns.impl.PatternsPackageImpl#getTimed()
	 * @generated
	 */
	int TIMED = 50;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED__T = 0;

	/**
	 * The number of structural features of the '<em>Timed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.ConditionDependent <em>Condition Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.ConditionDependent
	 * @see patterns.impl.PatternsPackageImpl#getConditionDependent()
	 * @generated
	 */
	int CONDITION_DEPENDENT = 51;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DEPENDENT__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DEPENDENT__LOCATIONEVENT = 1;

	/**
	 * The number of structural features of the '<em>Condition Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DEPENDENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DEPENDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.ActionDependent <em>Action Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.ActionDependent
	 * @see patterns.impl.PatternsPackageImpl#getActionDependent()
	 * @generated
	 */
	int ACTION_DEPENDENT = 52;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPENDENT__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Action Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPENDENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPENDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.MissionDependent <em>Mission Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.MissionDependent
	 * @see patterns.impl.PatternsPackageImpl#getMissionDependent()
	 * @generated
	 */
	int MISSION_DEPENDENT = 53;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_DEPENDENT__MISSIONS = 0;

	/**
	 * The number of structural features of the '<em>Mission Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_DEPENDENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mission Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_DEPENDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.MaintainImpl <em>Maintain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.MaintainImpl
	 * @see patterns.impl.PatternsPackageImpl#getMaintain()
	 * @generated
	 */
	int MAINTAIN = 54;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__CONDITION = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__LOCATIONEVENT = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Maintain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Maintain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.EndImpl
	 * @see patterns.impl.PatternsPackageImpl#getEnd()
	 * @generated
	 */
	int END = 55;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__CONDITION = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LOCATIONEVENT = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ResumeIfImpl <em>Resume If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ResumeIfImpl
	 * @see patterns.impl.PatternsPackageImpl#getResumeIf()
	 * @generated
	 */
	int RESUME_IF = 56;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_IF__CONDITION = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locationevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_IF__LOCATIONEVENT = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_IF__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resume If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_IF_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resume If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_IF_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.AccrueImpl <em>Accrue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.AccrueImpl
	 * @see patterns.impl.PatternsPackageImpl#getAccrue()
	 * @generated
	 */
	int ACCRUE = 57;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCRUE__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCRUE__MEASURE = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCRUE__ROBOTS = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accrue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCRUE_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Accrue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCRUE_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.SecureImpl <em>Secure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.SecureImpl
	 * @see patterns.impl.PatternsPackageImpl#getSecure()
	 * @generated
	 */
	int SECURE = 58;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE__LOCATIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.EquidistanceImpl <em>Equidistance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.EquidistanceImpl
	 * @see patterns.impl.PatternsPackageImpl#getEquidistance()
	 * @generated
	 */
	int EQUIDISTANCE = 59;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__LOCATION1 = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__LOCATION2 = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Robots1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__ROBOTS1 = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Robots2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__ROBOTS2 = COMPOSITE_PATTERNS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__ROBOTS = COMPOSITE_PATTERNS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE__DISTANCE = COMPOSITE_PATTERNS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Equidistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Equidistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIDISTANCE_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.TrailImpl <em>Trail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.TrailImpl
	 * @see patterns.impl.PatternsPackageImpl#getTrail()
	 * @generated
	 */
	int TRAIL = 60;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIL__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objet To Follow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIL__OBJET_TO_FOLLOW = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIL__ROBOTS = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIL__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIL_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Trail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIL_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.LocationDependent <em>Location Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.LocationDependent
	 * @see patterns.impl.PatternsPackageImpl#getLocationDependent()
	 * @generated
	 */
	int LOCATION_DEPENDENT = 61;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEPENDENT__LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Location Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEPENDENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEPENDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.PauseImpl <em>Pause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.PauseImpl
	 * @see patterns.impl.PatternsPackageImpl#getPause()
	 * @generated
	 */
	int PAUSE = 62;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__T = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.TimeoutImpl <em>Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.TimeoutImpl
	 * @see patterns.impl.PatternsPackageImpl#getTimeout()
	 * @generated
	 */
	int TIMEOUT = 63;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__T = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ReliabilityConfidenceImpl <em>Reliability Confidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ReliabilityConfidenceImpl
	 * @see patterns.impl.PatternsPackageImpl#getReliabilityConfidence()
	 * @generated
	 */
	int RELIABILITY_CONFIDENCE = 64;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE__CONFIDENCE = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE__MEASURE = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE__TYPE1 = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE__TYPE2 = COMPOSITE_PATTERNS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reliability Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Reliability Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONFIDENCE_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.LevelOfConfidence <em>Level Of Confidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.LevelOfConfidence
	 * @see patterns.impl.PatternsPackageImpl#getLevelOfConfidence()
	 * @generated
	 */
	int LEVEL_OF_CONFIDENCE = 65;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_CONFIDENCE__CONFIDENCE = 0;

	/**
	 * The number of structural features of the '<em>Level Of Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_CONFIDENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Level Of Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_CONFIDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.RelaxedImpl <em>Relaxed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.RelaxedImpl
	 * @see patterns.impl.PatternsPackageImpl#getRelaxed()
	 * @generated
	 */
	int RELAXED = 66;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAXED__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAXED__CONFIDENCE = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relaxed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAXED_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relaxed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAXED_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.AlmostAtImpl <em>Almost At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.AlmostAtImpl
	 * @see patterns.impl.PatternsPackageImpl#getAlmostAt()
	 * @generated
	 */
	int ALMOST_AT = 67;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMOST_AT__T = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMOST_AT__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Almost At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMOST_AT_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Almost At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMOST_AT_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ExactlyAtImpl <em>Exactly At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ExactlyAtImpl
	 * @see patterns.impl.PatternsPackageImpl#getExactlyAt()
	 * @generated
	 */
	int EXACTLY_AT = 68;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_AT__T = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_AT__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exactly At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_AT_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exactly At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_AT_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.DeadlineAtImpl <em>Deadline At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.DeadlineAtImpl
	 * @see patterns.impl.PatternsPackageImpl#getDeadlineAt()
	 * @generated
	 */
	int DEADLINE_AT = 69;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_AT__T = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_AT__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deadline At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_AT_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deadline At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_AT_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ProportionalImpl <em>Proportional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ProportionalImpl
	 * @see patterns.impl.PatternsPackageImpl#getProportional()
	 * @generated
	 */
	int PROPORTIONAL = 70;

	/**
	 * The feature id for the '<em><b>Mission1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL__MISSION1 = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mission2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL__MISSION2 = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Proportional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Proportional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.ExecuteImpl
	 * @see patterns.impl.PatternsPackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 71;

	/**
	 * The feature id for the '<em><b>Set Of Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__SET_OF_ACTIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__ROBOTS = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.SetOfActionsDependent <em>Set Of Actions Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.SetOfActionsDependent
	 * @see patterns.impl.PatternsPackageImpl#getSetOfActionsDependent()
	 * @generated
	 */
	int SET_OF_ACTIONS_DEPENDENT = 72;

	/**
	 * The feature id for the '<em><b>Set Of Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Set Of Actions Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_ACTIONS_DEPENDENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set Of Actions Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_ACTIONS_DEPENDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.impl.SequencingImpl <em>Sequencing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.SequencingImpl
	 * @see patterns.impl.PatternsPackageImpl#getSequencing()
	 * @generated
	 */
	int SEQUENCING = 73;

	/**
	 * The feature id for the '<em><b>Set Of Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCING__SET_OF_ACTIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequencing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCING_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequencing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCING_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.DeviationImpl <em>Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.DeviationImpl
	 * @see patterns.impl.PatternsPackageImpl#getDeviation()
	 * @generated
	 */
	int DEVIATION = 74;

	/**
	 * The feature id for the '<em><b>Set Of Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__SET_OF_ACTIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.RepeatImpl
	 * @see patterns.impl.PatternsPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 75;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__MISSIONS = COMPOSITE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__VALUE = COMPOSITE_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = COMPOSITE_PATTERNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = COMPOSITE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patterns.impl.TopMissionsImpl <em>Top Missions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.impl.TopMissionsImpl
	 * @see patterns.impl.PatternsPackageImpl#getTopMissions()
	 * @generated
	 */
	int TOP_MISSIONS = 76;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_MISSIONS__MISSION = 0;

	/**
	 * The number of structural features of the '<em>Top Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_MISSIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Top Missions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_MISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patterns.CompositionOperator <em>Composition Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterns.CompositionOperator
	 * @see patterns.impl.PatternsPackageImpl#getCompositionOperator()
	 * @generated
	 */
	int COMPOSITION_OPERATOR = 77;


	/**
	 * Returns the meta object for class '{@link patterns.SpecificationPatterns <em>Specification Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Patterns</em>'.
	 * @see patterns.SpecificationPatterns
	 * @generated
	 */
	EClass getSpecificationPatterns();

	/**
	 * Returns the meta object for the reference list '{@link patterns.SpecificationPatterns#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see patterns.SpecificationPatterns#getLocations()
	 * @see #getSpecificationPatterns()
	 * @generated
	 */
	EReference getSpecificationPatterns_Locations();

	/**
	 * Returns the meta object for the attribute '{@link patterns.SpecificationPatterns#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see patterns.SpecificationPatterns#getType()
	 * @see #getSpecificationPatterns()
	 * @generated
	 */
	EAttribute getSpecificationPatterns_Type();

	/**
	 * Returns the meta object for class '{@link patterns.Visit1 <em>Visit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit1</em>'.
	 * @see patterns.Visit1
	 * @generated
	 */
	EClass getVisit1();

	/**
	 * Returns the meta object for class '{@link patterns.ProblemSpecifications <em>Problem Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Specifications</em>'.
	 * @see patterns.ProblemSpecifications
	 * @generated
	 */
	EClass getProblemSpecifications();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see patterns.ProblemSpecifications#getCondition()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see patterns.ProblemSpecifications#getLocation()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see patterns.ProblemSpecifications#getAction()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots</em>'.
	 * @see patterns.ProblemSpecifications#getRobots()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_Robots();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getTopmissions <em>Topmissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topmissions</em>'.
	 * @see patterns.ProblemSpecifications#getTopmissions()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_Topmissions();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getElementaryPatterns <em>Elementary Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementary Patterns</em>'.
	 * @see patterns.ProblemSpecifications#getElementaryPatterns()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_ElementaryPatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getCompositePatterns <em>Composite Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Patterns</em>'.
	 * @see patterns.ProblemSpecifications#getCompositePatterns()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_CompositePatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ProblemSpecifications#getSpecificationPatterns <em>Specification Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Patterns</em>'.
	 * @see patterns.ProblemSpecifications#getSpecificationPatterns()
	 * @see #getProblemSpecifications()
	 * @generated
	 */
	EReference getProblemSpecifications_SpecificationPatterns();

	/**
	 * Returns the meta object for class '{@link patterns.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see patterns.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patterns.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for class '{@link patterns.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see patterns.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patterns.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for class '{@link patterns.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see patterns.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link patterns.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see patterns.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for class '{@link patterns.StrictOrder <em>Strict Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strict Order</em>'.
	 * @see patterns.StrictOrder
	 * @generated
	 */
	EClass getStrictOrder();

	/**
	 * Returns the meta object for class '{@link patterns.Patrol <em>Patrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patrol</em>'.
	 * @see patterns.Patrol
	 * @generated
	 */
	EClass getPatrol();

	/**
	 * Returns the meta object for class '{@link patterns.AvoidanceVisit <em>Avoidance Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avoidance Visit</em>'.
	 * @see patterns.AvoidanceVisit
	 * @generated
	 */
	EClass getAvoidanceVisit();

	/**
	 * Returns the meta object for class '{@link patterns.Restricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted</em>'.
	 * @see patterns.Restricted
	 * @generated
	 */
	EClass getRestricted();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Restricted#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see patterns.Restricted#getNumber()
	 * @see #getRestricted()
	 * @generated
	 */
	EAttribute getRestricted_Number();

	/**
	 * Returns the meta object for class '{@link patterns.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see patterns.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for class '{@link patterns.LocationEvent <em>Location Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Event</em>'.
	 * @see patterns.LocationEvent
	 * @generated
	 */
	EClass getLocationEvent();

	/**
	 * Returns the meta object for the reference '{@link patterns.LocationEvent#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots</em>'.
	 * @see patterns.LocationEvent#getRobots()
	 * @see #getLocationEvent()
	 * @generated
	 */
	EReference getLocationEvent_Robots();

	/**
	 * Returns the meta object for the reference '{@link patterns.LocationEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see patterns.LocationEvent#getLocation()
	 * @see #getLocationEvent()
	 * @generated
	 */
	EReference getLocationEvent_Location();

	/**
	 * Returns the meta object for class '{@link patterns.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see patterns.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patterns.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link patterns.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see patterns.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see patterns.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Event#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see patterns.Event#getCondition()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Condition();

	/**
	 * Returns the meta object for class '{@link patterns.Robots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robots</em>'.
	 * @see patterns.Robots
	 * @generated
	 */
	EClass getRobots();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Robots#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patterns.Robots#getName()
	 * @see #getRobots()
	 * @generated
	 */
	EAttribute getRobots_Name();

	/**
	 * Returns the meta object for class '{@link patterns.Fair <em>Fair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair</em>'.
	 * @see patterns.Fair
	 * @generated
	 */
	EClass getFair();

	/**
	 * Returns the meta object for class '{@link patterns.Visit2 <em>Visit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit2</em>'.
	 * @see patterns.Visit2
	 * @generated
	 */
	EClass getVisit2();

	/**
	 * Returns the meta object for class '{@link patterns.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see patterns.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link patterns.Exactly <em>Exactly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exactly</em>'.
	 * @see patterns.Exactly
	 * @generated
	 */
	EClass getExactly();

	/**
	 * Returns the meta object for class '{@link patterns.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see patterns.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for class '{@link patterns.Avoid <em>Avoid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avoid</em>'.
	 * @see patterns.Avoid
	 * @generated
	 */
	EClass getAvoid();

	/**
	 * Returns the meta object for class '{@link patterns.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see patterns.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for class '{@link patterns.ConditionBased <em>Condition Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based</em>'.
	 * @see patterns.ConditionBased
	 * @generated
	 */
	EClass getConditionBased();

	/**
	 * Returns the meta object for the reference '{@link patterns.ConditionBased#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see patterns.ConditionBased#getCondition()
	 * @see #getConditionBased()
	 * @generated
	 */
	EReference getConditionBased_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.ConditionBased#getLocationevent <em>Locationevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locationevent</em>'.
	 * @see patterns.ConditionBased#getLocationevent()
	 * @see #getConditionBased()
	 * @generated
	 */
	EReference getConditionBased_Locationevent();

	/**
	 * Returns the meta object for class '{@link patterns.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see patterns.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link patterns.Trigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see patterns.Trigger#getCondition()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.Trigger#getLocationevent <em>Locationevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locationevent</em>'.
	 * @see patterns.Trigger#getLocationevent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Locationevent();

	/**
	 * Returns the meta object for class '{@link patterns.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see patterns.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for class '{@link patterns.Descriptive <em>Descriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive</em>'.
	 * @see patterns.Descriptive
	 * @generated
	 */
	EClass getDescriptive();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.Descriptive#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see patterns.Descriptive#getPattern()
	 * @see #getDescriptive()
	 * @generated
	 */
	EReference getDescriptive_Pattern();

	/**
	 * Returns the meta object for the reference '{@link patterns.Descriptive#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see patterns.Descriptive#getAction()
	 * @see #getDescriptive()
	 * @generated
	 */
	EReference getDescriptive_Action();

	/**
	 * Returns the meta object for class '{@link patterns.React <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React</em>'.
	 * @see patterns.React
	 * @generated
	 */
	EClass getReact();

	/**
	 * Returns the meta object for class '{@link patterns.Counteract <em>Counteract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counteract</em>'.
	 * @see patterns.Counteract
	 * @generated
	 */
	EClass getCounteract();

	/**
	 * Returns the meta object for class '{@link patterns.Maximize <em>Maximize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximize</em>'.
	 * @see patterns.Maximize
	 * @generated
	 */
	EClass getMaximize();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Maximize#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward</em>'.
	 * @see patterns.Maximize#getReward()
	 * @see #getMaximize()
	 * @generated
	 */
	EAttribute getMaximize_Reward();

	/**
	 * Returns the meta object for class '{@link patterns.ElementaryPatterns <em>Elementary Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Patterns</em>'.
	 * @see patterns.ElementaryPatterns
	 * @generated
	 */
	EClass getElementaryPatterns();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ElementaryPatterns#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see patterns.ElementaryPatterns#getMeasure()
	 * @see #getElementaryPatterns()
	 * @generated
	 */
	EAttribute getElementaryPatterns_Measure();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.ElementaryPatterns#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mission</em>'.
	 * @see patterns.ElementaryPatterns#getMission()
	 * @see #getElementaryPatterns()
	 * @generated
	 */
	EReference getElementaryPatterns_Mission();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ElementaryPatterns#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see patterns.ElementaryPatterns#getType()
	 * @see #getElementaryPatterns()
	 * @generated
	 */
	EAttribute getElementaryPatterns_Type();

	/**
	 * Returns the meta object for class '{@link patterns.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see patterns.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for the attribute '{@link patterns.LessThan#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.LessThan#getValue()
	 * @see #getLessThan()
	 * @generated
	 */
	EAttribute getLessThan_Value();

	/**
	 * Returns the meta object for class '{@link patterns.Minimize <em>Minimize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimize</em>'.
	 * @see patterns.Minimize
	 * @generated
	 */
	EClass getMinimize();

	/**
	 * Returns the meta object for class '{@link patterns.AtMost <em>At Most</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Most</em>'.
	 * @see patterns.AtMost
	 * @generated
	 */
	EClass getAtMost();

	/**
	 * Returns the meta object for the attribute '{@link patterns.AtMost#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.AtMost#getValue()
	 * @see #getAtMost()
	 * @generated
	 */
	EAttribute getAtMost_Value();

	/**
	 * Returns the meta object for the attribute '{@link patterns.AtMost#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward</em>'.
	 * @see patterns.AtMost#getReward()
	 * @see #getAtMost()
	 * @generated
	 */
	EAttribute getAtMost_Reward();

	/**
	 * Returns the meta object for class '{@link patterns.AtLeast <em>At Least</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Least</em>'.
	 * @see patterns.AtLeast
	 * @generated
	 */
	EClass getAtLeast();

	/**
	 * Returns the meta object for the attribute '{@link patterns.AtLeast#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.AtLeast#getValue()
	 * @see #getAtLeast()
	 * @generated
	 */
	EAttribute getAtLeast_Value();

	/**
	 * Returns the meta object for class '{@link patterns.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see patterns.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the attribute '{@link patterns.GreaterThan#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.GreaterThan#getValue()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EAttribute getGreaterThan_Value();

	/**
	 * Returns the meta object for class '{@link patterns.Within <em>Within</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within</em>'.
	 * @see patterns.Within
	 * @generated
	 */
	EClass getWithin();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Within#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see patterns.Within#getValue1()
	 * @see #getWithin()
	 * @generated
	 */
	EAttribute getWithin_Value1();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Within#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see patterns.Within#getValue2()
	 * @see #getWithin()
	 * @generated
	 */
	EAttribute getWithin_Value2();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Within#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward</em>'.
	 * @see patterns.Within#getReward()
	 * @see #getWithin()
	 * @generated
	 */
	EAttribute getWithin_Reward();

	/**
	 * Returns the meta object for class '{@link patterns.StrictlyWithin <em>Strictly Within</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strictly Within</em>'.
	 * @see patterns.StrictlyWithin
	 * @generated
	 */
	EClass getStrictlyWithin();

	/**
	 * Returns the meta object for the attribute '{@link patterns.StrictlyWithin#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see patterns.StrictlyWithin#getValue1()
	 * @see #getStrictlyWithin()
	 * @generated
	 */
	EAttribute getStrictlyWithin_Value1();

	/**
	 * Returns the meta object for the attribute '{@link patterns.StrictlyWithin#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see patterns.StrictlyWithin#getValue2()
	 * @see #getStrictlyWithin()
	 * @generated
	 */
	EAttribute getStrictlyWithin_Value2();

	/**
	 * Returns the meta object for class '{@link patterns.CompositePatterns <em>Composite Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Patterns</em>'.
	 * @see patterns.CompositePatterns
	 * @generated
	 */
	EClass getCompositePatterns();

	/**
	 * Returns the meta object for class '{@link patterns.Missions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missions</em>'.
	 * @see patterns.Missions
	 * @generated
	 */
	EClass getMissions();

	/**
	 * Returns the meta object for class '{@link patterns.ShallMissions <em>Shall Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shall Missions</em>'.
	 * @see patterns.ShallMissions
	 * @generated
	 */
	EClass getShallMissions();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ShallMissions#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see patterns.ShallMissions#getId()
	 * @see #getShallMissions()
	 * @generated
	 */
	EAttribute getShallMissions_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ShallMissions#getMovementPatterns <em>Movement Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Movement Patterns</em>'.
	 * @see patterns.ShallMissions#getMovementPatterns()
	 * @see #getShallMissions()
	 * @generated
	 */
	EReference getShallMissions_MovementPatterns();

	/**
	 * Returns the meta object for the reference '{@link patterns.ShallMissions#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots</em>'.
	 * @see patterns.ShallMissions#getRobots()
	 * @see #getShallMissions()
	 * @generated
	 */
	EReference getShallMissions_Robots();

	/**
	 * Returns the meta object for class '{@link patterns.ActionEnd <em>Action End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action End</em>'.
	 * @see patterns.ActionEnd
	 * @generated
	 */
	EClass getActionEnd();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ActionEnd#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see patterns.ActionEnd#getDescription()
	 * @see #getActionEnd()
	 * @generated
	 */
	EAttribute getActionEnd_Description();

	/**
	 * Returns the meta object for the reference '{@link patterns.ActionEnd#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see patterns.ActionEnd#getAction()
	 * @see #getActionEnd()
	 * @generated
	 */
	EReference getActionEnd_Action();

	/**
	 * Returns the meta object for class '{@link patterns.Delayed <em>Delayed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed</em>'.
	 * @see patterns.Delayed
	 * @generated
	 */
	EClass getDelayed();

	/**
	 * Returns the meta object for class '{@link patterns.ComplexMissions <em>Complex Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Missions</em>'.
	 * @see patterns.ComplexMissions
	 * @generated
	 */
	EClass getComplexMissions();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.ComplexMissions#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composition</em>'.
	 * @see patterns.ComplexMissions#getComposition()
	 * @see #getComplexMissions()
	 * @generated
	 */
	EReference getComplexMissions_Composition();

	/**
	 * Returns the meta object for class '{@link patterns.MissionOperation <em>Mission Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Operation</em>'.
	 * @see patterns.MissionOperation
	 * @generated
	 */
	EClass getMissionOperation();

	/**
	 * Returns the meta object for class '{@link patterns.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see patterns.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.Negation#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see patterns.Negation#getNot()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Not();

	/**
	 * Returns the meta object for class '{@link patterns.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see patterns.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Composition#getBinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Type</em>'.
	 * @see patterns.Composition#getBinaryType()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_BinaryType();

	/**
	 * Returns the meta object for the reference '{@link patterns.Composition#getMiss1 <em>Miss1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Miss1</em>'.
	 * @see patterns.Composition#getMiss1()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Miss1();

	/**
	 * Returns the meta object for the reference '{@link patterns.Composition#getMiss2 <em>Miss2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Miss2</em>'.
	 * @see patterns.Composition#getMiss2()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Miss2();

	/**
	 * Returns the meta object for class '{@link patterns.Conservation <em>Conservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conservation</em>'.
	 * @see patterns.Conservation
	 * @generated
	 */
	EClass getConservation();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Conservation#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see patterns.Conservation#getMeasure()
	 * @see #getConservation()
	 * @generated
	 */
	EAttribute getConservation_Measure();

	/**
	 * Returns the meta object for class '{@link patterns.Preservation <em>Preservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preservation</em>'.
	 * @see patterns.Preservation
	 * @generated
	 */
	EClass getPreservation();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Preservation#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see patterns.Preservation#getMeasure()
	 * @see #getPreservation()
	 * @generated
	 */
	EAttribute getPreservation_Measure();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Preservation#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see patterns.Preservation#getValue1()
	 * @see #getPreservation()
	 * @generated
	 */
	EAttribute getPreservation_Value1();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Preservation#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see patterns.Preservation#getValue2()
	 * @see #getPreservation()
	 * @generated
	 */
	EAttribute getPreservation_Value2();

	/**
	 * Returns the meta object for class '{@link patterns.RepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Every</em>'.
	 * @see patterns.RepeatEvery
	 * @generated
	 */
	EClass getRepeatEvery();

	/**
	 * Returns the meta object for class '{@link patterns.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed</em>'.
	 * @see patterns.Timed
	 * @generated
	 */
	EClass getTimed();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Timed#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>T</em>'.
	 * @see patterns.Timed#getT()
	 * @see #getTimed()
	 * @generated
	 */
	EAttribute getTimed_T();

	/**
	 * Returns the meta object for class '{@link patterns.ConditionDependent <em>Condition Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Dependent</em>'.
	 * @see patterns.ConditionDependent
	 * @generated
	 */
	EClass getConditionDependent();

	/**
	 * Returns the meta object for the reference '{@link patterns.ConditionDependent#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see patterns.ConditionDependent#getCondition()
	 * @see #getConditionDependent()
	 * @generated
	 */
	EReference getConditionDependent_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link patterns.ConditionDependent#getLocationevent <em>Locationevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locationevent</em>'.
	 * @see patterns.ConditionDependent#getLocationevent()
	 * @see #getConditionDependent()
	 * @generated
	 */
	EReference getConditionDependent_Locationevent();

	/**
	 * Returns the meta object for class '{@link patterns.ActionDependent <em>Action Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Dependent</em>'.
	 * @see patterns.ActionDependent
	 * @generated
	 */
	EClass getActionDependent();

	/**
	 * Returns the meta object for the reference '{@link patterns.ActionDependent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see patterns.ActionDependent#getAction()
	 * @see #getActionDependent()
	 * @generated
	 */
	EReference getActionDependent_Action();

	/**
	 * Returns the meta object for class '{@link patterns.MissionDependent <em>Mission Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Dependent</em>'.
	 * @see patterns.MissionDependent
	 * @generated
	 */
	EClass getMissionDependent();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.MissionDependent#getMissions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Missions</em>'.
	 * @see patterns.MissionDependent#getMissions()
	 * @see #getMissionDependent()
	 * @generated
	 */
	EReference getMissionDependent_Missions();

	/**
	 * Returns the meta object for class '{@link patterns.Maintain <em>Maintain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintain</em>'.
	 * @see patterns.Maintain
	 * @generated
	 */
	EClass getMaintain();

	/**
	 * Returns the meta object for class '{@link patterns.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see patterns.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link patterns.End#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.End#getValue()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Value();

	/**
	 * Returns the meta object for class '{@link patterns.ResumeIf <em>Resume If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume If</em>'.
	 * @see patterns.ResumeIf
	 * @generated
	 */
	EClass getResumeIf();

	/**
	 * Returns the meta object for class '{@link patterns.Accrue <em>Accrue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accrue</em>'.
	 * @see patterns.Accrue
	 * @generated
	 */
	EClass getAccrue();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Accrue#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see patterns.Accrue#getMeasure()
	 * @see #getAccrue()
	 * @generated
	 */
	EAttribute getAccrue_Measure();

	/**
	 * Returns the meta object for the reference '{@link patterns.Accrue#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots</em>'.
	 * @see patterns.Accrue#getRobots()
	 * @see #getAccrue()
	 * @generated
	 */
	EReference getAccrue_Robots();

	/**
	 * Returns the meta object for class '{@link patterns.Secure <em>Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure</em>'.
	 * @see patterns.Secure
	 * @generated
	 */
	EClass getSecure();

	/**
	 * Returns the meta object for class '{@link patterns.Equidistance <em>Equidistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equidistance</em>'.
	 * @see patterns.Equidistance
	 * @generated
	 */
	EClass getEquidistance();

	/**
	 * Returns the meta object for the reference '{@link patterns.Equidistance#getLocation1 <em>Location1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location1</em>'.
	 * @see patterns.Equidistance#getLocation1()
	 * @see #getEquidistance()
	 * @generated
	 */
	EReference getEquidistance_Location1();

	/**
	 * Returns the meta object for the reference '{@link patterns.Equidistance#getLocation2 <em>Location2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location2</em>'.
	 * @see patterns.Equidistance#getLocation2()
	 * @see #getEquidistance()
	 * @generated
	 */
	EReference getEquidistance_Location2();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Equidistance#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see patterns.Equidistance#getDistance()
	 * @see #getEquidistance()
	 * @generated
	 */
	EAttribute getEquidistance_Distance();

	/**
	 * Returns the meta object for the reference '{@link patterns.Equidistance#getRobots1 <em>Robots1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots1</em>'.
	 * @see patterns.Equidistance#getRobots1()
	 * @see #getEquidistance()
	 * @generated
	 */
	EReference getEquidistance_Robots1();

	/**
	 * Returns the meta object for the reference '{@link patterns.Equidistance#getRobots2 <em>Robots2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots2</em>'.
	 * @see patterns.Equidistance#getRobots2()
	 * @see #getEquidistance()
	 * @generated
	 */
	EReference getEquidistance_Robots2();

	/**
	 * Returns the meta object for the reference '{@link patterns.Equidistance#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots</em>'.
	 * @see patterns.Equidistance#getRobots()
	 * @see #getEquidistance()
	 * @generated
	 */
	EReference getEquidistance_Robots();

	/**
	 * Returns the meta object for class '{@link patterns.Trail <em>Trail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trail</em>'.
	 * @see patterns.Trail
	 * @generated
	 */
	EClass getTrail();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Trail#getObjetToFollow <em>Objet To Follow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objet To Follow</em>'.
	 * @see patterns.Trail#getObjetToFollow()
	 * @see #getTrail()
	 * @generated
	 */
	EAttribute getTrail_ObjetToFollow();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Trail#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.Trail#getValue()
	 * @see #getTrail()
	 * @generated
	 */
	EAttribute getTrail_Value();

	/**
	 * Returns the meta object for the reference '{@link patterns.Trail#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots</em>'.
	 * @see patterns.Trail#getRobots()
	 * @see #getTrail()
	 * @generated
	 */
	EReference getTrail_Robots();

	/**
	 * Returns the meta object for class '{@link patterns.LocationDependent <em>Location Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Dependent</em>'.
	 * @see patterns.LocationDependent
	 * @generated
	 */
	EClass getLocationDependent();

	/**
	 * Returns the meta object for the reference list '{@link patterns.LocationDependent#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see patterns.LocationDependent#getLocations()
	 * @see #getLocationDependent()
	 * @generated
	 */
	EReference getLocationDependent_Locations();

	/**
	 * Returns the meta object for class '{@link patterns.Pause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pause</em>'.
	 * @see patterns.Pause
	 * @generated
	 */
	EClass getPause();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Pause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.Pause#getValue()
	 * @see #getPause()
	 * @generated
	 */
	EAttribute getPause_Value();

	/**
	 * Returns the meta object for class '{@link patterns.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout</em>'.
	 * @see patterns.Timeout
	 * @generated
	 */
	EClass getTimeout();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Timeout#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.Timeout#getValue()
	 * @see #getTimeout()
	 * @generated
	 */
	EAttribute getTimeout_Value();

	/**
	 * Returns the meta object for class '{@link patterns.ReliabilityConfidence <em>Reliability Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability Confidence</em>'.
	 * @see patterns.ReliabilityConfidence
	 * @generated
	 */
	EClass getReliabilityConfidence();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ReliabilityConfidence#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see patterns.ReliabilityConfidence#getMeasure()
	 * @see #getReliabilityConfidence()
	 * @generated
	 */
	EAttribute getReliabilityConfidence_Measure();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ReliabilityConfidence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.ReliabilityConfidence#getValue()
	 * @see #getReliabilityConfidence()
	 * @generated
	 */
	EAttribute getReliabilityConfidence_Value();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ReliabilityConfidence#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see patterns.ReliabilityConfidence#getType1()
	 * @see #getReliabilityConfidence()
	 * @generated
	 */
	EAttribute getReliabilityConfidence_Type1();

	/**
	 * Returns the meta object for the attribute '{@link patterns.ReliabilityConfidence#getType2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type2</em>'.
	 * @see patterns.ReliabilityConfidence#getType2()
	 * @see #getReliabilityConfidence()
	 * @generated
	 */
	EAttribute getReliabilityConfidence_Type2();

	/**
	 * Returns the meta object for class '{@link patterns.LevelOfConfidence <em>Level Of Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Of Confidence</em>'.
	 * @see patterns.LevelOfConfidence
	 * @generated
	 */
	EClass getLevelOfConfidence();

	/**
	 * Returns the meta object for the attribute '{@link patterns.LevelOfConfidence#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see patterns.LevelOfConfidence#getConfidence()
	 * @see #getLevelOfConfidence()
	 * @generated
	 */
	EAttribute getLevelOfConfidence_Confidence();

	/**
	 * Returns the meta object for class '{@link patterns.Relaxed <em>Relaxed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relaxed</em>'.
	 * @see patterns.Relaxed
	 * @generated
	 */
	EClass getRelaxed();

	/**
	 * Returns the meta object for class '{@link patterns.AlmostAt <em>Almost At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Almost At</em>'.
	 * @see patterns.AlmostAt
	 * @generated
	 */
	EClass getAlmostAt();

	/**
	 * Returns the meta object for class '{@link patterns.ExactlyAt <em>Exactly At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exactly At</em>'.
	 * @see patterns.ExactlyAt
	 * @generated
	 */
	EClass getExactlyAt();

	/**
	 * Returns the meta object for class '{@link patterns.DeadlineAt <em>Deadline At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline At</em>'.
	 * @see patterns.DeadlineAt
	 * @generated
	 */
	EClass getDeadlineAt();

	/**
	 * Returns the meta object for class '{@link patterns.Proportional <em>Proportional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportional</em>'.
	 * @see patterns.Proportional
	 * @generated
	 */
	EClass getProportional();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.Proportional#getMission1 <em>Mission1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mission1</em>'.
	 * @see patterns.Proportional#getMission1()
	 * @see #getProportional()
	 * @generated
	 */
	EReference getProportional_Mission1();

	/**
	 * Returns the meta object for the containment reference '{@link patterns.Proportional#getMission2 <em>Mission2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mission2</em>'.
	 * @see patterns.Proportional#getMission2()
	 * @see #getProportional()
	 * @generated
	 */
	EReference getProportional_Mission2();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Proportional#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.Proportional#getValue()
	 * @see #getProportional()
	 * @generated
	 */
	EAttribute getProportional_Value();

	/**
	 * Returns the meta object for class '{@link patterns.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see patterns.Execute
	 * @generated
	 */
	EClass getExecute();

	/**
	 * Returns the meta object for the reference '{@link patterns.Execute#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robots</em>'.
	 * @see patterns.Execute#getRobots()
	 * @see #getExecute()
	 * @generated
	 */
	EReference getExecute_Robots();

	/**
	 * Returns the meta object for class '{@link patterns.SetOfActionsDependent <em>Set Of Actions Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Of Actions Dependent</em>'.
	 * @see patterns.SetOfActionsDependent
	 * @generated
	 */
	EClass getSetOfActionsDependent();

	/**
	 * Returns the meta object for the reference list '{@link patterns.SetOfActionsDependent#getSetOfActions <em>Set Of Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Set Of Actions</em>'.
	 * @see patterns.SetOfActionsDependent#getSetOfActions()
	 * @see #getSetOfActionsDependent()
	 * @generated
	 */
	EReference getSetOfActionsDependent_SetOfActions();

	/**
	 * Returns the meta object for class '{@link patterns.Sequencing <em>Sequencing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequencing</em>'.
	 * @see patterns.Sequencing
	 * @generated
	 */
	EClass getSequencing();

	/**
	 * Returns the meta object for class '{@link patterns.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation</em>'.
	 * @see patterns.Deviation
	 * @generated
	 */
	EClass getDeviation();

	/**
	 * Returns the meta object for class '{@link patterns.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see patterns.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link patterns.Repeat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see patterns.Repeat#getValue()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_Value();

	/**
	 * Returns the meta object for class '{@link patterns.TopMissions <em>Top Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Missions</em>'.
	 * @see patterns.TopMissions
	 * @generated
	 */
	EClass getTopMissions();

	/**
	 * Returns the meta object for the reference '{@link patterns.TopMissions#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mission</em>'.
	 * @see patterns.TopMissions#getMission()
	 * @see #getTopMissions()
	 * @generated
	 */
	EReference getTopMissions_Mission();

	/**
	 * Returns the meta object for enum '{@link patterns.CompositionOperator <em>Composition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Operator</em>'.
	 * @see patterns.CompositionOperator
	 * @generated
	 */
	EEnum getCompositionOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link patterns.SpecificationPatterns <em>Specification Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.SpecificationPatterns
		 * @see patterns.impl.PatternsPackageImpl#getSpecificationPatterns()
		 * @generated
		 */
		EClass SPECIFICATION_PATTERNS = eINSTANCE.getSpecificationPatterns();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PATTERNS__LOCATIONS = eINSTANCE.getSpecificationPatterns_Locations();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_PATTERNS__TYPE = eINSTANCE.getSpecificationPatterns_Type();

		/**
		 * The meta object literal for the '{@link patterns.impl.Visit1Impl <em>Visit1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.Visit1Impl
		 * @see patterns.impl.PatternsPackageImpl#getVisit1()
		 * @generated
		 */
		EClass VISIT1 = eINSTANCE.getVisit1();

		/**
		 * The meta object literal for the '{@link patterns.impl.ProblemSpecificationsImpl <em>Problem Specifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ProblemSpecificationsImpl
		 * @see patterns.impl.PatternsPackageImpl#getProblemSpecifications()
		 * @generated
		 */
		EClass PROBLEM_SPECIFICATIONS = eINSTANCE.getProblemSpecifications();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__CONDITION = eINSTANCE.getProblemSpecifications_Condition();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__LOCATION = eINSTANCE.getProblemSpecifications_Location();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__ACTION = eINSTANCE.getProblemSpecifications_Action();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__ROBOTS = eINSTANCE.getProblemSpecifications_Robots();

		/**
		 * The meta object literal for the '<em><b>Topmissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__TOPMISSIONS = eINSTANCE.getProblemSpecifications_Topmissions();

		/**
		 * The meta object literal for the '<em><b>Elementary Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS = eINSTANCE.getProblemSpecifications_ElementaryPatterns();

		/**
		 * The meta object literal for the '<em><b>Composite Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS = eINSTANCE.getProblemSpecifications_CompositePatterns();

		/**
		 * The meta object literal for the '<em><b>Specification Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS = eINSTANCE.getProblemSpecifications_SpecificationPatterns();

		/**
		 * The meta object literal for the '{@link patterns.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.LocationImpl
		 * @see patterns.impl.PatternsPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '{@link patterns.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ActionImpl
		 * @see patterns.impl.PatternsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '{@link patterns.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.SequenceImpl
		 * @see patterns.impl.PatternsPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link patterns.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.OrderImpl
		 * @see patterns.impl.PatternsPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link patterns.impl.StrictOrderImpl <em>Strict Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.StrictOrderImpl
		 * @see patterns.impl.PatternsPackageImpl#getStrictOrder()
		 * @generated
		 */
		EClass STRICT_ORDER = eINSTANCE.getStrictOrder();

		/**
		 * The meta object literal for the '{@link patterns.impl.PatrolImpl <em>Patrol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.PatrolImpl
		 * @see patterns.impl.PatternsPackageImpl#getPatrol()
		 * @generated
		 */
		EClass PATROL = eINSTANCE.getPatrol();

		/**
		 * The meta object literal for the '{@link patterns.AvoidanceVisit <em>Avoidance Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.AvoidanceVisit
		 * @see patterns.impl.PatternsPackageImpl#getAvoidanceVisit()
		 * @generated
		 */
		EClass AVOIDANCE_VISIT = eINSTANCE.getAvoidanceVisit();

		/**
		 * The meta object literal for the '{@link patterns.Restricted <em>Restricted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Restricted
		 * @see patterns.impl.PatternsPackageImpl#getRestricted()
		 * @generated
		 */
		EClass RESTRICTED = eINSTANCE.getRestricted();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTED__NUMBER = eINSTANCE.getRestricted_Number();

		/**
		 * The meta object literal for the '{@link patterns.Conditional <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Conditional
		 * @see patterns.impl.PatternsPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '{@link patterns.impl.LocationEventImpl <em>Location Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.LocationEventImpl
		 * @see patterns.impl.PatternsPackageImpl#getLocationEvent()
		 * @generated
		 */
		EClass LOCATION_EVENT = eINSTANCE.getLocationEvent();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_EVENT__ROBOTS = eINSTANCE.getLocationEvent_Robots();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_EVENT__LOCATION = eINSTANCE.getLocationEvent_Location();

		/**
		 * The meta object literal for the '{@link patterns.Condition <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Condition
		 * @see patterns.impl.PatternsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link patterns.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.EventImpl
		 * @see patterns.impl.PatternsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CONDITION = eINSTANCE.getEvent_Condition();

		/**
		 * The meta object literal for the '{@link patterns.impl.RobotsImpl <em>Robots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.RobotsImpl
		 * @see patterns.impl.PatternsPackageImpl#getRobots()
		 * @generated
		 */
		EClass ROBOTS = eINSTANCE.getRobots();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS__NAME = eINSTANCE.getRobots_Name();

		/**
		 * The meta object literal for the '{@link patterns.impl.FairImpl <em>Fair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.FairImpl
		 * @see patterns.impl.PatternsPackageImpl#getFair()
		 * @generated
		 */
		EClass FAIR = eINSTANCE.getFair();

		/**
		 * The meta object literal for the '{@link patterns.impl.Visit2Impl <em>Visit2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.Visit2Impl
		 * @see patterns.impl.PatternsPackageImpl#getVisit2()
		 * @generated
		 */
		EClass VISIT2 = eINSTANCE.getVisit2();

		/**
		 * The meta object literal for the '{@link patterns.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.LessImpl
		 * @see patterns.impl.PatternsPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link patterns.impl.ExactlyImpl <em>Exactly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ExactlyImpl
		 * @see patterns.impl.PatternsPackageImpl#getExactly()
		 * @generated
		 */
		EClass EXACTLY = eINSTANCE.getExactly();

		/**
		 * The meta object literal for the '{@link patterns.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.SimpleImpl
		 * @see patterns.impl.PatternsPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '{@link patterns.impl.AvoidImpl <em>Avoid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.AvoidImpl
		 * @see patterns.impl.PatternsPackageImpl#getAvoid()
		 * @generated
		 */
		EClass AVOID = eINSTANCE.getAvoid();

		/**
		 * The meta object literal for the '{@link patterns.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.AfterImpl
		 * @see patterns.impl.PatternsPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '{@link patterns.ConditionBased <em>Condition Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.ConditionBased
		 * @see patterns.impl.PatternsPackageImpl#getConditionBased()
		 * @generated
		 */
		EClass CONDITION_BASED = eINSTANCE.getConditionBased();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED__CONDITION = eINSTANCE.getConditionBased_Condition();

		/**
		 * The meta object literal for the '<em><b>Locationevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED__LOCATIONEVENT = eINSTANCE.getConditionBased_Locationevent();

		/**
		 * The meta object literal for the '{@link patterns.Trigger <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Trigger
		 * @see patterns.impl.PatternsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__CONDITION = eINSTANCE.getTrigger_Condition();

		/**
		 * The meta object literal for the '<em><b>Locationevent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__LOCATIONEVENT = eINSTANCE.getTrigger_Locationevent();

		/**
		 * The meta object literal for the '{@link patterns.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.WaitImpl
		 * @see patterns.impl.PatternsPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '{@link patterns.Descriptive <em>Descriptive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Descriptive
		 * @see patterns.impl.PatternsPackageImpl#getDescriptive()
		 * @generated
		 */
		EClass DESCRIPTIVE = eINSTANCE.getDescriptive();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTIVE__PATTERN = eINSTANCE.getDescriptive_Pattern();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTIVE__ACTION = eINSTANCE.getDescriptive_Action();

		/**
		 * The meta object literal for the '{@link patterns.impl.ReactImpl <em>React</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ReactImpl
		 * @see patterns.impl.PatternsPackageImpl#getReact()
		 * @generated
		 */
		EClass REACT = eINSTANCE.getReact();

		/**
		 * The meta object literal for the '{@link patterns.impl.CounteractImpl <em>Counteract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.CounteractImpl
		 * @see patterns.impl.PatternsPackageImpl#getCounteract()
		 * @generated
		 */
		EClass COUNTERACT = eINSTANCE.getCounteract();

		/**
		 * The meta object literal for the '{@link patterns.impl.MaximizeImpl <em>Maximize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.MaximizeImpl
		 * @see patterns.impl.PatternsPackageImpl#getMaximize()
		 * @generated
		 */
		EClass MAXIMIZE = eINSTANCE.getMaximize();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAXIMIZE__REWARD = eINSTANCE.getMaximize_Reward();

		/**
		 * The meta object literal for the '{@link patterns.ElementaryPatterns <em>Elementary Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.ElementaryPatterns
		 * @see patterns.impl.PatternsPackageImpl#getElementaryPatterns()
		 * @generated
		 */
		EClass ELEMENTARY_PATTERNS = eINSTANCE.getElementaryPatterns();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_PATTERNS__MEASURE = eINSTANCE.getElementaryPatterns_Measure();

		/**
		 * The meta object literal for the '<em><b>Mission</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_PATTERNS__MISSION = eINSTANCE.getElementaryPatterns_Mission();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_PATTERNS__TYPE = eINSTANCE.getElementaryPatterns_Type();

		/**
		 * The meta object literal for the '{@link patterns.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.LessThanImpl
		 * @see patterns.impl.PatternsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESS_THAN__VALUE = eINSTANCE.getLessThan_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.MinimizeImpl <em>Minimize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.MinimizeImpl
		 * @see patterns.impl.PatternsPackageImpl#getMinimize()
		 * @generated
		 */
		EClass MINIMIZE = eINSTANCE.getMinimize();

		/**
		 * The meta object literal for the '{@link patterns.impl.AtMostImpl <em>At Most</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.AtMostImpl
		 * @see patterns.impl.PatternsPackageImpl#getAtMost()
		 * @generated
		 */
		EClass AT_MOST = eINSTANCE.getAtMost();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_MOST__VALUE = eINSTANCE.getAtMost_Value();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_MOST__REWARD = eINSTANCE.getAtMost_Reward();

		/**
		 * The meta object literal for the '{@link patterns.impl.AtLeastImpl <em>At Least</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.AtLeastImpl
		 * @see patterns.impl.PatternsPackageImpl#getAtLeast()
		 * @generated
		 */
		EClass AT_LEAST = eINSTANCE.getAtLeast();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_LEAST__VALUE = eINSTANCE.getAtLeast_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.GreaterThanImpl
		 * @see patterns.impl.PatternsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN__VALUE = eINSTANCE.getGreaterThan_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.WithinImpl <em>Within</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.WithinImpl
		 * @see patterns.impl.PatternsPackageImpl#getWithin()
		 * @generated
		 */
		EClass WITHIN = eINSTANCE.getWithin();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHIN__VALUE1 = eINSTANCE.getWithin_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHIN__VALUE2 = eINSTANCE.getWithin_Value2();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHIN__REWARD = eINSTANCE.getWithin_Reward();

		/**
		 * The meta object literal for the '{@link patterns.impl.StrictlyWithinImpl <em>Strictly Within</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.StrictlyWithinImpl
		 * @see patterns.impl.PatternsPackageImpl#getStrictlyWithin()
		 * @generated
		 */
		EClass STRICTLY_WITHIN = eINSTANCE.getStrictlyWithin();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRICTLY_WITHIN__VALUE1 = eINSTANCE.getStrictlyWithin_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRICTLY_WITHIN__VALUE2 = eINSTANCE.getStrictlyWithin_Value2();

		/**
		 * The meta object literal for the '{@link patterns.CompositePatterns <em>Composite Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.CompositePatterns
		 * @see patterns.impl.PatternsPackageImpl#getCompositePatterns()
		 * @generated
		 */
		EClass COMPOSITE_PATTERNS = eINSTANCE.getCompositePatterns();

		/**
		 * The meta object literal for the '{@link patterns.Missions <em>Missions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Missions
		 * @see patterns.impl.PatternsPackageImpl#getMissions()
		 * @generated
		 */
		EClass MISSIONS = eINSTANCE.getMissions();

		/**
		 * The meta object literal for the '{@link patterns.impl.ShallMissionsImpl <em>Shall Missions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ShallMissionsImpl
		 * @see patterns.impl.PatternsPackageImpl#getShallMissions()
		 * @generated
		 */
		EClass SHALL_MISSIONS = eINSTANCE.getShallMissions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHALL_MISSIONS__ID = eINSTANCE.getShallMissions_Id();

		/**
		 * The meta object literal for the '<em><b>Movement Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHALL_MISSIONS__MOVEMENT_PATTERNS = eINSTANCE.getShallMissions_MovementPatterns();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHALL_MISSIONS__ROBOTS = eINSTANCE.getShallMissions_Robots();

		/**
		 * The meta object literal for the '{@link patterns.impl.ActionEndImpl <em>Action End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ActionEndImpl
		 * @see patterns.impl.PatternsPackageImpl#getActionEnd()
		 * @generated
		 */
		EClass ACTION_END = eINSTANCE.getActionEnd();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_END__DESCRIPTION = eINSTANCE.getActionEnd_Description();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_END__ACTION = eINSTANCE.getActionEnd_Action();

		/**
		 * The meta object literal for the '{@link patterns.impl.DelayedImpl <em>Delayed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.DelayedImpl
		 * @see patterns.impl.PatternsPackageImpl#getDelayed()
		 * @generated
		 */
		EClass DELAYED = eINSTANCE.getDelayed();

		/**
		 * The meta object literal for the '{@link patterns.impl.ComplexMissionsImpl <em>Complex Missions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ComplexMissionsImpl
		 * @see patterns.impl.PatternsPackageImpl#getComplexMissions()
		 * @generated
		 */
		EClass COMPLEX_MISSIONS = eINSTANCE.getComplexMissions();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_MISSIONS__COMPOSITION = eINSTANCE.getComplexMissions_Composition();

		/**
		 * The meta object literal for the '{@link patterns.MissionOperation <em>Mission Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.MissionOperation
		 * @see patterns.impl.PatternsPackageImpl#getMissionOperation()
		 * @generated
		 */
		EClass MISSION_OPERATION = eINSTANCE.getMissionOperation();

		/**
		 * The meta object literal for the '{@link patterns.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.NegationImpl
		 * @see patterns.impl.PatternsPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__NOT = eINSTANCE.getNegation_Not();

		/**
		 * The meta object literal for the '{@link patterns.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.CompositionImpl
		 * @see patterns.impl.PatternsPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Binary Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__BINARY_TYPE = eINSTANCE.getComposition_BinaryType();

		/**
		 * The meta object literal for the '<em><b>Miss1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__MISS1 = eINSTANCE.getComposition_Miss1();

		/**
		 * The meta object literal for the '<em><b>Miss2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__MISS2 = eINSTANCE.getComposition_Miss2();

		/**
		 * The meta object literal for the '{@link patterns.impl.ConservationImpl <em>Conservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ConservationImpl
		 * @see patterns.impl.PatternsPackageImpl#getConservation()
		 * @generated
		 */
		EClass CONSERVATION = eINSTANCE.getConservation();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSERVATION__MEASURE = eINSTANCE.getConservation_Measure();

		/**
		 * The meta object literal for the '{@link patterns.impl.PreservationImpl <em>Preservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.PreservationImpl
		 * @see patterns.impl.PatternsPackageImpl#getPreservation()
		 * @generated
		 */
		EClass PRESERVATION = eINSTANCE.getPreservation();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESERVATION__MEASURE = eINSTANCE.getPreservation_Measure();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESERVATION__VALUE1 = eINSTANCE.getPreservation_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESERVATION__VALUE2 = eINSTANCE.getPreservation_Value2();

		/**
		 * The meta object literal for the '{@link patterns.impl.RepeatEveryImpl <em>Repeat Every</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.RepeatEveryImpl
		 * @see patterns.impl.PatternsPackageImpl#getRepeatEvery()
		 * @generated
		 */
		EClass REPEAT_EVERY = eINSTANCE.getRepeatEvery();

		/**
		 * The meta object literal for the '{@link patterns.Timed <em>Timed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.Timed
		 * @see patterns.impl.PatternsPackageImpl#getTimed()
		 * @generated
		 */
		EClass TIMED = eINSTANCE.getTimed();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED__T = eINSTANCE.getTimed_T();

		/**
		 * The meta object literal for the '{@link patterns.ConditionDependent <em>Condition Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.ConditionDependent
		 * @see patterns.impl.PatternsPackageImpl#getConditionDependent()
		 * @generated
		 */
		EClass CONDITION_DEPENDENT = eINSTANCE.getConditionDependent();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_DEPENDENT__CONDITION = eINSTANCE.getConditionDependent_Condition();

		/**
		 * The meta object literal for the '<em><b>Locationevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_DEPENDENT__LOCATIONEVENT = eINSTANCE.getConditionDependent_Locationevent();

		/**
		 * The meta object literal for the '{@link patterns.ActionDependent <em>Action Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.ActionDependent
		 * @see patterns.impl.PatternsPackageImpl#getActionDependent()
		 * @generated
		 */
		EClass ACTION_DEPENDENT = eINSTANCE.getActionDependent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DEPENDENT__ACTION = eINSTANCE.getActionDependent_Action();

		/**
		 * The meta object literal for the '{@link patterns.MissionDependent <em>Mission Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.MissionDependent
		 * @see patterns.impl.PatternsPackageImpl#getMissionDependent()
		 * @generated
		 */
		EClass MISSION_DEPENDENT = eINSTANCE.getMissionDependent();

		/**
		 * The meta object literal for the '<em><b>Missions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_DEPENDENT__MISSIONS = eINSTANCE.getMissionDependent_Missions();

		/**
		 * The meta object literal for the '{@link patterns.impl.MaintainImpl <em>Maintain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.MaintainImpl
		 * @see patterns.impl.PatternsPackageImpl#getMaintain()
		 * @generated
		 */
		EClass MAINTAIN = eINSTANCE.getMaintain();

		/**
		 * The meta object literal for the '{@link patterns.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.EndImpl
		 * @see patterns.impl.PatternsPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__VALUE = eINSTANCE.getEnd_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.ResumeIfImpl <em>Resume If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ResumeIfImpl
		 * @see patterns.impl.PatternsPackageImpl#getResumeIf()
		 * @generated
		 */
		EClass RESUME_IF = eINSTANCE.getResumeIf();

		/**
		 * The meta object literal for the '{@link patterns.impl.AccrueImpl <em>Accrue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.AccrueImpl
		 * @see patterns.impl.PatternsPackageImpl#getAccrue()
		 * @generated
		 */
		EClass ACCRUE = eINSTANCE.getAccrue();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCRUE__MEASURE = eINSTANCE.getAccrue_Measure();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCRUE__ROBOTS = eINSTANCE.getAccrue_Robots();

		/**
		 * The meta object literal for the '{@link patterns.impl.SecureImpl <em>Secure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.SecureImpl
		 * @see patterns.impl.PatternsPackageImpl#getSecure()
		 * @generated
		 */
		EClass SECURE = eINSTANCE.getSecure();

		/**
		 * The meta object literal for the '{@link patterns.impl.EquidistanceImpl <em>Equidistance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.EquidistanceImpl
		 * @see patterns.impl.PatternsPackageImpl#getEquidistance()
		 * @generated
		 */
		EClass EQUIDISTANCE = eINSTANCE.getEquidistance();

		/**
		 * The meta object literal for the '<em><b>Location1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIDISTANCE__LOCATION1 = eINSTANCE.getEquidistance_Location1();

		/**
		 * The meta object literal for the '<em><b>Location2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIDISTANCE__LOCATION2 = eINSTANCE.getEquidistance_Location2();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIDISTANCE__DISTANCE = eINSTANCE.getEquidistance_Distance();

		/**
		 * The meta object literal for the '<em><b>Robots1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIDISTANCE__ROBOTS1 = eINSTANCE.getEquidistance_Robots1();

		/**
		 * The meta object literal for the '<em><b>Robots2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIDISTANCE__ROBOTS2 = eINSTANCE.getEquidistance_Robots2();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIDISTANCE__ROBOTS = eINSTANCE.getEquidistance_Robots();

		/**
		 * The meta object literal for the '{@link patterns.impl.TrailImpl <em>Trail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.TrailImpl
		 * @see patterns.impl.PatternsPackageImpl#getTrail()
		 * @generated
		 */
		EClass TRAIL = eINSTANCE.getTrail();

		/**
		 * The meta object literal for the '<em><b>Objet To Follow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIL__OBJET_TO_FOLLOW = eINSTANCE.getTrail_ObjetToFollow();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIL__VALUE = eINSTANCE.getTrail_Value();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIL__ROBOTS = eINSTANCE.getTrail_Robots();

		/**
		 * The meta object literal for the '{@link patterns.LocationDependent <em>Location Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.LocationDependent
		 * @see patterns.impl.PatternsPackageImpl#getLocationDependent()
		 * @generated
		 */
		EClass LOCATION_DEPENDENT = eINSTANCE.getLocationDependent();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_DEPENDENT__LOCATIONS = eINSTANCE.getLocationDependent_Locations();

		/**
		 * The meta object literal for the '{@link patterns.impl.PauseImpl <em>Pause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.PauseImpl
		 * @see patterns.impl.PatternsPackageImpl#getPause()
		 * @generated
		 */
		EClass PAUSE = eINSTANCE.getPause();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAUSE__VALUE = eINSTANCE.getPause_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.TimeoutImpl <em>Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.TimeoutImpl
		 * @see patterns.impl.PatternsPackageImpl#getTimeout()
		 * @generated
		 */
		EClass TIMEOUT = eINSTANCE.getTimeout();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT__VALUE = eINSTANCE.getTimeout_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.ReliabilityConfidenceImpl <em>Reliability Confidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ReliabilityConfidenceImpl
		 * @see patterns.impl.PatternsPackageImpl#getReliabilityConfidence()
		 * @generated
		 */
		EClass RELIABILITY_CONFIDENCE = eINSTANCE.getReliabilityConfidence();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY_CONFIDENCE__MEASURE = eINSTANCE.getReliabilityConfidence_Measure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY_CONFIDENCE__VALUE = eINSTANCE.getReliabilityConfidence_Value();

		/**
		 * The meta object literal for the '<em><b>Type1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY_CONFIDENCE__TYPE1 = eINSTANCE.getReliabilityConfidence_Type1();

		/**
		 * The meta object literal for the '<em><b>Type2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY_CONFIDENCE__TYPE2 = eINSTANCE.getReliabilityConfidence_Type2();

		/**
		 * The meta object literal for the '{@link patterns.LevelOfConfidence <em>Level Of Confidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.LevelOfConfidence
		 * @see patterns.impl.PatternsPackageImpl#getLevelOfConfidence()
		 * @generated
		 */
		EClass LEVEL_OF_CONFIDENCE = eINSTANCE.getLevelOfConfidence();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_OF_CONFIDENCE__CONFIDENCE = eINSTANCE.getLevelOfConfidence_Confidence();

		/**
		 * The meta object literal for the '{@link patterns.impl.RelaxedImpl <em>Relaxed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.RelaxedImpl
		 * @see patterns.impl.PatternsPackageImpl#getRelaxed()
		 * @generated
		 */
		EClass RELAXED = eINSTANCE.getRelaxed();

		/**
		 * The meta object literal for the '{@link patterns.impl.AlmostAtImpl <em>Almost At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.AlmostAtImpl
		 * @see patterns.impl.PatternsPackageImpl#getAlmostAt()
		 * @generated
		 */
		EClass ALMOST_AT = eINSTANCE.getAlmostAt();

		/**
		 * The meta object literal for the '{@link patterns.impl.ExactlyAtImpl <em>Exactly At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ExactlyAtImpl
		 * @see patterns.impl.PatternsPackageImpl#getExactlyAt()
		 * @generated
		 */
		EClass EXACTLY_AT = eINSTANCE.getExactlyAt();

		/**
		 * The meta object literal for the '{@link patterns.impl.DeadlineAtImpl <em>Deadline At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.DeadlineAtImpl
		 * @see patterns.impl.PatternsPackageImpl#getDeadlineAt()
		 * @generated
		 */
		EClass DEADLINE_AT = eINSTANCE.getDeadlineAt();

		/**
		 * The meta object literal for the '{@link patterns.impl.ProportionalImpl <em>Proportional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ProportionalImpl
		 * @see patterns.impl.PatternsPackageImpl#getProportional()
		 * @generated
		 */
		EClass PROPORTIONAL = eINSTANCE.getProportional();

		/**
		 * The meta object literal for the '<em><b>Mission1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPORTIONAL__MISSION1 = eINSTANCE.getProportional_Mission1();

		/**
		 * The meta object literal for the '<em><b>Mission2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPORTIONAL__MISSION2 = eINSTANCE.getProportional_Mission2();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPORTIONAL__VALUE = eINSTANCE.getProportional_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.ExecuteImpl
		 * @see patterns.impl.PatternsPackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE__ROBOTS = eINSTANCE.getExecute_Robots();

		/**
		 * The meta object literal for the '{@link patterns.SetOfActionsDependent <em>Set Of Actions Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.SetOfActionsDependent
		 * @see patterns.impl.PatternsPackageImpl#getSetOfActionsDependent()
		 * @generated
		 */
		EClass SET_OF_ACTIONS_DEPENDENT = eINSTANCE.getSetOfActionsDependent();

		/**
		 * The meta object literal for the '<em><b>Set Of Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OF_ACTIONS_DEPENDENT__SET_OF_ACTIONS = eINSTANCE.getSetOfActionsDependent_SetOfActions();

		/**
		 * The meta object literal for the '{@link patterns.impl.SequencingImpl <em>Sequencing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.SequencingImpl
		 * @see patterns.impl.PatternsPackageImpl#getSequencing()
		 * @generated
		 */
		EClass SEQUENCING = eINSTANCE.getSequencing();

		/**
		 * The meta object literal for the '{@link patterns.impl.DeviationImpl <em>Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.DeviationImpl
		 * @see patterns.impl.PatternsPackageImpl#getDeviation()
		 * @generated
		 */
		EClass DEVIATION = eINSTANCE.getDeviation();

		/**
		 * The meta object literal for the '{@link patterns.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.RepeatImpl
		 * @see patterns.impl.PatternsPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__VALUE = eINSTANCE.getRepeat_Value();

		/**
		 * The meta object literal for the '{@link patterns.impl.TopMissionsImpl <em>Top Missions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.impl.TopMissionsImpl
		 * @see patterns.impl.PatternsPackageImpl#getTopMissions()
		 * @generated
		 */
		EClass TOP_MISSIONS = eINSTANCE.getTopMissions();

		/**
		 * The meta object literal for the '<em><b>Mission</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_MISSIONS__MISSION = eINSTANCE.getTopMissions_Mission();

		/**
		 * The meta object literal for the '{@link patterns.CompositionOperator <em>Composition Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterns.CompositionOperator
		 * @see patterns.impl.PatternsPackageImpl#getCompositionOperator()
		 * @generated
		 */
		EEnum COMPOSITION_OPERATOR = eINSTANCE.getCompositionOperator();

	}

} //PatternsPackage
