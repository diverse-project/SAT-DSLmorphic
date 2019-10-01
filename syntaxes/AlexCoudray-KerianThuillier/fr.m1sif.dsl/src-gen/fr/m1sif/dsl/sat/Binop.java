/**
 * generated by Xtext 2.19.0
 */
package fr.m1sif.dsl.sat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.m1sif.dsl.sat.Binop#getLeftParam <em>Left Param</em>}</li>
 *   <li>{@link fr.m1sif.dsl.sat.Binop#getOp <em>Op</em>}</li>
 *   <li>{@link fr.m1sif.dsl.sat.Binop#getRightParam <em>Right Param</em>}</li>
 * </ul>
 *
 * @see fr.m1sif.dsl.sat.SatPackage#getBinop()
 * @model
 * @generated
 */
public interface Binop extends Expression
{
  /**
   * Returns the value of the '<em><b>Left Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Param</em>' containment reference.
   * @see #setLeftParam(Expression)
   * @see fr.m1sif.dsl.sat.SatPackage#getBinop_LeftParam()
   * @model containment="true"
   * @generated
   */
  Expression getLeftParam();

  /**
   * Sets the value of the '{@link fr.m1sif.dsl.sat.Binop#getLeftParam <em>Left Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Param</em>' containment reference.
   * @see #getLeftParam()
   * @generated
   */
  void setLeftParam(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see fr.m1sif.dsl.sat.SatPackage#getBinop_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.m1sif.dsl.sat.Binop#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Param</em>' containment reference.
   * @see #setRightParam(Expression)
   * @see fr.m1sif.dsl.sat.SatPackage#getBinop_RightParam()
   * @model containment="true"
   * @generated
   */
  Expression getRightParam();

  /**
   * Sets the value of the '{@link fr.m1sif.dsl.sat.Binop#getRightParam <em>Right Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Param</em>' containment reference.
   * @see #getRightParam()
   * @generated
   */
  void setRightParam(Expression value);

} // Binop
