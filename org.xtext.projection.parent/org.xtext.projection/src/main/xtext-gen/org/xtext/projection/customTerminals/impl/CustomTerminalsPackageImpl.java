/**
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.customTerminals.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.projection.customTerminals.CustomTerminalsFactory;
import org.xtext.projection.customTerminals.CustomTerminalsPackage;
import org.xtext.projection.customTerminals.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomTerminalsPackageImpl extends EPackageImpl implements CustomTerminalsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.projection.customTerminals.CustomTerminalsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CustomTerminalsPackageImpl()
  {
    super(eNS_URI, CustomTerminalsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CustomTerminalsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CustomTerminalsPackage init()
  {
    if (isInited) return (CustomTerminalsPackage)EPackage.Registry.INSTANCE.getEPackage(CustomTerminalsPackage.eNS_URI);

    // Obtain or create and register package
    CustomTerminalsPackageImpl theCustomTerminalsPackage = (CustomTerminalsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomTerminalsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomTerminalsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCustomTerminalsPackage.createPackageContents();

    // Initialize created meta-data
    theCustomTerminalsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCustomTerminalsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CustomTerminalsPackage.eNS_URI, theCustomTerminalsPackage);
    return theCustomTerminalsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Rules()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomTerminalsFactory getCustomTerminalsFactory()
  {
    return (CustomTerminalsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__RULES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Rules(), ecorePackage.getEString(), "rules", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CustomTerminalsPackageImpl
