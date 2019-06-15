/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reviewer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Reviewer#getReviews <em>Reviews</em>}</li>
 * </ul>
 *
 * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getReviewer()
 * @model
 * @generated
 */
public interface Reviewer extends Role
{
  /**
   * Returns the value of the '<em><b>Reviews</b></em>' reference list.
   * The list contents are of type {@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.Review}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reviews</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reviews</em>' reference list.
   * @see it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage#getReviewer_Reviews()
   * @model
   * @generated
   */
  EList<Review> getReviews();

} // Reviewer
