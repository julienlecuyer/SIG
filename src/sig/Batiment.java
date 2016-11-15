/**
 */
package sig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sig.Batiment#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link sig.Batiment#getLiaisons <em>Liaisons</em>}</li>
 *   <li>{@link sig.Batiment#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getBatiment()
 * @model abstract="true"
 * @generated
 */
public interface Batiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see sig.SigPackage#getBatiment_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link sig.Batiment#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Liaisons</b></em>' containment reference list.
	 * The list contents are of type {@link sig.Liaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liaisons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liaisons</em>' containment reference list.
	 * @see sig.SigPackage#getBatiment_Liaisons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Liaison> getLiaisons();

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
	 * @see sig.SigPackage#getBatiment_Zone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link sig.Batiment#getZone <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' containment reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

} // Batiment
