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
	private static int identLevel = 0;
	private static boolean includePrint = false;
	private static boolean includeRead = false;
	private static String printf  = "declare i32 @printf(i8*, ...)";
	private static String scanf  = "@scanf";
	public static void generateCode(Tree tree, SymbolTable table)
	{
		Tree current = (tree.getText()==null)? tree.getChild(0) : tree ;;
		current = Statement.checkAllStatements(current, table, new LabelGenerator());
		while(current!=null)
		{
			Function.writeCodeForFunctions(current, table, new LabelGenerator());
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
	}

	public static void saveToFile(String filepath)
	{
		try{
			FileWriter fstream = new FileWriter(filepath);
			BufferedWriter out = new BufferedWriter(fstream);
			for (String line : instructions)
			{
				out.write(line + "\n");	
			}
			if (includePrint)
			{
				out.write(printf + "\n");
			}
			if (includeRead)
			{
				out.write(scanf+ "\n");
			}
			out.close();
		}catch (IOException e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void includePrint() { includePrint=true;}
	public static void includeRead() { includeRead=true;}
}
