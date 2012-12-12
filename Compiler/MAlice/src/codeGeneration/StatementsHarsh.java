package codeGeneration;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;
import symbol_table.DATA_TYPES;


public class StatementsHarsh {

	public static void getStatement(Tree node, SymbolTable table){

		STATEMENT stat = getKEY(node.getText());

		String arg1 = node.getChild(0).getText();
		String arg2 = node.getChild(1).getText();
		String arg3 = node.getChild(2).getText();
		switch(stat)
		{
		case WAS: 
			System.out.println(arg1);
			System.out.println(arg2);
			System.out.println(arg3);
			writeWAS(arg1, arg2, node.getChild(2), table);
			break;

//		case HAD:
//			writeHAD(arg1, node.getChild(1), arg3, table);
//			break;

//		case WHAT:
//			writeWHAT(arg1, node.getChild(0), table);
//			break;
		}

	}


	private static void writeWHAT(String arg1, Tree child, SymbolTable table, LabelGenerator gen) {
		if (child.getChildCount() == 0){
			
			VariableSTValue v = (VariableSTValue) table.lookup(arg1);
			
			if (v.getType() == DATA_TYPES.NUMBER) {
				String regId1 = gen.getUniqueLabel();
				CodeGenerator.addInstruction(regId1 + " = load i32* %" + arg1 + ", align 4");
				String regId2 = gen.getUniqueLabel();
				CodeGenerator.addInstruction(regId2 + " = call i32 (i8*, ...)* @scanf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32 %1");
				CodeGenerator.includeRead();
			}
			
			else if (v.getType() == DATA_TYPES.LETTER) {
				String regId1 = gen.getUniqueLabel();
				CodeGenerator.addInstruction(regId1 + " = load i32* %" + arg1 + ", align 4");
				 
			}
			
			if (v.getType() == DATA_TYPES.SENTENCE) {
				
			}
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

	private static void writeWAS(String arg1, String arg2, Tree storable, SymbolTable table, LabelGenerator gen) {
		if (table.getCurrentScopeLevel() == 0){
			if (arg2.equals("number")) {
				if (storable!=null ){
					CodeGenerator.addInstruction("@"+ arg1 + " = global i32 " + Expression.getResultReg(storable, table, gen) + ", align 4");
				}
				else {
					CodeGenerator.addInstruction("@" + arg1 + " = global i32 0, align 4");
				}
			}
			else if (arg2.equals("letter")) {
				if (!storable.equals(null) ){
					CodeGenerator.addInstruction("@"+ arg1 +" = global i8 "+ (int) (storable.getText().charAt(1)) +", align 1");
				}
				else {
					CodeGenerator.addInstruction("@" + arg1 + " = global i8 0, align 1");
				}
			}
			else if (arg2.equals("sentence")) {
				if (!storable.equals(null) ){
					int strLen = storable.getText().length() - 1;
					String effective = storable.getText().substring(1, strLen);
					System.out.println(effective);
					CodeGenerator.addInstruction(
								"@.at"+arg1+table.getCurrentScopeLevel()+
								" = private unnamed_addr constant ["
								+ strLen +" x i8] c\""
								+ effective + '\\' + "00"+
								"\", align 1"
							, 0);
					CodeGenerator.addInstruction(
							"@"+ arg1 
							+" = global i8* getelementptr inbounds (["
							+ strLen + " x i8]* @.at"
							+ arg1+table.getCurrentScopeLevel() + ", i64 0, i64 0), align 8");
				}
				else {
				CodeGenerator.addInstruction("@"+ arg1 +" = common global i8* null, align 8");
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
				int strLen = storable.getText().length() - 1;
				String effective = storable.getText().substring(1, strLen);
				System.out.println(effective);
				CodeGenerator.addInstruction("%" + arg1 + " = alloca i8*, align 8");
				if (!storable.equals(null) ){
					CodeGenerator.addInstruction("@.at"+arg1+" = private unnamed_addr constant [4 x i8] c\""
							+ storable.getText() +"\00\", align 1", 0);
					CodeGenerator.addInstruction("store i8* getelementptr inbounds ([" + strLen + " x i8]* @.at"
							+ arg1 + table.getCurrentScopeLevel() + ", i32 0, i32 0), i8** %"+ arg1 +", align 8)");
				}
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