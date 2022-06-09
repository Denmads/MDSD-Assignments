/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.BooleanOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.BooleanOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getBooleanOperation()
 * @model
 * @generated
 */
public interface BooleanOperation extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BooleanOperation)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getBooleanOperation_Left()
   * @model containment="true"
   * @generated
   */
  BooleanOperation getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.BooleanOperation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BooleanOperation value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Equality)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getBooleanOperation_Right()
   * @model containment="true"
   * @generated
   */
  Equality getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.BooleanOperation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Equality value);

} // BooleanOperation