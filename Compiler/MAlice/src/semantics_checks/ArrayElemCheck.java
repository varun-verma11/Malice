package semantics_checks;

import malice_grammar.SemanticVerifier;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import symbol_table.SymbolTableValue;

public class ArrayElemCheck
{
	/**
	 * Checks semantics errors in array declaration and initialisation
	 * 
	 * @param node				Current node
	 * @param symbol_table		Current Symbol-Table
	 * @return					
	 */
	public static DATA_TYPES checkArrayElem(Tree node, SymbolTable symbol_table)
	{
		if (!symbol_table
				.checkItemWasDeclaredBefore(node.getChild(0).getText()))
		{
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getChild(1).getLine() + ": "
					+ node.getChild(1).getCharPositionInLine() + ": Array "
					+ node.getChild(1).getText() + " is not defined.");
		}
		if (ExpressionChecker.getExpressionType(node.getChild(1), symbol_table) != DATA_TYPES.NUMBER)
		{
			SemanticVerifier.failed = true;
			System.err.println("Line " + node.getChild(1).getLine() + ": "
					+ node.getChild(2).getCharPositionInLine() + ": Array's "
					+ " index is not of type number.");
		}
		SymbolTableValue val = symbol_table.lookup(node.getChild(0).getText());
		if (val != null)
		{
			if (!val.getType().toString().contains("ARRAY_")) {
				SemanticVerifier.failed = true;
				System.err.println("Line: " + node.getChild(0).getLine() + ": "
						+ node.getChild(0).getCharPositionInLine() + ": Variable "
						+ node.getChild(0).getText() + " is not an array.");
				return DATA_TYPES.ERROR;
			}
			return DATA_TYPES.valueOf(val.getType().toString().substring("array_".length()));
		}
		return null;
	}
}
