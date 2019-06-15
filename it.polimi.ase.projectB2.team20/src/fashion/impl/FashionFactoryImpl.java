/**
 */
package fashion.impl;

import fashion.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FashionFactoryImpl extends EFactoryImpl implements FashionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FashionFactory init() {
		try {
			FashionFactory theFashionFactory = (FashionFactory)EPackage.Registry.INSTANCE.getEFactory(FashionPackage.eNS_URI);
			if (theFashionFactory != null) {
				return theFashionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FashionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FashionPackage.FASHION_DOMAIN: return createFashionDomain();
			case FashionPackage.ARTICLE: return createArticle();
			case FashionPackage.TV_PROGRAM: return createTVProgram();
			case FashionPackage.FASHION_STYLE: return createFashionStyle();
			case FashionPackage.SPATIO_TEMPORAL_DESCRIPTOR: return createSpatioTemporalDescriptor();
			case FashionPackage.FAMOUS_BRAND: return createFamousBrand();
			case FashionPackage.EMERGING_BRAND: return createEmergingBrand();
			case FashionPackage.LOCAL_BRAND: return createLocalBrand();
			case FashionPackage.ADVERTISING_CAMPAIGN: return createAdvertisingCampaign();
			case FashionPackage.ADVERTISING_PRODUCT: return createAdvertisingProduct();
			case FashionPackage.MACRO_EVENT: return createMacroEvent();
			case FashionPackage.SINGLE_BRAND_EVENT: return createSingleBrandEvent();
			case FashionPackage.PRODUCT_LINE: return createProductLine();
			case FashionPackage.PRODUCT_STYLE: return createProductStyle();
			case FashionPackage.PRODUCT: return createProduct();
			case FashionPackage.PHOTO: return createPhoto();
			case FashionPackage.DESCRIPTION: return createDescription();
			case FashionPackage.COMMENT: return createComment();
			case FashionPackage.DESIGNER: return createDesigner();
			case FashionPackage.MODEL: return createModel();
			case FashionPackage.PRESENTER: return createPresenter();
			case FashionPackage.CHOREOGRAPHER: return createChoreographer();
			case FashionPackage.PHOTOGRAPHER: return createPhotographer();
			case FashionPackage.BLOGGER: return createBlogger();
			case FashionPackage.CRITIC: return createCritic();
			case FashionPackage.INFLUENCER: return createInfluencer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FashionPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FashionPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionDomain createFashionDomain() {
		FashionDomainImpl fashionDomain = new FashionDomainImpl();
		return fashionDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVProgram createTVProgram() {
		TVProgramImpl tvProgram = new TVProgramImpl();
		return tvProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionStyle createFashionStyle() {
		FashionStyleImpl fashionStyle = new FashionStyleImpl();
		return fashionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatioTemporalDescriptor createSpatioTemporalDescriptor() {
		SpatioTemporalDescriptorImpl spatioTemporalDescriptor = new SpatioTemporalDescriptorImpl();
		return spatioTemporalDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamousBrand createFamousBrand() {
		FamousBrandImpl famousBrand = new FamousBrandImpl();
		return famousBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergingBrand createEmergingBrand() {
		EmergingBrandImpl emergingBrand = new EmergingBrandImpl();
		return emergingBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalBrand createLocalBrand() {
		LocalBrandImpl localBrand = new LocalBrandImpl();
		return localBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisingCampaign createAdvertisingCampaign() {
		AdvertisingCampaignImpl advertisingCampaign = new AdvertisingCampaignImpl();
		return advertisingCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisingProduct createAdvertisingProduct() {
		AdvertisingProductImpl advertisingProduct = new AdvertisingProductImpl();
		return advertisingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroEvent createMacroEvent() {
		MacroEventImpl macroEvent = new MacroEventImpl();
		return macroEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleBrandEvent createSingleBrandEvent() {
		SingleBrandEventImpl singleBrandEvent = new SingleBrandEventImpl();
		return singleBrandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductLine createProductLine() {
		ProductLineImpl productLine = new ProductLineImpl();
		return productLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStyle createProductStyle() {
		ProductStyleImpl productStyle = new ProductStyleImpl();
		return productStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo createPhoto() {
		PhotoImpl photo = new PhotoImpl();
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Designer createDesigner() {
		DesignerImpl designer = new DesignerImpl();
		return designer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Presenter createPresenter() {
		PresenterImpl presenter = new PresenterImpl();
		return presenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreographer createChoreographer() {
		ChoreographerImpl choreographer = new ChoreographerImpl();
		return choreographer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photographer createPhotographer() {
		PhotographerImpl photographer = new PhotographerImpl();
		return photographer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blogger createBlogger() {
		BloggerImpl blogger = new BloggerImpl();
		return blogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Critic createCritic() {
		CriticImpl critic = new CriticImpl();
		return critic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Influencer createInfluencer() {
		InfluencerImpl influencer = new InfluencerImpl();
		return influencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionPackage getFashionPackage() {
		return (FashionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FashionPackage getPackage() {
		return FashionPackage.eINSTANCE;
	}

} //FashionFactoryImpl
