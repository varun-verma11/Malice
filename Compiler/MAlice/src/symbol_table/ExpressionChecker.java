package symbol_table;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

public class ExpressionChecker
{
	private class FunctionProperties
	{
		private DATA_TYPES return_data_type = null;
		private int arity = 0;
		private DATA_TYPES arg_data_type;

		public FunctionProperties(DATA_TYPES returnDataType, int arity,
				DATA_TYPES arg_data_type)
		{
			return_data_type = returnDataType;
			this.arity = arity;
			this.arg_data_type = arg_data_type;
		}

	}

	private static Map<String, FunctionProperties> operators_map =
		new HashMap<String, FunctionProperties>();

	public ExpressionChecker()
	{
		operators_map.put("==", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("<=", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.NUMBER));
		operators_map.put(">=", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("!=", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.NUMBER));
		operators_map.put(">", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("<", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("!", new FunctionProperties(DATA_TYPES.BOOLEAN, 1,
				DATA_TYPES.BOOLEAN));
		operators_map.put("||", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.BOOLEAN));
		operators_map.put("&&", new FunctionProperties(DATA_TYPES.BOOLEAN, 2,
				DATA_TYPES.BOOLEAN));
		operators_map.put("+", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("-", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("/", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("*", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("|", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("^", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("~", new FunctionProperties(DATA_TYPES.NUMBER, 1,
				DATA_TYPES.NUMBER));
		operators_map.put("%", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
		operators_map.put("&", new FunctionProperties(DATA_TYPES.NUMBER, 2,
				DATA_TYPES.NUMBER));
	}

	public static DATA_TYPES getExpressionType(Tree node, SymbolTable symbol_table) 
	{
		//check for atom and returns its type if current node is atom
		if (node.getChildCount()==0)
		{
			try
			{
				Integer.parseInt(node.getText());
				return DATA_TYPES.NUMBER;
			} 
			catch (NumberFormatException e)
			{
				SymbolTableValue val =  symbol_table.lookup(node.getText()) ;
				if (val==null)
				{
					System.err.println("Line "+ node.getLine()+ ": " 
							+ node.getCharPositionInLine() + " Identifier "
							+ node.getText() + " is not defined.");
					return DATA_TYPES.ERROR ;
				}
				return val.getType();
			}

		}
		//check if required because bnf should be dealing with this potentially
		//checks for number of arguments for each operator and checks the type
		//of its arguments given
		if (operators_map.containsKey(node.getText()))
		{
			if(operators_map.get(node.getText()).arity != node.getChildCount())
			{
				return printIncorrectNumberOfArguments(node);
			}
			for(int i=0; i<node.getChildCount(); i++) 
			{
				checkVariableType(node, symbol_table, i);
			}
		} 

		//checking for the functions
		if ( node.getChild(0).getText().contentEquals("(") 
				&& node.getChild(node.getChildCount()-1).getText()
						.contentEquals(")"))
		{
			
			FunctionSTValue symbol_table_val 
					= (FunctionSTValue) symbol_table.lookup(node.getText());
			if (symbol_table_val != null) 
			{
				validateFunctionCall(node, symbol_table, symbol_table_val);
				return symbol_table.lookup(node.getText()).getType();
			} else
			{
				printUndefinedFunction(node);
				return DATA_TYPES.ERROR ;
			}
		} 

		return operators_map.get(node.getText()).return_data_type;

	}

	private static void printUndefinedFunction(Tree node)
	{
		System.err.println("Line "+ node.getLine()+ ": " 
				+ node.getCharPositionInLine() + " (" 
				+ node.getText() + ") Undefined function call.");
	}

	private static void validateFunctionCall(Tree node,
			SymbolTable symbol_table, FunctionSTValue symbol_table_val)
	{
		DATA_TYPES[] args_types = symbol_table_val.getArgs();
		if (args_types.length != node.getChildCount()-2)
		{
			printIncorrectNumberOfArguments(node);
		} else {
			checkArgumentsOfFunctions(node, symbol_table, args_types);
		}
	}

	private static void checkArgumentsOfFunctions(Tree node,
			SymbolTable symbol_table, DATA_TYPES[] args_types)
	{
		for (int i=1 ; i< node.getChildCount()-1 ; i++)
		{
			if (getExpressionType(node.getChild(i),symbol_table) 
					!= args_types[i-1] )
			{
				printInvalidVariable(node);
			}
		}
	}

	private static DATA_TYPES printIncorrectNumberOfArguments(Tree node)
	{
		System.err.println("Line "+ node.getLine()+ ": " 
				+ node.getCharPositionInLine() + " (" 
				+ node.getText() + ") Incorrect Number of Arguments");
		return DATA_TYPES.ERROR ;
	}

	private static void checkVariableType(Tree node, 
			SymbolTable symbol_table, int i)
	{
		DATA_TYPES child_return_type = getExpressionType(node.getChild(i),
				symbol_table);
		if (child_return_type != operators_map.get(node.getText()).arg_data_type
				&& child_return_type != DATA_TYPES.ERROR)
		{
			printInvalidVariable(node);
		}
	}

	private static void printInvalidVariable(Tree node)
	{
		System.err.println("Line " + node.getLine() + ": "
				+ node.getCharPositionInLine() + " (" + node.getText()
				+ ") The arguments for operator " + "are of invalid type(s).");
	}
}