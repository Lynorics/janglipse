/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getDirective <em>Directive</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnit()
 * @model
 * @generated
 */
public interface compilationUnit extends Model
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(packageDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnit_Package()
   * @model containment="true"
   * @generated
   */
  packageDeclaration getPackage();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(packageDeclaration value);

  /**
   * Returns the value of the '<em><b>Directive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directive</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive</em>' containment reference.
   * @see #setDirective(directives)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnit_Directive()
   * @model containment="true"
   * @generated
   */
  directives getDirective();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getDirective <em>Directive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directive</em>' containment reference.
   * @see #getDirective()
   * @generated
   */
  void setDirective(directives value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' containment reference.
   * @see #setUnit(compilationUnitDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnit_Unit()
   * @model containment="true"
   * @generated
   */
  compilationUnitDeclaration getUnit();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getUnit <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' containment reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(compilationUnitDeclaration value);

} // compilationUnit
