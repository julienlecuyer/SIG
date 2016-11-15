/**
 */
package sig.impl;

import java.awt.Point;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sig.SigPackage;
import sig.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sig.impl.ZoneImpl#getNo <em>No</em>}</li>
 *   <li>{@link sig.impl.ZoneImpl#getSe <em>Se</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZoneImpl extends MinimalEObjectImpl.Container implements Zone {
	/**
	 * The default value of the '{@link #getNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected static final Point NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected Point no = NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSe() <em>Se</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSe()
	 * @generated
	 * @ordered
	 */
	protected static final Point SE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSe() <em>Se</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSe()
	 * @generated
	 * @ordered
	 */
	protected Point se = SE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getNo() {
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo(Point newNo) {
		Point oldNo = no;
		no = newNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.ZONE__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getSe() {
		return se;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSe(Point newSe) {
		Point oldSe = se;
		se = newSe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigPackage.ZONE__SE, oldSe, se));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SigPackage.ZONE__NO:
				return getNo();
			case SigPackage.ZONE__SE:
				return getSe();
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
			case SigPackage.ZONE__NO:
				setNo((Point)newValue);
				return;
			case SigPackage.ZONE__SE:
				setSe((Point)newValue);
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
			case SigPackage.ZONE__NO:
				setNo(NO_EDEFAULT);
				return;
			case SigPackage.ZONE__SE:
				setSe(SE_EDEFAULT);
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
			case SigPackage.ZONE__NO:
				return NO_EDEFAULT == null ? no != null : !NO_EDEFAULT.equals(no);
			case SigPackage.ZONE__SE:
				return SE_EDEFAULT == null ? se != null : !SE_EDEFAULT.equals(se);
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
		result.append(" (no: ");
		result.append(no);
		result.append(", se: ");
		result.append(se);
		result.append(')');
		return result.toString();
	}

} //ZoneImpl
