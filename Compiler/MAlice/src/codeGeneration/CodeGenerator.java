package codeGeneration;

import java.util.ArrayList;

public class CodeGenerator
{
	private static ArrayList<String> instructions = new ArrayList<String>();
	private static int regNumber = 0;
	private static int identLevel = 0;
	public static void addInstruction(String ins)
	{
		instructions.add(getIdent() + ins);
	}
	
	private static String getIdent()
	{
		String ident = "";
		for (int i=0; i<identLevel ; i++)
		{
			ident += '\t';
		}
		return ident;
	}
	
	public static void incrementIdentLevel() { identLevel++; }
	public static void decrementIdentLevel() { identLevel--; }

	public static int getNumberOfInstructions()
	{
		return instructions.size();
	}
	
	public static void addInstruction(String ins, int index)
	{
		instructions.add(index, getIdent() + ins);
	}
	
	public static void printInstructions()
	{
		for (String ins: instructions)
		{
			System.out.println(ins);
		}
	}

	public static void emptyInstructions()
	{
		instructions.clear();
		regNumber = 0;
	}
	
	public static String getUniqueLabel()
	{
		++regNumber;
		return "%"+regNumber;
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
}
