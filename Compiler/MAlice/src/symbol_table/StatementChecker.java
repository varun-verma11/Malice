package symbol_table;

import org.antlr.runtime.tree.Tree;

public class StatementChecker {
	
	public static void checkStatement(Tree node)
	{
		if ( node.getText().contentEquals("was"))
		{
			if (!checkVarInScope(node.getChild(0).getText(), symbolTable))
			{
				//add this var to ur table
			}
			
			
		}
	}
}
