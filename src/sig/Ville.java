/**
 */
package sig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sig.Ville#getBatiments <em>Batiments</em>}</li>
 *   <li>{@link sig.Ville#getNom <em>Nom</em>}</li>
 *   <li>{@link sig.Ville#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getVille()
 * @model
 * @generated
 */
public interface Ville extends EObject {
	/**
	 * Returns the value of the '<em><b>Batiments</b></em>' containment reference list.
	 * The list contents are of type {@link sig.Batiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batiments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batiments</em>' containment reference list.
	 * @see sig.SigPackage#getVille_Batiments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Batiment> getBatiments();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see sig.SigPackage#getVille_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link sig.Ville#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

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
	 * @see sig.SigPackage#getVille_Zone()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link sig.Ville#getZone <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' containment reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

} // Ville
