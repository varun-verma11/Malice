package malice_grammar;

import org.antlr.runtime.tree.Tree;

import semantics_checks.FunctionSemanticsChecker;
import semantics_checks.SemanticsUtils;
import symbol_table.ExpressionChecker;
import symbol_table.StatementChecker;
import symbol_table.SymbolTable;


public class SemanticVerifier 
{
	public static void checkProgramSemantics(Tree node, SymbolTable table)
	{
		Tree current = node.getChild(0) ;
		new ExpressionChecker();
		current = StatementChecker.checkAllStatements(current, table);
		while(current != null)
		{
			current = FunctionSemanticsChecker.checkFunction(current, table);
			current = SemanticsUtils.getNextChild(current);
		}
	}
}
