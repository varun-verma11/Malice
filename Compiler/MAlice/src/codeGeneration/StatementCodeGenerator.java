package codeGeneration;

import java.util.ArrayDeque;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;

public class StatementCodeGenerator {

	public static void getStatement(Tree node, SymbolTable table){

		STATEMENT stat = getKEY(node.getText());

		String arg1 = node.getChild(0).getText();
		String arg2 = node.getChild(1).getText();
		String arg3 = node.getChild(2).getText();

		switch(stat)
		{
		case WAS: 
			writeWAS(arg1, arg2, node.getChild(2), table);
			break;

//		case HAD:
//			writeHAD(arg1, node.getChild(1), arg3, table);
//			break;

		case WHAT: 
			break;
		}

	}

//	private static void writeHAD(String arg1, Tree exp, String arg3,
//			SymbolTable table) {
//		if (table.getCurrentScopeLevel() == 0){
//			if (arg3.equals("number")) {
//				CodeGenerator.addInstruction("@" + arg1
//						+ " = global ["+ Expression.getResultReg(exp, table)
//						+ " x i32] zeroinitializer, align 16)");
//				}
//				
//			}
//			else if (arg3.equals("letter")) {
//				CodeGenerator.addInstruction("@"+ arg1 + "  = global [" + Expression.getResultReg(exp, table) + " x i8] zeroinitializer, align 1)");
//				
//			}
//			else if (arg3.equals("sentence")) {
//				CodeGenerator.addInstruction("@"+ arg1 + "  = global [" + Expression.getResultReg(exp, table) + " x i8*] zeroinitializer, align 16");
//			}
//		
//		else {
//			if (arg3.equals("number")) {
//				CodeGenerator.addInstruction("%" + arg1 + " = alloca ["+ Expression.getResultReg(exp, table) + " x i32], align 16)";
//				}
//			else if (arg3.equals("letter")) {
//				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8, align 1");
//			}
//			else if (arg3.equals("sentence")) {
//				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8*, align 8");
//				if (!arg3.equals(null) ){
////					writeAssign(arg3, )
//				}
//			}
//		}
//	}

	private static void writeWAS(String arg1, String arg2, Tree storable, SymbolTable table) {
		if (table.getCurrentScopeLevel() == 0){
			if (arg2.equals("number")) {
				if (!storable.equals(null) ){
					CodeGenerator.addInstruction("@"+ arg1 + " = global i32 " + Expression.getResultReg(storable, table) +", align 4");
				}
				else {
					CodeGenerator.addInstruction("@" + arg1 + " = global i32 0, align 4");
				}
			}
			else if (arg2.equals("letter")) {
				if (!storable.equals(null) ){
					CodeGenerator.addInstruction("@"+ arg1 +" = global i8 "+ (int) (storable.getText().charAt(0)) +", align 1");
				}
				else {
				CodeGenerator.addInstruction("@" + arg1 + " = global i8 0, align 1");
				}
			}
			else if (arg2.equals("sentence")) {
				if (!storable.equals(null) ){
//					CodeGenerator.addInstruction("@.str = private unnamed_addr constant [4 x i8] c"abc\00", align 1");
				}
				else {
				CodeGenerator.addInstruction("@"+ arg1 +" = global i8* null, align 8");
				}
			}
		}
		else {
			if (arg2.equals("number")) {
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i32, align 4");
				if (!storable.equals(null) ){
					CodeGenerator.addInstruction("store i32" + Expression.getResultReg(storable, table) 
							+ ", i32* %"+ arg1 +", align 4");
				}
			}
			else if (arg2.equals("letter")) {
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8, align 1");
				if (!storable.equals(null) ){
					CodeGenerator.addInstruction("store i8 " + (int) (storable.getText().charAt(0)) + ", i8* %" + arg1 + ", align 1");
				}
			}
			else if (arg2.equals("sentence")) {
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8*, align 8");
//				if (!storable.equals(null) ){
//					CodeGenerator.addInstruction("store i32" + storable.getText()
//							+ ", i32* %"+ arg1 +", align 4");
				}
			}
		}
	


	private static STATEMENT getKEY(String s){
		if (s.contentEquals("was")) return STATEMENT.WAS;
		if (s.contentEquals("had")) return STATEMENT.HAD;
		if (s.contentEquals("what")) return STATEMENT.WHAT;
		return null;		
	}

	private enum STATEMENT{
		WAS, HAD, WHAT
	}
}