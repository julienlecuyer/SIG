/**
 */
package sig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SigFactoryImpl extends EFactoryImpl implements SigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SigFactory init() {
		try {
			SigFactory theSigFactory = (SigFactory)EPackage.Registry.INSTANCE.getEFactory(SigPackage.eNS_URI);
			if (theSigFactory != null) {
				return theSigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SigPackage.VILLE: return createVille();
			case SigPackage.TRAVAIL: return createTravail();
			case SigPackage.ETUDE: return createEtude();
			case SigPackage.SOINS: return createSoins();
			case SigPackage.MONDE: return createMonde();
			case SigPackage.PERSONNE: return createPersonne();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville createVille() {
		VilleImpl ville = new VilleImpl();
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Travail createTravail() {
		TravailImpl travail = new TravailImpl();
		return travail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etude createEtude() {
		EtudeImpl etude = new EtudeImpl();
		return etude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Soins createSoins() {
		SoinsImpl soins = new SoinsImpl();
		return soins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monde createMonde() {
		MondeImpl monde = new MondeImpl();
		return monde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne createPersonne() {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SigPackage getSigPackage() {
		return (SigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SigPackage getPackage() {
		return SigPackage.eINSTANCE;
	}

} //SigFactoryImpl
