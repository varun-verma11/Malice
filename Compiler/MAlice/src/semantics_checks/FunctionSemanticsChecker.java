package semantics_checks;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.StatementChecker;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;

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
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		table.insert(node.getText(), new FunctionSTValue(getReturnType(node),table, args));
		Tree curr = node ;
		curr = checkParametersToFunction(table, curr);
		//skipping two children due to the return value
		curr = getNextChild(getNextChild(curr));
		curr = StatementChecker.checkAllStatements(curr, table);
		return curr ;
	}

	private static DATA_TYPES getReturnType(Tree node)
	{
		Tree curr = node.getChild(0);
		
		while (curr != null && curr.getText().contentEquals("contained"))
		{
			curr = getNextChild(curr);
		}
		
		return DATA_TYPES.valueOf(curr.getText().toUpperCase());
	}

	//check with magdiee about the construct od fVal
	private static Tree checkLookingFunction(Tree node, SymbolTable table)
	{
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		table.insert(node.getText(), new FunctionSTValue(table, args));
		Tree curr = node ;
		curr = checkParametersToFunction(table, curr);
		curr = StatementChecker.checkAllStatements(curr, table);
		return curr;
	}

	private static Tree checkParametersToFunction(SymbolTable table, Tree curr)
	{
		try {
			while(curr!=null ) {
				DATA_TYPES type ;
				if (curr.getChildCount()==1)
				{
					type = DATA_TYPES.valueOf(
							curr.getText().toUpperCase());
					table.insert(curr.getChild(0).getText(), 
							new VariableSTValue(type, true));
				} else 
				{
					type = DATA_TYPES.valueOf(("array_"+
							curr.getText()).toUpperCase());
					table.insert(curr.getChild(0).getText(), 
							new VariableSTValue(type, true));
				}
				curr = getNextChild(curr);
			}
		} catch (IllegalArgumentException e) { }
		return curr;
	}

	private static Tree getNextChild(Tree current)
	{
		return current.getParent().getChild(current.getChildIndex()+1);
	}
}