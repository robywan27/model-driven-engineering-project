/**
 */
package fashion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advertising Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.AdvertisingProduct#getName <em>Name</em>}</li>
 *   <li>{@link fashion.AdvertisingProduct#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getAdvertisingProduct()
 * @model annotation="gmf.node label='name,type' label.pattern='{0}: {1}'"
 * @generated
 */
public interface AdvertisingProduct extends FashionElement {
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
	 * @see fashion.FashionPackage#getAdvertisingProduct_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fashion.AdvertisingProduct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fashion.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fashion.MediaType
	 * @see #setType(MediaType)
	 * @see fashion.FashionPackage#getAdvertisingProduct_Type()
	 * @model required="true"
	 * @generated
	 */
	MediaType getType();

	/**
	 * Sets the value of the '{@link fashion.AdvertisingProduct#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fashion.MediaType
	 * @see #getType()
	 * @generated
	 */
	void setType(MediaType value);

} // AdvertisingProduct
