/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.x21.impl;

import dk.sdu.mmmi.mdsd.x21.ElementList;
import dk.sdu.mmmi.mdsd.x21.NodeOrInput;
import dk.sdu.mmmi.mdsd.x21.Stream;
import dk.sdu.mmmi.mdsd.x21.X21Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.x21.impl.StreamImpl#getStartNodes <em>Start Nodes</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.x21.impl.StreamImpl#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamImpl extends DeclarationImpl implements Stream
{
  /**
   * The cached value of the '{@link #getStartNodes() <em>Start Nodes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartNodes()
   * @generated
   * @ordered
   */
  protected EList<NodeOrInput> startNodes;

  /**
   * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoints()
   * @generated
   * @ordered
   */
  protected EList<ElementList> points;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamImpl()
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
    return X21Package.Literals.STREAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NodeOrInput> getStartNodes()
  {
    if (startNodes == null)
    {
      startNodes = new EObjectResolvingEList<NodeOrInput>(NodeOrInput.class, this, X21Package.STREAM__START_NODES);
    }
    return startNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ElementList> getPoints()
  {
    if (points == null)
    {
      points = new EObjectContainmentEList<ElementList>(ElementList.class, this, X21Package.STREAM__POINTS);
    }
    return points;
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
      case X21Package.STREAM__POINTS:
        return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
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
      case X21Package.STREAM__START_NODES:
        return getStartNodes();
      case X21Package.STREAM__POINTS:
        return getPoints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case X21Package.STREAM__START_NODES:
        getStartNodes().clear();
        getStartNodes().addAll((Collection<? extends NodeOrInput>)newValue);
        return;
      case X21Package.STREAM__POINTS:
        getPoints().clear();
        getPoints().addAll((Collection<? extends ElementList>)newValue);
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
      case X21Package.STREAM__START_NODES:
        getStartNodes().clear();
        return;
      case X21Package.STREAM__POINTS:
        getPoints().clear();
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
      case X21Package.STREAM__START_NODES:
        return startNodes != null && !startNodes.isEmpty();
      case X21Package.STREAM__POINTS:
        return points != null && !points.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StreamImpl