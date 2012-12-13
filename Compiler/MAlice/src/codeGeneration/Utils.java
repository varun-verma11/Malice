package codeGeneration;

import org.antlr.runtime.tree.Tree;

import semantics_checks.ArrayElemCheck;
import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;

public class Utils
{

	public static DATA_TYPES getValueType(Tree node, SymbolTable symbolTable)
	{
		char firstChar = node.getText().charAt(0);
		if (node.getText().contentEquals("piece"))
		{
			return ArrayElemCheck.checkArrayElem(node, symbolTable);
		} else if (firstChar == '\'')
		{
			return DATA_TYPES.LETTER;
		} else if (firstChar == '\"')
		{
			return DATA_TYPES.SENTENCE;
		} else
		{
			return DATA_TYPES.NUMBER;
		}
	}

	public static String getReturnTypeOfFunction(DATA_TYPES type)
	{

		switch (type)
		{
			case NUMBER:
				return "i32";
			case LETTER:
				return "i8";
			case SENTENCE:
				return "i8*";
		}
		return null;
	}

	public static String getVarReg(Tree node, SymbolTable table, LabelGenerator gen)
	{
		if (node.getText().contentEquals("piece"))
		{
			VariableSTValue val = (VariableSTValue) table.lookup(node.getChild(
					0).getText());
			try
			{
				String res = 
					Expression.getResultReg(node.getChild(1), table, gen);
				int index = Integer.parseInt(res);
				String uniqueId = gen.getUniqueLabel();
				CodeGenerator.addInstruction( uniqueId + " = getelementptr inbounds [" + val.getArraySize() + " x "
						+ getArrayTypeSize(val.getType()) + "]* "
						+ val.getLocationReg() + ", "
						+ getArrayTypeSize(val.getType()) + " 0, i64 " + index);
				return uniqueId;
			} catch (NumberFormatException e)
			{	}
			String uniqueId = gen.getUniqueLabel();
			CodeGenerator.addInstruction(uniqueId + " = load " 
					+ "i32* " + getVarReg(node, table, gen)
					+ "align 4"
					);
			String prevId = uniqueId;
			uniqueId = gen.getUniqueLabel();
			CodeGenerator.addInstruction(uniqueId 
					+ " = sext i32 " + prevId
					+ " to i64"
					);
			prevId = uniqueId;
			uniqueId = gen.getUniqueLabel();
			CodeGenerator.addInstruction(uniqueId
					+ " = getelementptr inbounds ["
					+ val.getArraySize() 
					+ " x "
					+ getArrayTypeSize(val.getType())
					+ " ]*"
					+ val.getLocationReg()
					+ ", i32 0, i64 %4" 
					);
			return uniqueId;
			
		}
		return table.lookup(node.getText()).getLocationReg();
	}

	private static String getArrayTypeSize(DATA_TYPES type)
	{
		switch (type)
		{
			case ARRAY_NUMBER:
				return "i32";
			case ARRAY_LETTER:
				return "i8";
			case ARRAY_SENTENCE:
				return "i8*";
		}
		return null;
	}

}
