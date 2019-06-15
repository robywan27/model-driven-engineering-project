/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.FashionElement#getStyles <em>Styles</em>}</li>
 *   <li>{@link fashion.FashionElement#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getFashionElement()
 * @model abstract="true"
 * @generated
 */
public interface FashionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference list.
	 * The list contents are of type {@link fashion.FashionStyle}.
	 * It is bidirectional and its opposite is '{@link fashion.FashionStyle#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference list.
	 * @see fashion.FashionPackage#getFashionElement_Styles()
	 * @see fashion.FashionStyle#getElements
	 * @model opposite="elements"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<FashionStyle> getStyles();

	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.NewsReport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference list.
	 * @see fashion.FashionPackage#getFashionElement_Reports()
	 * @model containment="true"
	 * @generated
	 */
	EList<NewsReport> getReports();

} // FashionElement
