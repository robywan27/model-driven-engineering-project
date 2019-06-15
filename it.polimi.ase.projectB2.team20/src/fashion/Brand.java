/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.Brand#getName <em>Name</em>}</li>
 *   <li>{@link fashion.Brand#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link fashion.Brand#getProductLines <em>Product Lines</em>}</li>
 *   <li>{@link fashion.Brand#getDesigners <em>Designers</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getBrand()
 * @model abstract="true"
 *        annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Brand extends FashionElement {
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
	 * @see fashion.FashionPackage#getBrand_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fashion.Brand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Campaigns</b></em>' reference list.
	 * The list contents are of type {@link fashion.AdvertisingCampaign}.
	 * It is bidirectional and its opposite is '{@link fashion.AdvertisingCampaign#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaigns</em>' reference list.
	 * @see fashion.FashionPackage#getBrand_Campaigns()
	 * @see fashion.AdvertisingCampaign#getBrand
	 * @model opposite="brand"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<AdvertisingCampaign> getCampaigns();

	/**
	 * Returns the value of the '<em><b>Product Lines</b></em>' reference list.
	 * The list contents are of type {@link fashion.ProductLine}.
	 * It is bidirectional and its opposite is '{@link fashion.ProductLine#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Lines</em>' reference list.
	 * @see fashion.FashionPackage#getBrand_ProductLines()
	 * @see fashion.ProductLine#getBrand
	 * @model opposite="brand" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<ProductLine> getProductLines();

	/**
	 * Returns the value of the '<em><b>Designers</b></em>' reference list.
	 * The list contents are of type {@link fashion.Designer}.
	 * It is bidirectional and its opposite is '{@link fashion.Designer#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designers</em>' reference list.
	 * @see fashion.FashionPackage#getBrand_Designers()
	 * @see fashion.Designer#getBrand
	 * @model opposite="brand" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<Designer> getDesigners();

} // Brand
