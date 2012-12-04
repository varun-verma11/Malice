package semantics_checks;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;

public class FunctionSemanticsChecker
{
	public static boolean hasReturnStatement = false;
	public static Tree checkFunction(Tree node, SymbolTable table)
	{
		if (node.getText().contentEquals("room"))
		{
			checkRoomFunction(node.getChild(0), table);
		} else if (node.getText().contentEquals("looking"))
		{
			checkLookingFunction(node.getChild(0), table);
		}
		return node;
	}

	private static void checkRoomFunction(Tree node, SymbolTable table)
	{
		if(table.checkItemIsInCurrentScopeLevel(node.getText()))
		{
			SemanticsUtils.printMultipleDefinitionsOfFunctions(node);
		}
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		FunctionSTValue func_val = new FunctionSTValue(getReturnType(node),
				table, args);
		table.insert(node.getText(), func_val);
		Tree curr = node;
		table = func_val.getTable();
		curr = checkParametersToFunction(table, SemanticsUtils.getNextChild(curr), args);
		// skipping two children due to the return value
		curr = SemanticsUtils.getNextChild(curr);
		curr = SemanticsUtils.getNextChild(curr);
		hasReturnStatement = false;
		curr = StatementChecker.checkAllStatements(curr, table);
		try
		{
			Tree temp = curr;
			while (true)
			{
				temp = checkFunction(curr, table);
				if (temp == curr)
				{
					break;
				}
				curr = StatementChecker.checkAllStatements(curr, table);
			}
		} catch (NullPointerException e)
		{
		}
		if (!hasReturnStatement)
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": The function " 
					//+ node.getChild(0).getText()
					+ " has no return statement." );
		}
		hasReturnStatement = false;
		table = table.finalizeCurrentScopeLevelTable();
	}

	private static DATA_TYPES getReturnType(Tree node)
	{
		Tree curr = node;

		while (!(curr == null || curr.getText().contentEquals("contained")))
		{
			curr = SemanticsUtils.getNextChild(curr);
		}

		curr = SemanticsUtils.getNextChild(curr);

		return DATA_TYPES.valueOf(curr.getText().toUpperCase());
	}

	// check with magdiee about the construct of Val
	private static void checkLookingFunction(Tree node, SymbolTable table)
	{
		if(table.checkItemIsInCurrentScopeLevel(node.getText()))
		{
			SemanticsUtils.printMultipleDefinitionsOfFunctions(node);
		}
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		FunctionSTValue func_val = new FunctionSTValue(table, args);
		table.insert(node.getText(), func_val);
		Tree curr = node;
		table = func_val.getTable();
		curr = SemanticsUtils.getNextChild(curr);
		curr = checkParametersToFunction(table, curr, args);
		hasReturnStatement = false;
		curr = StatementChecker.checkAllStatements(curr, table);
		try
		{
			Tree temp = curr;
			while (true)
			{
				temp = checkFunction(curr, table);
				if (temp == curr)
				{
					break;
				}
				curr = StatementChecker.checkAllStatements(curr, table);
			}
		} catch (NullPointerException e)
		{
		}
		if (hasReturnStatement)
		{
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": The procedure " 
					+ node.getChild(0).getText()
					+ " has a return statement." );
		}
		hasReturnStatement = false;
		table.finalizeCurrentScopeLevelTable();
	}

	private static Tree checkParametersToFunction(SymbolTable table, Tree node,
			ArrayList<DATA_TYPES> args)
	{
		Tree curr = node;
		try
		{
			while (curr != null)
			{
				DATA_TYPES type;
				if (curr.getChildCount() == 1)
				{
					type = DATA_TYPES.valueOf(curr.getText().toUpperCase());
					table.insert(curr.getChild(0).getText(),
							new VariableSTValue(type, true));
					args.add(type);
				} else
				{
					type = DATA_TYPES.valueOf(("array_" + curr.getText())
							.toUpperCase());
					table.insert(curr.getChild(1).getText(),
							new VariableSTValue(type, true));
					args.add(type);
				}
				curr = SemanticsUtils.getNextChild(curr);
			}
		} catch (IllegalArgumentException e)
		{
		}
		return curr;
	}

}