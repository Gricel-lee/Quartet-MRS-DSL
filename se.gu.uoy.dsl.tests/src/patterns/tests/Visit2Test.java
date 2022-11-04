/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.Visit2;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Visit2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Visit2Test extends TestCase {

	/**
	 * The fixture for this Visit2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Visit2 fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Visit2Test.class);
	}

	/**
	 * Constructs a new Visit2 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visit2Test(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Visit2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Visit2 fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Visit2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Visit2 getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createVisit2());
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

} //Visit2Test
