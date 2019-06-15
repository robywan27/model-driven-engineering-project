/**
 */
package fashion.impl;

import fashion.AdvertisingCampaign;
import fashion.AdvertisingProduct;
import fashion.Article;
import fashion.Blogger;
import fashion.Brand;
import fashion.Choreographer;
import fashion.Comment;
import fashion.Critic;
import fashion.Description;
import fashion.Designer;
import fashion.EmergingBrand;
import fashion.Event;
import fashion.FamousBrand;
import fashion.FashionDomain;
import fashion.FashionElement;
import fashion.FashionFactory;
import fashion.FashionPackage;
import fashion.FashionStyle;
import fashion.Influencer;
import fashion.LocalBrand;
import fashion.MacroEvent;
import fashion.MediaType;
import fashion.Model;
import fashion.NewsReport;
import fashion.Photo;
import fashion.Photographer;
import fashion.Presenter;
import fashion.Product;
import fashion.ProductLine;
import fashion.ProductStyle;
import fashion.Review;
import fashion.Reviewer;
import fashion.Role;
import fashion.SingleBrandEvent;
import fashion.SpatioTemporalDescriptor;
import fashion.TVProgram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FashionPackageImpl extends EPackageImpl implements FashionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fashionDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fashionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newsReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tvProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fashionStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatioTemporalDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass famousBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergingBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advertisingCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advertisingProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleBrandEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photographerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influencerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fashion.FashionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FashionPackageImpl() {
		super(eNS_URI, FashionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FashionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FashionPackage init() {
		if (isInited) return (FashionPackage)EPackage.Registry.INSTANCE.getEPackage(FashionPackage.eNS_URI);

		// Obtain or create and register package
		FashionPackageImpl theFashionPackage = (FashionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FashionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FashionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFashionPackage.createPackageContents();

		// Initialize created meta-data
		theFashionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFashionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FashionPackage.eNS_URI, theFashionPackage);
		return theFashionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFashionDomain() {
		return fashionDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFashionDomain_Elements() {
		return (EReference)fashionDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFashionDomain_Styles() {
		return (EReference)fashionDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFashionElement() {
		return fashionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFashionElement_Styles() {
		return (EReference)fashionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFashionElement_Reports() {
		return (EReference)fashionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewsReport() {
		return newsReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewsReport_Type() {
		return (EAttribute)newsReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewsReport_Content() {
		return (EAttribute)newsReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewsReport_Elements() {
		return (EReference)newsReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_Title() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_Magazine() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTVProgram() {
		return tvProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVProgram_Name() {
		return (EAttribute)tvProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFashionStyle() {
		return fashionStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFashionStyle_Name() {
		return (EAttribute)fashionStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFashionStyle_Descriptors() {
		return (EReference)fashionStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFashionStyle_Elements() {
		return (EReference)fashionStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpatioTemporalDescriptor() {
		return spatioTemporalDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatioTemporalDescriptor_Period() {
		return (EAttribute)spatioTemporalDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatioTemporalDescriptor_Location() {
		return (EAttribute)spatioTemporalDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrand() {
		return brandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrand_Name() {
		return (EAttribute)brandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrand_Campaigns() {
		return (EReference)brandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrand_ProductLines() {
		return (EReference)brandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrand_Designers() {
		return (EReference)brandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamousBrand() {
		return famousBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamousBrand_Countries() {
		return (EAttribute)famousBrandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergingBrand() {
		return emergingBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmergingBrand_Countries() {
		return (EAttribute)emergingBrandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalBrand() {
		return localBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalBrand_Country() {
		return (EAttribute)localBrandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvertisingCampaign() {
		return advertisingCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisingCampaign_Name() {
		return (EAttribute)advertisingCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvertisingCampaign_Brand() {
		return (EReference)advertisingCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvertisingCampaign_Products() {
		return (EReference)advertisingCampaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvertisingProduct() {
		return advertisingProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisingProduct_Name() {
		return (EAttribute)advertisingProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisingProduct_Type() {
		return (EAttribute)advertisingProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Year() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Month() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Roles() {
		return (EReference)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroEvent() {
		return macroEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroEvent_City() {
		return (EAttribute)macroEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroEvent_SingleBrandEvents() {
		return (EReference)macroEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleBrandEvent() {
		return singleBrandEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleBrandEvent_Day() {
		return (EAttribute)singleBrandEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleBrandEvent_Hour() {
		return (EAttribute)singleBrandEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleBrandEvent_Minute() {
		return (EAttribute)singleBrandEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleBrandEvent_Brand() {
		return (EReference)singleBrandEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductLine() {
		return productLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductLine_Name() {
		return (EAttribute)productLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductLine_Brand() {
		return (EReference)productLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductLine_ProductStyles() {
		return (EReference)productLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductLine_Products() {
		return (EReference)productLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductStyle() {
		return productStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductStyle_Name() {
		return (EAttribute)productStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Reviews() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_Id() {
		return (EAttribute)reviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReview_Product() {
		return (EReference)reviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReview_Reviewer() {
		return (EReference)reviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhoto() {
		return photoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Tags() {
		return (EAttribute)photoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Text() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Text() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Events() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesigner() {
		return designerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesigner_Brand() {
		return (EReference)designerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenter() {
		return presenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreographer() {
		return choreographerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotographer() {
		return photographerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewer() {
		return reviewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewer_Reviews() {
		return (EReference)reviewerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlogger() {
		return bloggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCritic() {
		return criticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluencer() {
		return influencerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaType() {
		return mediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionFactory getFashionFactory() {
		return (FashionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fashionDomainEClass = createEClass(FASHION_DOMAIN);
		createEReference(fashionDomainEClass, FASHION_DOMAIN__ELEMENTS);
		createEReference(fashionDomainEClass, FASHION_DOMAIN__STYLES);

		fashionElementEClass = createEClass(FASHION_ELEMENT);
		createEReference(fashionElementEClass, FASHION_ELEMENT__STYLES);
		createEReference(fashionElementEClass, FASHION_ELEMENT__REPORTS);

		newsReportEClass = createEClass(NEWS_REPORT);
		createEAttribute(newsReportEClass, NEWS_REPORT__TYPE);
		createEAttribute(newsReportEClass, NEWS_REPORT__CONTENT);
		createEReference(newsReportEClass, NEWS_REPORT__ELEMENTS);

		articleEClass = createEClass(ARTICLE);
		createEAttribute(articleEClass, ARTICLE__TITLE);
		createEAttribute(articleEClass, ARTICLE__MAGAZINE);

		tvProgramEClass = createEClass(TV_PROGRAM);
		createEAttribute(tvProgramEClass, TV_PROGRAM__NAME);

		fashionStyleEClass = createEClass(FASHION_STYLE);
		createEAttribute(fashionStyleEClass, FASHION_STYLE__NAME);
		createEReference(fashionStyleEClass, FASHION_STYLE__DESCRIPTORS);
		createEReference(fashionStyleEClass, FASHION_STYLE__ELEMENTS);

		spatioTemporalDescriptorEClass = createEClass(SPATIO_TEMPORAL_DESCRIPTOR);
		createEAttribute(spatioTemporalDescriptorEClass, SPATIO_TEMPORAL_DESCRIPTOR__PERIOD);
		createEAttribute(spatioTemporalDescriptorEClass, SPATIO_TEMPORAL_DESCRIPTOR__LOCATION);

		brandEClass = createEClass(BRAND);
		createEAttribute(brandEClass, BRAND__NAME);
		createEReference(brandEClass, BRAND__CAMPAIGNS);
		createEReference(brandEClass, BRAND__PRODUCT_LINES);
		createEReference(brandEClass, BRAND__DESIGNERS);

		famousBrandEClass = createEClass(FAMOUS_BRAND);
		createEAttribute(famousBrandEClass, FAMOUS_BRAND__COUNTRIES);

		emergingBrandEClass = createEClass(EMERGING_BRAND);
		createEAttribute(emergingBrandEClass, EMERGING_BRAND__COUNTRIES);

		localBrandEClass = createEClass(LOCAL_BRAND);
		createEAttribute(localBrandEClass, LOCAL_BRAND__COUNTRY);

		advertisingCampaignEClass = createEClass(ADVERTISING_CAMPAIGN);
		createEAttribute(advertisingCampaignEClass, ADVERTISING_CAMPAIGN__NAME);
		createEReference(advertisingCampaignEClass, ADVERTISING_CAMPAIGN__BRAND);
		createEReference(advertisingCampaignEClass, ADVERTISING_CAMPAIGN__PRODUCTS);

		advertisingProductEClass = createEClass(ADVERTISING_PRODUCT);
		createEAttribute(advertisingProductEClass, ADVERTISING_PRODUCT__NAME);
		createEAttribute(advertisingProductEClass, ADVERTISING_PRODUCT__TYPE);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);
		createEAttribute(eventEClass, EVENT__YEAR);
		createEAttribute(eventEClass, EVENT__MONTH);
		createEReference(eventEClass, EVENT__ROLES);

		macroEventEClass = createEClass(MACRO_EVENT);
		createEAttribute(macroEventEClass, MACRO_EVENT__CITY);
		createEReference(macroEventEClass, MACRO_EVENT__SINGLE_BRAND_EVENTS);

		singleBrandEventEClass = createEClass(SINGLE_BRAND_EVENT);
		createEAttribute(singleBrandEventEClass, SINGLE_BRAND_EVENT__DAY);
		createEAttribute(singleBrandEventEClass, SINGLE_BRAND_EVENT__HOUR);
		createEAttribute(singleBrandEventEClass, SINGLE_BRAND_EVENT__MINUTE);
		createEReference(singleBrandEventEClass, SINGLE_BRAND_EVENT__BRAND);

		productLineEClass = createEClass(PRODUCT_LINE);
		createEAttribute(productLineEClass, PRODUCT_LINE__NAME);
		createEReference(productLineEClass, PRODUCT_LINE__BRAND);
		createEReference(productLineEClass, PRODUCT_LINE__PRODUCT_STYLES);
		createEReference(productLineEClass, PRODUCT_LINE__PRODUCTS);

		productStyleEClass = createEClass(PRODUCT_STYLE);
		createEAttribute(productStyleEClass, PRODUCT_STYLE__NAME);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEReference(productEClass, PRODUCT__REVIEWS);

		reviewEClass = createEClass(REVIEW);
		createEAttribute(reviewEClass, REVIEW__ID);
		createEReference(reviewEClass, REVIEW__PRODUCT);
		createEReference(reviewEClass, REVIEW__REVIEWER);

		photoEClass = createEClass(PHOTO);
		createEAttribute(photoEClass, PHOTO__TAGS);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__TEXT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TEXT);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__EVENTS);

		designerEClass = createEClass(DESIGNER);
		createEReference(designerEClass, DESIGNER__BRAND);

		modelEClass = createEClass(MODEL);

		presenterEClass = createEClass(PRESENTER);

		choreographerEClass = createEClass(CHOREOGRAPHER);

		photographerEClass = createEClass(PHOTOGRAPHER);

		reviewerEClass = createEClass(REVIEWER);
		createEReference(reviewerEClass, REVIEWER__REVIEWS);

		bloggerEClass = createEClass(BLOGGER);

		criticEClass = createEClass(CRITIC);

		influencerEClass = createEClass(INFLUENCER);

		// Create enums
		mediaTypeEEnum = createEEnum(MEDIA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		articleEClass.getESuperTypes().add(this.getNewsReport());
		tvProgramEClass.getESuperTypes().add(this.getNewsReport());
		brandEClass.getESuperTypes().add(this.getFashionElement());
		famousBrandEClass.getESuperTypes().add(this.getBrand());
		emergingBrandEClass.getESuperTypes().add(this.getBrand());
		localBrandEClass.getESuperTypes().add(this.getBrand());
		advertisingCampaignEClass.getESuperTypes().add(this.getFashionElement());
		advertisingProductEClass.getESuperTypes().add(this.getFashionElement());
		eventEClass.getESuperTypes().add(this.getFashionElement());
		macroEventEClass.getESuperTypes().add(this.getEvent());
		singleBrandEventEClass.getESuperTypes().add(this.getEvent());
		productLineEClass.getESuperTypes().add(this.getFashionElement());
		productStyleEClass.getESuperTypes().add(this.getFashionElement());
		productEClass.getESuperTypes().add(this.getFashionElement());
		reviewEClass.getESuperTypes().add(this.getFashionElement());
		photoEClass.getESuperTypes().add(this.getReview());
		descriptionEClass.getESuperTypes().add(this.getReview());
		commentEClass.getESuperTypes().add(this.getReview());
		roleEClass.getESuperTypes().add(this.getFashionElement());
		designerEClass.getESuperTypes().add(this.getRole());
		modelEClass.getESuperTypes().add(this.getRole());
		presenterEClass.getESuperTypes().add(this.getRole());
		choreographerEClass.getESuperTypes().add(this.getRole());
		photographerEClass.getESuperTypes().add(this.getRole());
		reviewerEClass.getESuperTypes().add(this.getRole());
		bloggerEClass.getESuperTypes().add(this.getReviewer());
		criticEClass.getESuperTypes().add(this.getReviewer());
		influencerEClass.getESuperTypes().add(this.getReviewer());

		// Initialize classes and features; add operations and parameters
		initEClass(fashionDomainEClass, FashionDomain.class, "FashionDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFashionDomain_Elements(), this.getFashionElement(), null, "elements", null, 1, -1, FashionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFashionDomain_Styles(), this.getFashionStyle(), null, "styles", null, 1, -1, FashionDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fashionElementEClass, FashionElement.class, "FashionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFashionElement_Styles(), this.getFashionStyle(), this.getFashionStyle_Elements(), "styles", null, 0, -1, FashionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFashionElement_Reports(), this.getNewsReport(), null, "reports", null, 0, -1, FashionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newsReportEClass, NewsReport.class, "NewsReport", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewsReport_Type(), this.getMediaType(), "type", null, 1, 1, NewsReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewsReport_Content(), ecorePackage.getEString(), "content", null, 1, 1, NewsReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewsReport_Elements(), this.getFashionElement(), null, "elements", null, 1, -1, NewsReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArticle_Title(), ecorePackage.getEString(), "title", null, 1, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArticle_Magazine(), ecorePackage.getEString(), "magazine", null, 1, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tvProgramEClass, TVProgram.class, "TVProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTVProgram_Name(), ecorePackage.getEString(), "name", null, 1, 1, TVProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fashionStyleEClass, FashionStyle.class, "FashionStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFashionStyle_Name(), ecorePackage.getEString(), "name", null, 1, 1, FashionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFashionStyle_Descriptors(), this.getSpatioTemporalDescriptor(), null, "descriptors", null, 1, -1, FashionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFashionStyle_Elements(), this.getFashionElement(), this.getFashionElement_Styles(), "elements", null, 1, -1, FashionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatioTemporalDescriptorEClass, SpatioTemporalDescriptor.class, "SpatioTemporalDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatioTemporalDescriptor_Period(), ecorePackage.getEDate(), "period", null, 1, 1, SpatioTemporalDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatioTemporalDescriptor_Location(), ecorePackage.getEString(), "location", null, 1, 1, SpatioTemporalDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brandEClass, Brand.class, "Brand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Brand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrand_Campaigns(), this.getAdvertisingCampaign(), this.getAdvertisingCampaign_Brand(), "campaigns", null, 0, -1, Brand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrand_ProductLines(), this.getProductLine(), this.getProductLine_Brand(), "productLines", null, 1, -1, Brand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrand_Designers(), this.getDesigner(), this.getDesigner_Brand(), "designers", null, 1, -1, Brand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(famousBrandEClass, FamousBrand.class, "FamousBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamousBrand_Countries(), ecorePackage.getEString(), "countries", null, 1, -1, FamousBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emergingBrandEClass, EmergingBrand.class, "EmergingBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmergingBrand_Countries(), ecorePackage.getEString(), "countries", null, 1, -1, EmergingBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localBrandEClass, LocalBrand.class, "LocalBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalBrand_Country(), ecorePackage.getEString(), "country", null, 1, 1, LocalBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisingCampaignEClass, AdvertisingCampaign.class, "AdvertisingCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdvertisingCampaign_Name(), ecorePackage.getEString(), "name", null, 1, 1, AdvertisingCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvertisingCampaign_Brand(), this.getBrand(), this.getBrand_Campaigns(), "brand", null, 1, 1, AdvertisingCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvertisingCampaign_Products(), this.getAdvertisingProduct(), null, "products", null, 1, -1, AdvertisingCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisingProductEClass, AdvertisingProduct.class, "AdvertisingProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdvertisingProduct_Name(), ecorePackage.getEString(), "name", null, 1, 1, AdvertisingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisingProduct_Type(), this.getMediaType(), "type", null, 1, 1, AdvertisingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Year(), ecorePackage.getEInt(), "year", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Month(), ecorePackage.getEInt(), "month", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Roles(), this.getRole(), this.getRole_Events(), "roles", null, 1, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macroEventEClass, MacroEvent.class, "MacroEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacroEvent_City(), ecorePackage.getEString(), "city", null, 1, 1, MacroEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMacroEvent_SingleBrandEvents(), this.getSingleBrandEvent(), null, "singleBrandEvents", null, 1, -1, MacroEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleBrandEventEClass, SingleBrandEvent.class, "SingleBrandEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleBrandEvent_Day(), ecorePackage.getEInt(), "day", null, 1, 1, SingleBrandEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleBrandEvent_Hour(), ecorePackage.getEInt(), "hour", null, 1, 1, SingleBrandEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleBrandEvent_Minute(), ecorePackage.getEInt(), "minute", null, 1, 1, SingleBrandEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleBrandEvent_Brand(), this.getBrand(), null, "brand", null, 1, 1, SingleBrandEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productLineEClass, ProductLine.class, "ProductLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductLine_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductLine_Brand(), this.getBrand(), this.getBrand_ProductLines(), "brand", null, 1, 1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductLine_ProductStyles(), this.getProductStyle(), null, "productStyles", null, 1, -1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductLine_Products(), this.getProduct(), null, "products", null, 1, -1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStyleEClass, ProductStyle.class, "ProductStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStyle_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProductStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Reviews(), this.getReview(), this.getReview_Product(), "reviews", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reviewEClass, Review.class, "Review", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReview_Id(), ecorePackage.getEString(), "id", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReview_Product(), this.getProduct(), this.getProduct_Reviews(), "product", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReview_Reviewer(), this.getReviewer(), this.getReviewer_Reviews(), "reviewer", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoEClass, Photo.class, "Photo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhoto_Tags(), ecorePackage.getEString(), "tags", null, 1, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Text(), ecorePackage.getEString(), "text", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Events(), this.getEvent(), this.getEvent_Roles(), "events", null, 1, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designerEClass, Designer.class, "Designer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesigner_Brand(), this.getBrand(), this.getBrand_Designers(), "brand", null, 1, 1, Designer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presenterEClass, Presenter.class, "Presenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choreographerEClass, Choreographer.class, "Choreographer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(photographerEClass, Photographer.class, "Photographer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reviewerEClass, Reviewer.class, "Reviewer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReviewer_Reviews(), this.getReview(), this.getReview_Reviewer(), "reviews", null, 1, -1, Reviewer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloggerEClass, Blogger.class, "Blogger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(criticEClass, Critic.class, "Critic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influencerEClass, Influencer.class, "Influencer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(mediaTypeEEnum, MediaType.class, "MediaType");
		addEEnumLiteral(mediaTypeEEnum, MediaType.ONLINE);
		addEEnumLiteral(mediaTypeEEnum, MediaType.TV);
		addEEnumLiteral(mediaTypeEEnum, MediaType.PHYSICAL_BOARD);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.node
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (fashionDomainEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getFashionElement_Styles(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getNewsReport_Elements(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getFashionStyle_Elements(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getBrand_Campaigns(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getBrand_ProductLines(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getBrand_Designers(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getAdvertisingCampaign_Brand(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getEvent_Roles(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getSingleBrandEvent_Brand(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getProductLine_Brand(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getProduct_Reviews(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getReview_Product(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getReview_Reviewer(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getRole_Events(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getDesigner_Brand(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getReviewer_Reviews(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getFashionElement_Reports(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFashionStyle_Descriptors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAdvertisingCampaign_Products(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMacroEvent_SingleBrandEvents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProductLine_ProductStyles(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProductLine_Products(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (newsReportEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (articleEClass, 
		   source, 
		   new String[] {
			 "label", "title,type",
			 "label.pattern", "{1}: {0}"
		   });	
		addAnnotation
		  (tvProgramEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{1}: {0}"
		   });	
		addAnnotation
		  (fashionStyleEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (spatioTemporalDescriptorEClass, 
		   source, 
		   new String[] {
			 "label", "period,location",
			 "label.pattern", "{0}, {1}"
		   });	
		addAnnotation
		  (brandEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (advertisingCampaignEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (advertisingProductEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}: {1}"
		   });	
		addAnnotation
		  (macroEventEClass, 
		   source, 
		   new String[] {
			 "label", "name,year,month,city",
			 "label.pattern", "{0}, {1}-{2}, {3}"
		   });	
		addAnnotation
		  (singleBrandEventEClass, 
		   source, 
		   new String[] {
			 "label", "name,year,month,day,hour,minute",
			 "label.pattern", "{0}, {1}-{2}-{3}, {4}:{5}"
		   });	
		addAnnotation
		  (productLineEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (productStyleEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (productEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (reviewEClass, 
		   source, 
		   new String[] {
			 "label", "id"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

} //FashionPackageImpl
