/**
 */
package sig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monde</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sig.Monde#getVilles <em>Villes</em>}</li>
 *   <li>{@link sig.Monde#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getMonde()
 * @model
 * @generated
 */
public interface Monde extends EObject {
	/**
	 * Returns the value of the '<em><b>Villes</b></em>' containment reference list.
	 * The list contents are of type {@link sig.Ville}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Villes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Villes</em>' containment reference list.
	 * @see sig.SigPackage#getMonde_Villes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ville> getVilles();

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' containment reference.
	 * @see #setZone(Zone)
	 * @see sig.SigPackage#getMonde_Zone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link sig.Monde#getZone <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' containment reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

} // Monde
