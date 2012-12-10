package semantics_checks;

import malice_grammar.SemanticVerifier;

import org.antlr.runtime.tree.Tree;

import codeGeneration.StatementsCodeGeneratorMagda;

import symbol_table.CodeBlockSTValue;
import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;
import symbol_table.SymbolTableValue;
import symbol_table.VariableSTValue;

public class StatementChecker {

	public static Tree checkAllStatements(Tree node, SymbolTable table) {
		Tree current = node;
		boolean end_of_statements = false;
		while (current != null && !end_of_statements) {
			end_of_statements = checkStatement(current, table);
			if (end_of_statements) {
				return current;
			}
			current = SemanticsUtils.getNextChild(current);
		}

		return current;

	}

	public static boolean checkStatement(Tree node, SymbolTable symbolTable)
	{
		if (node.getText() == null || node.getChildCount() == 0)
		{
			return true;
		}

		if (node.getText().contentEquals("was"))
		{
			validateWasStatement(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("ate")
				|| node.getText().contentEquals("drank"))
		{
			validateAteAndDrank(node, symbolTable);
			if (node.getText().contentEquals("ate")) {
				StatementsCodeGeneratorMagda.writeAteCode(node, symbolTable);
			} else {
				StatementsCodeGeneratorMagda.writeDrankCode(node, symbolTable);
			}
			return false;
		} else if (node.getText().contentEquals("became"))
		{
			validateBecame(node, symbolTable);
			StatementsCodeGeneratorMagda.writeBecameCode(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("spoke")
				|| node.getText().contentEquals("said"))
		{
			validatePrint(node, symbolTable);
			StatementsCodeGeneratorMagda.writePrintStatementCode(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("what"))
		{
			validateWhat(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("found"))
		{
			validateFound(node.getChild(0), symbolTable);
			StatementsCodeGeneratorMagda.writeFoundCode(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("had"))
		{
			validateHad(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("perhaps"))
		{
			validatePerhaps(node.getChild(0), symbolTable);
			return false;
		} else if (node.getText().contentEquals("either"))
		{
			validateEither(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("eventually"))
		{
			checkForBooleanExpression(node.getChild(0), symbolTable);
			node = checkAllStatements(node.getChild(1), symbolTable);
			return false;
		} else if (node.getText().contentEquals("opened"))
		{
			validateCodeBlock(node, symbolTable);
			return false;
		} else if (node.getChildCount() > 2
				&& node.getChild(0).getText().contentEquals("(")
				&& node.getChild(node.getChildCount() - 1).getText()
						.contentEquals(")"))
		{
			FunctionSTValue symbol_table_val = (FunctionSTValue) symbolTable
					.lookup(node.getText());
			SemanticsUtils.validateFunctionCall(node, symbolTable,
					symbol_table_val);
			return false;
		}
		return true;
	}

	private static void validateFound(Tree node, SymbolTable symbolTable) {
		FunctionSemanticsChecker.returnType = SemanticsUtils.getValueType(node,
				symbolTable);
	}

	private static void validateCodeBlock(Tree node, SymbolTable symbolTable) {
		CodeBlockSTValue codeVal = new CodeBlockSTValue(symbolTable);
		symbolTable.insert(
				"l" + node.getLine() + "c" + node.getCharPositionInLine(),
				codeVal);
		symbolTable = codeVal.getTable();
		node = checkAllStatements(node.getChild(0), symbolTable);
		symbolTable = symbolTable.finalizeCurrentScopeLevelTable();
	}

	private static void validateEither(Tree node, SymbolTable symbolTable) {
		node = node.getChild(0);
		checkForBooleanExpression(node, symbolTable);
		node = SemanticsUtils.getNextChild(node);
		node = checkAllStatements(node, symbolTable);
		if (node.getText().contentEquals("or")) {
			node = SemanticsUtils.getNextChild(node);
			node = checkAllStatements(node, symbolTable);
		}
	}

	private static void validatePerhaps(Tree current, SymbolTable symbolTable) {
		checkForBooleanExpression(current, symbolTable);
		current = SemanticsUtils.getNextChild(current);
		current = checkAllStatements(current, symbolTable);
		if (current != null && current.getText().contentEquals("maybe")) {
			current = SemanticsUtils.getNextChild(current);
			checkForBooleanExpression(current, symbolTable);
			current = SemanticsUtils.getNextChild(current);
			current = checkAllStatements(current, symbolTable);
		}
		if (current != null && current.getText().contentEquals("or")) {
			current = checkAllStatements(current, symbolTable);
		}
	}

	private static void validateHad(Tree node, SymbolTable symbolTable) {
		String var = node.getChild(0).getText();

		if (symbolTable.checkItemIsInCurrentScopeLevel(var)) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine()
					+ " Multiple declarations of " + node.getText());
		} else if (SemanticsUtils.getValueType(node.getChild(1), symbolTable) != DATA_TYPES.NUMBER) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : Array length "
					+ node.getChild(1).getText() + " is not a number.");
		} else {
			SymbolTableValue val = new VariableSTValue(
					DATA_TYPES.valueOf(("array_" + node.getChild(2))
							.toUpperCase()), true);
			symbolTable.insert(node.getChild(0).getText(), val);
		}
	}

	private static void validateWhat(Tree node, SymbolTable symbolTable) {
		String var = node.getChild(0).getText();
		if (!symbolTable.checkItemWasDeclaredBefore(var)) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": " + var
					+ " out of scope");
		}

		else {
			try {
				((VariableSTValue) symbolTable.lookup(node.getChild(0)
						.getText())).setInitialised(true);
			} catch (ClassCastException e) {
				SemanticVerifier.failed = true;
				System.err.println("Line " + node.getLine() + ": "
						+ node.getCharPositionInLine() + ": "
						+ " Invalid variable for read statement.");
			}
		}
	}

	private static void validatePrint(Tree node, SymbolTable symbolTable) {
		SemanticsUtils.getValueType(node.getChild(0), symbolTable);
	}

	private static void validateBecame(Tree node, SymbolTable symbolTable) {
		String var = node.getChild(0).getText();
		if (node.getChild(0).getText().contentEquals("piece")) {
			ArrayElemCheck.checkArrayElem(node.getChild(0), symbolTable);
		} else if (!symbolTable.checkItemWasDeclaredBefore(var)) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": " + var
					+ " out of scope");
		} else if ((symbolTable.lookup(node.getChild(0).getText())).getType() != SemanticsUtils
				.getValueType(node.getChild(node.getChildCount() - 1),
						symbolTable)) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": Types of " + var
					+ " and the subcribed value don't match.");
		} else {

			((VariableSTValue) symbolTable.lookup(node.getChild(0).getText()))
					.setInitialised(true);

		}
	}

	private static void validateAteAndDrank(Tree node, SymbolTable symbolTable) {
		String var = node.getChild(0).getText();
		if (!symbolTable.checkItemWasDeclaredBefore(var)) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : " + var
					+ " out of scope.");
		} else if ((symbolTable.lookup(node.getChild(0).getText())).getType() != DATA_TYPES.NUMBER) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : " + var
					+ " not a number.");
		} else if (!((VariableSTValue) symbolTable.lookup(node.getChild(0)
				.getText())).isInitialised()) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": " + var
					+ " not initialised yet");
		}
		String out = "@." + var + " = private unnamed_addr constant ["
				+ (var.length() + 1) + " x i8] c\"" + "VAL_FROM_TABLE" + '\\'
				+ '0' + "0\", align 1";
		System.out.println(out);
	}

	private static void validateWasStatement(Tree node, SymbolTable symbolTable) {
		String var = node.getChild(0).getText();

		if (symbolTable.checkItemIsInCurrentScopeLevel(var)) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine()
					+ " Multiple declarations of " + var);
		}

		else if (node.getChildCount() == 3
				&& (SemanticsUtils.getValueType(node.getChild(2), symbolTable) != (SemanticsUtils
						.getReturnType(node.getChild(1))))) {
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : Data types of " + var
					+ " and subscribed value don't match.");
		}

		else {

			boolean initialised = node.getChildCount() == 3;
			symbolTable.insert(
					var,
					new VariableSTValue(SemanticsUtils.getReturnType(node
							.getChild(1)), initialised));
		}
	}

	private static void checkForBooleanExpression(Tree expr, SymbolTable table) {
		DATA_TYPES expr_type = ExpressionChecker.getExpressionType(expr, table);
		if (expr_type != DATA_TYPES.BOOLEAN) {
			SemanticVerifier.failed = true;
			System.err.println("Line: " + expr.getLine() + " :"
					+ expr.getCharPositionInLine() + " Invalid Expression "
					+ "for the statement. Expected BOOLEAN, Actual Type "
					+ expr_type);
		}
	}
}