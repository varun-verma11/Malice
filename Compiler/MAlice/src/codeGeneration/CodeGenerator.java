package codeGeneration;

import java.util.ArrayList;

public class CodeGenerator
{
	private static ArrayList<String> instructions = new ArrayList<String>();
	private static int regNumber =0;
	public static void addInstruction(String ins)
	{
		instructions.add(ins);
	}
	
	public static int getNumberOfInstructions()
	{
		return instructions.size();
	}
	
	public static void addInstruction(String ins, int index)
	{
		instructions.add(index, ins);
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
