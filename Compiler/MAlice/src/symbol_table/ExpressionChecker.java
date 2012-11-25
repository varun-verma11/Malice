package symbol_table;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

public class ExpressionChecker
{
	private class FunctionProperties
	{
<<<<<<< HEAD
		private DATA_TYPES return_data_type ;
=======
		private DATA_TYPES return_data_type = null;
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
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
<<<<<<< HEAD

=======
	
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
	private static Map<String, FunctionProperties> operators_map = new HashMap<String, FunctionProperties>();

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

<<<<<<< HEAD
	public DATA_TYPES getExpressionType(Tree node, SymbolTable symbol_table) 
=======
	public static DATA_TYPES getExpressionType(Tree node, SymbolTable symbol_table) 
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
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
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " (" 
						+ node.getText() + ") Incorrect Number of Arguments");
				return DATA_TYPES.ERROR ;
			}
			for(int i=0; i<node.getChildCount(); i++) 
			{
				checkVariableType(node, symbol_table, i);
			}
<<<<<<< HEAD

		} 

		//does the checking for function calls in the expressions
		SymbolTableValue symbol_table_val = symbol_table.lookup(node.getText());

		if ( node.getChild(0).getText().contentEquals("(") 
				&& node.getChild(node.getChildCount()-1).getText().contentEquals(")"))
		{
			if (symbol_table_val != null) 	
			{
				DATA_TYPES[] args_types = 
					((FunctionSTValue)symbol_table_val).getArgs();
				for (int i=1 ; i< node.getChildCount()-1 ; i++)
				{
					if (getExpressionType(node.getChild(i),symbol_table) 
							!= args_types[i-1] )
					{
						printInvalidVariable(node);
					}
				}
				return symbol_table.lookup(node.getText()).getType();
			} else
=======
		} 
		FunctionSTValue symbol_table_val = (FunctionSTValue) symbol_table.lookup(node.getText());
		if (symbol_table_val != null) 	{
			if ( node.getChild(0).getText().contentEquals("(") 
					&& node.getChild(node.getChildCount()-1).getText().contentEquals(")"))
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
			{
				DATA_TYPES[] args_types = symbol_table_val.getArgs();
				for (int i=1 ; i< node.getChildCount()-1 ; i++)
				{
					if (getExpressionType(node.getChild(i),symbol_table) != args_types[i-1] )
					{
						printInvalidVariable(node);
					}
				}
				return symbol_table.lookup(node.getText()).getType();
			} 
			else
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " (" 
						+ node.getText() + ") Undefined function call.");
				return DATA_TYPES.ERROR ;
			}
		} 
<<<<<<< HEAD

=======
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
		return operators_map.get(node.getText()).return_data_type;

	}

	private static void checkVariableType(Tree node, SymbolTable symbol_table, int i)
	{
		DATA_TYPES child_return_type = getExpressionType(node.getChild(i),
				symbol_table);
		if (child_return_type != operators_map.get(node.getText()).arg_data_type
				&& child_return_type != DATA_TYPES.ERROR)
		{
			printInvalidVariable(node);
		}
	}

<<<<<<< HEAD
	private  void checkVariableType(Tree node, SymbolTable symbol_table, int i)
	{
		DATA_TYPES child_return_type = getExpressionType(node.getChild(i),
				symbol_table);
		if (child_return_type != operators_map.get(node.getText()).arg_data_type
				&& child_return_type != DATA_TYPES.ERROR)
		{
			printInvalidVariable(node);
		}
	}

	private  void printInvalidVariable(Tree node)
=======
	private static void printInvalidVariable(Tree node)
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
	{
		System.err.println("Line " + node.getLine() + ": "
				+ node.getCharPositionInLine() + " (" + node.getText()
				+ ") The arguments for operator " + "are of invalid type(s).");
	}
}