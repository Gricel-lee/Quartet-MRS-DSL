/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.PatternsFactory;
import patterns.ResumeIf;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resume If</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResumeIfTest extends TestCase {

	/**
	 * The fixture for this Resume If test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumeIf fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResumeIfTest.class);
	}

	/**
	 * Constructs a new Resume If test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResumeIfTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resume If test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResumeIf fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resume If test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumeIf getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createResumeIf());
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

} //ResumeIfTest
