/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.satt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.satt.SATCallMethod;
import org.xtext.example.mydsl.satt.Sat;
import org.xtext.example.mydsl.satt.SattPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.satt.impl.SatImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.satt.impl.SatImpl#getCallMethod <em>Call Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatImpl extends MinimalEObjectImpl.Container implements Sat
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EObject source;

  /**
   * The default value of the '{@link #getCallMethod() <em>Call Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallMethod()
   * @generated
   * @ordered
   */
  protected static final SATCallMethod CALL_METHOD_EDEFAULT = SATCallMethod.SAT4J_JAVA;

  /**
   * The cached value of the '{@link #getCallMethod() <em>Call Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallMethod()
   * @generated
   * @ordered
   */
  protected SATCallMethod callMethod = CALL_METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SatImpl()
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
    return SattPackage.Literals.SAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(EObject newSource, NotificationChain msgs)
  {
    EObject oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SattPackage.SAT__SOURCE, oldSource, newSource);
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
  public void setSource(EObject newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SattPackage.SAT__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SattPackage.SAT__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SattPackage.SAT__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SATCallMethod getCallMethod()
  {
    return callMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCallMethod(SATCallMethod newCallMethod)
  {
    SATCallMethod oldCallMethod = callMethod;
    callMethod = newCallMethod == null ? CALL_METHOD_EDEFAULT : newCallMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SattPackage.SAT__CALL_METHOD, oldCallMethod, callMethod));
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
      case SattPackage.SAT__SOURCE:
        return basicSetSource(null, msgs);
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
      case SattPackage.SAT__SOURCE:
        return getSource();
      case SattPackage.SAT__CALL_METHOD:
        return getCallMethod();
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
      case SattPackage.SAT__SOURCE:
        setSource((EObject)newValue);
        return;
      case SattPackage.SAT__CALL_METHOD:
        setCallMethod((SATCallMethod)newValue);
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
      case SattPackage.SAT__SOURCE:
        setSource((EObject)null);
        return;
      case SattPackage.SAT__CALL_METHOD:
        setCallMethod(CALL_METHOD_EDEFAULT);
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
      case SattPackage.SAT__SOURCE:
        return source != null;
      case SattPackage.SAT__CALL_METHOD:
        return callMethod != CALL_METHOD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (callMethod: ");
    result.append(callMethod);
    result.append(')');
    return result.toString();
  }

} //SatImpl
