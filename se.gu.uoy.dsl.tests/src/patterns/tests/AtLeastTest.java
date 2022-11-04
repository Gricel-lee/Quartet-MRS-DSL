/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.AtLeast;
import patterns.PatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>At Least</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtLeastTest extends TestCase {

	/**
	 * The fixture for this At Least test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtLeast fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtLeastTest.class);
	}

	/**
	 * Constructs a new At Least test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtLeastTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this At Least test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AtLeast fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this At Least test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtLeast getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createAtLeast());
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

} //AtLeastTest
