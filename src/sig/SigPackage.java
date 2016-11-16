/**
 */
package sig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sig.SigFactory
 * @model kind="package"
 * @generated
 */
public interface SigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ubo.jl.sig";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SigPackage eINSTANCE = sig.impl.SigPackageImpl.init();

	/**
	 * The meta object id for the '{@link sig.impl.VilleImpl <em>Ville</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.VilleImpl
	 * @see sig.impl.SigPackageImpl#getVille()
	 * @generated
	 */
	int VILLE = 0;

	/**
	 * The feature id for the '<em><b>Batiments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__BATIMENTS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__NOM = 1;

	/**
	 * The number of structural features of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sig.impl.BatimentImpl <em>Batiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.BatimentImpl
	 * @see sig.impl.SigPackageImpl#getBatiment()
	 * @generated
	 */
	int BATIMENT = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__ADRESSE = 0;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__PERSONNES = 1;

	/**
	 * The number of structural features of the '<em>Batiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Batiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sig.impl.TravailImpl <em>Travail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.TravailImpl
	 * @see sig.impl.SigPackageImpl#getTravail()
	 * @generated
	 */
	int TRAVAIL = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVAIL__ADRESSE = BATIMENT__ADRESSE;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVAIL__PERSONNES = BATIMENT__PERSONNES;

	/**
	 * The number of structural features of the '<em>Travail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVAIL_FEATURE_COUNT = BATIMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Travail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVAIL_OPERATION_COUNT = BATIMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sig.impl.EtudeImpl <em>Etude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.EtudeImpl
	 * @see sig.impl.SigPackageImpl#getEtude()
	 * @generated
	 */
	int ETUDE = 3;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDE__ADRESSE = BATIMENT__ADRESSE;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDE__PERSONNES = BATIMENT__PERSONNES;

	/**
	 * The number of structural features of the '<em>Etude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDE_FEATURE_COUNT = BATIMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Etude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDE_OPERATION_COUNT = BATIMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sig.impl.SoinsImpl <em>Soins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.SoinsImpl
	 * @see sig.impl.SigPackageImpl#getSoins()
	 * @generated
	 */
	int SOINS = 4;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOINS__ADRESSE = BATIMENT__ADRESSE;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOINS__PERSONNES = BATIMENT__PERSONNES;

	/**
	 * The number of structural features of the '<em>Soins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOINS_FEATURE_COUNT = BATIMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOINS_OPERATION_COUNT = BATIMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sig.impl.MondeImpl <em>Monde</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.MondeImpl
	 * @see sig.impl.SigPackageImpl#getMonde()
	 * @generated
	 */
	int MONDE = 5;

	/**
	 * The feature id for the '<em><b>Villes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONDE__VILLES = 0;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONDE__PERSONNES = 1;

	/**
	 * The number of structural features of the '<em>Monde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Monde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sig.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sig.impl.PersonneImpl
	 * @see sig.impl.SigPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__STATUT = 1;

	/**
	 * The feature id for the '<em><b>Batiments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__BATIMENTS = 2;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sig.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ville</em>'.
	 * @see sig.Ville
	 * @generated
	 */
	EClass getVille();

	/**
	 * Returns the meta object for the containment reference list '{@link sig.Ville#getBatiments <em>Batiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batiments</em>'.
	 * @see sig.Ville#getBatiments()
	 * @see #getVille()
	 * @generated
	 */
	EReference getVille_Batiments();

	/**
	 * Returns the meta object for the attribute '{@link sig.Ville#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see sig.Ville#getNom()
	 * @see #getVille()
	 * @generated
	 */
	EAttribute getVille_Nom();

	/**
	 * Returns the meta object for class '{@link sig.Batiment <em>Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batiment</em>'.
	 * @see sig.Batiment
	 * @generated
	 */
	EClass getBatiment();

	/**
	 * Returns the meta object for the attribute '{@link sig.Batiment#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see sig.Batiment#getAdresse()
	 * @see #getBatiment()
	 * @generated
	 */
	EAttribute getBatiment_Adresse();

	/**
	 * Returns the meta object for the reference list '{@link sig.Batiment#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personnes</em>'.
	 * @see sig.Batiment#getPersonnes()
	 * @see #getBatiment()
	 * @generated
	 */
	EReference getBatiment_Personnes();

	/**
	 * Returns the meta object for class '{@link sig.Travail <em>Travail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travail</em>'.
	 * @see sig.Travail
	 * @generated
	 */
	EClass getTravail();

	/**
	 * Returns the meta object for class '{@link sig.Etude <em>Etude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etude</em>'.
	 * @see sig.Etude
	 * @generated
	 */
	EClass getEtude();

	/**
	 * Returns the meta object for class '{@link sig.Soins <em>Soins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soins</em>'.
	 * @see sig.Soins
	 * @generated
	 */
	EClass getSoins();

	/**
	 * Returns the meta object for class '{@link sig.Monde <em>Monde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monde</em>'.
	 * @see sig.Monde
	 * @generated
	 */
	EClass getMonde();

	/**
	 * Returns the meta object for the containment reference list '{@link sig.Monde#getVilles <em>Villes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Villes</em>'.
	 * @see sig.Monde#getVilles()
	 * @see #getMonde()
	 * @generated
	 */
	EReference getMonde_Villes();

	/**
	 * Returns the meta object for the containment reference list '{@link sig.Monde#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personnes</em>'.
	 * @see sig.Monde#getPersonnes()
	 * @see #getMonde()
	 * @generated
	 */
	EReference getMonde_Personnes();

	/**
	 * Returns the meta object for class '{@link sig.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see sig.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link sig.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see sig.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link sig.Personne#getStatut <em>Statut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statut</em>'.
	 * @see sig.Personne#getStatut()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Statut();

	/**
	 * Returns the meta object for the reference list '{@link sig.Personne#getBatiments <em>Batiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Batiments</em>'.
	 * @see sig.Personne#getBatiments()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Batiments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SigFactory getSigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sig.impl.VilleImpl <em>Ville</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.VilleImpl
		 * @see sig.impl.SigPackageImpl#getVille()
		 * @generated
		 */
		EClass VILLE = eINSTANCE.getVille();

		/**
		 * The meta object literal for the '<em><b>Batiments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VILLE__BATIMENTS = eINSTANCE.getVille_Batiments();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VILLE__NOM = eINSTANCE.getVille_Nom();

		/**
		 * The meta object literal for the '{@link sig.impl.BatimentImpl <em>Batiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.BatimentImpl
		 * @see sig.impl.SigPackageImpl#getBatiment()
		 * @generated
		 */
		EClass BATIMENT = eINSTANCE.getBatiment();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATIMENT__ADRESSE = eINSTANCE.getBatiment_Adresse();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATIMENT__PERSONNES = eINSTANCE.getBatiment_Personnes();

		/**
		 * The meta object literal for the '{@link sig.impl.TravailImpl <em>Travail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.TravailImpl
		 * @see sig.impl.SigPackageImpl#getTravail()
		 * @generated
		 */
		EClass TRAVAIL = eINSTANCE.getTravail();

		/**
		 * The meta object literal for the '{@link sig.impl.EtudeImpl <em>Etude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.EtudeImpl
		 * @see sig.impl.SigPackageImpl#getEtude()
		 * @generated
		 */
		EClass ETUDE = eINSTANCE.getEtude();

		/**
		 * The meta object literal for the '{@link sig.impl.SoinsImpl <em>Soins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.SoinsImpl
		 * @see sig.impl.SigPackageImpl#getSoins()
		 * @generated
		 */
		EClass SOINS = eINSTANCE.getSoins();

		/**
		 * The meta object literal for the '{@link sig.impl.MondeImpl <em>Monde</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.MondeImpl
		 * @see sig.impl.SigPackageImpl#getMonde()
		 * @generated
		 */
		EClass MONDE = eINSTANCE.getMonde();

		/**
		 * The meta object literal for the '<em><b>Villes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONDE__VILLES = eINSTANCE.getMonde_Villes();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONDE__PERSONNES = eINSTANCE.getMonde_Personnes();

		/**
		 * The meta object literal for the '{@link sig.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sig.impl.PersonneImpl
		 * @see sig.impl.SigPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Statut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__STATUT = eINSTANCE.getPersonne_Statut();

		/**
		 * The meta object literal for the '<em><b>Batiments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__BATIMENTS = eINSTANCE.getPersonne_Batiments();

	}

} //SigPackage
