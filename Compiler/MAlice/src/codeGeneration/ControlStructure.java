package codeGeneration;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;

public class ControlStructure
{
	public static void writeEitherStatement(Tree node, SymbolTable table)
	{
		
		String boolExp = Expression.getResultReg(node.getChild(0), table);
		//HERE ALL STATEMENTS WOULD BE GENERATED.
		
		
	}
}
