/**
 */
package sig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liaison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sig.Liaison#isEstDedans <em>Est Dedans</em>}</li>
 * </ul>
 * </p>
 *
 * @see sig.SigPackage#getLiaison()
 * @model
 * @generated
 */
public interface Liaison extends EObject {
	/**
	 * Returns the value of the '<em><b>Est Dedans</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Dedans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dedans</em>' attribute.
	 * @see #setEstDedans(boolean)
	 * @see sig.SigPackage#getLiaison_EstDedans()
	 * @model default="false"
	 * @generated
	 */
	boolean isEstDedans();

	/**
	 * Sets the value of the '{@link sig.Liaison#isEstDedans <em>Est Dedans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Dedans</em>' attribute.
	 * @see #isEstDedans()
	 * @generated
	 */
	void setEstDedans(boolean value);

} // Liaison
