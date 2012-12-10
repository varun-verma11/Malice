package codeGeneration;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import codeGeneration.Utils;

public class StatementsCodeGeneratorMagda {

	
	public static void writeAteCode(Tree node, SymbolTable table ) {
		String tempReg = CodeGenerator.getUniqueRegisterID();
		String currReg = setGlobalorLocal(node.getChild(0), table);
		Expression.writeOperationExpressions(tempReg, "add", currReg, "1");
		CodeGenerator.addInstruction("store i32 " + tempReg + ", i32* " + currReg + ", align 4");

	}

	public static void writeDrankCode(Tree node, SymbolTable table) {
		String tempReg = CodeGenerator.getUniqueRegisterID();
		String currReg = setGlobalorLocal(node.getChild(0), table);
		Expression.writeOperationExpressions(tempReg, "sub", currReg, "1");
		CodeGenerator.addInstruction("store i32 " + tempReg + ", i32* " + currReg + ", align 4");
	}

	public static void writeBecameCode(Tree node, SymbolTable table) {
		
		DATA_TYPES type = Utils.getValueType(node.getChild(1), table);
		
		if(type == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction("store i8 " + (int) node.getChild(1).getText().charAt(1)
					+ ", i32* " + setGlobalorLocal(node.getChild(0), table) + ", align 4");
		} else if (type == DATA_TYPES.SENTENCE) {
			
			//%2 = bitcast [8 x i8]* %hi to i8*
			//			  call void @llvm.memcpy.p0i8.p0i8.i64(i8* %2, i8* getelementptr inbounds ([8 x i8]* @main.hi, i32 0, i32 0), i64 8, i32 1, i1 false)
//a potem: declare void @llvm.memcpy.p0i8.p0i8.i64(i8* nocapture, i8* nocapture, i64, i32, i1) nounwind
			CodeGenerator.addInstruction("");
		} else {
			CodeGenerator.addInstruction("store i32 " + Expression.getResultReg(node.getChild(1), table) 
					+ ", i32* " + setGlobalorLocal(node.getChild(0), table) + ", align 4");
		}
	}

	//get num of insrt and add to the bottom
	//add at index 0 for global stuff
	
	private static String setGlobalorLocal(Tree node, SymbolTable table) {
		int currentScope = table.getCurrentScopeLevel();

		if(currentScope == 0) {
			return "@" + node.getText();
		} else {
			return "%" + node.getText();
		}
	}	

	
//Question: x spoke tree looks like spoke --> x but not spoke --> 2 or spoke --> "string".. so i cant use type method here :/
	public static void writePrintStatementCode(Tree node, SymbolTable table) {
		String uniqueReg = CodeGenerator.getUniqueRegisterID();
		String currentReg = setGlobalorLocal(node.getChild(0), table);
		DATA_TYPES type = Utils.getValueType(node.getChild(0), table);	
		
	
		if(true) { // this will be type == DATA_TYPES.SENTENCE once i fix other conditions..
			CodeGenerator.addInstruction(currentReg + " = private unnamed_addr constant [" + sizeOfStringInBytes + " x i8 c\"" + node.getChild(0).getText() + "\00,\", align 1" , 0);
			CodeGenerator.addInstruction(uniqueReg + " = call i32 (i8*, ...)* @printf(i8* getemelentptr inbounds ([" + sizeOfStringInBytes + " x i8]* " + currentReg + ", i32 0, i32 0))");
			CodeGenerator.addInstruction("declare i32 @printf(i8*, ...)", CodeGenerator.getNumberOfInstructions() + 1); // do i need +1 here? depends how size works on array lists...
		} 
		
		else if (type == DATA_TYPES.SENTENCE) {
			CodeGenerator.addInstruction(uniqueReg + " = getelementptr inbounds [" + sizeOfStringInBytes + " x i8]* " + currentReg + ", i32 0, i32 0");
			CodeGenerator.addInstruction("declare i32 @printf(i8*, ...)", CodeGenerator.getNumberOfInstructions() + 1); // do i need +1 here? depends how size works on array lists...
	
		} else {	
			if (type == DATA_TYPES.LETTER) {
				CodeGenerator.addInstruction(uniqueReg + " = load i8 " + currentReg + ", align 1");
				currentReg = uniqueReg;
				uniqueReg = CodeGenerator.getUniqueRegisterID();
				CodeGenerator.addInstruction(uniqueReg + " = sext i8 " + currentReg + "to i64");
			} else if (type == DATA_TYPES.NUMBER) { //AND FOR EXPRESSIONS!!! HAS TO BE THE LAST CASE!!!
				currentReg = Expression.getResultReg(node.getChild(0), table);// does result 
				CodeGenerator.addInstruction(uniqueReg + " = load i32 " + currentReg + ", align 4");
				currentReg = uniqueReg;
				uniqueReg = CodeGenerator.getUniqueRegisterID();
				CodeGenerator.addInstruction(uniqueReg + " = sext i32 " + currentReg + "to i64");
			}
			currentReg = uniqueReg;
			uniqueReg = CodeGenerator.getUniqueRegisterID();
			CodeGenerator.addInstruction(uniqueReg + " = inttoptr i64 " + currentReg + "to i8*");
		}
		
		currentReg = uniqueReg;
		uniqueReg = CodeGenerator.getUniqueRegisterID();
		CodeGenerator.addInstruction(uniqueReg + " = call i32 (i8*, ...)* @printf(i8* " + currentReg + ")");
	}
//Can we have at global level 'x was a sentence' and then at local 'x became "hello"'?? because llvm wont allow it :/
/**
 * IF printf(someArray); works (as op to printf(%s\n, someArray);) then in print sentence bit:
 * 1. add the instr: '@.str = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1'  at the global scope,
 * as a first thing (add(instr, 0);)
 * 2.in the 2nd codeGenerator.add instr change instruction to:  'uniqueReg " = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([" 
 * + sizeOfNewString + " x i8]* " = theNameOfNewString + ", i32 0, 132 0), i8* " + currentReg + ")"' 
 * 
 */



	//atm the test assumes that x is an int so i couldnt check for chars and sentences :/
	public static void writeFoundCode(Tree node, SymbolTable table) {
		String uniqueReg = CodeGenerator.getUniqueRegisterID();
		String currentReg = setGlobalorLocal(node.getChild(0), table);
		DATA_TYPES type = Utils.getValueType(node.getChild(0), table);	

		if (type == DATA_TYPES.LETTER) {
			CodeGenerator.addInstruction(uniqueReg + " = load i8* " + currentReg + ", align 1");
			CodeGenerator.addInstruction("ret i8 " + uniqueReg);
		} else if (type == DATA_TYPES.SENTENCE) {
			CodeGenerator.addInstruction(uniqueReg + " = load i8** " + currentReg + ", align 8");
			CodeGenerator.addInstruction("ret i8* " + uniqueReg);
		} else {
			CodeGenerator.addInstruction(uniqueReg + " = load i32* " + currentReg + ", align 4");
			CodeGenerator.addInstruction("ret i32 " + uniqueReg);
		}
	}

	
	
}