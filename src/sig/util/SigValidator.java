/**
 */
package sig.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import sig.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sig.SigPackage
 * @generated
 */
public class SigValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SigValidator INSTANCE = new SigValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sig";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SigValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SigPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SigPackage.VILLE:
				return validateVille((Ville)value, diagnostics, context);
			case SigPackage.BATIMENT:
				return validateBatiment((Batiment)value, diagnostics, context);
			case SigPackage.TRAVAIL:
				return validateTravail((Travail)value, diagnostics, context);
			case SigPackage.ETUDE:
				return validateEtude((Etude)value, diagnostics, context);
			case SigPackage.SOINS:
				return validateSoins((Soins)value, diagnostics, context);
			case SigPackage.MONDE:
				return validateMonde((Monde)value, diagnostics, context);
			case SigPackage.PERSONNE:
				return validatePersonne((Personne)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVille(Ville ville, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ville, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatiment(Batiment batiment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batiment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravail(Travail travail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtude(Etude etude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoins(Soins soins, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soins, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonde(Monde monde, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(monde, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(monde, diagnostics, context);
		if (result || diagnostics != null) result &= validateMonde_nomVilleUnique(monde, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nomVilleUnique constraint of '<em>Monde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MONDE__NOM_VILLE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tself.villes->forAll(v1, v2:Ville |\n" +
		" \t\t\tv1<>v2 implies\n" +
		" \t\t\tv1.nom <> v2.nom)";

	/**
	 * Validates the nomVilleUnique constraint of '<em>Monde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonde_nomVilleUnique(Monde monde, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SigPackage.Literals.MONDE,
				 monde,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nomVilleUnique",
				 MONDE__NOM_VILLE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(personne, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_NombreBatiments(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_EtudeOuTravail(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_nomPersonneUnique(personne, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NombreBatiments constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSONNE__NOMBRE_BATIMENTS__EEXPRESSION = "\n" +
		"\t\t\tself.batiments->selectByType(Etude)->size() <= 1\n" +
		"\t\t\tand \n" +
		"\t\t\tself.batiments->selectByType(Travail)->size() <= 1 \n" +
		"\t\t\tand \n" +
		"\t\t\tself.batiments->selectByType(Soins)->size() <= 2";

	/**
	 * Validates the NombreBatiments constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_NombreBatiments(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SigPackage.Literals.PERSONNE,
				 personne,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreBatiments",
				 PERSONNE__NOMBRE_BATIMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the EtudeOuTravail constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSONNE__ETUDE_OU_TRAVAIL__EEXPRESSION = "\n" +
		"\t\t\tself.batiments->forAll(b1, b2:Batiment |\n" +
		"\t\t \t\t((b1.oclIsTypeOf(Travail) or b1.oclIsTypeOf(Etude) = false)  and ( b2.oclIsTypeOf(Travail) or b2.oclIsTypeOf(Etude) = false )) \n" +
		"\t\t \tor \n" +
		"\t\t \t\t((b1.oclIsTypeOf(Etude) or b1.oclIsTypeOf(Etude) = false)  and (b2.oclIsTypeOf(Etude) or b2.oclIsTypeOf(Travail) = false ))\n" +
		"\t\t)";

	/**
	 * Validates the EtudeOuTravail constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_EtudeOuTravail(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SigPackage.Literals.PERSONNE,
				 personne,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EtudeOuTravail",
				 PERSONNE__ETUDE_OU_TRAVAIL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nomPersonneUnique constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSONNE__NOM_PERSONNE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tPersonne.allInstances()->forAll(p1:Personne, p2:Personne | p1<>p2 implies p1.nom<>p2.nom)";

	/**
	 * Validates the nomPersonneUnique constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_nomPersonneUnique(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SigPackage.Literals.PERSONNE,
				 personne,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nomPersonneUnique",
				 PERSONNE__NOM_PERSONNE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SigValidator
