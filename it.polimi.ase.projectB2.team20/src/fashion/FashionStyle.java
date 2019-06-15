/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.FashionStyle#getName <em>Name</em>}</li>
 *   <li>{@link fashion.FashionStyle#getDescriptors <em>Descriptors</em>}</li>
 *   <li>{@link fashion.FashionStyle#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getFashionStyle()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface FashionStyle extends EObject {
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
	 * @see fashion.FashionPackage#getFashionStyle_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fashion.FashionStyle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.SpatioTemporalDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptors</em>' containment reference list.
	 * @see fashion.FashionPackage#getFashionStyle_Descriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SpatioTemporalDescriptor> getDescriptors();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link fashion.FashionElement}.
	 * It is bidirectional and its opposite is '{@link fashion.FashionElement#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see fashion.FashionPackage#getFashionStyle_Elements()
	 * @see fashion.FashionElement#getStyles
	 * @model opposite="styles" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<FashionElement> getElements();

} // FashionStyle
