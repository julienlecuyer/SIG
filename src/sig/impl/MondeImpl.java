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

import sig.Monde;
import sig.SigPackage;
import sig.Ville;
import sig.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monde</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.MondeImpl#getVilles <em>Villes</em>}</li>
 *   <li>{@link sig.impl.MondeImpl#getZone <em>Zone</em>}</li>
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SigPackage.MONDE__ZONE, oldZone, newZone);
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
				msgs = ((InternalEObject)zone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SigPackage.MONDE__ZONE, null, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SigPackage.MONDE__ZONE, null, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.MONDE__ZONE, newZone, newZone));
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
			case SigPackage.MONDE__ZONE:
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
			case SigPackage.MONDE__VILLES:
				return getVilles();
			case SigPackage.MONDE__ZONE:
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
			case SigPackage.MONDE__VILLES:
				getVilles().clear();
				getVilles().addAll((Collection<? extends Ville>)newValue);
				return;
			case SigPackage.MONDE__ZONE:
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
			case SigPackage.MONDE__VILLES:
				getVilles().clear();
				return;
			case SigPackage.MONDE__ZONE:
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
			case SigPackage.MONDE__VILLES:
				return villes != null && !villes.isEmpty();
			case SigPackage.MONDE__ZONE:
				return zone != null;
		}
		return super.eIsSet(featureID);
	}

} //MondeImpl
