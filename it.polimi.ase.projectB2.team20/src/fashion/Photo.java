/**
 */
package fashion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.Photo#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getPhoto()
 * @model
 * @generated
 */
public interface Photo extends Review {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute.
	 * @see #setTags(String)
	 * @see fashion.FashionPackage#getPhoto_Tags()
	 * @model required="true"
	 * @generated
	 */
	String getTags();

	/**
	 * Sets the value of the '{@link fashion.Photo#getTags <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' attribute.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(String value);

} // Photo
