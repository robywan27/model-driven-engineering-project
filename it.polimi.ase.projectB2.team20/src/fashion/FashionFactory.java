/**
 */
package fashion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fashion.FashionPackage
 * @generated
 */
public interface FashionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FashionFactory eINSTANCE = fashion.impl.FashionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	FashionDomain createFashionDomain();

	/**
	 * Returns a new object of class '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Article</em>'.
	 * @generated
	 */
	Article createArticle();

	/**
	 * Returns a new object of class '<em>TV Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TV Program</em>'.
	 * @generated
	 */
	TVProgram createTVProgram();

	/**
	 * Returns a new object of class '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style</em>'.
	 * @generated
	 */
	FashionStyle createFashionStyle();

	/**
	 * Returns a new object of class '<em>Spatio Temporal Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatio Temporal Descriptor</em>'.
	 * @generated
	 */
	SpatioTemporalDescriptor createSpatioTemporalDescriptor();

	/**
	 * Returns a new object of class '<em>Famous Brand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Famous Brand</em>'.
	 * @generated
	 */
	FamousBrand createFamousBrand();

	/**
	 * Returns a new object of class '<em>Emerging Brand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emerging Brand</em>'.
	 * @generated
	 */
	EmergingBrand createEmergingBrand();

	/**
	 * Returns a new object of class '<em>Local Brand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Brand</em>'.
	 * @generated
	 */
	LocalBrand createLocalBrand();

	/**
	 * Returns a new object of class '<em>Advertising Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advertising Campaign</em>'.
	 * @generated
	 */
	AdvertisingCampaign createAdvertisingCampaign();

	/**
	 * Returns a new object of class '<em>Advertising Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advertising Product</em>'.
	 * @generated
	 */
	AdvertisingProduct createAdvertisingProduct();

	/**
	 * Returns a new object of class '<em>Macro Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Event</em>'.
	 * @generated
	 */
	MacroEvent createMacroEvent();

	/**
	 * Returns a new object of class '<em>Single Brand Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Brand Event</em>'.
	 * @generated
	 */
	SingleBrandEvent createSingleBrandEvent();

	/**
	 * Returns a new object of class '<em>Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Line</em>'.
	 * @generated
	 */
	ProductLine createProductLine();

	/**
	 * Returns a new object of class '<em>Product Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Style</em>'.
	 * @generated
	 */
	ProductStyle createProductStyle();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo</em>'.
	 * @generated
	 */
	Photo createPhoto();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Designer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Designer</em>'.
	 * @generated
	 */
	Designer createDesigner();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presenter</em>'.
	 * @generated
	 */
	Presenter createPresenter();

	/**
	 * Returns a new object of class '<em>Choreographer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreographer</em>'.
	 * @generated
	 */
	Choreographer createChoreographer();

	/**
	 * Returns a new object of class '<em>Photographer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photographer</em>'.
	 * @generated
	 */
	Photographer createPhotographer();

	/**
	 * Returns a new object of class '<em>Blogger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blogger</em>'.
	 * @generated
	 */
	Blogger createBlogger();

	/**
	 * Returns a new object of class '<em>Critic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Critic</em>'.
	 * @generated
	 */
	Critic createCritic();

	/**
	 * Returns a new object of class '<em>Influencer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influencer</em>'.
	 * @generated
	 */
	Influencer createInfluencer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FashionPackage getFashionPackage();

} //FashionFactory
