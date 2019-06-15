/**
 */
package fashion;

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
 *   <li>{@link fashion.Reviewer#getReviews <em>Reviews</em>}</li>
 * </ul>
 *
 * @see fashion.FashionPackage#getReviewer()
 * @model abstract="true"
 * @generated
 */
public interface Reviewer extends Role {
	/**
	 * Returns the value of the '<em><b>Reviews</b></em>' reference list.
	 * The list contents are of type {@link fashion.Review}.
	 * It is bidirectional and its opposite is '{@link fashion.Review#getReviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviews</em>' reference list.
	 * @see fashion.FashionPackage#getReviewer_Reviews()
	 * @see fashion.Review#getReviewer
	 * @model opposite="reviewer" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<Review> getReviews();

} // Reviewer
