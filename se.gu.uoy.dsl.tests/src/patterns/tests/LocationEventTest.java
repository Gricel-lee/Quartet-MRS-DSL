/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.LocationEvent;
import patterns.PatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationEventTest extends TestCase {

	/**
	 * The fixture for this Location Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationEvent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationEventTest.class);
	}

	/**
	 * Constructs a new Location Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationEventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Location Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocationEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Location Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationEvent getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createLocationEvent());
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

} //LocationEventTest
