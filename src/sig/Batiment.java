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
 *   <li>{@link sig.Batiment#getPersonnes <em>Personnes</em>}</li>
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
	 * Returns the value of the '<em><b>Personnes</b></em>' reference list.
	 * The list contents are of type {@link sig.Personne}.
	 * It is bidirectional and its opposite is '{@link sig.Personne#getBatiments <em>Batiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' reference list.
	 * @see sig.SigPackage#getBatiment_Personnes()
	 * @see sig.Personne#getBatiments
	 * @model opposite="batiments"
	 * @generated
	 */
	EList<Personne> getPersonnes();

} // Batiment
