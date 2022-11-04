/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.StrictlyWithin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Strictly Within</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrictlyWithinTest extends TestCase {

	/**
	 * The fixture for this Strictly Within test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrictlyWithin fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StrictlyWithinTest.class);
	}

	/**
	 * Constructs a new Strictly Within test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictlyWithinTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Strictly Within test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StrictlyWithin fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Strictly Within test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrictlyWithin getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createStrictlyWithin());
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

} //StrictlyWithinTest
