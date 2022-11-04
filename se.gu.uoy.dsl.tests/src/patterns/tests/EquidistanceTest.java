/**
 */
package patterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import patterns.Equidistance;
import patterns.PatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Equidistance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EquidistanceTest extends TestCase {

	/**
	 * The fixture for this Equidistance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Equidistance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EquidistanceTest.class);
	}

	/**
	 * Constructs a new Equidistance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquidistanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Equidistance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Equidistance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Equidistance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Equidistance getFixture() {
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
		setFixture(PatternsFactory.eINSTANCE.createEquidistance());
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

} //EquidistanceTest
