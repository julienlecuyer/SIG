/**
 */
package sig;

import java.awt.Point;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sig.Zone#getNo <em>No</em>}</li>
 *   <li>{@link sig.Zone#getSe <em>Se</em>}</li>
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(Point)
	 * @see sig.SigPackage#getZone_No()
	 * @model dataType="sig.EPoint"
	 * @generated
	 */
	Point getNo();

	/**
	 * Sets the value of the '{@link sig.Zone#getNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(Point value);

	/**
	 * Returns the value of the '<em><b>Se</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se</em>' attribute.
	 * @see #setSe(Point)
	 * @see sig.SigPackage#getZone_Se()
	 * @model dataType="sig.EPoint"
	 * @generated
	 */
	Point getSe();

	/**
	 * Sets the value of the '{@link sig.Zone#getSe <em>Se</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se</em>' attribute.
	 * @see #getSe()
	 * @generated
	 */
	void setSe(Point value);

} // Zone
