package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
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

	public static DATA_TYPES getValueType(Tree node, SymbolTable symbolTable)
	{
		char firstChar = node.getText().charAt(0);
		if (firstChar == '\'')
		{
			return DATA_TYPES.LETTER;
		}
	
		else if (firstChar == '\"')
	
		{
			return DATA_TYPES.SENTENCE;
		}
	
		else
		{
			return ExpressionChecker.getExpressionType(node, symbolTable);
		}
	}
}