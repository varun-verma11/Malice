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
		new ExpressionChecker();
		Tree current = (node.getText()==null)? node.getChild(0) : node ;
		current = StatementChecker.checkAllStatements(current, table);
		System.out.println(current);
		while(current != null)
		{
			System.out.println(current + "in semantic veri");
			current = FunctionSemanticsChecker.checkFunction(current, table);
			current = SemanticsUtils.getNextChild(current);
		}
		if (!table.checkItemIsInCurrentScopeLevel("hatta"))
		{
			System.out.println("ERROR: No hatta function defined " +
					"(Entry point of the program)");
		}
	}
}
