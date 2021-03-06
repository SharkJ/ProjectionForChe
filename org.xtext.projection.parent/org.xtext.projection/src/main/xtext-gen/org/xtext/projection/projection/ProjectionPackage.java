/**
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.projection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.projection.projection.ProjectionFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "projection";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/projection/Projection";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "projection";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProjectionPackage eINSTANCE = org.xtext.projection.projection.impl.ProjectionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.ModelImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.ElementImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.MyTextImpl <em>My Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.MyTextImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyText()
   * @generated
   */
  int MY_TEXT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_TEXT__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_TEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.MyIntImpl <em>My Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.MyIntImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyInt()
   * @generated
   */
  int MY_INT = 3;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_INT__INT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_INT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.MyDecimalImpl <em>My Decimal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.MyDecimalImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyDecimal()
   * @generated
   */
  int MY_DECIMAL = 4;

  /**
   * The feature id for the '<em><b>Dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_DECIMAL__DEC = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Decimal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_DECIMAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.MyIdImpl <em>My Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.MyIdImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyId()
   * @generated
   */
  int MY_ID = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ID__ID = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ID_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.projection.projection.impl.MyTimeImpl <em>My Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.projection.projection.impl.MyTimeImpl
   * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyTime()
   * @generated
   */
  int MY_TIME = 6;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_TIME__TIME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_TIME_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.projection.projection.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.projection.projection.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.projection.projection.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.xtext.projection.projection.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.MyText <em>My Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Text</em>'.
   * @see org.xtext.projection.projection.MyText
   * @generated
   */
  EClass getMyText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.projection.projection.MyText#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.projection.projection.MyText#getName()
   * @see #getMyText()
   * @generated
   */
  EAttribute getMyText_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.MyInt <em>My Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Int</em>'.
   * @see org.xtext.projection.projection.MyInt
   * @generated
   */
  EClass getMyInt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.projection.projection.MyInt#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.projection.projection.MyInt#getInt()
   * @see #getMyInt()
   * @generated
   */
  EAttribute getMyInt_Int();

  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.MyDecimal <em>My Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Decimal</em>'.
   * @see org.xtext.projection.projection.MyDecimal
   * @generated
   */
  EClass getMyDecimal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.projection.projection.MyDecimal#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dec</em>'.
   * @see org.xtext.projection.projection.MyDecimal#getDec()
   * @see #getMyDecimal()
   * @generated
   */
  EAttribute getMyDecimal_Dec();

  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.MyId <em>My Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Id</em>'.
   * @see org.xtext.projection.projection.MyId
   * @generated
   */
  EClass getMyId();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.projection.projection.MyId#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.projection.projection.MyId#getId()
   * @see #getMyId()
   * @generated
   */
  EAttribute getMyId_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.projection.projection.MyTime <em>My Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Time</em>'.
   * @see org.xtext.projection.projection.MyTime
   * @generated
   */
  EClass getMyTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.projection.projection.MyTime#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.projection.projection.MyTime#getTime()
   * @see #getMyTime()
   * @generated
   */
  EAttribute getMyTime_Time();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProjectionFactory getProjectionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.ModelImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.ElementImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.MyTextImpl <em>My Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.MyTextImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyText()
     * @generated
     */
    EClass MY_TEXT = eINSTANCE.getMyText();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_TEXT__NAME = eINSTANCE.getMyText_Name();

    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.MyIntImpl <em>My Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.MyIntImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyInt()
     * @generated
     */
    EClass MY_INT = eINSTANCE.getMyInt();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_INT__INT = eINSTANCE.getMyInt_Int();

    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.MyDecimalImpl <em>My Decimal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.MyDecimalImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyDecimal()
     * @generated
     */
    EClass MY_DECIMAL = eINSTANCE.getMyDecimal();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_DECIMAL__DEC = eINSTANCE.getMyDecimal_Dec();

    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.MyIdImpl <em>My Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.MyIdImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyId()
     * @generated
     */
    EClass MY_ID = eINSTANCE.getMyId();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_ID__ID = eINSTANCE.getMyId_Id();

    /**
     * The meta object literal for the '{@link org.xtext.projection.projection.impl.MyTimeImpl <em>My Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.projection.projection.impl.MyTimeImpl
     * @see org.xtext.projection.projection.impl.ProjectionPackageImpl#getMyTime()
     * @generated
     */
    EClass MY_TIME = eINSTANCE.getMyTime();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_TIME__TIME = eINSTANCE.getMyTime_Time();

  }

} //ProjectionPackage
