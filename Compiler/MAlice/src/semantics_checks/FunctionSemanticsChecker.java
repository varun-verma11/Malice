package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;

public class FunctionSemanticsChecker
{
	public static Tree checkFunction(Tree node, SymbolTable table)
	{
		if (node.getText().contentEquals("room")) 
		{
			return checkRoomFunction(node.getChild(0), table);
		} else if (node.getText().contentEquals("looking"))
		{
			return checkLookingFunction(node.getChild(0),table);
		}
		return node;
	}

	private static Tree checkRoomFunction(Tree node, SymbolTable table)
	{

		return node ;
	}

	private static Tree checkLookingFunction(Tree node, SymbolTable table)
	{
		DATA_TYPES[] args = getArgumentsTypes(node);
		table.insert(node.getText(), new FunctionSTValue(table, args));
		return node;
	}

	private static DATA_TYPES[] getArgumentsTypes(Tree node)
	{
		DATA_TYPES[] args_types = new DATA_TYPES[getNumberOfArguments(node)];
		for (int i=1; i<=args_types.length ; i++)
		{
			try 
			{
			args_types[i] = DATA_TYPES.valueOf(
					(node.getChild(i).getText().toUpperCase()));
			} catch (IllegalArgumentException e) {
				
			}
		}
		return args_types;
	}

	private static int getNumberOfArguments(Tree node)
	{
		int i = 0;
		Tree curr = node ;

		try 
		{
			while(curr != null)
			{
				DATA_TYPES.valueOf((curr.getText().toUpperCase()));
				curr = getNextChild(curr);
			}
		} catch (IllegalArgumentException e ) {	}
		return i;
	}

	private static Tree getNextChild(Tree current)
	{
		return current.getParent().getChild(current.getChildIndex()+1);
	}

}
