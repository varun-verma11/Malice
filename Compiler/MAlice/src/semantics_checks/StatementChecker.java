package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.CodeBlockSTValue;
import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;

public class StatementChecker
{
	/**
	 * Checks a collection of statements passed as a symbol-table tree for Syntax errors.
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	public static Tree checkAllStatements(Tree node, SymbolTable table)
	{
		Tree current = node;
		boolean end_of_statements = false;
		while (current != null && !end_of_statements)
		{
			end_of_statements = checkStatement(current, table);
			if (end_of_statements)
			{
				return current;
			}
			current = SemanticsUtils.getNextChild(current);
		}

		return current;

	}

	/**
	 * Checks a single statement passed as a symbol-table tree for Syntax errors.
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
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
			return false;
		} else if (node.getText().contentEquals("became"))
		{
			validateBecame(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("spoke")
				|| node.getText().contentEquals("said"))
		{
			validatePrint(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("what"))
		{
			validateWhat(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("found"))
		{
			validateFound(node.getChild(0), symbolTable);
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
			System.out.println(symbolTable.getSymbolTable().size());
			System.out.println(symbolTable.getSymbolTable().toString());
			validateEither(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("eventually"))
		{
			checkForBooleanExpression(node, symbolTable);
			node = checkAllStatements(node, symbolTable);
			return false;
		} else if (node.getText().contentEquals("opened"))
		{
			validateCodeBlock(node, symbolTable);
			return false;
		}
		return true;
	}

	/**
	 * Validating Found
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateFound(Tree node, SymbolTable symbolTable)
	{
		SemanticsUtils.getValueType(node.getChild(0), symbolTable);
	}

	
	/**
	 * Opened and closed blocks
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateCodeBlock(Tree node, SymbolTable symbolTable)
	{
		CodeBlockSTValue codeVal = new CodeBlockSTValue(symbolTable);
		symbolTable.insert("l" + node.getLine() + "c"
				+ node.getCharPositionInLine(), codeVal);
		symbolTable = codeVal.getTable();
		node = checkAllStatements(node.getChild(0), symbolTable);
		symbolTable = symbolTable.finalizeCurrentScopeLevelTable();
	}

	
	/**
	 * Validating Either
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateEither(Tree node, SymbolTable symbolTable)
	{
		node = node.getChild(0);
		checkForBooleanExpression(node, symbolTable);
		node = SemanticsUtils.getNextChild(node);
		node = checkAllStatements(node, symbolTable);
		if (node.getText().contentEquals("or"))
		{
			node = SemanticsUtils.getNextChild(node);
			node = checkAllStatements(node, symbolTable);
		}
	}

	
	/**
	 * Validating Perhaps
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validatePerhaps(Tree node, SymbolTable symbolTable)
	{
		Tree current = node;
		checkForBooleanExpression(current, symbolTable);
		current = SemanticsUtils.getNextChild(current);
		current = checkAllStatements(current, symbolTable);
		if (current.getText().contentEquals("maybe"))
		{
			checkForBooleanExpression(current, symbolTable);
			current = SemanticsUtils.getNextChild(current);
			current = checkAllStatements(current, symbolTable);
		}
		if (current.getText().contentEquals("or"))
		{
			current = checkAllStatements(current, symbolTable);
		}
	}

	
	/**
	 * Validating Had
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateHad(Tree node, SymbolTable symbolTable)
	{
		String var = node.getChild(0).getText();

		if (symbolTable.checkItemIsInCurrentScopeLevel(var))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine()
					+ " Multiple declarations of " + node.getText());
		}

		else if (SemanticsUtils.getValueType(node.getChild(1), symbolTable) != DATA_TYPES.NUMBER)
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : Array length "
					+ node.getChild(1).getText() + " is not a number.");
		}
	}

	
	/**
	 * Validating What
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateWhat(Tree node, SymbolTable symbolTable)
	{
		String var = node.getChild(0).getText();
		if (!symbolTable.checkItemWasDeclaredBefore(var))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": " + var
					+ " out of scope" + node.getText());
		}

		else
		{
			((VariableSTValue) symbolTable.lookup(node.getChild(0).getText()))
					.setInitialised(true);
		}
	}

	
	/**
	 * Validating Print
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validatePrint(Tree node, SymbolTable symbolTable)
	{
		SemanticsUtils.getValueType(node.getChild(0), symbolTable);
	}

	
	/**
	 * Validating Became
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateBecame(Tree node, SymbolTable symbolTable)
	{
		String var = node.getChild(0).getText();
		if (!symbolTable.checkItemWasDeclaredBefore(var))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": " + var
					+ " out of scope");
		}

		else if ((symbolTable.lookup(node.getChild(0).getText())).getType() != SemanticsUtils.getValueType(
				node.getChild(node.getChildCount() - 1), symbolTable))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : Types of " + var
					+ " and the subcribed value don't match.");
		}

		else if (node.getChildCount() > 2
				&& SemanticsUtils.getValueType(node.getChild(1), symbolTable) != DATA_TYPES.NUMBER)
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : Length of the Array"
					+ var + " should be an Integer");
		}

		else
		{

			((VariableSTValue) symbolTable.lookup(node.getChild(0).getText()))
					.setInitialised(true);

		}
	}

	
	/**
	 * Validating Ate and Drank statements
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateAteAndDrank(Tree node, SymbolTable symbolTable)
	{
		String var = node.getChild(0).getText();
		if (!symbolTable.checkItemWasDeclaredBefore(var))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : " + var
					+ " out of scope.");
		} else if ((symbolTable.lookup(node.getChild(0).getText())).getType() != DATA_TYPES.NUMBER)
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + " : " + var
					+ " not a number.");
		} else if (!((VariableSTValue) symbolTable.lookup(node.getChild(0)
				.getText())).isInitialised())
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": " + var
					+ " not initialised yet");
		}
	}

	
	/**
	 * Validating Was
	 * 
	 * @param node    Starting point on the tree.
	 * @param table   Symbol-Table tree.
	 */
	private static void validateWasStatement(Tree node, SymbolTable symbolTable)
	{
		String var = node.getChild(0).getText();

		if (symbolTable.checkItemIsInCurrentScopeLevel(var))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine()
					+ " Multiple declarations of " + var);
		}

		else if (node.getChildCount() > 2
				&& (SemanticsUtils.getValueType(node.getChild(2), symbolTable) != (SemanticsUtils
						.getReturnType(node.getChild(1)))))
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + "Data types of " + var
					+ " and subscribed value don't match.");
		}

		else
		{
			symbolTable.insert(var, new VariableSTValue(SemanticsUtils
					.getReturnType(node.getChild(1)), false));
		}
	}

	
	/**
	 * Checks the boolean expression for syntax errors
	 * 
	 * @param expr    Input boolean expression
	 * @param table   Symbol-Table tree.
	 */
	private static void checkForBooleanExpression(Tree expr, SymbolTable table)
	{
		DATA_TYPES expr_type = ExpressionChecker.getExpressionType(expr, table);
		if (expr_type != DATA_TYPES.BOOLEAN)
		{
			System.err.println(expr.getLine() + " :"
					+ expr.getCharPositionInLine() + " Invalid Expression "
					+ "for the statement. Expected BOOLEAN, Actual Type "
					+ expr_type);
		}
	}
}