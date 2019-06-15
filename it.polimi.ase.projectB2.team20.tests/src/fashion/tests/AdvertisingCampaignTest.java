/**
 */
package fashion.tests;

import fashion.AdvertisingCampaign;
import fashion.FashionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Advertising Campaign</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdvertisingCampaignTest extends FashionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdvertisingCampaignTest.class);
	}

	/**
	 * Constructs a new Advertising Campaign test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisingCampaignTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Advertising Campaign test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdvertisingCampaign getFixture() {
		return (AdvertisingCampaign)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FashionFactory.eINSTANCE.createAdvertisingCampaign());
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

} //AdvertisingCampaignTest
