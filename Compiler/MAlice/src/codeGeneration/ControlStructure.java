package codeGeneration;

import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;
import symbol_table.SymbolTable;

public class ControlStructure
{
	public static void writeEitherStatement(Tree node, SymbolTable table)
	{
		String boolExp = Expression.getResultReg(node.getChild(0), table);
		try
		{
			int bool = Integer.parseInt(boolExp);

			if (bool == 1)
			{
				// code for then case only
				// Do all statements then skip to end of either
				return;
			} else
			{
				// code for else case only
				Tree current = node;
				while (current.getText().contentEquals("or"))
				{
					current = SemanticsUtils.getNextChild(current);
				}
				current = SemanticsUtils.getNextChild(current);
				// Do all statements then skip to end of either
				return;
			}
		} catch (NumberFormatException e)
		{
		}

		String lblThen = CodeGenerator.getUniqueLabel();
		int brInsIndex = CodeGenerator.getNumberOfInstructions();
		int[] endIfLblInserts = new int[2];
		CodeGenerator.addInstruction(getLabel(lblThen));
		// DO ALL STATEMENTS
		@SuppressWarnings("unused")
		String temp = Expression.getResultReg(node.getChild(1).getChild(1),
				table);
		// DO ALL STATEMENTS
		endIfLblInserts[0] = CodeGenerator.getNumberOfInstructions();
		String lblElse = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(lblElse));
		// DO ALL STATEMENTS
		temp = Expression.getResultReg(node.getChild(3).getChild(1), table);
		// DO ALL STATEMENTS
		endIfLblInserts[1] = CodeGenerator.getNumberOfInstructions();
		String lblEndIf = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(lblEndIf));
		CodeGenerator
				.addInstruction(getBranchIns(lblEndIf), endIfLblInserts[1]);
		CodeGenerator
				.addInstruction(getBranchIns(lblEndIf), endIfLblInserts[0]);
		CodeGenerator.addInstruction(getConditionalBranchIns(boolExp, lblThen, lblElse), brInsIndex);
	}

	public static void writeEventuallyStatement(Tree node, SymbolTable table)
	{
		String startLbl = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction(getBranchIns(startLbl));
		CodeGenerator.addInstruction(getLabel(startLbl));
		String boolExp = Expression.getResultReg(node.getChild(0), table);
//		try{
//			int bool = Integer.parseInt(boolExp);
//			if (bool==0) return;
//		} catch (NumberFormatException e) { }
		int brInsIndex = CodeGenerator.getNumberOfInstructions();
		String loop = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(loop));
		//DO ALL STATEMENTSS
		@SuppressWarnings("unused")
		String temp = Expression.getResultReg(node.getChild(1).getChild(1), table);
		//DO ALL STATEMENTSS
		CodeGenerator.addInstruction(getBranchIns(startLbl));
		String endLoop = CodeGenerator.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(endLoop));
		CodeGenerator.addInstruction(getConditionalBranchIns(boolExp, loop,endLoop), brInsIndex);
	}

	private static String getConditionalBranchIns(String boolExp, String reg1,
			String reg2)
	{
		return "br il " + boolExp + ", label " + reg1 + ", label " + reg2;
	}
	
	private static String getBranchIns(String lbl)
	{
		return "br label " + lbl;
	}
	
	private static String getLabel(String lbl)
	{
		return ";<label>:" + lbl.substring(1);
	}
}
