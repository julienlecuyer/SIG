/**
 */
package sig.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sig.Liaison;
import sig.SigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liaison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.LiaisonImpl#isEstDedans <em>Est Dedans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiaisonImpl extends MinimalEObjectImpl.Container implements Liaison {
	/**
	 * The default value of the '{@link #isEstDedans() <em>Est Dedans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstDedans()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_DEDANS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstDedans() <em>Est Dedans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstDedans()
	 * @generated
	 * @ordered
	 */
	protected boolean estDedans = EST_DEDANS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigPackage.Literals.LIAISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstDedans() {
		return estDedans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDedans(boolean newEstDedans) {
		boolean oldEstDedans = estDedans;
		estDedans = newEstDedans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.LIAISON__EST_DEDANS, oldEstDedans, estDedans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SigPackage.LIAISON__EST_DEDANS:
				return isEstDedans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SigPackage.LIAISON__EST_DEDANS:
				setEstDedans((Boolean)newValue);
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
			case SigPackage.LIAISON__EST_DEDANS:
				setEstDedans(EST_DEDANS_EDEFAULT);
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
			case SigPackage.LIAISON__EST_DEDANS:
				return estDedans != EST_DEDANS_EDEFAULT;
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
		result.append(" (estDedans: ");
		result.append(estDedans);
		result.append(')');
		return result.toString();
	}

} //LiaisonImpl
