package codeGeneration;

import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;
import symbol_table.SymbolTable;

public class Statement
{
	public static Tree checkAllStatements(Tree node, SymbolTable table,
			LabelGenerator gen)
	{
		Tree current = node;
		boolean end_of_statements = false;
		while (current != null && !end_of_statements)
		{
			end_of_statements = generateStatementCode(current, table, gen);
			if (end_of_statements)
			{
				return current;
			}
			current = SemanticsUtils.getNextChild(current);
		}
		return current;

	}

	private static boolean generateStatementCode(Tree node, SymbolTable table,
			LabelGenerator gen)
	{
		if (node.getText() == null || node.getChildCount() == 0)
		{
			return true;
		}

		if (node.getText().contentEquals("was"))
		{
			writeWAS(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("ate"))
		{
			StatementsCodeGeneratorMagda.writeAteCode(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("drank"))
		{
			StatementsCodeGeneratorMagda.writeDrankCode(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("became"))
		{
			StatementsCodeGeneratorMagda.writeBecameCode(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("spoke")
				|| node.getText().contentEquals("said"))
		{
			StatementsCodeGeneratorMagda.writePrintStatementCode(node, table,
					gen);
			return false;
		} else if (node.getText().contentEquals("what"))
		{
			return false;
		} else if (node.getText().contentEquals("found"))
		{
			StatementsCodeGeneratorMagda.writeFoundCode(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("had"))
		{
			return false;
		} else if (node.getText().contentEquals("perhaps"))
		{
			ControlStructure.writePerhapsStatements(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("either"))
		{
			ControlStructure.writeEitherStatement(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("eventually"))
		{
			ControlStructure.writeEventuallyStatement(node, table, gen);
			return false;
		} else if (node.getText().contentEquals("opened"))
		{
			return false;
		} else if (node.getChildCount() > 2
				&& node.getChild(0).getText().contentEquals("(")
				&& node.getChild(node.getChildCount() - 1).getText()
						.contentEquals(")"))
		{
			// DEAL WITH FUNCTION CALL
			return false;
		}
		return true;
	}

	private static void writeWAS(Tree node, SymbolTable table, LabelGenerator gen) {
		Tree storable = node.getChild(2);
		String arg1 = node.getChild(0).getText();
		String arg2 = node.getChild(1).getText();
		if (table.getCurrentScopeLevel() == 0){
			if (arg2.equals("number")) {
				if (storable!=null){
					CodeGenerator.addInstruction("@"+ arg1 + " = common global i32 " + Expression.getResultReg(storable, table, gen) +", align 4");
				}
				else {
					CodeGenerator.addInstruction("@" + arg1 + " = common global i32 0, align 4");
				}
			}
			else if (arg2.equals("letter")) {
				if (storable!=null){
					CodeGenerator.addInstruction("@"+ arg1 +" = common global i8 "+ (int) (storable.getText().charAt(1)) +", align 1");
				}
				else {
				CodeGenerator.addInstruction("@" + arg1 + " = common global i8 0, align 1");
				}
			}
			else if (arg2.equals("sentence")) {
				if (storable!=null){
					int strLen = storable.getText().length() - 1;
					String effective = storable.getText().substring(1, strLen);
					CodeGenerator.addInstruction(
								"@.at"+arg1+table.getCurrentScopeLevel()+
								" = private unnamed_addr constant ["
								+ strLen +" x i8] c\""
								+ effective + '\\' + "00"+
								"\", align 1"
							, 0);
					CodeGenerator.addInstruction(
							"@"+ arg1
							+" = common global i8* getelementptr inbounds (["
							+ strLen + " x i8]* @.at"
							+ arg1+table.getCurrentScopeLevel() + ", i32 0, i32 0), align 8");
				}
				else {
				CodeGenerator.addInstruction("@"+ arg1 +" = common global i8* null, align 8");
				}
			}
		}
		else {
			if (arg2.equals("number")) {
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i32, align 4");
				if (storable!=null){
					CodeGenerator.addInstruction("store i32 " + Expression.getResultReg(storable, table, gen) 
							+ ", i32* %"+ arg1 +", align 4");
				}
			}
			else if (arg2.equals("letter")) {
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8, align 1");
				if (storable!=null){
					CodeGenerator.addInstruction("store i8 " + (int) (storable.getText().charAt(1)) + ", i8* %" + arg1 + ", align 1");
				}
			}
			else if (arg2.equals("sentence")) {
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8*, align 8");
				if (storable!=null){
					int strLen = storable.getText().length() - 1;
					String effective = storable.getText().substring(1, strLen);
					CodeGenerator.addInstruction(
							"@.at"+arg1+table.getCurrentScopeLevel()+
							" = private unnamed_addr constant ["
							+ strLen +" x i8] c\""
							+ effective + '\\' + "00"+
							"\", align 1"
						, 0);
					CodeGenerator.addInstruction(
							"store i8* getelementptr inbounds (["
							+ strLen +" x i8]* @.at"+ arg1
							+ table.getCurrentScopeLevel() 
							+ ", i32 0, i32 0), i8** %"
							+ arg1 +", align 8");
					
				}
			}
		}
	}
}
