/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.Sub#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.Sub#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getSub()
 * @model
 * @generated
 */
public interface Sub extends AddSub
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(AddSub)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getSub_Left()
   * @model containment="true"
   * @generated
   */
  AddSub getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.Sub#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(AddSub value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(MulDiv)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getSub_Right()
   * @model containment="true"
   * @generated
   */
  MulDiv getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.Sub#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(MulDiv value);

} // Sub
