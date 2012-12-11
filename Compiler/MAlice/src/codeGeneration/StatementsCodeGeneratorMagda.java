package codeGeneration;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;

public class StatementsCodeGeneratorMagda {
	
	private static int count = 0;
	
	public static void writeAteCode(Tree node, SymbolTable table, LabelGenerator gen) {
		String tempReg = gen.getUniqueRegisterID();
		String currReg = (table.lookup(node.getChild(0).getText())).getLocationReg();
		Expression.writeOperationExpressions(tempReg, "add", currReg, "1");
		CodeGenerator.addInstruction("store i32 " + tempReg + ", i32* "
				+ currReg + ", align 4");

	}

	public static void writeDrankCode(Tree node, SymbolTable table, LabelGenerator gen) {
		String tempReg = gen.getUniqueRegisterID();
		String currReg = (table.lookup(node.getChild(0).getText())).getLocationReg();
		Expression.writeOperationExpressions(tempReg, "sub", currReg, "1");
		CodeGenerator.addInstruction("store i32 " + tempReg + ", i32* "
				+ currReg + ", align 4");
	}

	public static void writeBecameCode(Tree node, SymbolTable table, LabelGenerator gen) {
		DATA_TYPES type = Utils.getValueType(node.getChild(1), table);
		String currReg = (table.lookup(node.getChild(0).getText())).getLocationReg();

		if (type == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction("store i8 "
					+ (int) node.getChild(1).getText().charAt(1) + ", i8* "
					+ currReg + ", align 1");
		} else if (type == DATA_TYPES.SENTENCE) {
			String curr = node.getChild(1).getText();
			curr = curr.substring(1, curr.length()-1);
			int size = curr.length() + 1;
			//set string size, needed in print statements
			(table.lookup(node.getChild(0).getText())).setStringSize(size);
			String newLabel = "@." + node.getChild(0).getText() + "_" + count ;
			count++;
			CodeGenerator.addInstruction(newLabel + " = private unnamed_addr "
					+ "constant [" + size + " x i8] c\"" + curr + "\\00\", "
					+ "align 1",0);
			CodeGenerator.addInstruction("store i8* getelementptr inbounds ([" 
					+ size + " x i8]* " + newLabel + ", i32 0, i32 0), i8** " 
					+ currReg + ", align 8");
		} else {
			CodeGenerator.addInstruction("store i32 "
					+ Expression.getResultReg(node.getChild(1), table,gen)
					+ ", i32* " + currReg + ", align 4");
		}
	}
	
	public static void writePrintStatementCode(Tree node, SymbolTable table
			, LabelGenerator gen) {
		String uniqueReg = gen.getUniqueRegisterID();
		//String currentReg = (table.lookup(node.getChild(0).getText())).getLocationReg();
		DATA_TYPES nodeType = Utils.getValueType(node.getChild(0), table);
		//DATA_TYPES type = (table.lookup(node.getChild(0).getText())).getType();

		if (nodeType == DATA_TYPES.SENTENCE) { 
			String curr = node.getChild(0).getText();
			curr = curr.substring(1, curr.length()-1);
			int size = curr.length() + 1;
			String newLabel = "@.str_" + count ;
			count++;
			CodeGenerator.addInstruction(newLabel + " = private unnamed_addr "
					+ "constant [" + size + " x i8] c\"" + curr + "\\00\", "
					+ "align 1",0);
			CodeGenerator.addInstruction(uniqueReg + " = call i32 (i8*, ...)* "
					+ "@printf(i8* getemelentptr inbounds (["
					+ size + " x i8]* " + newLabel
					+ ", i32 0, i32 0))");
			CodeGenerator.includePrint();
		} else if (nodeType == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction(uniqueReg
					+ " = call i32 (i8*, ...)* @printf(i8* inttoptr (i64 "
					+ (int) node.getChild(0).getText().charAt(1) + " to i8*))");
		} else if (nodeType == DATA_TYPES.NUMBER) {
			String currReg = Expression.getResultReg(node.getChild(0), table,gen);
			CodeGenerator.addInstruction(uniqueReg + " = call i32 (i8*, ...)* " 
					+ "@printf(i8* inttoptr (i64 " + currReg + " to i8*))");
			
		} else {
			DATA_TYPES type = (table.lookup(node.getChild(0).getText())).getType();
			String currentReg = (table.lookup(node.getChild(0).getText())).getLocationReg();

			if (type == DATA_TYPES.SENTENCE) {
				CodeGenerator.addInstruction(uniqueReg
						+ " = load i8** " + currentReg + ", align 8");//is this right?
				CodeGenerator.includePrint();

			} else { // numbers and letters

				CodeGenerator.addInstruction(uniqueReg + " = load "
						+ getType(type) + "* " + currentReg + ", align "
						+ getAlignValue(type));
				currentReg = uniqueReg;
				uniqueReg = gen.getUniqueRegisterID();
				CodeGenerator.addInstruction(uniqueReg + " = sext "
						+ getType(type) + " " + currentReg + " to i64");
				currentReg = uniqueReg;
				uniqueReg = gen.getUniqueRegisterID();
				CodeGenerator.addInstruction(uniqueReg + " = inttoptr i64 "
						+ currentReg + " to i8*");
			}

			currentReg = uniqueReg;
			uniqueReg = gen.getUniqueRegisterID();
			CodeGenerator.addInstruction(uniqueReg
						+ " = call i32 (i8*, ...)* @printf(i8* "
						+ currentReg + ")");
		}

	}

	private static String getAlignValue(DATA_TYPES type) {
		if (type == DATA_TYPES.LETTER) {
			return "1";
		} else if (type == DATA_TYPES.NUMBER) {
			return "4";
		}
		return null;
	}

	private static String getType(DATA_TYPES type) {
		if (type == DATA_TYPES.LETTER) {
			return "i8";
		} else if (type == DATA_TYPES.NUMBER) {
			return "i32";
		}
		return null;
	}


	public static void writeFoundCode(Tree node, SymbolTable table, LabelGenerator gen) {
		String uniqueReg = gen.getUniqueRegisterID();
		String currentReg = (table.lookup(node.getChild(0).getText())).getLocationReg();
		DATA_TYPES type = (table.lookup(node.getChild(0).getText())).getType();

		if (type == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction(uniqueReg + " = load i8* "
					+ currentReg + ", align 1");
			currentReg = uniqueReg;
			uniqueReg = gen.getUniqueRegisterID();
			CodeGenerator.addInstruction(uniqueReg + " = sext i8 " 
					+ currentReg + " to i32");
			CodeGenerator.addInstruction("ret i32 " + uniqueReg);
		} else if (type == DATA_TYPES.SENTENCE) {
			CodeGenerator.addInstruction(uniqueReg + " = load i8** "
					+ currentReg + ", align 8");
			currentReg = uniqueReg;
			uniqueReg = gen.getUniqueRegisterID();
			CodeGenerator.addInstruction(uniqueReg + " = ptrtoint i8* " 
					+ currentReg + " to i32");
			CodeGenerator.addInstruction("ret i32 " + uniqueReg);
		} else {
			CodeGenerator.addInstruction(uniqueReg + " = load i32* "
					+ currentReg + ", align 4");
			CodeGenerator.addInstruction("ret i32 " + uniqueReg);
		}
	}

}