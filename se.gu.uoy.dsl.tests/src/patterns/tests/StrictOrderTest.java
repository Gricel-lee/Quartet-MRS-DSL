/**
 */
package patterns.tests;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.StrictOrder;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Strict Order</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrictOrderTest extends Visit1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StrictOrderTest.class);
	}

	/**
	 * Constructs a new Strict Order test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictOrderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Strict Order test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StrictOrder getFixture() {
		return (StrictOrder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternsFactory.eINSTANCE.createStrictOrder());
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

} //StrictOrderTest
