/**
 */
package sig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sig.SigPackage
 * @generated
 */
public interface SigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SigFactory eINSTANCE = sig.impl.SigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ville</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ville</em>'.
	 * @generated
	 */
	Ville createVille();

	/**
	 * Returns a new object of class '<em>Travail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travail</em>'.
	 * @generated
	 */
	Travail createTravail();

	/**
	 * Returns a new object of class '<em>Etude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etude</em>'.
	 * @generated
	 */
	Etude createEtude();

	/**
	 * Returns a new object of class '<em>Soins</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soins</em>'.
	 * @generated
	 */
	Soins createSoins();

	/**
	 * Returns a new object of class '<em>Monde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monde</em>'.
	 * @generated
	 */
	Monde createMonde();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns a new object of class '<em>Liaison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liaison</em>'.
	 * @generated
	 */
	Liaison createLiaison();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SigPackage getSigPackage();

} //SigFactory
