package codeGeneration;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;

public class ControlStructure
{
	public static void writeEitherStatement(Tree node, SymbolTable table)
	{
		
		String boolExp = Expression.getResultReg(node.getChild(0), table);
		try {
			int bool = Integer.parseInt(boolExp);
			
			
			
			return ;
		} catch ( NumberFormatException e) {
			
		}
		String lblThen = CodeGenerator.getUniqueLabel();
		int brInsIndex = CodeGenerator.getNumberOfInstructions();
		int[] endIfLblInserts = new int[2];
		CodeGenerator.addInstruction("; <label>:"+lblThen.substring(1));
		//DO ALL STATEMENTS
		String temp = Expression.getResultReg(node.getChild(1).getChild(1), table);
		//DO ALL STATEMENTS
		endIfLblInserts[0] = CodeGenerator.getNumberOfInstructions();
		String lblElse = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction("; <label>:"+lblElse.substring(1));
		//DO ALL STATEMENTS
		temp = Expression.getResultReg(node.getChild(3).getChild(1), table);
		//DO ALL STATEMENTS
		endIfLblInserts[1] = CodeGenerator.getNumberOfInstructions();
		String lblEndIf = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction("; <label>:"+ lblEndIf);
		CodeGenerator.addInstruction("br label " + lblEndIf, endIfLblInserts[1]);
		CodeGenerator.addInstruction("br label " + lblEndIf, endIfLblInserts[0]);
		CodeGenerator.addInstruction("br il " + boolExp + ", label " 
				+ lblThen + ", label " + lblElse, brInsIndex);
	}
}
