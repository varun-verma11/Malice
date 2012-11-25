package symbol_table;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

public class ExpressionChecker 
{
	private class FunctionProperties
	{
		private DATA_TYPES return_data_type=null;
		private int arity=0;
		private DATA_TYPES arg_data_type ;
		public FunctionProperties(DATA_TYPES returnDataType, int arity, DATA_TYPES arg_data_type)
		{
			return_data_type = returnDataType;
			this.arity = arity;
			this.arg_data_type = arg_data_type ;
		}
		
	}
	
	private Map<String,FunctionProperties> operators_map 
			= new HashMap<String, FunctionProperties>();
	
	public ExpressionChecker() 
	{
		operators_map.put("==", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.NUMBER));
		operators_map.put("<=", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.NUMBER));
		operators_map.put(">=", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.NUMBER));
		operators_map.put("!=", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.NUMBER));
		operators_map.put(">", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.NUMBER));
		operators_map.put("<", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.NUMBER));
		operators_map.put("!", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 1, DATA_TYPES.BOOLEAN));
		operators_map.put("||", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.BOOLEAN));
		operators_map.put("&&", new 
				FunctionProperties(DATA_TYPES.BOOLEAN, 2, DATA_TYPES.BOOLEAN));
		operators_map.put("+", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("-", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("/", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("*", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("|", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("^", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("~", new 
				FunctionProperties(DATA_TYPES.NUMBER, 1, DATA_TYPES.NUMBER));
		operators_map.put("%", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
		operators_map.put("&", new 
				FunctionProperties(DATA_TYPES.NUMBER, 2, DATA_TYPES.NUMBER));
	}
	
	public DATA_TYPES getExpressionType(Tree node) 
	{
		if (node.getChildCount()==0)
		{
			try
			{
				Integer.parseInt(node.getText());
				return DATA_TYPES.NUMBER;
			} 
			catch (NumberFormatException e)
			{
				return DATA_TYPES.BOOLEAN;
			}
			
		}
		//check if required because bnf should be dealing with this potentially
		if (operators_map.containsKey(node.getText()))
		{
			if(operators_map.get(node.getText()).arity != node.getChildCount())
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " (" 
						+ node.getText() + ") Incorrect Number of Arguments");
			}
			for(int i=0; i<node.getChildCount(); i++) 
			{
				if (getExpressionType(node.getChild(i))
						!= operators_map.get(node.getText()).arg_data_type )
				{
					System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " (" 
						+ node.getText() + ") The arguments for operator " +
								"are of invalid type(s).");
				}
			}
		}
		
		return operators_map.get(node.getText()).return_data_type;
	}

}
