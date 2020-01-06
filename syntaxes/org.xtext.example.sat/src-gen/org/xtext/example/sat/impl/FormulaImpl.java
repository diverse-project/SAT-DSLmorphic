/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.sat.impl;

import org.xtext.example.sat.Expr;
import org.xtext.example.sat.Formula;
import org.xtext.example.sat.SatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sat.impl.FormulaImpl#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends MinimalEObjectImpl.Container implements Formula
{
  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected Expr form;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormulaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SatPackage.Literals.FORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getForm()
  {
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForm(Expr newForm, NotificationChain msgs)
  {
    Expr oldForm = form;
    form = newForm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SatPackage.FORMULA__FORM, oldForm, newForm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForm(Expr newForm)
  {
    if (newForm != form)
    {
      NotificationChain msgs = null;
      if (form != null)
        msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SatPackage.FORMULA__FORM, null, msgs);
      if (newForm != null)
        msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SatPackage.FORMULA__FORM, null, msgs);
      msgs = basicSetForm(newForm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SatPackage.FORMULA__FORM, newForm, newForm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SatPackage.FORMULA__FORM:
        return basicSetForm(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SatPackage.FORMULA__FORM:
        return getForm();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SatPackage.FORMULA__FORM:
        setForm((Expr)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SatPackage.FORMULA__FORM:
        setForm((Expr)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SatPackage.FORMULA__FORM:
        return form != null;
    }
    return super.eIsSet(featureID);
  }

} //FormulaImpl
