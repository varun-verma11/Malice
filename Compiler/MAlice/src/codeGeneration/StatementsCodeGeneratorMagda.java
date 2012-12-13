package codeGeneration;

import org.antlr.runtime.tree.Tree;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import codeGeneration.Utils;
import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;

public class StatementsCodeGeneratorMagda {
	
	private static int count = 0;
   
	public static void writeAteCode(Tree node, SymbolTable table, 
			LabelGenerator gen) {
		writeAteAndDrankCode(node, table, gen, "add");
	}
	
	public static void writeDrankCode(Tree node, SymbolTable table, 
			LabelGenerator gen) {
		writeAteAndDrankCode(node, table, gen, "sub");

	}
	
	private static void writeAteAndDrankCode(Tree node, SymbolTable table,
			LabelGenerator gen, String action) {
		String uniqueReg = gen.getUniqueRegisterID();
		String currReg = Utils.getVarReg(node.getChild(0), table, gen);
				//(table.lookup(node.getChild(0).getText())).getLocationReg();
		CodeGenerator.addInstruction(uniqueReg + " = load i32* " + currReg + ", align 4");
		currReg = uniqueReg;
		uniqueReg = gen.getUniqueRegisterID();
		Expression.writeOperationExpressions(uniqueReg, action, currReg, "1");
		currReg = Utils.getVarReg(node.getChild(0), table, gen);
		CodeGenerator.addInstruction("store i32 " + uniqueReg + ", i32* "
				+ currReg + ", align 4");
	}




	public static void writeBecameCode(Tree node, SymbolTable table, 
			LabelGenerator gen) {
		DATA_TYPES type = Utils.getValueType(node.getChild(1), table);
		String currReg = Utils.getVarReg(node.getChild(0), table, gen); 
				//(table.lookup(node.getChild(0).getText())).getLocationReg();

		if (type == DATA_TYPES.LETTER || type == DATA_TYPES.ARRAY_LETTER) {
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
			CodeGenerator.addGlobalInstruction(newLabel + " = private " 
					+ "unnamed_addr constant [" + size + " x i8] c\"" + curr 
					+ "\\00\", " + "align 1");
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
		CodeGenerator.includePrint();
		String uniqueReg = gen.getUniqueRegisterID();
		DATA_TYPES nodeType = Utils.getValueType(node.getChild(0), table);

		if (nodeType == DATA_TYPES.SENTENCE) { 
			sentenceAtNode(node, gen, "print");
			return;
		} else if (nodeType == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction(uniqueReg
					+ " = call i32 (i8*, ...)* @printf(i8* inttoptr (i64 "
					+ (int) node.getChild(0).getText().charAt(1) + " to i8*))");
			return;
		} else if (table.lookup(node.getChild(0).getText())!=null){
			DATA_TYPES type = 
					(table.lookup(node.getChild(0).getText())).getType();
			String currentReg = Utils.getVarReg(node.getChild(0), table, gen); 
					//(table.lookup(node.getChild(0).getText())).getLocationReg();

			if (type == DATA_TYPES.SENTENCE) {
				CodeGenerator.addInstruction(uniqueReg
						+ " = load i8** " + currentReg + ", align 8");
				currentReg = uniqueReg;
				uniqueReg = gen.getUniqueRegisterID();
				CodeGenerator.addInstruction(uniqueReg
						+ " = call i32 (i8*, ...)* @printf(i8* getelementptr " 
						+ "inbounds ([3 x i8]* @.readString, i32 0, i32 0), i8* "
						+ currentReg + ")");
				CodeGenerator.includeReadString();

			} else { 
				CodeGenerator.addInstruction(uniqueReg + " = load "
						+ getType(type) + "* " + currentReg + ", align "
						+ getAlignValue(type));
				currentReg = uniqueReg;
				uniqueReg = gen.getUniqueRegisterID();
				if(type == DATA_TYPES.LETTER){
					CodeGenerator.addInstruction(uniqueReg + " = sext i8 "
						+ currentReg + " to i32");
					currentReg = uniqueReg;
					uniqueReg = gen.getUniqueRegisterID();
					CodeGenerator.addInstruction(uniqueReg
							+ " = call i32 (i8*, ...)* @printf(i8* getelementptr " 
							+ "inbounds ([3 x i8]* @.readChar, i32 0, i32 0), i32 "
							+ currentReg + ")");
					CodeGenerator.includeReadChar();
				} else {
					CodeGenerator.addInstruction(uniqueReg
							+ " = call i32 (i8*, ...)* @printf(i8* getelementptr " 
							+ "inbounds ([3 x i8]* @.readInt, i32 0, i32 0), i32 "
							+ currentReg + ")");
					CodeGenerator.includeReadInt();
				}
			}
			return;
		}
		String currReg = Expression.getResultReg(node.getChild(0), table,gen);
		CodeGenerator.addInstruction(uniqueReg + " = call i32 (i8*, ...)* " 
				+ "@printf(i8* inttoptr (i64 " + currReg + " to i8*))");
	}
	
	private static void sentenceAtNode(Tree node, LabelGenerator gen, String ident) {
		String uniqueReg = gen.getUniqueRegisterID();
		String curr = node.getChild(0).getText();
		curr = curr.substring(1, curr.length()-1);
		int size = curr.length() + 1;
		String newLabel = "@.str_" + count ;
		count++;
		CodeGenerator.addGlobalInstruction(newLabel + " = private " 
				+ "unnamed_addr constant [" + size + " x i8] c\"" 
				+ curr + "\\00\", align 1");
		if(ident.equals("print")) {//EXPENSIVE!!
			CodeGenerator.addInstruction(uniqueReg + " = call i32 (i8*, ...)* "
					+ "@printf(i8* getelementptr inbounds (["
					+ size + " x i8]* " + newLabel
					+ ", i32 0, i32 0))");
		} else {
			CodeGenerator.addInstruction("ret i8* getelementptr inbounds ([" 
					+ size + " x i8*]* " + newLabel + ", i32 0, i32 0");
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


	public static void writeFoundCode(Tree node, SymbolTable table, 
			LabelGenerator gen) {
		DATA_TYPES nodeType = Utils.getValueType(node.getChild(0), table);

		if(nodeType == DATA_TYPES.SENTENCE) {
			sentenceAtNode(node, gen, "ret");

			return;
		} else if (nodeType == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction("ret i8 " 
					+ (int) node.getChild(0).getText().charAt(1));
			return;
		} else if(table.lookup(node.getChild(0).getText())!=null) {
		
			String uniqueReg = gen.getUniqueRegisterID();
			String currentReg = //Utils.getVarReg(node.getChild(0), table, gen); 
					(table.lookup(node.getChild(0).getText())).getLocationReg();
			DATA_TYPES type = 
					(table.lookup(node.getChild(0).getText())).getType();
	
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
			return;
		}
		
		String currentReg = Expression.getResultReg(node.getChild(0), table,gen);
		CodeGenerator.addInstruction("ret i32 " + currentReg);
		
	}

}