package codeGeneration;

import malice_grammar.malice_grammarParser.expr_return;

import org.antlr.runtime.tree.Tree;

import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.bcel.internal.classfile.Code;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;

public class StatementsCodeGeneratorMagda {

	static SymbolTable table;
	
	public static void writeAteCode(Tree node) {
		String tempReg = CodeGenerator.getUniqueRegisterID();
		String currReg = setGlobalorLocal(node.getChild(0));
		CodeGenerator.addInstruction(tempReg + "add nsw i32 " + currReg + ", 1");
		CodeGenerator.addInstruction("store i32 " + tempReg + ", i32* " + currReg + ", align 4");

	}

	public static void writeDrankCode(Tree node) {
		String tempReg = CodeGenerator.getUniqueRegisterID();
		String currReg = setGlobalorLocal(node.getChild(0));
		CodeGenerator.addInstruction(tempReg + "add nsw i32 " + currReg + ", 1");
		CodeGenerator.addInstruction("store i32 " + tempReg + ", i32* " + currReg + ", align 4");
	}

	public static void writeBecameCode(Tree node) {
		

		String type = node.getChild(1).getText();
		
		if(type.equals("letter")) {
			CodeGenerator.addInstruction("store i8 " + (int) node.getChild(1).getText().charAt(1) + ", i32* " + setGlobalorLocal(node.getChild(0)) + ", align 4");
		} else if(type.equals("number")||type.equals("expr")) {
			CodeGenerator.addInstruction("store i32 " + Expression.getResultReg(node.getChild(1), table) 
					+ ", i32* " + setGlobalorLocal(node.getChild(0)) + ", align 4");
		} else if (type.equals("sentence")) {//%2 = bitcast [8 x i8]* %hi to i8*
//			  call void @llvm.memcpy.p0i8.p0i8.i64(i8* %2, i8* getelementptr inbounds ([8 x i8]* @main.hi, i32 0, i32 0), i64 8, i32 1, i1 false)
//a potem: declare void @llvm.memcpy.p0i8.p0i8.i64(i8* nocapture, i8* nocapture, i64, i32, i1) nounwind
			CodeGenerator.addInstruction("");
		}
	}


	//this should be fine as statementChecker wont allow uninitialised vars.
	private static String setGlobalorLocal(Tree node) {
		int currentScope = table.getCurrentScopeLevel();

		if(currentScope == 0) {
			return "@" + node.getText();
		} else {
			return "%" + node.getText();
		}
	}	
	
//		if (table.checkItemIsInCurrentScopeLevel(node.getText()) && currentScope != 0) {
//			return "@" + node.getText();
//		} 
//		while (currentScope > 0) {
//			curr.finalizeCurrentScopeLevelTable();
//			currentScope--;
//		}
//		if(table.checkItemIsInCurrentScopeLevel(node.getText())) {
//			return "%" + node.getText();
//		}
		


	public static void writePrintStatementCode(Tree node) {
		String str = node.getChild(0).getText();
		//eg x said Alice or k spoke
		//this is for string, need cases for letter, exp, number
		CodeGenerator.addInstruction("@" + CodeGenerator.getUniqueLabel() + " = internal constant [" + str.length() //not sure if getUniqueLbl is theright approach
					+ " x i8] c\"" + str + "\0A\00" );//make sure this is added at global lvl!! +do the method for local
		//at currentscopeLevel we say:
		CodeGenerator.addInstruction("%" + CodeGenerator.getUniqueRegisterID() + " = call i32 @printf( i8* getelementptr ([" + str.length() + " x i8]* @." + CodeGenerator.getUniqueLabel() + ", i32 0,i32 0))");
	}//This is if we print a var btw, not the actual string/val!!

	public static void writeFoundCode(Tree node) {
		CodeGenerator.addInstruction("ret " + generateType(node.getChild(0)) + setGlobalorLocal(node.getChild(0)));
	}

	private static String generateType(Tree child) {
		
		//TO_DO: implemet this, need this for writeFoundCode!!!
		
		
		return null;
	}



	//the other checks
	/**
	 * so in statementChecker in the if statements after the code have fn like
	 * StatementCodeGenertor.generateForAte(node); where generateForAte will be the fn that prints out the LLVM code
	 * for the ate fn.
	 */
	

	
	
	
	
}