/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Famous Brand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.FamousBrand#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getFamousBrand()
 * @model
 * @generated
 */
public interface FamousBrand extends Brand {
	/**
	 * Returns the value of the '<em><b>Countries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' attribute list.
	 * @see fashion.FashionPackage#getFamousBrand_Countries()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getCountries();

} // FamousBrand
