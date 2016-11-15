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
import sig.Liaison;
import sig.SigPackage;
import sig.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.BatimentImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link sig.impl.BatimentImpl#getLiaisons <em>Liaisons</em>}</li>
 *   <li>{@link sig.impl.BatimentImpl#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BatimentImpl extends MinimalEObjectImpl.Container implements Batiment {
	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

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
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected Zone zone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigPackage.Literals.BATIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.BATIMENT__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Liaison> getLiaisons() {
		if (liaisons == null) {
			liaisons = new EObjectContainmentEList<Liaison>(Liaison.class, this, SigPackage.BATIMENT__LIAISONS);
		}
		return liaisons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZone(Zone newZone, NotificationChain msgs) {
		Zone oldZone = zone;
		zone = newZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SigPackage.BATIMENT__ZONE, oldZone, newZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(Zone newZone) {
		if (newZone != zone) {
			NotificationChain msgs = null;
			if (zone != null)
				msgs = ((InternalEObject)zone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SigPackage.BATIMENT__ZONE, null, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SigPackage.BATIMENT__ZONE, null, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.BATIMENT__ZONE, newZone, newZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SigPackage.BATIMENT__LIAISONS:
				return ((InternalEList<?>)getLiaisons()).basicRemove(otherEnd, msgs);
			case SigPackage.BATIMENT__ZONE:
				return basicSetZone(null, msgs);
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
			case SigPackage.BATIMENT__ADRESSE:
				return getAdresse();
			case SigPackage.BATIMENT__LIAISONS:
				return getLiaisons();
			case SigPackage.BATIMENT__ZONE:
				return getZone();
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
			case SigPackage.BATIMENT__ADRESSE:
				setAdresse((String)newValue);
				return;
			case SigPackage.BATIMENT__LIAISONS:
				getLiaisons().clear();
				getLiaisons().addAll((Collection<? extends Liaison>)newValue);
				return;
			case SigPackage.BATIMENT__ZONE:
				setZone((Zone)newValue);
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
			case SigPackage.BATIMENT__ADRESSE:
				setAdresse(ADRESSE_EDEFAULT);
				return;
			case SigPackage.BATIMENT__LIAISONS:
				getLiaisons().clear();
				return;
			case SigPackage.BATIMENT__ZONE:
				setZone((Zone)null);
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
			case SigPackage.BATIMENT__ADRESSE:
				return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
			case SigPackage.BATIMENT__LIAISONS:
				return liaisons != null && !liaisons.isEmpty();
			case SigPackage.BATIMENT__ZONE:
				return zone != null;
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
		result.append(" (adresse: ");
		result.append(adresse);
		result.append(')');
		return result.toString();
	}

} //BatimentImpl
