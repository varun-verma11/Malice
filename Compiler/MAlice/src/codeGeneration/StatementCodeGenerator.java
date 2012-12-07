package codeGeneration;

import java.util.ArrayDeque;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;

public class StatementCodeGenerator {
	private static int regNumber = 0;
	private static Queue<String> statements = new ArrayDeque<String>();
	
	public static void emptyQueue()
	{
		statements = new ArrayDeque<String>();
		regNumber = 0;
	}
	
	public static String getResultReg(Tree node, SymbolTable table){
		if (node==null) return null;
		if (node.getChildCount()==0) return makeVar(node, table);
		
		
	}
	
	
}
