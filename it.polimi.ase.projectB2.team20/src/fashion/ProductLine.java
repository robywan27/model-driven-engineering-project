/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.ProductLine#getName <em>Name</em>}</li>
 *   <li>{@link fashion.ProductLine#getBrand <em>Brand</em>}</li>
 *   <li>{@link fashion.ProductLine#getProductStyles <em>Product Styles</em>}</li>
 *   <li>{@link fashion.ProductLine#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getProductLine()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ProductLine extends FashionElement {
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
	 * @see fashion.FashionPackage#getProductLine_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fashion.ProductLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fashion.Brand#getProductLines <em>Product Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' reference.
	 * @see #setBrand(Brand)
	 * @see fashion.FashionPackage#getProductLine_Brand()
	 * @see fashion.Brand#getProductLines
	 * @model opposite="productLines" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Brand getBrand();

	/**
	 * Sets the value of the '{@link fashion.ProductLine#getBrand <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(Brand value);

	/**
	 * Returns the value of the '<em><b>Product Styles</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.ProductStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Styles</em>' containment reference list.
	 * @see fashion.FashionPackage#getProductLine_ProductStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProductStyle> getProductStyles();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see fashion.FashionPackage#getProductLine_Products()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Product> getProducts();

} // ProductLine
