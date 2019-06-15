/**
 */
package fashion.util;

import fashion.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fashion.FashionPackage
 * @generated
 */
public class FashionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FashionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FashionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FashionSwitch<Adapter> modelSwitch =
		new FashionSwitch<Adapter>() {
			@Override
			public Adapter caseFashionDomain(FashionDomain object) {
				return createFashionDomainAdapter();
			}
			@Override
			public Adapter caseFashionElement(FashionElement object) {
				return createFashionElementAdapter();
			}
			@Override
			public Adapter caseNewsReport(NewsReport object) {
				return createNewsReportAdapter();
			}
			@Override
			public Adapter caseArticle(Article object) {
				return createArticleAdapter();
			}
			@Override
			public Adapter caseTVProgram(TVProgram object) {
				return createTVProgramAdapter();
			}
			@Override
			public Adapter caseFashionStyle(FashionStyle object) {
				return createFashionStyleAdapter();
			}
			@Override
			public Adapter caseSpatioTemporalDescriptor(SpatioTemporalDescriptor object) {
				return createSpatioTemporalDescriptorAdapter();
			}
			@Override
			public Adapter caseBrand(Brand object) {
				return createBrandAdapter();
			}
			@Override
			public Adapter caseFamousBrand(FamousBrand object) {
				return createFamousBrandAdapter();
			}
			@Override
			public Adapter caseEmergingBrand(EmergingBrand object) {
				return createEmergingBrandAdapter();
			}
			@Override
			public Adapter caseLocalBrand(LocalBrand object) {
				return createLocalBrandAdapter();
			}
			@Override
			public Adapter caseAdvertisingCampaign(AdvertisingCampaign object) {
				return createAdvertisingCampaignAdapter();
			}
			@Override
			public Adapter caseAdvertisingProduct(AdvertisingProduct object) {
				return createAdvertisingProductAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseMacroEvent(MacroEvent object) {
				return createMacroEventAdapter();
			}
			@Override
			public Adapter caseSingleBrandEvent(SingleBrandEvent object) {
				return createSingleBrandEventAdapter();
			}
			@Override
			public Adapter caseProductLine(ProductLine object) {
				return createProductLineAdapter();
			}
			@Override
			public Adapter caseProductStyle(ProductStyle object) {
				return createProductStyleAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseReview(Review object) {
				return createReviewAdapter();
			}
			@Override
			public Adapter casePhoto(Photo object) {
				return createPhotoAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseDesigner(Designer object) {
				return createDesignerAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter casePresenter(Presenter object) {
				return createPresenterAdapter();
			}
			@Override
			public Adapter caseChoreographer(Choreographer object) {
				return createChoreographerAdapter();
			}
			@Override
			public Adapter casePhotographer(Photographer object) {
				return createPhotographerAdapter();
			}
			@Override
			public Adapter caseReviewer(Reviewer object) {
				return createReviewerAdapter();
			}
			@Override
			public Adapter caseBlogger(Blogger object) {
				return createBloggerAdapter();
			}
			@Override
			public Adapter caseCritic(Critic object) {
				return createCriticAdapter();
			}
			@Override
			public Adapter caseInfluencer(Influencer object) {
				return createInfluencerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fashion.FashionDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.FashionDomain
	 * @generated
	 */
	public Adapter createFashionDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.FashionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.FashionElement
	 * @generated
	 */
	public Adapter createFashionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.NewsReport <em>News Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.NewsReport
	 * @generated
	 */
	public Adapter createNewsReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Article
	 * @generated
	 */
	public Adapter createArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.TVProgram <em>TV Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.TVProgram
	 * @generated
	 */
	public Adapter createTVProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.FashionStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.FashionStyle
	 * @generated
	 */
	public Adapter createFashionStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.SpatioTemporalDescriptor <em>Spatio Temporal Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.SpatioTemporalDescriptor
	 * @generated
	 */
	public Adapter createSpatioTemporalDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Brand
	 * @generated
	 */
	public Adapter createBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.FamousBrand <em>Famous Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.FamousBrand
	 * @generated
	 */
	public Adapter createFamousBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.EmergingBrand <em>Emerging Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.EmergingBrand
	 * @generated
	 */
	public Adapter createEmergingBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.LocalBrand <em>Local Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.LocalBrand
	 * @generated
	 */
	public Adapter createLocalBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.AdvertisingCampaign <em>Advertising Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.AdvertisingCampaign
	 * @generated
	 */
	public Adapter createAdvertisingCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.AdvertisingProduct <em>Advertising Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.AdvertisingProduct
	 * @generated
	 */
	public Adapter createAdvertisingProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.MacroEvent <em>Macro Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.MacroEvent
	 * @generated
	 */
	public Adapter createMacroEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.SingleBrandEvent <em>Single Brand Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.SingleBrandEvent
	 * @generated
	 */
	public Adapter createSingleBrandEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.ProductLine <em>Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.ProductLine
	 * @generated
	 */
	public Adapter createProductLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.ProductStyle <em>Product Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.ProductStyle
	 * @generated
	 */
	public Adapter createProductStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Review
	 * @generated
	 */
	public Adapter createReviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Photo
	 * @generated
	 */
	public Adapter createPhotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Designer <em>Designer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Designer
	 * @generated
	 */
	public Adapter createDesignerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Presenter <em>Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Presenter
	 * @generated
	 */
	public Adapter createPresenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Choreographer <em>Choreographer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Choreographer
	 * @generated
	 */
	public Adapter createChoreographerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Photographer <em>Photographer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Photographer
	 * @generated
	 */
	public Adapter createPhotographerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Reviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Reviewer
	 * @generated
	 */
	public Adapter createReviewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Blogger <em>Blogger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Blogger
	 * @generated
	 */
	public Adapter createBloggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Critic <em>Critic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Critic
	 * @generated
	 */
	public Adapter createCriticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fashion.Influencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fashion.Influencer
	 * @generated
	 */
	public Adapter createInfluencerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FashionAdapterFactory
