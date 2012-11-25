package symbol_table;

import org.antlr.runtime.tree.Tree;

public class StatementChecker {
	
	public static void checkStatement(Tree node, SymbolTable symbolTable)
	{
		if ( node.getText().contentEquals("was"))
		{
			String var = node.getChild(0).getText();
			
			if (symbolTable.checkVariableScopeInFunctionInCurrLevel(var))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() 
						+ " Multiple declarations of " + node.getText());
			} else 
			{
				symbolTable.insert(var, new VariableSTValue(var, DATA_TYPES.NUMBER, false));
			}
		
					
		}
		
		if ( node.getText().contentEquals("ate") ||  node.getText().contentEquals("drank"))
		{
			
			
			if (!symbolTable.checkVariableScopeInAllReleventLevels(var, f_name))
			{
				System.out.println(node.getChild(0).getText() + " out of scope.");
			}
			
		}		

		if ( node.getText().contentEquals("became"))
		{
			String var = node.getChild(0).getText();
			String f_name = node.getChild(1).getText();
			
			if (!symbolTable.checkVariableScopeInAllReleventLevels(var, f_name))
			{
				System.err.println("Line "+ node.getLine()+ ": " 
						+ node.getCharPositionInLine() + ": "
						+ var +" out of scope" + node.getText());
			}
			
			
		}
		
	}
	
}
