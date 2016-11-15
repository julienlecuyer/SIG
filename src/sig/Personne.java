/**
 */
package sig;

import java.awt.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sig.Personne#getNom <em>Nom</em>}</li>
 *   <li>{@link sig.Personne#getStatut <em>Statut</em>}</li>
 *   <li>{@link sig.Personne#getLiaisons <em>Liaisons</em>}</li>
 *   <li>{@link sig.Personne#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject {
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
	 * @see sig.SigPackage#getPersonne_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link sig.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut</em>' attribute.
	 * @see #setStatut(String)
	 * @see sig.SigPackage#getPersonne_Statut()
	 * @model
	 * @generated
	 */
	String getStatut();

	/**
	 * Sets the value of the '{@link sig.Personne#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut</em>' attribute.
	 * @see #getStatut()
	 * @generated
	 */
	void setStatut(String value);

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
	 * @see sig.SigPackage#getPersonne_Liaisons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Liaison> getLiaisons();

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(Point)
	 * @see sig.SigPackage#getPersonne_Pos()
	 * @model dataType="sig.EPoint"
	 * @generated
	 */
	Point getPos();

	/**
	 * Sets the value of the '{@link sig.Personne#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Point value);

} // Personne
