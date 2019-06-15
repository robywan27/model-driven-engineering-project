/**
 */
package fashion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.Review#getId <em>Id</em>}</li>
 *   <li>{@link fashion.Review#getProduct <em>Product</em>}</li>
 *   <li>{@link fashion.Review#getReviewer <em>Reviewer</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getReview()
 * @model abstract="true"
 *        annotation="gmf.node label='id'"
 * @generated
 */
public interface Review extends FashionElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fashion.FashionPackage#getReview_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fashion.Review#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fashion.Product#getReviews <em>Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see fashion.FashionPackage#getReview_Product()
	 * @see fashion.Product#getReviews
	 * @model opposite="reviews" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link fashion.Review#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fashion.Reviewer#getReviews <em>Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewer</em>' reference.
	 * @see #setReviewer(Reviewer)
	 * @see fashion.FashionPackage#getReview_Reviewer()
	 * @see fashion.Reviewer#getReviews
	 * @model opposite="reviews" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Reviewer getReviewer();

	/**
	 * Sets the value of the '{@link fashion.Review#getReviewer <em>Reviewer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewer</em>' reference.
	 * @see #getReviewer()
	 * @generated
	 */
	void setReviewer(Reviewer value);

} // Review
