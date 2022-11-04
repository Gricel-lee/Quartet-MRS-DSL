/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.ReliabilityConfidence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reliability Confidence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityConfidenceTest extends TestCase {

	/**
	 * The fixture for this Reliability Confidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityConfidence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReliabilityConfidenceTest.class);
	}

	/**
	 * Constructs a new Reliability Confidence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityConfidenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reliability Confidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReliabilityConfidence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reliability Confidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityConfidence getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternsFactory.eINSTANCE.createReliabilityConfidence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ReliabilityConfidenceTest
