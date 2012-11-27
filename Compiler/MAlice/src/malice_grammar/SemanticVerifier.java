package malice_grammar;

import org.antlr.runtime.tree.Tree;

import semantics_checks.FunctionSemanticsChecker;
import symbol_table.ExpressionChecker;
import symbol_table.StatementChecker;
import symbol_table.SymbolTable;


public class SemanticVerifier 
{
	public static void checkProgramSemantics(Tree node, SymbolTable table)
	{
		Tree current = node ;
		new ExpressionChecker();
		current = StatementChecker.checkAllStatements(current, table);
		while(current != null)
		{
			current = FunctionSemanticsChecker.checkFunction(current, table);
		}
	}
}
