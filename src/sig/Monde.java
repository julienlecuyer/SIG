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
 *   <li>{@link sig.Monde#getPersonnes <em>Personnes</em>}</li>
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
	 * Returns the value of the '<em><b>Personnes</b></em>' containment reference list.
	 * The list contents are of type {@link sig.Personne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' containment reference list.
	 * @see sig.SigPackage#getMonde_Personnes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Personne> getPersonnes();

} // Monde
