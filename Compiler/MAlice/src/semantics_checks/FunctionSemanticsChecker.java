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
		DATA_TYPES[] args = getArgumentsTypesOfFunction(node);
		
		table.insert(node.getText(), new FunctionSTValue(table, args));
		return node;
	}
	
	private static DATA_TYPES[] getArgumentsTypesOfFunction(Tree node)
	{
		DATA_TYPES args;
		return null;
	}
}
