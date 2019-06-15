/**
 */
package fashion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Designer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.Designer#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getDesigner()
 * @model
 * @generated
 */
public interface Designer extends Role {
	/**
	 * Returns the value of the '<em><b>Brand</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fashion.Brand#getDesigners <em>Designers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' reference.
	 * @see #setBrand(Brand)
	 * @see fashion.FashionPackage#getDesigner_Brand()
	 * @see fashion.Brand#getDesigners
	 * @model opposite="designers" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Brand getBrand();

	/**
	 * Sets the value of the '{@link fashion.Designer#getBrand <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(Brand value);

} // Designer
