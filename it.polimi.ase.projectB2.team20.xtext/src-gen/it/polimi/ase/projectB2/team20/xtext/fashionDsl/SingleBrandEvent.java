/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Brand Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getDay <em>Day</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getHour <em>Hour</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getMinute <em>Minute</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getSingleBrandEvent()
 * @model
 * @generated
 */
public interface SingleBrandEvent extends Event
{
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
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getSingleBrandEvent_Day()
   * @model
   * @generated
   */
  int getDay();

  /**
   * Sets the value of the '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getDay <em>Day</em>}' attribute.
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
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getSingleBrandEvent_Hour()
   * @model
   * @generated
   */
  int getHour();

  /**
   * Sets the value of the '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getHour <em>Hour</em>}' attribute.
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
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getSingleBrandEvent_Minute()
   * @model
   * @generated
   */
  int getMinute();

  /**
   * Sets the value of the '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getMinute <em>Minute</em>}' attribute.
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
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getSingleBrandEvent_Brand()
   * @model
   * @generated
   */
  Brand getBrand();

  /**
   * Sets the value of the '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent#getBrand <em>Brand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Brand</em>' reference.
   * @see #getBrand()
   * @generated
   */
  void setBrand(Brand value);

} // SingleBrandEvent
