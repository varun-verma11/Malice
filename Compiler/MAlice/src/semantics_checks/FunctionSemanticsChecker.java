package semantics_checks;

import java.util.ArrayList;

import malice_grammar.SemanticVerifier;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;

public class FunctionSemanticsChecker
{
	public static DATA_TYPES returnType = DATA_TYPES.ERROR;
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

	private static void checkRoomFunction(Tree node, SymbolTable enclosing_table)
	{
		if(enclosing_table.checkItemIsInCurrentScopeLevel(node.getText()))
		{
			SemanticsUtils.printMultipleDefinitionsOfFunctions(node);
		}
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		DATA_TYPES expectedReturnType = getReturnType(node);
		FunctionSTValue func_val = new FunctionSTValue(expectedReturnType,
				enclosing_table, args);
		SymbolTable table = func_val.getTable();
		func_val.setLocationReg(node.getText().contentEquals("main")? 
				"@_main" : "@" + node);
		enclosing_table.insert(node.getText(), func_val);
		Tree curr = node;
		table = func_val.getTable();
		curr = checkParametersToFunction(table, SemanticsUtils.getNextChild(curr), args);
		// skipping two children due to the return value
		curr = SemanticsUtils.getNextChild(curr);
		curr = SemanticsUtils.getNextChild(curr);
		returnType = DATA_TYPES.ERROR;
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
		if (returnType==DATA_TYPES.ERROR)
		{
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": The function " 
					+ " has no return statement." );
		}
		if (expectedReturnType!=returnType)
		{
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": The function's " 
					+ " return type mismatch. (ACTUAL : " + returnType 
					+ ", EXPECTED: " + expectedReturnType  );
		}
		returnType = DATA_TYPES.ERROR;
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
	private static void checkLookingFunction(Tree node, SymbolTable enclosing_table)
	{
		if(enclosing_table.checkItemIsInCurrentScopeLevel(node.getText()))
		{
			SemanticsUtils.printMultipleDefinitionsOfFunctions(node);
		}
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		FunctionSTValue func_val = new FunctionSTValue(enclosing_table, args);
		SymbolTable table = func_val.getTable();
		func_val.setLocationReg(node.getText().contentEquals("main")? 
				"@_main" : "@" + node);
		enclosing_table.insert(node.getText(), func_val);
		Tree curr = node;
		table = func_val.getTable();
		curr = SemanticsUtils.getNextChild(curr);
		curr = checkParametersToFunction(table, curr, args);
		returnType = DATA_TYPES.ERROR;
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
		if (returnType!=DATA_TYPES.ERROR)
		{
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getLine() + ": "
					+ node.getCharPositionInLine() + ": The procedure " 
					+ node.getChild(0).getText()
					+ " has a return statement." );
		}
		returnType = DATA_TYPES.ERROR;
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