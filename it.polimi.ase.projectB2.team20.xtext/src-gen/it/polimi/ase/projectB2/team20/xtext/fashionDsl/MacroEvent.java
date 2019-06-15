/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl;

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
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.MacroEvent#getCity <em>City</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.MacroEvent#getSingleBrandEvents <em>Single Brand Events</em>}</li>
 * </ul>
 *
 * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getMacroEvent()
 * @model
 * @generated
 */
public interface MacroEvent extends Event
{
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
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getMacroEvent_City()
   * @model
   * @generated
   */
  String getCity();

  /**
   * Sets the value of the '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.MacroEvent#getCity <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>City</em>' attribute.
   * @see #getCity()
   * @generated
   */
  void setCity(String value);

  /**
   * Returns the value of the '<em><b>Single Brand Events</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Brand Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Brand Events</em>' containment reference list.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getMacroEvent_SingleBrandEvents()
   * @model containment="true"
   * @generated
   */
  EList<SingleBrandEvent> getSingleBrandEvents();

} // MacroEvent
