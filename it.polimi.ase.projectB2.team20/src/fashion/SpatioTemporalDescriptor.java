/**
 */
package fashion;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatio Temporal Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fashion.SpatioTemporalDescriptor#getPeriod <em>Period</em>}</li>
 *   <li>{@link fashion.SpatioTemporalDescriptor#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getSpatioTemporalDescriptor()
 * @model annotation="gmf.node label='period,location' label.pattern='{0}, {1}'"
 * @generated
 */
public interface SpatioTemporalDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Date)
	 * @see fashion.FashionPackage#getSpatioTemporalDescriptor_Period()
	 * @model required="true"
	 * @generated
	 */
	Date getPeriod();

	/**
	 * Sets the value of the '{@link fashion.SpatioTemporalDescriptor#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see fashion.FashionPackage#getSpatioTemporalDescriptor_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link fashion.SpatioTemporalDescriptor#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // SpatioTemporalDescriptor
