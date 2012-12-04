package semantics_checks;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;

public class SemanticsUtils {
	public static DATA_TYPES getReturnType(Tree node)
	{
		return DATA_TYPES.valueOf(node.getText().toUpperCase());
	}

	public static Tree getNextChild(Tree current)
	{
		try 
		{
			Tree parent = current.getParent();
			return parent.getChild(1+current.getChildIndex());
		} catch (NullPointerException e) 
		{
			return null;
		}
	}
	
	public static void validateFunctionCall(Tree node,
			SymbolTable symbol_table, FunctionSTValue symbol_table_val)
	{
		ArrayList<DATA_TYPES> args_types = symbol_table_val.getArgs();
		if (args_types.size() != node.getChildCount()-2)
		{
			printIncorrectNumberOfArguments(node);
		} else {
			checkArgumentsOfFunctions(node, symbol_table, args_types);
		}
	}

	public static DATA_TYPES printIncorrectNumberOfArguments(Tree node)
	{
		System.err.println("Line "+ node.getLine()+ ": " 
				+ node.getCharPositionInLine() + " (" 
				+ node.getText() + ") Incorrect Number of Arguments");
		return DATA_TYPES.ERROR ;
	}
	
	public static void printMultipleDefinitionsOfFunctions(Tree node) 
	{
		System.err.println("Line "+ node.getLine()+ ": " 
				+ node.getCharPositionInLine() + " (" 
				+ node.getText() + ") Muliple definitions.");
	}
	
	private static void checkArgumentsOfFunctions(Tree node,
			SymbolTable symbol_table, ArrayList<DATA_TYPES> argsTypes )
	{
		for (int i=1 ; i< node.getChildCount()-1 ; i++)
		{
			if (SemanticsUtils.getValueType(node.getChild(i),symbol_table) 
					!= argsTypes.get(i-1))
			{
				printInvalidVariable(node);
			}
		}
	}
	
	public static void printInvalidVariable(Tree node)
	{
		System.err.println("Line " + node.getLine() + ": "
				+ node.getCharPositionInLine() + " (" + node.getText()
				+ ") The arguments for operator " + "are of invalid type(s).");
	}
	
	public static DATA_TYPES getValueType(Tree node, SymbolTable symbolTable)
	{
		char firstChar = node.getText().charAt(0);
		if(node.getText().contentEquals("piece"))
		{
			return ArrayElemCheck.checkArrayElem(node, symbolTable); 
		}else if (firstChar == '\'')
		{
			return DATA_TYPES.LETTER;
		}
		else if (firstChar == '\"')
		{
			return DATA_TYPES.SENTENCE;
		} else 
		{
			return ExpressionChecker.getExpressionType(node, symbolTable);
		}
	}
}
