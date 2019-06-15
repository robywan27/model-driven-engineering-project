/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.Product#getName <em>Name</em>}</li>
 *   <li>{@link fashion.Product#getReviews <em>Reviews</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getProduct()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Product extends FashionElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fashion.FashionPackage#getProduct_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fashion.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reviews</b></em>' reference list.
	 * The list contents are of type {@link fashion.Review}.
	 * It is bidirectional and its opposite is '{@link fashion.Review#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviews</em>' reference list.
	 * @see fashion.FashionPackage#getProduct_Reviews()
	 * @see fashion.Review#getProduct
	 * @model opposite="product"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<Review> getReviews();

} // Product
