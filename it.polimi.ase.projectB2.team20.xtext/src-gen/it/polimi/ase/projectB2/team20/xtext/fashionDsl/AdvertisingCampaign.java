/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advertising Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign#getBrand <em>Brand</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getAdvertisingCampaign()
 * @model
 * @generated
 */
public interface AdvertisingCampaign extends FashionElement
{
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
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getAdvertisingCampaign_Brand()
   * @model
   * @generated
   */
  Brand getBrand();

  /**
   * Sets the value of the '{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign#getBrand <em>Brand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Brand</em>' reference.
   * @see #getBrand()
   * @generated
   */
  void setBrand(Brand value);

  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingProduct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference list.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getAdvertisingCampaign_Products()
   * @model containment="true"
   * @generated
   */
  EList<AdvertisingProduct> getProducts();

} // AdvertisingCampaign
