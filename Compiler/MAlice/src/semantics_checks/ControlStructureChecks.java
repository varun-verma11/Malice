package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.ExpressionChecker;
import symbol_table.SymbolTable;

public class ControlStructureChecks
{

	public static void checkForControlStructures(Tree node, SymbolTable table)
	{
		Tree current = node.getChild(0);
		if (node.getText().contentEquals("perhaps"))
		{
			checkForBooleanExpression(current, table);
			current = getNextChild(current);
			do
			{
				if(current.getText().contentEquals("maybe")
						|| current.getText().contentEquals("or")) 
				{
					current = getNextChild(current) ;
					checkForBooleanExpression(current, table);
					current = getNextChild(current);
				}
				current = checkAllStatements(current, table);
				current = getNextChild(current);
			}while(current != null) ;

		} else if (node.getText().contentEquals("either"))
		{
			checkForBooleanExpression(current, table);
			current = getNextChild(current);
			current = checkAllStatements(current, table);
			current = getNextChild(current);
			if (current.getText().contentEquals("or"))
			{
				current = getNextChild(current);
				current = checkAllStatements(current, table);
			}
		} else if (node.getText().contentEquals("eventually"))
		{
			checkForBooleanExpression(current, table);
			current = checkAllStatements(current, table);
		}
		
	}

	private static Tree getNextChild(Tree current)
	{
		return current.getParent().getChild(current.getChildIndex()+1);
	}

	private static void checkForBooleanExpression(Tree expr, SymbolTable table)
	{
		DATA_TYPES expr_type = 
			ExpressionChecker.getExpressionType(expr, table) ;
		if( expr_type !=DATA_TYPES.BOOLEAN)
		{
			System.out.println(expr.getLine() + " :" 
					+ expr.getCharPositionInLine() +" Invalid Expression " +
					"for the statement. Expected BOOLEAN, Actual Type " +
					expr_type
			);
		}
	}

	private static Tree checkAllStatements(Tree node, SymbolTable table) 
	{
		Tree current = node ;

		while(current != null && (current.getText().contentEquals("maybe") 
				|| current.getText().contentEquals("or")))
		{
			/************************************************
			 * pass current to the method to check 			*
			 * the statement    							*
			 ************************************************/
			current = getNextChild(current) ;
		}
		return node;
	}
}
