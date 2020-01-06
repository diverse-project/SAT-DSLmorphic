/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BinExpr#getLeftexpr <em>Leftexpr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BinExpr#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BinExpr#getRightexpr <em>Rightexpr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBinExpr()
 * @model
 * @generated
 */
public interface BinExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Leftexpr</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leftexpr</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBinExpr_Leftexpr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getLeftexpr();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBinExpr_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

  /**
   * Returns the value of the '<em><b>Rightexpr</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rightexpr</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBinExpr_Rightexpr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getRightexpr();

} // BinExpr
