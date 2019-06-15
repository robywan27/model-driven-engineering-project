/**
 */
package fashion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Brand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.LocalBrand#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getLocalBrand()
 * @model
 * @generated
 */
public interface LocalBrand extends Brand {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see fashion.FashionPackage#getLocalBrand_Country()
	 * @model required="true"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link fashion.LocalBrand#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // LocalBrand
