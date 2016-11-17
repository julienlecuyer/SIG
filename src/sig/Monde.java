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
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getMonde()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomVilleUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nomVilleUnique='\n\t\t\tself.villes->forAll(v1, v2:Ville |\n \t\t\tv1<>v2 implies\n \t\t\tv1.nom <> v2.nom)'"
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

} // Monde
