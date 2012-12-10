package codeGeneration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;
import symbol_table.SymbolTable;

public class ControlStructure
{
	public static void writeEitherStatement(Tree node, SymbolTable table, LabelGenerator gen)
	{
		String boolExp = Expression.getResultReg(node.getChild(0), table,gen);
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

		String lblThen = gen.getUniqueLabel();
		int brInsIndex = CodeGenerator.getNumberOfInstructions();
		int[] endIfLblInserts = new int[2];
		CodeGenerator.addInstruction(getLabel(lblThen));
		// DO ALL STATEMENTS
		@SuppressWarnings("unused")
		String temp = Expression.getResultReg(node.getChild(1).getChild(1),
				table, gen);
		// DO ALL STATEMENTS
		endIfLblInserts[0] = CodeGenerator.getNumberOfInstructions();
		String lblElse = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(lblElse));
		// DO ALL STATEMENTS
		temp = Expression.getResultReg(node.getChild(3).getChild(1), table, gen);
		// DO ALL STATEMENTS
		endIfLblInserts[1] = CodeGenerator.getNumberOfInstructions();
		String lblEndIf = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(lblEndIf));
		CodeGenerator
				.addInstruction(getBranchIns(lblEndIf), endIfLblInserts[1]);
		CodeGenerator
				.addInstruction(getBranchIns(lblEndIf), endIfLblInserts[0]);
		CodeGenerator.addInstruction(getConditionalBranchIns(boolExp, lblThen,
				lblElse), brInsIndex);
	}

	public static void writeEventuallyStatement(Tree node, SymbolTable table,LabelGenerator gen)
	{
		String startLbl = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getBranchIns(startLbl));
		CodeGenerator.addInstruction(getLabel(startLbl));
		String boolExp = Expression.getResultReg(node.getChild(0), table, gen);
		// try{
		// int bool = Integer.parseInt(boolExp);
		// if (bool==0) return;
		// } catch (NumberFormatException e) { }
		int brInsIndex = CodeGenerator.getNumberOfInstructions();
		String loop = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(loop));
		// DO ALL STATEMENTSS
		Expression.getResultReg(node.getChild(1).getChild(1), table, gen);
		// DO ALL STATEMENTSS
		CodeGenerator.addInstruction(getBranchIns(startLbl));
		String endLoop = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(endLoop));
		CodeGenerator.addInstruction(getConditionalBranchIns(boolExp, loop,
				endLoop), brInsIndex);
	}

	public static void writePerhapsStatements(Tree node, SymbolTable table, LabelGenerator gen)
	{
		String bool_exp = Expression.getResultReg(node.getChild(0), table, gen);
		ArrayList<Integer> endIfInserts = new ArrayList<Integer>();
		int brInsert = CodeGenerator.getNumberOfInstructions();
		String startLbl = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(startLbl));
		// DO ALL STATEMENTS
		CodeGenerator.addInstruction("Statements being done here.");
		// DO ALL STATEMENTS
		endIfInserts.add(CodeGenerator.getNumberOfInstructions());
		String endLbl = gen.getUniqueLabel();
		CodeGenerator.addInstruction(getLabel(endLbl));
		// STATEMENT CHECK TO RETURN THE VALID CHILD
		Tree current = node.getChild(2);
		// ONLY CASE FOR TEST CASES
		while (current != null && current.getText().contentEquals("maybe"))
		{
			CodeGenerator.addInstruction(getConditionalBranchIns(bool_exp,
					startLbl, endLbl), brInsert);
			current = SemanticsUtils.getNextChild(current);
			bool_exp = Expression.getResultReg(current, table, gen);
			brInsert = CodeGenerator.getNumberOfInstructions();
			startLbl = gen.getUniqueLabel();
			CodeGenerator.addInstruction(getLabel(startLbl));
			// DO ALL STATEMENTS
			CodeGenerator.addInstruction("Statements being done here.");
			current = SemanticsUtils.getNextChild(SemanticsUtils
					.getNextChild(current));
			// DO ALL STATEMENTS
			endIfInserts.add(CodeGenerator.getNumberOfInstructions());
			endLbl = gen.getUniqueLabel();
			CodeGenerator.addInstruction(getLabel(endLbl));
		}

		CodeGenerator.addInstruction(getConditionalBranchIns(bool_exp,
				startLbl, endLbl), brInsert);
		String endIf;
		if (current != null && current.getText().contentEquals("or"))
		{
			current = SemanticsUtils.getNextChild(current);
			// DO ALL STATEMENTS
			CodeGenerator.addInstruction("Statements being done here.");
			// DO ALL STATEMENTS
			endIf = gen.getUniqueLabel();
			CodeGenerator.addInstruction(getLabel(endIf));
		} else
		{
			endIf = gen.getUniqueLabel();
			CodeGenerator.addInstruction(getLabel(endIf));
		}
		String endIfIns = getBranchIns(endIf);
		for (int i = endIfInserts.size() - 1; i >= 0; i--)
		{
			CodeGenerator.addInstruction(endIfIns, endIfInserts.get(i) + 1);
		}

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