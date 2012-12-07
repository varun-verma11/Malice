package codeGeneration;

import java.util.ArrayDeque;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;

public class StatementCodeGenerator {
	
	public static void getStatement(Tree node, SymbolTable table){
		
		STATEMENT stat = getStatement(node.getText());
		
		String arg1 = node.getChild(0).getText();
		String arg2 = node.getChild(1).getText();
		String arg3 = node.getChild(2).getText();
		
		String uniqueRegisterID = CodeGenerator.getUniqueRegisterID();
		
		switch(stat)
		{
			case WAS: 
				writeWAS(uniqueRegisterID, "was", arg1, arg2);
				break;
			
			case HAD: 
				break;
			
			case WHAT: 
				 break;
		}
		
	}
	
	private static void writeWAS(String uniqueRegisterID, String arg1, String arg2, String arg3) {
		if (arg2.equals("number")) {
			CodeGenerator.addInstruction("%" + arg1 + " = alloca i32, align 4");
		}
		if (arg2.equals("letter")) {
			CodeGenerator.addInstruction("%" + arg1 + " = alloca i8, align 1");
		}
		if (arg2.equals("sentence")) {
			CodeGenerator.addInstruction("%" + arg1 + " = alloca i8*, align 8");
		}
	}
	

	private static STATEMENT getStatement(String s){
		if (s.contentEquals("was")) return STATEMENT.WAS;
		if (s.contentEquals("had")) return STATEMENT.HAD;
		if (s.contentEquals("what")) return STATEMENT.WHAT;
		return null;		
	}

	private enum STATEMENT{
		WAS, HAD, WHAT
	}
}