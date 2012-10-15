/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage
 * @generated
 */
public interface EcdarTextFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EcdarTextFactory eINSTANCE = dk.itu.ecdar.text.ecdarText.impl.EcdarTextFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ET File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET File</em>'.
   * @generated
   */
  ETFile createETFile();

  /**
   * Returns a new object of class '<em>ET Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Import</em>'.
   * @generated
   */
  ETImport createETImport();

  /**
   * Returns a new object of class '<em>ET Array Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Array Declaration</em>'.
   * @generated
   */
  ETArrayDeclaration createETArrayDeclaration();

  /**
   * Returns a new object of class '<em>ET Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Declarations</em>'.
   * @generated
   */
  ETDeclarations createETDeclarations();

  /**
   * Returns a new object of class '<em>ET Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Declaration</em>'.
   * @generated
   */
  ETDeclaration createETDeclaration();

  /**
   * Returns a new object of class '<em>ET Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Type</em>'.
   * @generated
   */
  ETType createETType();

  /**
   * Returns a new object of class '<em>ET Type Modifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Type Modifiers</em>'.
   * @generated
   */
  ETTypeModifiers createETTypeModifiers();

  /**
   * Returns a new object of class '<em>ET Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Variable Declaration</em>'.
   * @generated
   */
  ETVariableDeclaration createETVariableDeclaration();

  /**
   * Returns a new object of class '<em>ET Variable ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Variable ID</em>'.
   * @generated
   */
  ETVariableID createETVariableID();

  /**
   * Returns a new object of class '<em>ET Initialiser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Initialiser</em>'.
   * @generated
   */
  ETInitialiser createETInitialiser();

  /**
   * Returns a new object of class '<em>ET Single Initialiser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Single Initialiser</em>'.
   * @generated
   */
  ETSingleInitialiser createETSingleInitialiser();

  /**
   * Returns a new object of class '<em>ET Multi Initialiser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Multi Initialiser</em>'.
   * @generated
   */
  ETMultiInitialiser createETMultiInitialiser();

  /**
   * Returns a new object of class '<em>ET Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Type Declaration</em>'.
   * @generated
   */
  ETTypeDeclaration createETTypeDeclaration();

  /**
   * Returns a new object of class '<em>ET Type ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Type ID</em>'.
   * @generated
   */
  ETTypeID createETTypeID();

  /**
   * Returns a new object of class '<em>ET Type Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Type Identifier</em>'.
   * @generated
   */
  ETTypeIdentifier createETTypeIdentifier();

  /**
   * Returns a new object of class '<em>ET Integer Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Integer Type</em>'.
   * @generated
   */
  ETIntegerType createETIntegerType();

  /**
   * Returns a new object of class '<em>ET Clock Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Clock Type</em>'.
   * @generated
   */
  ETClockType createETClockType();

  /**
   * Returns a new object of class '<em>ET Action Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Action Type</em>'.
   * @generated
   */
  ETActionType createETActionType();

  /**
   * Returns a new object of class '<em>ET Input Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Input Type</em>'.
   * @generated
   */
  ETInputType createETInputType();

  /**
   * Returns a new object of class '<em>ET Output Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Output Type</em>'.
   * @generated
   */
  ETOutputType createETOutputType();

  /**
   * Returns a new object of class '<em>ET Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Boolean Type</em>'.
   * @generated
   */
  ETBooleanType createETBooleanType();

  /**
   * Returns a new object of class '<em>ET Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Scalar Type</em>'.
   * @generated
   */
  ETScalarType createETScalarType();

  /**
   * Returns a new object of class '<em>ET Struct Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Struct Type</em>'.
   * @generated
   */
  ETStructType createETStructType();

  /**
   * Returns a new object of class '<em>ET Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Field Declaration</em>'.
   * @generated
   */
  ETFieldDeclaration createETFieldDeclaration();

  /**
   * Returns a new object of class '<em>ET Field ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Field ID</em>'.
   * @generated
   */
  ETFieldID createETFieldID();

  /**
   * Returns a new object of class '<em>ET Specification Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Expression</em>'.
   * @generated
   */
  ETSpecificationExpression createETSpecificationExpression();

  /**
   * Returns a new object of class '<em>ET Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification</em>'.
   * @generated
   */
  ETSpecification createETSpecification();

  /**
   * Returns a new object of class '<em>ET Specification Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Binding</em>'.
   * @generated
   */
  ETSpecificationBinding createETSpecificationBinding();

  /**
   * Returns a new object of class '<em>ET Specification Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Definition</em>'.
   * @generated
   */
  ETSpecificationDefinition createETSpecificationDefinition();

  /**
   * Returns a new object of class '<em>ET Specification Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Template</em>'.
   * @generated
   */
  ETSpecificationTemplate createETSpecificationTemplate();

  /**
   * Returns a new object of class '<em>ET Specification Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Body</em>'.
   * @generated
   */
  ETSpecificationBody createETSpecificationBody();

  /**
   * Returns a new object of class '<em>ET Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Parameter</em>'.
   * @generated
   */
  ETParameter createETParameter();

  /**
   * Returns a new object of class '<em>ET Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Location</em>'.
   * @generated
   */
  ETLocation createETLocation();

  /**
   * Returns a new object of class '<em>ET Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Edge</em>'.
   * @generated
   */
  ETEdge createETEdge();

  /**
   * Returns a new object of class '<em>ETIO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ETIO</em>'.
   * @generated
   */
  ETIO createETIO();

  /**
   * Returns a new object of class '<em>ET Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Select</em>'.
   * @generated
   */
  ETSelect createETSelect();

  /**
   * Returns a new object of class '<em>ET Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Expression</em>'.
   * @generated
   */
  ETExpression createETExpression();

  /**
   * Returns a new object of class '<em>ET Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Type Reference</em>'.
   * @generated
   */
  ETTypeReference createETTypeReference();

  /**
   * Returns a new object of class '<em>ET Specification Disjunction Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Disjunction Expression</em>'.
   * @generated
   */
  ETSpecificationDisjunctionExpression createETSpecificationDisjunctionExpression();

  /**
   * Returns a new object of class '<em>ET Specification Conjunction Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Conjunction Expression</em>'.
   * @generated
   */
  ETSpecificationConjunctionExpression createETSpecificationConjunctionExpression();

  /**
   * Returns a new object of class '<em>ET Specification Composition Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Composition Expression</em>'.
   * @generated
   */
  ETSpecificationCompositionExpression createETSpecificationCompositionExpression();

  /**
   * Returns a new object of class '<em>ET Specification Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Reference</em>'.
   * @generated
   */
  ETSpecificationReference createETSpecificationReference();

  /**
   * Returns a new object of class '<em>ET Specification Instantiation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Specification Instantiation</em>'.
   * @generated
   */
  ETSpecificationInstantiation createETSpecificationInstantiation();

  /**
   * Returns a new object of class '<em>ET Forall Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Forall Expression</em>'.
   * @generated
   */
  ETForallExpression createETForallExpression();

  /**
   * Returns a new object of class '<em>ET Exists Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Exists Expression</em>'.
   * @generated
   */
  ETExistsExpression createETExistsExpression();

  /**
   * Returns a new object of class '<em>ET Imply Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Imply Expression</em>'.
   * @generated
   */
  ETImplyExpression createETImplyExpression();

  /**
   * Returns a new object of class '<em>ET Logic Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Logic Or Expression</em>'.
   * @generated
   */
  ETLogicOrExpression createETLogicOrExpression();

  /**
   * Returns a new object of class '<em>ET Logic And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Logic And Expression</em>'.
   * @generated
   */
  ETLogicAndExpression createETLogicAndExpression();

  /**
   * Returns a new object of class '<em>ET Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Assignment Expression</em>'.
   * @generated
   */
  ETAssignmentExpression createETAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Addition Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Addition Assignment Expression</em>'.
   * @generated
   */
  ETAdditionAssignmentExpression createETAdditionAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Subtraction Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Subtraction Assignment Expression</em>'.
   * @generated
   */
  ETSubtractionAssignmentExpression createETSubtractionAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Multiplication Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Multiplication Assignment Expression</em>'.
   * @generated
   */
  ETMultiplicationAssignmentExpression createETMultiplicationAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Division Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Division Assignment Expression</em>'.
   * @generated
   */
  ETDivisionAssignmentExpression createETDivisionAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Modulo Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Modulo Assignment Expression</em>'.
   * @generated
   */
  ETModuloAssignmentExpression createETModuloAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Bit Or Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit Or Assignment Expression</em>'.
   * @generated
   */
  ETBitOrAssignmentExpression createETBitOrAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Bit And Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit And Assignment Expression</em>'.
   * @generated
   */
  ETBitAndAssignmentExpression createETBitAndAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Bit XOR Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit XOR Assignment Expression</em>'.
   * @generated
   */
  ETBitXORAssignmentExpression createETBitXORAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Bit Left Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit Left Assignment Expression</em>'.
   * @generated
   */
  ETBitLeftAssignmentExpression createETBitLeftAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Bit Right Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit Right Assignment Expression</em>'.
   * @generated
   */
  ETBitRightAssignmentExpression createETBitRightAssignmentExpression();

  /**
   * Returns a new object of class '<em>ET Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Conditional Expression</em>'.
   * @generated
   */
  ETConditionalExpression createETConditionalExpression();

  /**
   * Returns a new object of class '<em>ET Bit Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit Or Expression</em>'.
   * @generated
   */
  ETBitOrExpression createETBitOrExpression();

  /**
   * Returns a new object of class '<em>ET Bit XOR Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit XOR Expression</em>'.
   * @generated
   */
  ETBitXORExpression createETBitXORExpression();

  /**
   * Returns a new object of class '<em>ET Bit And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit And Expression</em>'.
   * @generated
   */
  ETBitAndExpression createETBitAndExpression();

  /**
   * Returns a new object of class '<em>ET Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Equal Expression</em>'.
   * @generated
   */
  ETEqualExpression createETEqualExpression();

  /**
   * Returns a new object of class '<em>ET Unequal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Unequal Expression</em>'.
   * @generated
   */
  ETUnequalExpression createETUnequalExpression();

  /**
   * Returns a new object of class '<em>ET Less Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Less Expression</em>'.
   * @generated
   */
  ETLessExpression createETLessExpression();

  /**
   * Returns a new object of class '<em>ET Less Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Less Equal Expression</em>'.
   * @generated
   */
  ETLessEqualExpression createETLessEqualExpression();

  /**
   * Returns a new object of class '<em>ET Greater Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Greater Equal Expression</em>'.
   * @generated
   */
  ETGreaterEqualExpression createETGreaterEqualExpression();

  /**
   * Returns a new object of class '<em>ET Greater Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Greater Expression</em>'.
   * @generated
   */
  ETGreaterExpression createETGreaterExpression();

  /**
   * Returns a new object of class '<em>ET Min Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Min Expression</em>'.
   * @generated
   */
  ETMinExpression createETMinExpression();

  /**
   * Returns a new object of class '<em>ET Max Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Max Expression</em>'.
   * @generated
   */
  ETMaxExpression createETMaxExpression();

  /**
   * Returns a new object of class '<em>ET Bit Left Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit Left Expression</em>'.
   * @generated
   */
  ETBitLeftExpression createETBitLeftExpression();

  /**
   * Returns a new object of class '<em>ET Bit Right Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Bit Right Expression</em>'.
   * @generated
   */
  ETBitRightExpression createETBitRightExpression();

  /**
   * Returns a new object of class '<em>ET Add Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Add Expression</em>'.
   * @generated
   */
  ETAddExpression createETAddExpression();

  /**
   * Returns a new object of class '<em>ET Subtract Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Subtract Expression</em>'.
   * @generated
   */
  ETSubtractExpression createETSubtractExpression();

  /**
   * Returns a new object of class '<em>ET Multiply Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Multiply Expression</em>'.
   * @generated
   */
  ETMultiplyExpression createETMultiplyExpression();

  /**
   * Returns a new object of class '<em>ET Divide Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Divide Expression</em>'.
   * @generated
   */
  ETDivideExpression createETDivideExpression();

  /**
   * Returns a new object of class '<em>ET Modulo Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Modulo Expression</em>'.
   * @generated
   */
  ETModuloExpression createETModuloExpression();

  /**
   * Returns a new object of class '<em>ET Pre Increment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Pre Increment Expression</em>'.
   * @generated
   */
  ETPreIncrementExpression createETPreIncrementExpression();

  /**
   * Returns a new object of class '<em>ET Pre Decrement Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Pre Decrement Expression</em>'.
   * @generated
   */
  ETPreDecrementExpression createETPreDecrementExpression();

  /**
   * Returns a new object of class '<em>ET Logic Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Logic Not Expression</em>'.
   * @generated
   */
  ETLogicNotExpression createETLogicNotExpression();

  /**
   * Returns a new object of class '<em>ET Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Minus Expression</em>'.
   * @generated
   */
  ETMinusExpression createETMinusExpression();

  /**
   * Returns a new object of class '<em>ET Post Increment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Post Increment Expression</em>'.
   * @generated
   */
  ETPostIncrementExpression createETPostIncrementExpression();

  /**
   * Returns a new object of class '<em>ET Post Decrement Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Post Decrement Expression</em>'.
   * @generated
   */
  ETPostDecrementExpression createETPostDecrementExpression();

  /**
   * Returns a new object of class '<em>ET Struct Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Struct Expression</em>'.
   * @generated
   */
  ETStructExpression createETStructExpression();

  /**
   * Returns a new object of class '<em>ET Array Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Array Expression</em>'.
   * @generated
   */
  ETArrayExpression createETArrayExpression();

  /**
   * Returns a new object of class '<em>ET Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Reference</em>'.
   * @generated
   */
  ETReference createETReference();

  /**
   * Returns a new object of class '<em>ET Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Boolean Literal</em>'.
   * @generated
   */
  ETBooleanLiteral createETBooleanLiteral();

  /**
   * Returns a new object of class '<em>ET Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ET Number Literal</em>'.
   * @generated
   */
  ETNumberLiteral createETNumberLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EcdarTextPackage getEcdarTextPackage();

} //EcdarTextFactory
