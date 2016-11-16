/**
 */
package sig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sig.Monde;
import sig.Personne;
import sig.SigPackage;
import sig.Ville;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monde</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.MondeImpl#getVilles <em>Villes</em>}</li>
 *   <li>{@link sig.impl.MondeImpl#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MondeImpl extends MinimalEObjectImpl.Container implements Monde {
	/**
	 * The cached value of the '{@link #getVilles() <em>Villes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVilles()
	 * @generated
	 * @ordered
	 */
	protected EList<Ville> villes;

	/**
	 * The cached value of the '{@link #getPersonnes() <em>Personnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> personnes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MondeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigPackage.Literals.MONDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ville> getVilles() {
		if (villes == null) {
			villes = new EObjectContainmentEList<Ville>(Ville.class, this, SigPackage.MONDE__VILLES);
		}
		return villes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectContainmentEList<Personne>(Personne.class, this, SigPackage.MONDE__PERSONNES);
		}
		return personnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SigPackage.MONDE__VILLES:
				return ((InternalEList<?>)getVilles()).basicRemove(otherEnd, msgs);
			case SigPackage.MONDE__PERSONNES:
				return ((InternalEList<?>)getPersonnes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SigPackage.MONDE__VILLES:
				return getVilles();
			case SigPackage.MONDE__PERSONNES:
				return getPersonnes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SigPackage.MONDE__VILLES:
				getVilles().clear();
				getVilles().addAll((Collection<? extends Ville>)newValue);
				return;
			case SigPackage.MONDE__PERSONNES:
				getPersonnes().clear();
				getPersonnes().addAll((Collection<? extends Personne>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SigPackage.MONDE__VILLES:
				getVilles().clear();
				return;
			case SigPackage.MONDE__PERSONNES:
				getPersonnes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SigPackage.MONDE__VILLES:
				return villes != null && !villes.isEmpty();
			case SigPackage.MONDE__PERSONNES:
				return personnes != null && !personnes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MondeImpl
