/**
 */
package fashion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Brand Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.SingleBrandEvent#getDay <em>Day</em>}</li>
 *   <li>{@link fashion.SingleBrandEvent#getHour <em>Hour</em>}</li>
 *   <li>{@link fashion.SingleBrandEvent#getMinute <em>Minute</em>}</li>
 *   <li>{@link fashion.SingleBrandEvent#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getSingleBrandEvent()
 * @model annotation="gmf.node label='name,year,month,day,hour,minute' label.pattern='{0}, {1}-{2}-{3}, {4}:{5}'"
 * @generated
 */
public interface SingleBrandEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see fashion.FashionPackage#getSingleBrandEvent_Day()
	 * @model required="true"
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link fashion.SingleBrandEvent#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see fashion.FashionPackage#getSingleBrandEvent_Hour()
	 * @model required="true"
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link fashion.SingleBrandEvent#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(int value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see fashion.FashionPackage#getSingleBrandEvent_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link fashion.SingleBrandEvent#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' reference.
	 * @see #setBrand(Brand)
	 * @see fashion.FashionPackage#getSingleBrandEvent_Brand()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Brand getBrand();

	/**
	 * Sets the value of the '{@link fashion.SingleBrandEvent#getBrand <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(Brand value);

} // SingleBrandEvent
