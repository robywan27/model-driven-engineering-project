/**
 */
package fashion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fashion.FashionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface FashionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fashion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fashion.it";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ase.projectB.team20.fashion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FashionPackage eINSTANCE = fashion.impl.FashionPackageImpl.init();

	/**
	 * The meta object id for the '{@link fashion.impl.FashionDomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.FashionDomainImpl
	 * @see fashion.impl.FashionPackageImpl#getFashionDomain()
	 * @generated
	 */
	int FASHION_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_DOMAIN__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_DOMAIN__STYLES = 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fashion.impl.FashionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.FashionElementImpl
	 * @see fashion.impl.FashionPackageImpl#getFashionElement()
	 * @generated
	 */
	int FASHION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_ELEMENT__STYLES = 0;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_ELEMENT__REPORTS = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fashion.impl.NewsReportImpl <em>News Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.NewsReportImpl
	 * @see fashion.impl.FashionPackageImpl#getNewsReport()
	 * @generated
	 */
	int NEWS_REPORT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_REPORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_REPORT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_REPORT__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>News Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_REPORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fashion.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ArticleImpl
	 * @see fashion.impl.FashionPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TYPE = NEWS_REPORT__TYPE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CONTENT = NEWS_REPORT__CONTENT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__ELEMENTS = NEWS_REPORT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = NEWS_REPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Magazine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__MAGAZINE = NEWS_REPORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = NEWS_REPORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fashion.impl.TVProgramImpl <em>TV Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.TVProgramImpl
	 * @see fashion.impl.FashionPackageImpl#getTVProgram()
	 * @generated
	 */
	int TV_PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_PROGRAM__TYPE = NEWS_REPORT__TYPE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_PROGRAM__CONTENT = NEWS_REPORT__CONTENT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_PROGRAM__ELEMENTS = NEWS_REPORT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_PROGRAM__NAME = NEWS_REPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TV Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_PROGRAM_FEATURE_COUNT = NEWS_REPORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.FashionStyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.FashionStyleImpl
	 * @see fashion.impl.FashionPackageImpl#getFashionStyle()
	 * @generated
	 */
	int FASHION_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_STYLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_STYLE__DESCRIPTORS = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_STYLE__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FASHION_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fashion.impl.SpatioTemporalDescriptorImpl <em>Spatio Temporal Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.SpatioTemporalDescriptorImpl
	 * @see fashion.impl.FashionPackageImpl#getSpatioTemporalDescriptor()
	 * @generated
	 */
	int SPATIO_TEMPORAL_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIO_TEMPORAL_DESCRIPTOR__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIO_TEMPORAL_DESCRIPTOR__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Spatio Temporal Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIO_TEMPORAL_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fashion.impl.BrandImpl <em>Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.BrandImpl
	 * @see fashion.impl.FashionPackageImpl#getBrand()
	 * @generated
	 */
	int BRAND = 7;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__CAMPAIGNS = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__PRODUCT_LINES = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Designers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__DESIGNERS = FASHION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fashion.impl.FamousBrandImpl <em>Famous Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.FamousBrandImpl
	 * @see fashion.impl.FashionPackageImpl#getFamousBrand()
	 * @generated
	 */
	int FAMOUS_BRAND = 8;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__STYLES = BRAND__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__REPORTS = BRAND__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__NAME = BRAND__NAME;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__CAMPAIGNS = BRAND__CAMPAIGNS;

	/**
	 * The feature id for the '<em><b>Product Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__PRODUCT_LINES = BRAND__PRODUCT_LINES;

	/**
	 * The feature id for the '<em><b>Designers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__DESIGNERS = BRAND__DESIGNERS;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND__COUNTRIES = BRAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Famous Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMOUS_BRAND_FEATURE_COUNT = BRAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.EmergingBrandImpl <em>Emerging Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.EmergingBrandImpl
	 * @see fashion.impl.FashionPackageImpl#getEmergingBrand()
	 * @generated
	 */
	int EMERGING_BRAND = 9;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__STYLES = BRAND__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__REPORTS = BRAND__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__NAME = BRAND__NAME;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__CAMPAIGNS = BRAND__CAMPAIGNS;

	/**
	 * The feature id for the '<em><b>Product Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__PRODUCT_LINES = BRAND__PRODUCT_LINES;

	/**
	 * The feature id for the '<em><b>Designers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__DESIGNERS = BRAND__DESIGNERS;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND__COUNTRIES = BRAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emerging Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGING_BRAND_FEATURE_COUNT = BRAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.LocalBrandImpl <em>Local Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.LocalBrandImpl
	 * @see fashion.impl.FashionPackageImpl#getLocalBrand()
	 * @generated
	 */
	int LOCAL_BRAND = 10;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__STYLES = BRAND__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__REPORTS = BRAND__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__NAME = BRAND__NAME;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__CAMPAIGNS = BRAND__CAMPAIGNS;

	/**
	 * The feature id for the '<em><b>Product Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__PRODUCT_LINES = BRAND__PRODUCT_LINES;

	/**
	 * The feature id for the '<em><b>Designers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__DESIGNERS = BRAND__DESIGNERS;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND__COUNTRY = BRAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_BRAND_FEATURE_COUNT = BRAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.AdvertisingCampaignImpl <em>Advertising Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.AdvertisingCampaignImpl
	 * @see fashion.impl.FashionPackageImpl#getAdvertisingCampaign()
	 * @generated
	 */
	int ADVERTISING_CAMPAIGN = 11;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_CAMPAIGN__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_CAMPAIGN__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_CAMPAIGN__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_CAMPAIGN__BRAND = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_CAMPAIGN__PRODUCTS = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Advertising Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_CAMPAIGN_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fashion.impl.AdvertisingProductImpl <em>Advertising Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.AdvertisingProductImpl
	 * @see fashion.impl.FashionPackageImpl#getAdvertisingProduct()
	 * @generated
	 */
	int ADVERTISING_PRODUCT = 12;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_PRODUCT__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_PRODUCT__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_PRODUCT__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_PRODUCT__TYPE = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Advertising Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISING_PRODUCT_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fashion.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.EventImpl
	 * @see fashion.impl.FashionPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 13;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__YEAR = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MONTH = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ROLES = FASHION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fashion.impl.MacroEventImpl <em>Macro Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.MacroEventImpl
	 * @see fashion.impl.FashionPackageImpl#getMacroEvent()
	 * @generated
	 */
	int MACRO_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__STYLES = EVENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__REPORTS = EVENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__YEAR = EVENT__YEAR;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__MONTH = EVENT__MONTH;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__ROLES = EVENT__ROLES;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__CITY = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Single Brand Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT__SINGLE_BRAND_EVENTS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Macro Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fashion.impl.SingleBrandEventImpl <em>Single Brand Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.SingleBrandEventImpl
	 * @see fashion.impl.FashionPackageImpl#getSingleBrandEvent()
	 * @generated
	 */
	int SINGLE_BRAND_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__STYLES = EVENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__REPORTS = EVENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__YEAR = EVENT__YEAR;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__MONTH = EVENT__MONTH;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__ROLES = EVENT__ROLES;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__DAY = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__HOUR = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__MINUTE = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT__BRAND = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Single Brand Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BRAND_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fashion.impl.ProductLineImpl <em>Product Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ProductLineImpl
	 * @see fashion.impl.FashionPackageImpl#getProductLine()
	 * @generated
	 */
	int PRODUCT_LINE = 16;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE__BRAND = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE__PRODUCT_STYLES = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE__PRODUCTS = FASHION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fashion.impl.ProductStyleImpl <em>Product Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ProductStyleImpl
	 * @see fashion.impl.FashionPackageImpl#getProductStyle()
	 * @generated
	 */
	int PRODUCT_STYLE = 17;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STYLE__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STYLE__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STYLE__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STYLE_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ProductImpl
	 * @see fashion.impl.FashionPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 18;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REVIEWS = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fashion.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ReviewImpl
	 * @see fashion.impl.FashionPackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 19;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__ID = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__PRODUCT = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEWER = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fashion.impl.PhotoImpl <em>Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.PhotoImpl
	 * @see fashion.impl.FashionPackageImpl#getPhoto()
	 * @generated
	 */
	int PHOTO = 20;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__STYLES = REVIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__REPORTS = REVIEW__REPORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__ID = REVIEW__ID;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__PRODUCT = REVIEW__PRODUCT;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__REVIEWER = REVIEW__REVIEWER;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__TAGS = REVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FEATURE_COUNT = REVIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.DescriptionImpl
	 * @see fashion.impl.FashionPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 21;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__STYLES = REVIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__REPORTS = REVIEW__REPORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ID = REVIEW__ID;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__PRODUCT = REVIEW__PRODUCT;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__REVIEWER = REVIEW__REVIEWER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TEXT = REVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = REVIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.CommentImpl
	 * @see fashion.impl.FashionPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 22;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__STYLES = REVIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REPORTS = REVIEW__REPORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = REVIEW__ID;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRODUCT = REVIEW__PRODUCT;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REVIEWER = REVIEW__REVIEWER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = REVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = REVIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.RoleImpl
	 * @see fashion.impl.FashionPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 23;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__STYLES = FASHION_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REPORTS = FASHION_ELEMENT__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = FASHION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EVENTS = FASHION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = FASHION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fashion.impl.DesignerImpl <em>Designer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.DesignerImpl
	 * @see fashion.impl.FashionPackageImpl#getDesigner()
	 * @generated
	 */
	int DESIGNER = 24;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER__STYLES = ROLE__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER__REPORTS = ROLE__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER__EVENTS = ROLE__EVENTS;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER__BRAND = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Designer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ModelImpl
	 * @see fashion.impl.FashionPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 25;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STYLES = ROLE__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPORTS = ROLE__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EVENTS = ROLE__EVENTS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.impl.PresenterImpl <em>Presenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.PresenterImpl
	 * @see fashion.impl.FashionPackageImpl#getPresenter()
	 * @generated
	 */
	int PRESENTER = 26;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER__STYLES = ROLE__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER__REPORTS = ROLE__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER__EVENTS = ROLE__EVENTS;

	/**
	 * The number of structural features of the '<em>Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.impl.ChoreographerImpl <em>Choreographer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ChoreographerImpl
	 * @see fashion.impl.FashionPackageImpl#getChoreographer()
	 * @generated
	 */
	int CHOREOGRAPHER = 27;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHER__STYLES = ROLE__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHER__REPORTS = ROLE__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHER__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHER__EVENTS = ROLE__EVENTS;

	/**
	 * The number of structural features of the '<em>Choreographer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.impl.PhotographerImpl <em>Photographer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.PhotographerImpl
	 * @see fashion.impl.FashionPackageImpl#getPhotographer()
	 * @generated
	 */
	int PHOTOGRAPHER = 28;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER__STYLES = ROLE__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER__REPORTS = ROLE__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER__EVENTS = ROLE__EVENTS;

	/**
	 * The number of structural features of the '<em>Photographer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOGRAPHER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.impl.ReviewerImpl <em>Reviewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.ReviewerImpl
	 * @see fashion.impl.FashionPackageImpl#getReviewer()
	 * @generated
	 */
	int REVIEWER = 29;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWER__STYLES = ROLE__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWER__REPORTS = ROLE__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWER__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWER__EVENTS = ROLE__EVENTS;

	/**
	 * The feature id for the '<em><b>Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWER__REVIEWS = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reviewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fashion.impl.BloggerImpl <em>Blogger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.BloggerImpl
	 * @see fashion.impl.FashionPackageImpl#getBlogger()
	 * @generated
	 */
	int BLOGGER = 30;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOGGER__STYLES = REVIEWER__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOGGER__REPORTS = REVIEWER__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOGGER__NAME = REVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOGGER__EVENTS = REVIEWER__EVENTS;

	/**
	 * The feature id for the '<em><b>Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOGGER__REVIEWS = REVIEWER__REVIEWS;

	/**
	 * The number of structural features of the '<em>Blogger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOGGER_FEATURE_COUNT = REVIEWER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.impl.CriticImpl <em>Critic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.CriticImpl
	 * @see fashion.impl.FashionPackageImpl#getCritic()
	 * @generated
	 */
	int CRITIC = 31;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIC__STYLES = REVIEWER__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIC__REPORTS = REVIEWER__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIC__NAME = REVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIC__EVENTS = REVIEWER__EVENTS;

	/**
	 * The feature id for the '<em><b>Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIC__REVIEWS = REVIEWER__REVIEWS;

	/**
	 * The number of structural features of the '<em>Critic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIC_FEATURE_COUNT = REVIEWER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.impl.InfluencerImpl <em>Influencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.impl.InfluencerImpl
	 * @see fashion.impl.FashionPackageImpl#getInfluencer()
	 * @generated
	 */
	int INFLUENCER = 32;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__STYLES = REVIEWER__STYLES;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__REPORTS = REVIEWER__REPORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__NAME = REVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__EVENTS = REVIEWER__EVENTS;

	/**
	 * The feature id for the '<em><b>Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__REVIEWS = REVIEWER__REVIEWS;

	/**
	 * The number of structural features of the '<em>Influencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_FEATURE_COUNT = REVIEWER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fashion.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fashion.MediaType
	 * @see fashion.impl.FashionPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 33;


	/**
	 * Returns the meta object for class '{@link fashion.FashionDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see fashion.FashionDomain
	 * @generated
	 */
	EClass getFashionDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.FashionDomain#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fashion.FashionDomain#getElements()
	 * @see #getFashionDomain()
	 * @generated
	 */
	EReference getFashionDomain_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.FashionDomain#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see fashion.FashionDomain#getStyles()
	 * @see #getFashionDomain()
	 * @generated
	 */
	EReference getFashionDomain_Styles();

	/**
	 * Returns the meta object for class '{@link fashion.FashionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fashion.FashionElement
	 * @generated
	 */
	EClass getFashionElement();

	/**
	 * Returns the meta object for the reference list '{@link fashion.FashionElement#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Styles</em>'.
	 * @see fashion.FashionElement#getStyles()
	 * @see #getFashionElement()
	 * @generated
	 */
	EReference getFashionElement_Styles();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.FashionElement#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reports</em>'.
	 * @see fashion.FashionElement#getReports()
	 * @see #getFashionElement()
	 * @generated
	 */
	EReference getFashionElement_Reports();

	/**
	 * Returns the meta object for class '{@link fashion.NewsReport <em>News Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>News Report</em>'.
	 * @see fashion.NewsReport
	 * @generated
	 */
	EClass getNewsReport();

	/**
	 * Returns the meta object for the attribute '{@link fashion.NewsReport#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fashion.NewsReport#getType()
	 * @see #getNewsReport()
	 * @generated
	 */
	EAttribute getNewsReport_Type();

	/**
	 * Returns the meta object for the attribute '{@link fashion.NewsReport#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fashion.NewsReport#getContent()
	 * @see #getNewsReport()
	 * @generated
	 */
	EAttribute getNewsReport_Content();

	/**
	 * Returns the meta object for the reference list '{@link fashion.NewsReport#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see fashion.NewsReport#getElements()
	 * @see #getNewsReport()
	 * @generated
	 */
	EReference getNewsReport_Elements();

	/**
	 * Returns the meta object for class '{@link fashion.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see fashion.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Article#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fashion.Article#getTitle()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Title();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Article#getMagazine <em>Magazine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magazine</em>'.
	 * @see fashion.Article#getMagazine()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Magazine();

	/**
	 * Returns the meta object for class '{@link fashion.TVProgram <em>TV Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TV Program</em>'.
	 * @see fashion.TVProgram
	 * @generated
	 */
	EClass getTVProgram();

	/**
	 * Returns the meta object for the attribute '{@link fashion.TVProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.TVProgram#getName()
	 * @see #getTVProgram()
	 * @generated
	 */
	EAttribute getTVProgram_Name();

	/**
	 * Returns the meta object for class '{@link fashion.FashionStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see fashion.FashionStyle
	 * @generated
	 */
	EClass getFashionStyle();

	/**
	 * Returns the meta object for the attribute '{@link fashion.FashionStyle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.FashionStyle#getName()
	 * @see #getFashionStyle()
	 * @generated
	 */
	EAttribute getFashionStyle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.FashionStyle#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptors</em>'.
	 * @see fashion.FashionStyle#getDescriptors()
	 * @see #getFashionStyle()
	 * @generated
	 */
	EReference getFashionStyle_Descriptors();

	/**
	 * Returns the meta object for the reference list '{@link fashion.FashionStyle#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see fashion.FashionStyle#getElements()
	 * @see #getFashionStyle()
	 * @generated
	 */
	EReference getFashionStyle_Elements();

	/**
	 * Returns the meta object for class '{@link fashion.SpatioTemporalDescriptor <em>Spatio Temporal Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatio Temporal Descriptor</em>'.
	 * @see fashion.SpatioTemporalDescriptor
	 * @generated
	 */
	EClass getSpatioTemporalDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link fashion.SpatioTemporalDescriptor#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fashion.SpatioTemporalDescriptor#getPeriod()
	 * @see #getSpatioTemporalDescriptor()
	 * @generated
	 */
	EAttribute getSpatioTemporalDescriptor_Period();

	/**
	 * Returns the meta object for the attribute '{@link fashion.SpatioTemporalDescriptor#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see fashion.SpatioTemporalDescriptor#getLocation()
	 * @see #getSpatioTemporalDescriptor()
	 * @generated
	 */
	EAttribute getSpatioTemporalDescriptor_Location();

	/**
	 * Returns the meta object for class '{@link fashion.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brand</em>'.
	 * @see fashion.Brand
	 * @generated
	 */
	EClass getBrand();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Brand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.Brand#getName()
	 * @see #getBrand()
	 * @generated
	 */
	EAttribute getBrand_Name();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Brand#getCampaigns <em>Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Campaigns</em>'.
	 * @see fashion.Brand#getCampaigns()
	 * @see #getBrand()
	 * @generated
	 */
	EReference getBrand_Campaigns();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Brand#getProductLines <em>Product Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Lines</em>'.
	 * @see fashion.Brand#getProductLines()
	 * @see #getBrand()
	 * @generated
	 */
	EReference getBrand_ProductLines();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Brand#getDesigners <em>Designers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designers</em>'.
	 * @see fashion.Brand#getDesigners()
	 * @see #getBrand()
	 * @generated
	 */
	EReference getBrand_Designers();

	/**
	 * Returns the meta object for class '{@link fashion.FamousBrand <em>Famous Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Famous Brand</em>'.
	 * @see fashion.FamousBrand
	 * @generated
	 */
	EClass getFamousBrand();

	/**
	 * Returns the meta object for the attribute list '{@link fashion.FamousBrand#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Countries</em>'.
	 * @see fashion.FamousBrand#getCountries()
	 * @see #getFamousBrand()
	 * @generated
	 */
	EAttribute getFamousBrand_Countries();

	/**
	 * Returns the meta object for class '{@link fashion.EmergingBrand <em>Emerging Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emerging Brand</em>'.
	 * @see fashion.EmergingBrand
	 * @generated
	 */
	EClass getEmergingBrand();

	/**
	 * Returns the meta object for the attribute list '{@link fashion.EmergingBrand#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Countries</em>'.
	 * @see fashion.EmergingBrand#getCountries()
	 * @see #getEmergingBrand()
	 * @generated
	 */
	EAttribute getEmergingBrand_Countries();

	/**
	 * Returns the meta object for class '{@link fashion.LocalBrand <em>Local Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Brand</em>'.
	 * @see fashion.LocalBrand
	 * @generated
	 */
	EClass getLocalBrand();

	/**
	 * Returns the meta object for the attribute '{@link fashion.LocalBrand#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see fashion.LocalBrand#getCountry()
	 * @see #getLocalBrand()
	 * @generated
	 */
	EAttribute getLocalBrand_Country();

	/**
	 * Returns the meta object for class '{@link fashion.AdvertisingCampaign <em>Advertising Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advertising Campaign</em>'.
	 * @see fashion.AdvertisingCampaign
	 * @generated
	 */
	EClass getAdvertisingCampaign();

	/**
	 * Returns the meta object for the attribute '{@link fashion.AdvertisingCampaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.AdvertisingCampaign#getName()
	 * @see #getAdvertisingCampaign()
	 * @generated
	 */
	EAttribute getAdvertisingCampaign_Name();

	/**
	 * Returns the meta object for the reference '{@link fashion.AdvertisingCampaign#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brand</em>'.
	 * @see fashion.AdvertisingCampaign#getBrand()
	 * @see #getAdvertisingCampaign()
	 * @generated
	 */
	EReference getAdvertisingCampaign_Brand();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.AdvertisingCampaign#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see fashion.AdvertisingCampaign#getProducts()
	 * @see #getAdvertisingCampaign()
	 * @generated
	 */
	EReference getAdvertisingCampaign_Products();

	/**
	 * Returns the meta object for class '{@link fashion.AdvertisingProduct <em>Advertising Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advertising Product</em>'.
	 * @see fashion.AdvertisingProduct
	 * @generated
	 */
	EClass getAdvertisingProduct();

	/**
	 * Returns the meta object for the attribute '{@link fashion.AdvertisingProduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.AdvertisingProduct#getName()
	 * @see #getAdvertisingProduct()
	 * @generated
	 */
	EAttribute getAdvertisingProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link fashion.AdvertisingProduct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fashion.AdvertisingProduct#getType()
	 * @see #getAdvertisingProduct()
	 * @generated
	 */
	EAttribute getAdvertisingProduct_Type();

	/**
	 * Returns the meta object for class '{@link fashion.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fashion.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Event#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see fashion.Event#getYear()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Year();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Event#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see fashion.Event#getMonth()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Month();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Event#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see fashion.Event#getRoles()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Roles();

	/**
	 * Returns the meta object for class '{@link fashion.MacroEvent <em>Macro Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Event</em>'.
	 * @see fashion.MacroEvent
	 * @generated
	 */
	EClass getMacroEvent();

	/**
	 * Returns the meta object for the attribute '{@link fashion.MacroEvent#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see fashion.MacroEvent#getCity()
	 * @see #getMacroEvent()
	 * @generated
	 */
	EAttribute getMacroEvent_City();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.MacroEvent#getSingleBrandEvents <em>Single Brand Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Brand Events</em>'.
	 * @see fashion.MacroEvent#getSingleBrandEvents()
	 * @see #getMacroEvent()
	 * @generated
	 */
	EReference getMacroEvent_SingleBrandEvents();

	/**
	 * Returns the meta object for class '{@link fashion.SingleBrandEvent <em>Single Brand Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Brand Event</em>'.
	 * @see fashion.SingleBrandEvent
	 * @generated
	 */
	EClass getSingleBrandEvent();

	/**
	 * Returns the meta object for the attribute '{@link fashion.SingleBrandEvent#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see fashion.SingleBrandEvent#getDay()
	 * @see #getSingleBrandEvent()
	 * @generated
	 */
	EAttribute getSingleBrandEvent_Day();

	/**
	 * Returns the meta object for the attribute '{@link fashion.SingleBrandEvent#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see fashion.SingleBrandEvent#getHour()
	 * @see #getSingleBrandEvent()
	 * @generated
	 */
	EAttribute getSingleBrandEvent_Hour();

	/**
	 * Returns the meta object for the attribute '{@link fashion.SingleBrandEvent#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see fashion.SingleBrandEvent#getMinute()
	 * @see #getSingleBrandEvent()
	 * @generated
	 */
	EAttribute getSingleBrandEvent_Minute();

	/**
	 * Returns the meta object for the reference '{@link fashion.SingleBrandEvent#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brand</em>'.
	 * @see fashion.SingleBrandEvent#getBrand()
	 * @see #getSingleBrandEvent()
	 * @generated
	 */
	EReference getSingleBrandEvent_Brand();

	/**
	 * Returns the meta object for class '{@link fashion.ProductLine <em>Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Line</em>'.
	 * @see fashion.ProductLine
	 * @generated
	 */
	EClass getProductLine();

	/**
	 * Returns the meta object for the attribute '{@link fashion.ProductLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.ProductLine#getName()
	 * @see #getProductLine()
	 * @generated
	 */
	EAttribute getProductLine_Name();

	/**
	 * Returns the meta object for the reference '{@link fashion.ProductLine#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brand</em>'.
	 * @see fashion.ProductLine#getBrand()
	 * @see #getProductLine()
	 * @generated
	 */
	EReference getProductLine_Brand();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.ProductLine#getProductStyles <em>Product Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Styles</em>'.
	 * @see fashion.ProductLine#getProductStyles()
	 * @see #getProductLine()
	 * @generated
	 */
	EReference getProductLine_ProductStyles();

	/**
	 * Returns the meta object for the containment reference list '{@link fashion.ProductLine#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see fashion.ProductLine#getProducts()
	 * @see #getProductLine()
	 * @generated
	 */
	EReference getProductLine_Products();

	/**
	 * Returns the meta object for class '{@link fashion.ProductStyle <em>Product Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Style</em>'.
	 * @see fashion.ProductStyle
	 * @generated
	 */
	EClass getProductStyle();

	/**
	 * Returns the meta object for the attribute '{@link fashion.ProductStyle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.ProductStyle#getName()
	 * @see #getProductStyle()
	 * @generated
	 */
	EAttribute getProductStyle_Name();

	/**
	 * Returns the meta object for class '{@link fashion.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see fashion.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Product#getReviews <em>Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reviews</em>'.
	 * @see fashion.Product#getReviews()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Reviews();

	/**
	 * Returns the meta object for class '{@link fashion.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see fashion.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Review#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fashion.Review#getId()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Id();

	/**
	 * Returns the meta object for the reference '{@link fashion.Review#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see fashion.Review#getProduct()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_Product();

	/**
	 * Returns the meta object for the reference '{@link fashion.Review#getReviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reviewer</em>'.
	 * @see fashion.Review#getReviewer()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_Reviewer();

	/**
	 * Returns the meta object for class '{@link fashion.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo</em>'.
	 * @see fashion.Photo
	 * @generated
	 */
	EClass getPhoto();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Photo#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags</em>'.
	 * @see fashion.Photo#getTags()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Tags();

	/**
	 * Returns the meta object for class '{@link fashion.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see fashion.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Description#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fashion.Description#getText()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Text();

	/**
	 * Returns the meta object for class '{@link fashion.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see fashion.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fashion.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for class '{@link fashion.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see fashion.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link fashion.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fashion.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Role#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see fashion.Role#getEvents()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Events();

	/**
	 * Returns the meta object for class '{@link fashion.Designer <em>Designer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Designer</em>'.
	 * @see fashion.Designer
	 * @generated
	 */
	EClass getDesigner();

	/**
	 * Returns the meta object for the reference '{@link fashion.Designer#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brand</em>'.
	 * @see fashion.Designer#getBrand()
	 * @see #getDesigner()
	 * @generated
	 */
	EReference getDesigner_Brand();

	/**
	 * Returns the meta object for class '{@link fashion.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fashion.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link fashion.Presenter <em>Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presenter</em>'.
	 * @see fashion.Presenter
	 * @generated
	 */
	EClass getPresenter();

	/**
	 * Returns the meta object for class '{@link fashion.Choreographer <em>Choreographer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreographer</em>'.
	 * @see fashion.Choreographer
	 * @generated
	 */
	EClass getChoreographer();

	/**
	 * Returns the meta object for class '{@link fashion.Photographer <em>Photographer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photographer</em>'.
	 * @see fashion.Photographer
	 * @generated
	 */
	EClass getPhotographer();

	/**
	 * Returns the meta object for class '{@link fashion.Reviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reviewer</em>'.
	 * @see fashion.Reviewer
	 * @generated
	 */
	EClass getReviewer();

	/**
	 * Returns the meta object for the reference list '{@link fashion.Reviewer#getReviews <em>Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reviews</em>'.
	 * @see fashion.Reviewer#getReviews()
	 * @see #getReviewer()
	 * @generated
	 */
	EReference getReviewer_Reviews();

	/**
	 * Returns the meta object for class '{@link fashion.Blogger <em>Blogger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blogger</em>'.
	 * @see fashion.Blogger
	 * @generated
	 */
	EClass getBlogger();

	/**
	 * Returns the meta object for class '{@link fashion.Critic <em>Critic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critic</em>'.
	 * @see fashion.Critic
	 * @generated
	 */
	EClass getCritic();

	/**
	 * Returns the meta object for class '{@link fashion.Influencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influencer</em>'.
	 * @see fashion.Influencer
	 * @generated
	 */
	EClass getInfluencer();

	/**
	 * Returns the meta object for enum '{@link fashion.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see fashion.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FashionFactory getFashionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fashion.impl.FashionDomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.FashionDomainImpl
		 * @see fashion.impl.FashionPackageImpl#getFashionDomain()
		 * @generated
		 */
		EClass FASHION_DOMAIN = eINSTANCE.getFashionDomain();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FASHION_DOMAIN__ELEMENTS = eINSTANCE.getFashionDomain_Elements();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FASHION_DOMAIN__STYLES = eINSTANCE.getFashionDomain_Styles();

		/**
		 * The meta object literal for the '{@link fashion.impl.FashionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.FashionElementImpl
		 * @see fashion.impl.FashionPackageImpl#getFashionElement()
		 * @generated
		 */
		EClass FASHION_ELEMENT = eINSTANCE.getFashionElement();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FASHION_ELEMENT__STYLES = eINSTANCE.getFashionElement_Styles();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FASHION_ELEMENT__REPORTS = eINSTANCE.getFashionElement_Reports();

		/**
		 * The meta object literal for the '{@link fashion.impl.NewsReportImpl <em>News Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.NewsReportImpl
		 * @see fashion.impl.FashionPackageImpl#getNewsReport()
		 * @generated
		 */
		EClass NEWS_REPORT = eINSTANCE.getNewsReport();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEWS_REPORT__TYPE = eINSTANCE.getNewsReport_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEWS_REPORT__CONTENT = eINSTANCE.getNewsReport_Content();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEWS_REPORT__ELEMENTS = eINSTANCE.getNewsReport_Elements();

		/**
		 * The meta object literal for the '{@link fashion.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ArticleImpl
		 * @see fashion.impl.FashionPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__TITLE = eINSTANCE.getArticle_Title();

		/**
		 * The meta object literal for the '<em><b>Magazine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__MAGAZINE = eINSTANCE.getArticle_Magazine();

		/**
		 * The meta object literal for the '{@link fashion.impl.TVProgramImpl <em>TV Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.TVProgramImpl
		 * @see fashion.impl.FashionPackageImpl#getTVProgram()
		 * @generated
		 */
		EClass TV_PROGRAM = eINSTANCE.getTVProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TV_PROGRAM__NAME = eINSTANCE.getTVProgram_Name();

		/**
		 * The meta object literal for the '{@link fashion.impl.FashionStyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.FashionStyleImpl
		 * @see fashion.impl.FashionPackageImpl#getFashionStyle()
		 * @generated
		 */
		EClass FASHION_STYLE = eINSTANCE.getFashionStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FASHION_STYLE__NAME = eINSTANCE.getFashionStyle_Name();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FASHION_STYLE__DESCRIPTORS = eINSTANCE.getFashionStyle_Descriptors();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FASHION_STYLE__ELEMENTS = eINSTANCE.getFashionStyle_Elements();

		/**
		 * The meta object literal for the '{@link fashion.impl.SpatioTemporalDescriptorImpl <em>Spatio Temporal Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.SpatioTemporalDescriptorImpl
		 * @see fashion.impl.FashionPackageImpl#getSpatioTemporalDescriptor()
		 * @generated
		 */
		EClass SPATIO_TEMPORAL_DESCRIPTOR = eINSTANCE.getSpatioTemporalDescriptor();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIO_TEMPORAL_DESCRIPTOR__PERIOD = eINSTANCE.getSpatioTemporalDescriptor_Period();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIO_TEMPORAL_DESCRIPTOR__LOCATION = eINSTANCE.getSpatioTemporalDescriptor_Location();

		/**
		 * The meta object literal for the '{@link fashion.impl.BrandImpl <em>Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.BrandImpl
		 * @see fashion.impl.FashionPackageImpl#getBrand()
		 * @generated
		 */
		EClass BRAND = eINSTANCE.getBrand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRAND__NAME = eINSTANCE.getBrand_Name();

		/**
		 * The meta object literal for the '<em><b>Campaigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRAND__CAMPAIGNS = eINSTANCE.getBrand_Campaigns();

		/**
		 * The meta object literal for the '<em><b>Product Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRAND__PRODUCT_LINES = eINSTANCE.getBrand_ProductLines();

		/**
		 * The meta object literal for the '<em><b>Designers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRAND__DESIGNERS = eINSTANCE.getBrand_Designers();

		/**
		 * The meta object literal for the '{@link fashion.impl.FamousBrandImpl <em>Famous Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.FamousBrandImpl
		 * @see fashion.impl.FashionPackageImpl#getFamousBrand()
		 * @generated
		 */
		EClass FAMOUS_BRAND = eINSTANCE.getFamousBrand();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMOUS_BRAND__COUNTRIES = eINSTANCE.getFamousBrand_Countries();

		/**
		 * The meta object literal for the '{@link fashion.impl.EmergingBrandImpl <em>Emerging Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.EmergingBrandImpl
		 * @see fashion.impl.FashionPackageImpl#getEmergingBrand()
		 * @generated
		 */
		EClass EMERGING_BRAND = eINSTANCE.getEmergingBrand();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMERGING_BRAND__COUNTRIES = eINSTANCE.getEmergingBrand_Countries();

		/**
		 * The meta object literal for the '{@link fashion.impl.LocalBrandImpl <em>Local Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.LocalBrandImpl
		 * @see fashion.impl.FashionPackageImpl#getLocalBrand()
		 * @generated
		 */
		EClass LOCAL_BRAND = eINSTANCE.getLocalBrand();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_BRAND__COUNTRY = eINSTANCE.getLocalBrand_Country();

		/**
		 * The meta object literal for the '{@link fashion.impl.AdvertisingCampaignImpl <em>Advertising Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.AdvertisingCampaignImpl
		 * @see fashion.impl.FashionPackageImpl#getAdvertisingCampaign()
		 * @generated
		 */
		EClass ADVERTISING_CAMPAIGN = eINSTANCE.getAdvertisingCampaign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISING_CAMPAIGN__NAME = eINSTANCE.getAdvertisingCampaign_Name();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERTISING_CAMPAIGN__BRAND = eINSTANCE.getAdvertisingCampaign_Brand();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVERTISING_CAMPAIGN__PRODUCTS = eINSTANCE.getAdvertisingCampaign_Products();

		/**
		 * The meta object literal for the '{@link fashion.impl.AdvertisingProductImpl <em>Advertising Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.AdvertisingProductImpl
		 * @see fashion.impl.FashionPackageImpl#getAdvertisingProduct()
		 * @generated
		 */
		EClass ADVERTISING_PRODUCT = eINSTANCE.getAdvertisingProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISING_PRODUCT__NAME = eINSTANCE.getAdvertisingProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISING_PRODUCT__TYPE = eINSTANCE.getAdvertisingProduct_Type();

		/**
		 * The meta object literal for the '{@link fashion.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.EventImpl
		 * @see fashion.impl.FashionPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__YEAR = eINSTANCE.getEvent_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MONTH = eINSTANCE.getEvent_Month();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ROLES = eINSTANCE.getEvent_Roles();

		/**
		 * The meta object literal for the '{@link fashion.impl.MacroEventImpl <em>Macro Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.MacroEventImpl
		 * @see fashion.impl.FashionPackageImpl#getMacroEvent()
		 * @generated
		 */
		EClass MACRO_EVENT = eINSTANCE.getMacroEvent();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_EVENT__CITY = eINSTANCE.getMacroEvent_City();

		/**
		 * The meta object literal for the '<em><b>Single Brand Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_EVENT__SINGLE_BRAND_EVENTS = eINSTANCE.getMacroEvent_SingleBrandEvents();

		/**
		 * The meta object literal for the '{@link fashion.impl.SingleBrandEventImpl <em>Single Brand Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.SingleBrandEventImpl
		 * @see fashion.impl.FashionPackageImpl#getSingleBrandEvent()
		 * @generated
		 */
		EClass SINGLE_BRAND_EVENT = eINSTANCE.getSingleBrandEvent();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_BRAND_EVENT__DAY = eINSTANCE.getSingleBrandEvent_Day();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_BRAND_EVENT__HOUR = eINSTANCE.getSingleBrandEvent_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_BRAND_EVENT__MINUTE = eINSTANCE.getSingleBrandEvent_Minute();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_BRAND_EVENT__BRAND = eINSTANCE.getSingleBrandEvent_Brand();

		/**
		 * The meta object literal for the '{@link fashion.impl.ProductLineImpl <em>Product Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ProductLineImpl
		 * @see fashion.impl.FashionPackageImpl#getProductLine()
		 * @generated
		 */
		EClass PRODUCT_LINE = eINSTANCE.getProductLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_LINE__NAME = eINSTANCE.getProductLine_Name();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LINE__BRAND = eINSTANCE.getProductLine_Brand();

		/**
		 * The meta object literal for the '<em><b>Product Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LINE__PRODUCT_STYLES = eINSTANCE.getProductLine_ProductStyles();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LINE__PRODUCTS = eINSTANCE.getProductLine_Products();

		/**
		 * The meta object literal for the '{@link fashion.impl.ProductStyleImpl <em>Product Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ProductStyleImpl
		 * @see fashion.impl.FashionPackageImpl#getProductStyle()
		 * @generated
		 */
		EClass PRODUCT_STYLE = eINSTANCE.getProductStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STYLE__NAME = eINSTANCE.getProductStyle_Name();

		/**
		 * The meta object literal for the '{@link fashion.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ProductImpl
		 * @see fashion.impl.FashionPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Reviews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__REVIEWS = eINSTANCE.getProduct_Reviews();

		/**
		 * The meta object literal for the '{@link fashion.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ReviewImpl
		 * @see fashion.impl.FashionPackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__ID = eINSTANCE.getReview_Id();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__PRODUCT = eINSTANCE.getReview_Product();

		/**
		 * The meta object literal for the '<em><b>Reviewer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__REVIEWER = eINSTANCE.getReview_Reviewer();

		/**
		 * The meta object literal for the '{@link fashion.impl.PhotoImpl <em>Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.PhotoImpl
		 * @see fashion.impl.FashionPackageImpl#getPhoto()
		 * @generated
		 */
		EClass PHOTO = eINSTANCE.getPhoto();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__TAGS = eINSTANCE.getPhoto_Tags();

		/**
		 * The meta object literal for the '{@link fashion.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.DescriptionImpl
		 * @see fashion.impl.FashionPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

		/**
		 * The meta object literal for the '{@link fashion.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.CommentImpl
		 * @see fashion.impl.FashionPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '{@link fashion.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.RoleImpl
		 * @see fashion.impl.FashionPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__EVENTS = eINSTANCE.getRole_Events();

		/**
		 * The meta object literal for the '{@link fashion.impl.DesignerImpl <em>Designer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.DesignerImpl
		 * @see fashion.impl.FashionPackageImpl#getDesigner()
		 * @generated
		 */
		EClass DESIGNER = eINSTANCE.getDesigner();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGNER__BRAND = eINSTANCE.getDesigner_Brand();

		/**
		 * The meta object literal for the '{@link fashion.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ModelImpl
		 * @see fashion.impl.FashionPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link fashion.impl.PresenterImpl <em>Presenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.PresenterImpl
		 * @see fashion.impl.FashionPackageImpl#getPresenter()
		 * @generated
		 */
		EClass PRESENTER = eINSTANCE.getPresenter();

		/**
		 * The meta object literal for the '{@link fashion.impl.ChoreographerImpl <em>Choreographer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ChoreographerImpl
		 * @see fashion.impl.FashionPackageImpl#getChoreographer()
		 * @generated
		 */
		EClass CHOREOGRAPHER = eINSTANCE.getChoreographer();

		/**
		 * The meta object literal for the '{@link fashion.impl.PhotographerImpl <em>Photographer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.PhotographerImpl
		 * @see fashion.impl.FashionPackageImpl#getPhotographer()
		 * @generated
		 */
		EClass PHOTOGRAPHER = eINSTANCE.getPhotographer();

		/**
		 * The meta object literal for the '{@link fashion.impl.ReviewerImpl <em>Reviewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.ReviewerImpl
		 * @see fashion.impl.FashionPackageImpl#getReviewer()
		 * @generated
		 */
		EClass REVIEWER = eINSTANCE.getReviewer();

		/**
		 * The meta object literal for the '<em><b>Reviews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEWER__REVIEWS = eINSTANCE.getReviewer_Reviews();

		/**
		 * The meta object literal for the '{@link fashion.impl.BloggerImpl <em>Blogger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.BloggerImpl
		 * @see fashion.impl.FashionPackageImpl#getBlogger()
		 * @generated
		 */
		EClass BLOGGER = eINSTANCE.getBlogger();

		/**
		 * The meta object literal for the '{@link fashion.impl.CriticImpl <em>Critic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.CriticImpl
		 * @see fashion.impl.FashionPackageImpl#getCritic()
		 * @generated
		 */
		EClass CRITIC = eINSTANCE.getCritic();

		/**
		 * The meta object literal for the '{@link fashion.impl.InfluencerImpl <em>Influencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.impl.InfluencerImpl
		 * @see fashion.impl.FashionPackageImpl#getInfluencer()
		 * @generated
		 */
		EClass INFLUENCER = eINSTANCE.getInfluencer();

		/**
		 * The meta object literal for the '{@link fashion.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fashion.MediaType
		 * @see fashion.impl.FashionPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

	}

} //FashionPackage
