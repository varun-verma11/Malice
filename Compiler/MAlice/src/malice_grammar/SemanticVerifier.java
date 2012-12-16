package malice_grammar;

import org.antlr.runtime.tree.Tree;

import semantics_checks.ExpressionChecker;
import semantics_checks.FunctionSemanticsChecker;
import semantics_checks.SemanticsUtils;
import semantics_checks.StatementChecker;
import symbol_table.SymbolTable;


public class SemanticVerifier 
{
	public static boolean failed = false;
	public static void checkProgramSemantics(Tree node, SymbolTable table)
	{
		new ExpressionChecker();
		Tree current = (node.getText()==null)? node.getChild(0) : node ;
		current = SemanticsUtils.skipImports(current);
		current = StatementChecker.checkAllStatements(current, table);
		while(current != null)
		{
			current = FunctionSemanticsChecker.checkFunction(current, table);
			//current = StatementChecker.checkAllStatements(current, table);
			current = SemanticsUtils.getNextChild(current);
		}
		if (table.checkItemIsInCurrentScopeLevel("hatta"))
		{
			if (table.lookup("hatta").getType()!=null)
			{
				failed = true;
				System.err.println("Error: The main procedure hatta defined " +
						"as a function.");
			}
		} else 
		{
			failed = true;
			System.err.println("ERROR: No hatta function defined " +
			"(Entry point of the program)");
		}
	}
}
