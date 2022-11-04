/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.ProblemSpecifications;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Problem Specifications</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemSpecificationsTest extends TestCase {

	/**
	 * The fixture for this Problem Specifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSpecifications fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProblemSpecificationsTest.class);
	}

	/**
	 * Constructs a new Problem Specifications test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSpecificationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Problem Specifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProblemSpecifications fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Problem Specifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemSpecifications getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createProblemSpecifications());
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

} //ProblemSpecificationsTest
