/**
 */
package sig.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sig.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sig.SigPackage
 * @generated
 */
public class SigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SigSwitch<Adapter> modelSwitch =
		new SigSwitch<Adapter>() {
			@Override
			public Adapter caseVille(Ville object) {
				return createVilleAdapter();
			}
			@Override
			public Adapter caseBatiment(Batiment object) {
				return createBatimentAdapter();
			}
			@Override
			public Adapter caseTravail(Travail object) {
				return createTravailAdapter();
			}
			@Override
			public Adapter caseEtude(Etude object) {
				return createEtudeAdapter();
			}
			@Override
			public Adapter caseSoins(Soins object) {
				return createSoinsAdapter();
			}
			@Override
			public Adapter caseMonde(Monde object) {
				return createMondeAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseLiaison(Liaison object) {
				return createLiaisonAdapter();
			}
			@Override
			public Adapter casePersonne(Personne object) {
				return createPersonneAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sig.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Ville
	 * @generated
	 */
	public Adapter createVilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Batiment <em>Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Batiment
	 * @generated
	 */
	public Adapter createBatimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Travail <em>Travail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Travail
	 * @generated
	 */
	public Adapter createTravailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Etude <em>Etude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Etude
	 * @generated
	 */
	public Adapter createEtudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Soins <em>Soins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Soins
	 * @generated
	 */
	public Adapter createSoinsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Monde <em>Monde</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Monde
	 * @generated
	 */
	public Adapter createMondeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Liaison <em>Liaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Liaison
	 * @generated
	 */
	public Adapter createLiaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sig.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sig.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SigAdapterFactory
