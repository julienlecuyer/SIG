/**
 */
package sig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sig.Batiment;
import sig.Personne;
import sig.SigPackage;
import sig.Ville;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.VilleImpl#getBatiments <em>Batiments</em>}</li>
 *   <li>{@link sig.impl.VilleImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link sig.impl.VilleImpl#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VilleImpl extends MinimalEObjectImpl.Container implements Ville {
	/**
	 * The cached value of the '{@link #getBatiments() <em>Batiments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatiments()
	 * @generated
	 * @ordered
	 */
	protected EList<Batiment> batiments;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	protected VilleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigPackage.Literals.VILLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Batiment> getBatiments() {
		if (batiments == null) {
			batiments = new EObjectContainmentEList<Batiment>(Batiment.class, this, SigPackage.VILLE__BATIMENTS);
		}
		return batiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.VILLE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectContainmentEList<Personne>(Personne.class, this, SigPackage.VILLE__PERSONNES);
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
			case SigPackage.VILLE__BATIMENTS:
				return ((InternalEList<?>)getBatiments()).basicRemove(otherEnd, msgs);
			case SigPackage.VILLE__PERSONNES:
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
			case SigPackage.VILLE__BATIMENTS:
				return getBatiments();
			case SigPackage.VILLE__NOM:
				return getNom();
			case SigPackage.VILLE__PERSONNES:
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
			case SigPackage.VILLE__BATIMENTS:
				getBatiments().clear();
				getBatiments().addAll((Collection<? extends Batiment>)newValue);
				return;
			case SigPackage.VILLE__NOM:
				setNom((String)newValue);
				return;
			case SigPackage.VILLE__PERSONNES:
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
			case SigPackage.VILLE__BATIMENTS:
				getBatiments().clear();
				return;
			case SigPackage.VILLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SigPackage.VILLE__PERSONNES:
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
			case SigPackage.VILLE__BATIMENTS:
				return batiments != null && !batiments.isEmpty();
			case SigPackage.VILLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SigPackage.VILLE__PERSONNES:
				return personnes != null && !personnes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //VilleImpl
