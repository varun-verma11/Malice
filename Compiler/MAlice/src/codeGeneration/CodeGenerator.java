package codeGeneration;

import java.util.ArrayDeque;
import java.util.Queue;

public class CodeGenerator
{
	private static Queue<String> instructions = new ArrayDeque<String>();
	private static int regNumber =0;
	public static void addInstruction(String ins)
	{
		instructions.add(ins);
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
