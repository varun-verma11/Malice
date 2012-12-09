package semantics_checks;

import java.util.HashMap;
import java.util.Map;

import malice_grammar.SemanticVerifier;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;

public class ExpressionChecker
{
	private class FunctionProperties
	{
		private DATA_TYPES return_data_type = null;
		private DATA_TYPES arg_data_type;

		public FunctionProperties(DATA_TYPES returnDataType,
				DATA_TYPES arg_data_type)
		{
			return_data_type = returnDataType;
			this.arg_data_type = arg_data_type;
		}

	}

	private static Map<String, FunctionProperties> operators_map = new HashMap<String, FunctionProperties>();

	public ExpressionChecker()
	{
		operators_map.put("==", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.NUMBER));
		operators_map.put("<=", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.NUMBER));
		operators_map.put(">=", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.NUMBER));
		operators_map.put("!=", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.NUMBER));
		operators_map.put(">", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.NUMBER));
		operators_map.put("<", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.NUMBER));
		operators_map.put("!", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.BOOLEAN));
		operators_map.put("||", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.BOOLEAN));
		operators_map.put("&&", new FunctionProperties(DATA_TYPES.BOOLEAN,
				DATA_TYPES.BOOLEAN));
		operators_map.put("+", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("-", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("/", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("*", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("|", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("^", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("~", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("%", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
		operators_map.put("&", new FunctionProperties(DATA_TYPES.NUMBER,
				DATA_TYPES.NUMBER));
	}

	public static Map<String,FunctionProperties> getOperatorsMap()
	{
		return operators_map;
	}
	public static DATA_TYPES getExpressionType(Tree node,
			SymbolTable symbol_table)
	{
		// check for atom and returns its type if current node is atom
		if (node == null)
			return DATA_TYPES.ERROR;
		if (node.getChildCount() == 0)
		{
			try
			{
				Integer.parseInt(node.getText());
				return DATA_TYPES.NUMBER;
			} catch (NumberFormatException e)
			{
				if (!symbol_table.checkItemWasDeclaredBefore(node.getText()))
				{
					SemanticVerifier.failed = true;
					System.err.println("Line " + node.getLine() + ": "
							+ node.getCharPositionInLine() + " Identifier "
							+ node.getText() + " is not defined.");
					return DATA_TYPES.ERROR;
				}
				return symbol_table.lookup(node.getText()).getType();
			}

		}
		// check if required because bnf should be dealing with this potentially
		// checks for number of arguments for each operator and checks the type
		// of its arguments given
		if (operators_map.containsKey(node.getText()))
		{
			for (int i = 0; i < node.getChildCount(); i++)
			{
				checkVariableType(node, symbol_table, i);
			}
		}

		// checking for the functions
		if (node.getChild(0).getText().contentEquals("(")
				&& node.getChild(node.getChildCount() - 1).getText()
						.contentEquals(")"))
		{

			FunctionSTValue symbol_table_val = (FunctionSTValue) symbol_table
					.lookup(node.getText());
			if (symbol_table_val != null)
			{
				SemanticsUtils.validateFunctionCall(node, symbol_table,
						symbol_table_val);
				return symbol_table.lookup(node.getText()).getType();
			} else
			{
				printUndefinedFunction(node);
				return DATA_TYPES.ERROR;
			}
		}
		return operators_map.get(node.getText()).return_data_type;

	}

	private static void printUndefinedFunction(Tree node)
	{
		SemanticVerifier.failed = true;
		System.err.println("Line " + node.getLine() + ": "
				+ node.getCharPositionInLine() + " (" + node.getText()
				+ ") Undefined function call.");
	}

	private static void checkVariableType(Tree node, SymbolTable symbol_table,
			int i)
	{
		if (node.getChild(i).getText().contentEquals("piece"))
		{
			ArrayElemCheck.checkArrayElem(node.getChild(i), symbol_table);
			return;
		}
		DATA_TYPES child_return_type = getExpressionType(node.getChild(i),
				symbol_table);
		if (child_return_type != operators_map.get(node.getText()).arg_data_type
				&& child_return_type != DATA_TYPES.ERROR)
		{
			SemanticsUtils.printInvalidVariable(node);
		}
	}

}