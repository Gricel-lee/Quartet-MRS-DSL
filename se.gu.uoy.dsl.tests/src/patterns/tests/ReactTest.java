/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.React;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>React</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactTest extends TestCase {

	/**
	 * The fixture for this React test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected React fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReactTest.class);
	}

	/**
	 * Constructs a new React test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this React test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(React fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this React test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected React getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createReact());
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

} //ReactTest
