package codeGeneration;


import org.antlr.runtime.tree.Tree;

import semantics_checks.ArrayElemCheck;
import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;

public class Utils {

	public static DATA_TYPES getValueType(Tree node, SymbolTable symbolTable)
	{
		char firstChar = node.getText().charAt(0);
		if(node.getText().contentEquals("piece"))
		{
			return ArrayElemCheck.checkArrayElem(node, symbolTable);
		}else if (firstChar == '\'')
		{
			return DATA_TYPES.LETTER;
		}
		else if (firstChar == '\"')
		{
			return DATA_TYPES.SENTENCE;
		} else 
		{
			return DATA_TYPES.NUMBER;
		}
	}

	public static String getReturnTypeOfFunction(DATA_TYPES type)
	{
		
		switch(type)
		{
			case NUMBER :
				return "i32";
			case LETTER:
				return "i8";
			case SENTENCE:
				return "i8*";
		}
		return null;
	}
	
	public static String getVarReg(Tree node, SymbolTable table)
	{
		
		return null;
	}
}

