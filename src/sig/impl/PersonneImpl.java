/**
 */
package sig.impl;

import java.awt.Point;

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

import sig.Liaison;
import sig.Personne;
import sig.SigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.PersonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link sig.impl.PersonneImpl#getStatut <em>Statut</em>}</li>
 *   <li>{@link sig.impl.PersonneImpl#getLiaisons <em>Liaisons</em>}</li>
 *   <li>{@link sig.impl.PersonneImpl#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonneImpl extends MinimalEObjectImpl.Container implements Personne {
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
	 * The default value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected String statut = STATUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiaisons() <em>Liaisons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiaisons()
	 * @generated
	 * @ordered
	 */
	protected EList<Liaison> liaisons;

	/**
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final Point POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected Point pos = POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigPackage.Literals.PERSONNE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.PERSONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatut(String newStatut) {
		String oldStatut = statut;
		statut = newStatut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.PERSONNE__STATUT, oldStatut, statut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Liaison> getLiaisons() {
		if (liaisons == null) {
			liaisons = new EObjectContainmentEList<Liaison>(Liaison.class, this, SigPackage.PERSONNE__LIAISONS);
		}
		return liaisons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(Point newPos) {
		Point oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.PERSONNE__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SigPackage.PERSONNE__LIAISONS:
				return ((InternalEList<?>)getLiaisons()).basicRemove(otherEnd, msgs);
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
			case SigPackage.PERSONNE__NOM:
				return getNom();
			case SigPackage.PERSONNE__STATUT:
				return getStatut();
			case SigPackage.PERSONNE__LIAISONS:
				return getLiaisons();
			case SigPackage.PERSONNE__POS:
				return getPos();
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
			case SigPackage.PERSONNE__NOM:
				setNom((String)newValue);
				return;
			case SigPackage.PERSONNE__STATUT:
				setStatut((String)newValue);
				return;
			case SigPackage.PERSONNE__LIAISONS:
				getLiaisons().clear();
				getLiaisons().addAll((Collection<? extends Liaison>)newValue);
				return;
			case SigPackage.PERSONNE__POS:
				setPos((Point)newValue);
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
			case SigPackage.PERSONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SigPackage.PERSONNE__STATUT:
				setStatut(STATUT_EDEFAULT);
				return;
			case SigPackage.PERSONNE__LIAISONS:
				getLiaisons().clear();
				return;
			case SigPackage.PERSONNE__POS:
				setPos(POS_EDEFAULT);
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
			case SigPackage.PERSONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SigPackage.PERSONNE__STATUT:
				return STATUT_EDEFAULT == null ? statut != null : !STATUT_EDEFAULT.equals(statut);
			case SigPackage.PERSONNE__LIAISONS:
				return liaisons != null && !liaisons.isEmpty();
			case SigPackage.PERSONNE__POS:
				return POS_EDEFAULT == null ? pos != null : !POS_EDEFAULT.equals(pos);
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
		result.append(", statut: ");
		result.append(statut);
		result.append(", pos: ");
		result.append(pos);
		result.append(')');
		return result.toString();
	}

} //PersonneImpl
