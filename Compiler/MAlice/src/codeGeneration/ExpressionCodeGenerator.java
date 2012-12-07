package codeGeneration;

import java.util.ArrayDeque;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

import symbol_table.SymbolTable;

public class ExpressionCodeGenerator
{
	private static int regNumber =0;
	private static Queue<String> expression = new ArrayDeque<String>();
	
	public static void emptyQueue()
	{
		expression = new ArrayDeque<String>();
		regNumber = 0;
	}
	public static String getResultReg(Tree node, SymbolTable table)
	{
		if (node==null) return null;
		if (node.getChildCount()==0) return makeVar(node, table);
		//AFTER CHECKING FOR NO CHILD
		OPERATOR op = getOperator(node.getText());
		
		//checking for single arity functions would be checked before this point
		String arg1 = getResultReg(node.getChild(0), table);
		String arg2 = getResultReg(node.getChild(1), table);
		String uniqueRegisterID = getUniqueRegisterID();
		switch(op)
		{
			case EQ: 
				writeComparisonStatements(uniqueRegisterID, "eq", arg1, arg2);
				break;
			case ADD:
				writeOperationExpressions(uniqueRegisterID, "add", arg1, arg2);
				break;
			case OR:
				break;
			case AND:
				break;
			case BWOR:
				writeOperationExpressions(uniqueRegisterID, "or", arg1, arg2);
				break;
			case BWXOR:
				writeOperationExpressions(uniqueRegisterID, "xor", arg1, arg2);
				break;
			case BWAND:
				writeOperationExpressions(uniqueRegisterID, "and", arg1, arg2);
				break;
			case NE:
				writeComparisonStatements(uniqueRegisterID, "ne", arg1, arg2);
				break;
			case LTE:
				writeComparisonStatements(uniqueRegisterID, "sle", arg1, arg2);
				break;
			case LT:
				writeComparisonStatements(uniqueRegisterID, "slt", arg1, arg2);
				break;
			case GT:
				writeComparisonStatements(uniqueRegisterID, "sgt", arg1, arg2);
				break;
			case GTE:
				writeComparisonStatements(uniqueRegisterID, "sge", arg1, arg2);
				break;
			case SUB:
				writeOperationExpressions(uniqueRegisterID, "sub", arg1, arg2);
				break;
			case MUL:
				writeOperationExpressions(uniqueRegisterID, "mul", arg1, arg2);
			case DIV:
				writeOperationExpressions(uniqueRegisterID, "sdiv", arg1, arg2);
				break;
			case MOD:
				writeOperationExpressions(uniqueRegisterID, "srem", arg1, arg2);
				break;
			case BWNOT:
				writeOperationExpressions(uniqueRegisterID, "xor", arg1, "-1");
				break;
			case NOT:
				break;
		}
		return uniqueRegisterID;
	}
	
	private static void writeOperationExpressions(String uniqueRegisterID, 
			String operation, String arg1, String arg2)
	{
		expression.add(uniqueRegisterID + " = " + operation + " nsw i32 " 
				+ arg1 + ", " + arg2);
	}
	private static void writeComparisonStatements(String uniqueRegisterID, String operation, String arg1, String arg2)
	{
		expression.add(uniqueRegisterID + " = " + "icmp " + operation + " i32 " 
				+ arg1 + ", " + arg2);
		String prev = uniqueRegisterID;
		uniqueRegisterID = getUniqueRegisterID();
		expression.add(uniqueRegisterID + " = zest il " + prev 
				+ " to i32");
	}
	
	//THIS METHOD IS ONLY FOR TESTING PURPOSES AND HAS TO BE REMOVED FOR FINAL CODE
	public static void printInstructions()
	{
		for (String ins: expression)
		{
			System.out.println(ins);
		}
	}
	
	private static String makeVar(Tree leaf, SymbolTable table)
	{
		if (table.checkItemWasDeclaredBefore(leaf.getText())) 
		{
			//THIS NEEDS TO BE THE NEW METHOD WHICH WOULD RETURN THE NAME OF 
			//THE EXPRESSIONS
			return "@." + leaf.getText();
		}
		return leaf.getText();
	}

	public static String getUniqueRegisterID()
	{
		++regNumber;
		return "%"+regNumber;
	}
	public static String getLocalRegisterID(int reg)
	{
		return "%" + reg;
	}
	
	private static OPERATOR getOperator(String op)
	{
		if (op.contentEquals("==")) return OPERATOR.EQ;
		if (op.contentEquals("&&")) return OPERATOR.AND;
		if (op.contentEquals("|")) return OPERATOR.BWOR;
		if (op.contentEquals("^")) return OPERATOR.BWXOR;
		if (op.contentEquals("!=")) return OPERATOR.NE;
		if (op.contentEquals("<=")) return OPERATOR.LTE;
		if (op.contentEquals("<")) return OPERATOR.LT;
		if (op.contentEquals(">")) return OPERATOR.GT;
		if (op.contentEquals(">=")) return OPERATOR.LTE;
		if (op.contentEquals("+")) return OPERATOR.ADD;
		if (op.contentEquals("-")) return OPERATOR.SUB;
		if (op.contentEquals("*")) return OPERATOR.MUL;
		if (op.contentEquals("/")) return OPERATOR.DIV;
		if (op.contentEquals("%")) return OPERATOR.MOD;
		if (op.contentEquals("~")) return OPERATOR.BWNOT;
		if (op.contentEquals("!")) return OPERATOR.NOT;
		if (op.contentEquals("||")) return OPERATOR.OR;
		if (op.contentEquals("&")) return OPERATOR.BWAND;
		return null;
			
	}
	private enum OPERATOR
	{
		OR, AND, BWOR, BWXOR, BWAND, EQ, NE, LTE, LT, GT, GTE, ADD,
		SUB, MUL, MOD, BWNOT, NOT, DIV
	}
}
