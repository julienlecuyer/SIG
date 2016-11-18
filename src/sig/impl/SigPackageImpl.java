/**
 */
package sig.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sig.Batiment;
import sig.Etude;
import sig.Monde;
import sig.Personne;
import sig.SigFactory;
import sig.SigPackage;
import sig.Soins;
import sig.Travail;
import sig.Ville;

import sig.util.SigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SigPackageImpl extends EPackageImpl implements SigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass villeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soinsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mondeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sig.SigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SigPackageImpl() {
		super(eNS_URI, SigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SigPackage init() {
		if (isInited) return (SigPackage)EPackage.Registry.INSTANCE.getEPackage(SigPackage.eNS_URI);

		// Obtain or create and register package
		SigPackageImpl theSigPackage = (SigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SigPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSigPackage.createPackageContents();

		// Initialize created meta-data
		theSigPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSigPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SigValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SigPackage.eNS_URI, theSigPackage);
		return theSigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVille() {
		return villeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVille_Batiments() {
		return (EReference)villeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVille_Nom() {
		return (EAttribute)villeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVille_Personnes() {
		return (EReference)villeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatiment() {
		return batimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatiment_Adresse() {
		return (EAttribute)batimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatiment_Personnes() {
		return (EReference)batimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravail() {
		return travailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtude() {
		return etudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoins() {
		return soinsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonde() {
		return mondeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonde_Villes() {
		return (EReference)mondeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Statut() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Batiments() {
		return (EReference)personneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SigFactory getSigFactory() {
		return (SigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		villeEClass = createEClass(VILLE);
		createEReference(villeEClass, VILLE__BATIMENTS);
		createEAttribute(villeEClass, VILLE__NOM);
		createEReference(villeEClass, VILLE__PERSONNES);

		batimentEClass = createEClass(BATIMENT);
		createEAttribute(batimentEClass, BATIMENT__ADRESSE);
		createEReference(batimentEClass, BATIMENT__PERSONNES);

		travailEClass = createEClass(TRAVAIL);

		etudeEClass = createEClass(ETUDE);

		soinsEClass = createEClass(SOINS);

		mondeEClass = createEClass(MONDE);
		createEReference(mondeEClass, MONDE__VILLES);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__STATUT);
		createEReference(personneEClass, PERSONNE__BATIMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		travailEClass.getESuperTypes().add(this.getBatiment());
		etudeEClass.getESuperTypes().add(this.getBatiment());
		soinsEClass.getESuperTypes().add(this.getBatiment());

		// Initialize classes, features, and operations; add parameters
		initEClass(villeEClass, Ville.class, "Ville", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVille_Batiments(), this.getBatiment(), null, "batiments", null, 0, -1, Ville.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVille_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Ville.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVille_Personnes(), this.getPersonne(), null, "personnes", null, 0, -1, Ville.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batimentEClass, Batiment.class, "Batiment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatiment_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatiment_Personnes(), this.getPersonne(), this.getPersonne_Batiments(), "personnes", null, 0, -1, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travailEClass, Travail.class, "Travail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etudeEClass, Etude.class, "Etude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soinsEClass, Soins.class, "Soins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mondeEClass, Monde.class, "Monde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonde_Villes(), this.getVille(), null, "villes", null, 0, -1, Monde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Statut(), ecorePackage.getEString(), "statut", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Batiments(), this.getBatiment(), this.getBatiment_Personnes(), "batiments", null, 0, -1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (mondeEClass, 
		   source, 
		   new String[] {
			 "constraints", "nomVilleUnique"
		   });	
		addAnnotation
		  (personneEClass, 
		   source, 
		   new String[] {
			 "constraints", "NombreBatiments EtudeOuTravail nomPersonneUnique"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (mondeEClass, 
		   source, 
		   new String[] {
			 "nomVilleUnique", "\n\t\t\tself.villes->forAll(v1, v2:Ville |\n \t\t\tv1<>v2 implies\n \t\t\tv1.nom <> v2.nom)"
		   });	
		addAnnotation
		  (personneEClass, 
		   source, 
		   new String[] {
			 "NombreBatiments", "\n\t\t\tself.batiments->selectByType(Etude)->size() <= 1\n\t\t\tand \n\t\t\tself.batiments->selectByType(Travail)->size() <= 1 \n\t\t\tand \n\t\t\tself.batiments->selectByType(Soins)->size() <= 2",
			 "EtudeOuTravail", "\n\t\t\tself.batiments->forAll(b1, b2:Batiment |\n\t\t \t\t((b1.oclIsTypeOf(Travail) or b1.oclIsTypeOf(Etude) = false)  and ( b2.oclIsTypeOf(Travail) or b2.oclIsTypeOf(Etude) = false )) \n\t\t \tor \n\t\t \t\t((b1.oclIsTypeOf(Etude) or b1.oclIsTypeOf(Etude) = false)  and (b2.oclIsTypeOf(Etude) or b2.oclIsTypeOf(Travail) = false ))\n\t\t)",
			 "nomPersonneUnique", "\n\t\t\tPersonne.allInstances()->forAll(p1:Personne, p2:Personne | p1<>p2 implies p1.nom<>p2.nom)"
		   });
	}

} //SigPackageImpl
