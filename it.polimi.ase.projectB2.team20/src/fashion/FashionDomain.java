/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.FashionDomain#getElements <em>Elements</em>}</li>
 *   <li>{@link fashion.FashionDomain#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getFashionDomain()
 * @model
 * @generated
 */
public interface FashionDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.FashionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see fashion.FashionPackage#getFashionDomain_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FashionElement> getElements();

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.FashionStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see fashion.FashionPackage#getFashionDomain_Styles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FashionStyle> getStyles();

} // FashionDomain
