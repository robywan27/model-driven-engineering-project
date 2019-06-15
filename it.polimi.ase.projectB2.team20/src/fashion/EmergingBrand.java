/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emerging Brand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.EmergingBrand#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getEmergingBrand()
 * @model
 * @generated
 */
public interface EmergingBrand extends Brand {
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
	 * @see fashion.FashionPackage#getEmergingBrand_Countries()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getCountries();

} // EmergingBrand
