package symbol_table;

import org.antlr.runtime.tree.Tree;

public class StatementChecker {
	
	public static void checkStatement(Tree node, SymbolTable symbolTable)
	{
		if (node.getText().contentEquals("was"))
		{
			if (!checkVarInScope(node.getChild(0).getText(), symbolTable))
			{
				//add this var to ur table
			}
			
		}
		
		if (node.getText().contentEquals("became"))
		{
			checkIfDataTypeIsInTheRange(node);
			checkIfTypesMatch(node, symbolTable);
			
		}
	}

	private static void checkIfTypesMatch(Tree node, SymbolTable symbolTable) {
		
		((VariableSTValue)symbolTable.lookup(node.getChild(0).getText())).getType();//type x == number
		node.getChild(1)//symTable lookup this node?
		
	}

	private static void checkIfDataTypeIsInTheRange(Tree node) {
		//check and print errors
	}
}
