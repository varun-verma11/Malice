package codeGeneration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;
import symbol_table.SymbolTable;

public class CodeGenerator
{
	private static ArrayList<String> instructions = new ArrayList<String>();
	private static int regNumber = 0;
	private static int identLevel = 0;

	public static void generateCode(Tree tree, SymbolTable table)
	{
		Tree current = tree;
		//GENERATE CODE FOR ALL GLOBAL STATEMENTS
		while(current!=null)
		{
			current = Function.writeCodeForFunctions(current, table, new LabelGenerator());
			current = SemanticsUtils.getNextChild(current);
		}
	}
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

	public static void saveToFile(String filepath)
	{
		try{
			FileWriter fstream = new FileWriter(filepath);
			BufferedWriter out = new BufferedWriter(fstream);
			for (String line : instructions)
			{
				out.write(line);	
			}
			out.close();
		}catch (IOException e){
			System.err.println("Error: " + e.getMessage());
		}
	}
}
