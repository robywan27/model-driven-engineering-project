/**
 */
package fashion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.MacroEvent#getCity <em>City</em>}</li>
 *   <li>{@link fashion.MacroEvent#getSingleBrandEvents <em>Single Brand Events</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getMacroEvent()
 * @model annotation="gmf.node label='name,year,month,city' label.pattern='{0}, {1}-{2}, {3}'"
 * @generated
 */
public interface MacroEvent extends Event {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see fashion.FashionPackage#getMacroEvent_City()
	 * @model required="true"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link fashion.MacroEvent#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Single Brand Events</b></em>' containment reference list.
	 * The list contents are of type {@link fashion.SingleBrandEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Brand Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Brand Events</em>' containment reference list.
	 * @see fashion.FashionPackage#getMacroEvent_SingleBrandEvents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SingleBrandEvent> getSingleBrandEvents();

} // MacroEvent
