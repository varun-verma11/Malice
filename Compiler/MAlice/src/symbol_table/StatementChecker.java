
package symbol_table;

import org.antlr.runtime.tree.Tree;

public class StatementChecker {

	public static Tree checkAllStatements(Tree node, SymbolTable table) 
	{
		Tree current = node ;
		boolean end_of_statements = false;
		while(current != null || !end_of_statements)
		{
			end_of_statements = checkStatement(node, table);
			if (end_of_statements) return current ;
			current = getNextChild(current) ;
		}
		return current;

	}

	private static Tree getNextChild(Tree current)
	{
		return current.getParent().getChild(current.getChildIndex()+1);
	}


	public static boolean checkStatement(Tree node, SymbolTable symbolTable)
	{
		if (node.getChildCount()==0) { return false; }
		String var = node.getChild(0).getText();
		int currentScopeLevel = symbolTable.getCurrentScopeLevel();

		if (node.getText().contentEquals("was"))
		{

			if (!symbolTable.checkVariableIsInCurrentScopeLevel(var))
			{
				System.err.println("doesnt work :'(");
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() 
						+ " Multiple declarations of " + var);
			}

			else 
			{
				DATA_TYPES type = DATA_TYPES.valueOf((node.getChild(1).getText()).toUpperCase());
				symbolTable.insert(var, new VariableSTValue(type, false));
			}

			return false;

		}

		else if ( node.getText().contentEquals("ate") ||  node.getText().contentEquals("drank"))
		{	

			if (!symbolTable.checkVariableIsInOtherScopeLevels(var, currentScopeLevel))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " : "
						+ var + " out of scope.");
			}

			else if ( !((VariableSTValue) symbolTable.lookup(node.getChild(0).getText())).isInitialised())
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" not initialised yet" + node.getText());				
			}

			else if ((symbolTable.lookup(node.getChild(0).getText())).getType() != DATA_TYPES.NUMBER)
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " : "
						+ var + " not a number.");
			}

			return false;

		}		

		else if ( node.getText().contentEquals("became"))
		{

			if (!symbolTable.checkVariableIsInOtherScopeLevels(var, currentScopeLevel))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" out of scope" + node.getText());
			}

			else if ((symbolTable.lookup(node.getChild(0).getText())).getType() != ExpressionChecker.getExpressionType(node.getChild(1), symbolTable))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + " : Types of "
						+ var + " and the subcribed value don't match.");
			}

			else
			{
				((VariableSTValue) symbolTable.lookup(node.getChild(0).getText())).setInitialised(true) ;
			}

			return false;

		}

		else if ( node.getText().contentEquals("spoke") || node.getText().contentEquals("said"))
		{

			if (!symbolTable.checkVariableIsInOtherScopeLevels(var, currentScopeLevel))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" out of scope" + node.getText());				
			}

			else if ( !((VariableSTValue) symbolTable.lookup(node.getChild(0).getText())).isInitialised() )
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" not initialised yet" + node.getText());				
			}

			return false;
		}

		else if ( node.getText().contentEquals("what"))

		{
			if (!symbolTable.checkVariableIsInOtherScopeLevels(var, currentScopeLevel))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" out of scope" + node.getText());				
			}
			
			else
			{
				((VariableSTValue) symbolTable.lookup(node.getChild(0).getText())).setInitialised(true);
			}

			return false;
		}
		
		else if ( node.getText().contentEquals("found"))

		{
			if (!symbolTable.checkVariableIsInOtherScopeLevels(var, currentScopeLevel))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" out of scope" + node.getText());				
			}

			else if ( !((VariableSTValue) symbolTable.lookup(node.getChild(0).getText())).isInitialised() )
			{
				System.err.println("Line "+ node.getLine()+ ": "
						+ node.getCharPositionInLine() + ": "
						+ var +" not initialised yet" + node.getText());				
			}
			
			return false;
		}
		
		else if ( node.getText().contentEquals("had"))
		{
			
		}

		return true;
	}

}
