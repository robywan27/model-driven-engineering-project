/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.util;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage
 * @generated
 */
public class FashionDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FashionDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FashionDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FashionDslPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected FashionDslSwitch<Adapter> modelSwitch =
    new FashionDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseFashionDomain(FashionDomain object)
      {
        return createFashionDomainAdapter();
      }
      @Override
      public Adapter caseFashionElement(FashionElement object)
      {
        return createFashionElementAdapter();
      }
      @Override
      public Adapter caseBrand(Brand object)
      {
        return createBrandAdapter();
      }
      @Override
      public Adapter caseNewsReport(NewsReport object)
      {
        return createNewsReportAdapter();
      }
      @Override
      public Adapter caseReview(Review object)
      {
        return createReviewAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseReviewer(Reviewer object)
      {
        return createReviewerAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseFashionStyle(FashionStyle object)
      {
        return createFashionStyleAdapter();
      }
      @Override
      public Adapter caseSpatioTemporalDescriptor(SpatioTemporalDescriptor object)
      {
        return createSpatioTemporalDescriptorAdapter();
      }
      @Override
      public Adapter caseArticle(Article object)
      {
        return createArticleAdapter();
      }
      @Override
      public Adapter caseTVProgram(TVProgram object)
      {
        return createTVProgramAdapter();
      }
      @Override
      public Adapter caseFamousBrand(FamousBrand object)
      {
        return createFamousBrandAdapter();
      }
      @Override
      public Adapter caseEmergingBrand(EmergingBrand object)
      {
        return createEmergingBrandAdapter();
      }
      @Override
      public Adapter caseLocalBrand(LocalBrand object)
      {
        return createLocalBrandAdapter();
      }
      @Override
      public Adapter caseAdvertisingCampaign(AdvertisingCampaign object)
      {
        return createAdvertisingCampaignAdapter();
      }
      @Override
      public Adapter caseAdvertisingProduct(AdvertisingProduct object)
      {
        return createAdvertisingProductAdapter();
      }
      @Override
      public Adapter caseProductLine(ProductLine object)
      {
        return createProductLineAdapter();
      }
      @Override
      public Adapter caseProductStyle(ProductStyle object)
      {
        return createProductStyleAdapter();
      }
      @Override
      public Adapter caseProduct(Product object)
      {
        return createProductAdapter();
      }
      @Override
      public Adapter casePhoto(Photo object)
      {
        return createPhotoAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseBlogger(Blogger object)
      {
        return createBloggerAdapter();
      }
      @Override
      public Adapter caseCritic(Critic object)
      {
        return createCriticAdapter();
      }
      @Override
      public Adapter caseInfluencer(Influencer object)
      {
        return createInfluencerAdapter();
      }
      @Override
      public Adapter caseDesigner(Designer object)
      {
        return createDesignerAdapter();
      }
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePhotographer(Photographer object)
      {
        return createPhotographerAdapter();
      }
      @Override
      public Adapter caseChoreographer(Choreographer object)
      {
        return createChoreographerAdapter();
      }
      @Override
      public Adapter casePresenter(Presenter object)
      {
        return createPresenterAdapter();
      }
      @Override
      public Adapter caseMacroEvent(MacroEvent object)
      {
        return createMacroEventAdapter();
      }
      @Override
      public Adapter caseSingleBrandEvent(SingleBrandEvent object)
      {
        return createSingleBrandEventAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDomain <em>Fashion Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDomain
   * @generated
   */
  public Adapter createFashionDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionElement <em>Fashion Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionElement
   * @generated
   */
  public Adapter createFashionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Brand <em>Brand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Brand
   * @generated
   */
  public Adapter createBrandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.NewsReport <em>News Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.NewsReport
   * @generated
   */
  public Adapter createNewsReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Review <em>Review</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Review
   * @generated
   */
  public Adapter createReviewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Reviewer <em>Reviewer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Reviewer
   * @generated
   */
  public Adapter createReviewerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionStyle <em>Fashion Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionStyle
   * @generated
   */
  public Adapter createFashionStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SpatioTemporalDescriptor <em>Spatio Temporal Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.SpatioTemporalDescriptor
   * @generated
   */
  public Adapter createSpatioTemporalDescriptorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Article <em>Article</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Article
   * @generated
   */
  public Adapter createArticleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.TVProgram <em>TV Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.TVProgram
   * @generated
   */
  public Adapter createTVProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.FamousBrand <em>Famous Brand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FamousBrand
   * @generated
   */
  public Adapter createFamousBrandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.EmergingBrand <em>Emerging Brand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.EmergingBrand
   * @generated
   */
  public Adapter createEmergingBrandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.LocalBrand <em>Local Brand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.LocalBrand
   * @generated
   */
  public Adapter createLocalBrandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign <em>Advertising Campaign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign
   * @generated
   */
  public Adapter createAdvertisingCampaignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingProduct <em>Advertising Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingProduct
   * @generated
   */
  public Adapter createAdvertisingProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductLine <em>Product Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductLine
   * @generated
   */
  public Adapter createProductLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductStyle <em>Product Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductStyle
   * @generated
   */
  public Adapter createProductStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Product
   * @generated
   */
  public Adapter createProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Photo <em>Photo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Photo
   * @generated
   */
  public Adapter createPhotoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Blogger <em>Blogger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Blogger
   * @generated
   */
  public Adapter createBloggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Critic <em>Critic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Critic
   * @generated
   */
  public Adapter createCriticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Influencer <em>Influencer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Influencer
   * @generated
   */
  public Adapter createInfluencerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Designer <em>Designer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Designer
   * @generated
   */
  public Adapter createDesignerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Photographer <em>Photographer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Photographer
   * @generated
   */
  public Adapter createPhotographerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Choreographer <em>Choreographer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Choreographer
   * @generated
   */
  public Adapter createChoreographerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Presenter <em>Presenter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.Presenter
   * @generated
   */
  public Adapter createPresenterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.MacroEvent <em>Macro Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.MacroEvent
   * @generated
   */
  public Adapter createMacroEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent <em>Single Brand Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent
   * @generated
   */
  public Adapter createSingleBrandEventAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FashionDslAdapterFactory
