package malice_grammar;

import org.antlr.runtime.tree.Tree;

import symbol_table.ExpressionChecker;
import symbol_table.SymbolTable;


public class SemanticVerifier 
{
	public static void checkProgramSemantics(Tree node, SymbolTable table)
	{
		Tree current = node ;
		new ExpressionChecker();
		//check for global statements
		
		//current = StatementChecker.checkAllStatements(node, table) ;
		
	}
}
