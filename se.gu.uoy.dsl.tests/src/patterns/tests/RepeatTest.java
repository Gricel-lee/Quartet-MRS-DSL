/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.Repeat;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepeatTest extends TestCase {

	/**
	 * The fixture for this Repeat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Repeat fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RepeatTest.class);
	}

	/**
	 * Constructs a new Repeat test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Repeat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Repeat fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Repeat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Repeat getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createRepeat());
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

} //RepeatTest
