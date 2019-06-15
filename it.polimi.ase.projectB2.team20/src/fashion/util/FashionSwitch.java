/**
 */
package fashion.util;

import fashion.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fashion.FashionPackage
 * @generated
 */
public class FashionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FashionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FashionSwitch() {
		if (modelPackage == null) {
			modelPackage = FashionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FashionPackage.FASHION_DOMAIN: {
				FashionDomain fashionDomain = (FashionDomain)theEObject;
				T result = caseFashionDomain(fashionDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.FASHION_ELEMENT: {
				FashionElement fashionElement = (FashionElement)theEObject;
				T result = caseFashionElement(fashionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.NEWS_REPORT: {
				NewsReport newsReport = (NewsReport)theEObject;
				T result = caseNewsReport(newsReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.ARTICLE: {
				Article article = (Article)theEObject;
				T result = caseArticle(article);
				if (result == null) result = caseNewsReport(article);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.TV_PROGRAM: {
				TVProgram tvProgram = (TVProgram)theEObject;
				T result = caseTVProgram(tvProgram);
				if (result == null) result = caseNewsReport(tvProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.FASHION_STYLE: {
				FashionStyle fashionStyle = (FashionStyle)theEObject;
				T result = caseFashionStyle(fashionStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.SPATIO_TEMPORAL_DESCRIPTOR: {
				SpatioTemporalDescriptor spatioTemporalDescriptor = (SpatioTemporalDescriptor)theEObject;
				T result = caseSpatioTemporalDescriptor(spatioTemporalDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.BRAND: {
				Brand brand = (Brand)theEObject;
				T result = caseBrand(brand);
				if (result == null) result = caseFashionElement(brand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.FAMOUS_BRAND: {
				FamousBrand famousBrand = (FamousBrand)theEObject;
				T result = caseFamousBrand(famousBrand);
				if (result == null) result = caseBrand(famousBrand);
				if (result == null) result = caseFashionElement(famousBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.EMERGING_BRAND: {
				EmergingBrand emergingBrand = (EmergingBrand)theEObject;
				T result = caseEmergingBrand(emergingBrand);
				if (result == null) result = caseBrand(emergingBrand);
				if (result == null) result = caseFashionElement(emergingBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.LOCAL_BRAND: {
				LocalBrand localBrand = (LocalBrand)theEObject;
				T result = caseLocalBrand(localBrand);
				if (result == null) result = caseBrand(localBrand);
				if (result == null) result = caseFashionElement(localBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.ADVERTISING_CAMPAIGN: {
				AdvertisingCampaign advertisingCampaign = (AdvertisingCampaign)theEObject;
				T result = caseAdvertisingCampaign(advertisingCampaign);
				if (result == null) result = caseFashionElement(advertisingCampaign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.ADVERTISING_PRODUCT: {
				AdvertisingProduct advertisingProduct = (AdvertisingProduct)theEObject;
				T result = caseAdvertisingProduct(advertisingProduct);
				if (result == null) result = caseFashionElement(advertisingProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseFashionElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.MACRO_EVENT: {
				MacroEvent macroEvent = (MacroEvent)theEObject;
				T result = caseMacroEvent(macroEvent);
				if (result == null) result = caseEvent(macroEvent);
				if (result == null) result = caseFashionElement(macroEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.SINGLE_BRAND_EVENT: {
				SingleBrandEvent singleBrandEvent = (SingleBrandEvent)theEObject;
				T result = caseSingleBrandEvent(singleBrandEvent);
				if (result == null) result = caseEvent(singleBrandEvent);
				if (result == null) result = caseFashionElement(singleBrandEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.PRODUCT_LINE: {
				ProductLine productLine = (ProductLine)theEObject;
				T result = caseProductLine(productLine);
				if (result == null) result = caseFashionElement(productLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.PRODUCT_STYLE: {
				ProductStyle productStyle = (ProductStyle)theEObject;
				T result = caseProductStyle(productStyle);
				if (result == null) result = caseFashionElement(productStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseFashionElement(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.REVIEW: {
				Review review = (Review)theEObject;
				T result = caseReview(review);
				if (result == null) result = caseFashionElement(review);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.PHOTO: {
				Photo photo = (Photo)theEObject;
				T result = casePhoto(photo);
				if (result == null) result = caseReview(photo);
				if (result == null) result = caseFashionElement(photo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseReview(description);
				if (result == null) result = caseFashionElement(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseReview(comment);
				if (result == null) result = caseFashionElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseFashionElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.DESIGNER: {
				Designer designer = (Designer)theEObject;
				T result = caseDesigner(designer);
				if (result == null) result = caseRole(designer);
				if (result == null) result = caseFashionElement(designer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseRole(model);
				if (result == null) result = caseFashionElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.PRESENTER: {
				Presenter presenter = (Presenter)theEObject;
				T result = casePresenter(presenter);
				if (result == null) result = caseRole(presenter);
				if (result == null) result = caseFashionElement(presenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.CHOREOGRAPHER: {
				Choreographer choreographer = (Choreographer)theEObject;
				T result = caseChoreographer(choreographer);
				if (result == null) result = caseRole(choreographer);
				if (result == null) result = caseFashionElement(choreographer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.PHOTOGRAPHER: {
				Photographer photographer = (Photographer)theEObject;
				T result = casePhotographer(photographer);
				if (result == null) result = caseRole(photographer);
				if (result == null) result = caseFashionElement(photographer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.REVIEWER: {
				Reviewer reviewer = (Reviewer)theEObject;
				T result = caseReviewer(reviewer);
				if (result == null) result = caseRole(reviewer);
				if (result == null) result = caseFashionElement(reviewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.BLOGGER: {
				Blogger blogger = (Blogger)theEObject;
				T result = caseBlogger(blogger);
				if (result == null) result = caseReviewer(blogger);
				if (result == null) result = caseRole(blogger);
				if (result == null) result = caseFashionElement(blogger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.CRITIC: {
				Critic critic = (Critic)theEObject;
				T result = caseCritic(critic);
				if (result == null) result = caseReviewer(critic);
				if (result == null) result = caseRole(critic);
				if (result == null) result = caseFashionElement(critic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FashionPackage.INFLUENCER: {
				Influencer influencer = (Influencer)theEObject;
				T result = caseInfluencer(influencer);
				if (result == null) result = caseReviewer(influencer);
				if (result == null) result = caseRole(influencer);
				if (result == null) result = caseFashionElement(influencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFashionDomain(FashionDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFashionElement(FashionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>News Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>News Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewsReport(NewsReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TV Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TV Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVProgram(TVProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFashionStyle(FashionStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatio Temporal Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatio Temporal Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatioTemporalDescriptor(SpatioTemporalDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrand(Brand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Famous Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Famous Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamousBrand(FamousBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emerging Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emerging Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergingBrand(EmergingBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalBrand(LocalBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advertising Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advertising Campaign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvertisingCampaign(AdvertisingCampaign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advertising Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advertising Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvertisingProduct(AdvertisingProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroEvent(MacroEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Brand Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Brand Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleBrandEvent(SingleBrandEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductLine(ProductLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductStyle(ProductStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReview(Review object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhoto(Photo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesigner(Designer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresenter(Presenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreographer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreographer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographer(Choreographer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photographer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photographer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotographer(Photographer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reviewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reviewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewer(Reviewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blogger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blogger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlogger(Blogger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Critic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Critic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCritic(Critic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluencer(Influencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FashionSwitch
