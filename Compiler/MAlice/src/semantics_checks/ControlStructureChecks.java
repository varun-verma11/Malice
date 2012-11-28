package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;

public class ControlStructureChecks
{

	public static void checkForControlStructures(Tree n, SymbolTable table)
	{
		Tree node = n.getChild(0);
		if (node.getText().contentEquals("perhaps"))
		{
			checkForBooleanExpression(node, table);
			node =SemanticsUtils. getNextChild(node);
			do
			{
				if(node.getText().contentEquals("maybe")
						|| node.getText().contentEquals("or")) 
				{
					node = SemanticsUtils.getNextChild(node) ;
					checkForBooleanExpression(node, table);
					node = SemanticsUtils.getNextChild(node);
				}
				node = checkAllStatements(node, table);
				node = SemanticsUtils.getNextChild(node);
			}while(node != null) ;

		} else if (node.getText().contentEquals("either"))
		{
			checkForBooleanExpression(node, table);
			node = SemanticsUtils.getNextChild(node);
			node = checkAllStatements(node, table);
			node = SemanticsUtils.getNextChild(node);
			if (node.getText().contentEquals("or"))
			{
				node = SemanticsUtils.getNextChild(node);
				node = checkAllStatements(node, table);
			}
		} else if (node.getText().contentEquals("eventually"))
		{
			checkForBooleanExpression(node, table);
			node = checkAllStatements(node, table);
		}
		
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
			current = SemanticsUtils.getNextChild(current) ;
		}
		return node;
	}
}
