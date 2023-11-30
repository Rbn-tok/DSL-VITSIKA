/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.vitsika.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.vitsika.VitsikaPackage;
import org.xtext.example.vitsika.WifiCreate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wifi Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.vitsika.impl.WifiCreateImpl#getSsid <em>Ssid</em>}</li>
 *   <li>{@link org.xtext.example.vitsika.impl.WifiCreateImpl#getPasswd <em>Passwd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WifiCreateImpl extends ActionImpl implements WifiCreate
{
  /**
   * The default value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsid()
   * @generated
   * @ordered
   */
  protected static final String SSID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsid()
   * @generated
   * @ordered
   */
  protected String ssid = SSID_EDEFAULT;

  /**
   * The default value of the '{@link #getPasswd() <em>Passwd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPasswd()
   * @generated
   * @ordered
   */
  protected static final String PASSWD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPasswd() <em>Passwd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPasswd()
   * @generated
   * @ordered
   */
  protected String passwd = PASSWD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WifiCreateImpl()
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
    return VitsikaPackage.Literals.WIFI_CREATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSsid()
  {
    return ssid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSsid(String newSsid)
  {
    String oldSsid = ssid;
    ssid = newSsid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VitsikaPackage.WIFI_CREATE__SSID, oldSsid, ssid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPasswd()
  {
    return passwd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPasswd(String newPasswd)
  {
    String oldPasswd = passwd;
    passwd = newPasswd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VitsikaPackage.WIFI_CREATE__PASSWD, oldPasswd, passwd));
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
      case VitsikaPackage.WIFI_CREATE__SSID:
        return getSsid();
      case VitsikaPackage.WIFI_CREATE__PASSWD:
        return getPasswd();
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
      case VitsikaPackage.WIFI_CREATE__SSID:
        setSsid((String)newValue);
        return;
      case VitsikaPackage.WIFI_CREATE__PASSWD:
        setPasswd((String)newValue);
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
      case VitsikaPackage.WIFI_CREATE__SSID:
        setSsid(SSID_EDEFAULT);
        return;
      case VitsikaPackage.WIFI_CREATE__PASSWD:
        setPasswd(PASSWD_EDEFAULT);
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
      case VitsikaPackage.WIFI_CREATE__SSID:
        return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
      case VitsikaPackage.WIFI_CREATE__PASSWD:
        return PASSWD_EDEFAULT == null ? passwd != null : !PASSWD_EDEFAULT.equals(passwd);
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
    result.append(" (ssid: ");
    result.append(ssid);
    result.append(", passwd: ");
    result.append(passwd);
    result.append(')');
    return result.toString();
  }

} //WifiCreateImpl
