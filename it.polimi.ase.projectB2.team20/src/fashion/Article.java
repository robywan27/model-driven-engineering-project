/**
 */
package fashion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.Article#getTitle <em>Title</em>}</li>
 *   <li>{@link fashion.Article#getMagazine <em>Magazine</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getArticle()
 * @model annotation="gmf.node label='title,type' label.pattern='{1}: {0}'"
 * @generated
 */
public interface Article extends NewsReport {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fashion.FashionPackage#getArticle_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fashion.Article#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Magazine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magazine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magazine</em>' attribute.
	 * @see #setMagazine(String)
	 * @see fashion.FashionPackage#getArticle_Magazine()
	 * @model required="true"
	 * @generated
	 */
	String getMagazine();

	/**
	 * Sets the value of the '{@link fashion.Article#getMagazine <em>Magazine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magazine</em>' attribute.
	 * @see #getMagazine()
	 * @generated
	 */
	void setMagazine(String value);

} // Article
