/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.sattl;

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
 * @see org.xtext.example.mydsl.sattl.SattlFactory
 * @model kind="package"
 * @generated
 */
public interface SattlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sattl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/Sattl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sattl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SattlPackage eINSTANCE = org.xtext.example.mydsl.sattl.impl.SattlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sattl.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sattl.impl.DocumentImpl
   * @see org.xtext.example.mydsl.sattl.impl.SattlPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__FORM = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl <em>Formulae</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sattl.impl.FormulaeImpl
   * @see org.xtext.example.mydsl.sattl.impl.SattlPackageImpl#getFormulae()
   * @generated
   */
  int FORMULAE = 1;

  /**
   * The feature id for the '<em><b>Form left</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE__FORM_LEFT = 0;

  /**
   * The feature id for the '<em><b>Binop</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE__BINOP = 1;

  /**
   * The feature id for the '<em><b>Form right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE__FORM_RIGHT = 2;

  /**
   * The feature id for the '<em><b>Unop</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE__UNOP = 3;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE__FORM = 4;

  /**
   * The feature id for the '<em><b>Atom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE__ATOM = 5;

  /**
   * The number of structural features of the '<em>Formulae</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.sattl.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.sattl.impl.AtomImpl
   * @see org.xtext.example.mydsl.sattl.impl.SattlPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__NAME = 0;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sattl.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.xtext.example.mydsl.sattl.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sattl.Document#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Form</em>'.
   * @see org.xtext.example.mydsl.sattl.Document#getForm()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Form();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sattl.Formulae <em>Formulae</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formulae</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae
   * @generated
   */
  EClass getFormulae();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sattl.Formulae#getForm_left <em>Form left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Form left</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae#getForm_left()
   * @see #getFormulae()
   * @generated
   */
  EReference getFormulae_Form_left();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.sattl.Formulae#getBinop <em>Binop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Binop</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae#getBinop()
   * @see #getFormulae()
   * @generated
   */
  EAttribute getFormulae_Binop();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sattl.Formulae#getForm_right <em>Form right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Form right</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae#getForm_right()
   * @see #getFormulae()
   * @generated
   */
  EReference getFormulae_Form_right();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.sattl.Formulae#getUnop <em>Unop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Unop</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae#getUnop()
   * @see #getFormulae()
   * @generated
   */
  EAttribute getFormulae_Unop();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sattl.Formulae#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Form</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae#getForm()
   * @see #getFormulae()
   * @generated
   */
  EReference getFormulae_Form();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.sattl.Formulae#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atom</em>'.
   * @see org.xtext.example.mydsl.sattl.Formulae#getAtom()
   * @see #getFormulae()
   * @generated
   */
  EReference getFormulae_Atom();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.sattl.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see org.xtext.example.mydsl.sattl.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.sattl.Atom#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.sattl.Atom#getName()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SattlFactory getSattlFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.sattl.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sattl.impl.DocumentImpl
     * @see org.xtext.example.mydsl.sattl.impl.SattlPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__FORM = eINSTANCE.getDocument_Form();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sattl.impl.FormulaeImpl <em>Formulae</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sattl.impl.FormulaeImpl
     * @see org.xtext.example.mydsl.sattl.impl.SattlPackageImpl#getFormulae()
     * @generated
     */
    EClass FORMULAE = eINSTANCE.getFormulae();

    /**
     * The meta object literal for the '<em><b>Form left</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAE__FORM_LEFT = eINSTANCE.getFormulae_Form_left();

    /**
     * The meta object literal for the '<em><b>Binop</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULAE__BINOP = eINSTANCE.getFormulae_Binop();

    /**
     * The meta object literal for the '<em><b>Form right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAE__FORM_RIGHT = eINSTANCE.getFormulae_Form_right();

    /**
     * The meta object literal for the '<em><b>Unop</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULAE__UNOP = eINSTANCE.getFormulae_Unop();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAE__FORM = eINSTANCE.getFormulae_Form();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAE__ATOM = eINSTANCE.getFormulae_Atom();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.sattl.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.sattl.impl.AtomImpl
     * @see org.xtext.example.mydsl.sattl.impl.SattlPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__NAME = eINSTANCE.getAtom_Name();

  }

} //SattlPackage
