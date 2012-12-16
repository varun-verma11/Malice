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
	private static boolean includeATOI = false;
	private static boolean includePrintIntTop = false;
	private static boolean includePrintCharTop = false;
	private static boolean includePrintStringTop = false;
	private static boolean includeStdin = false;
	
	private static final String read = "%struct._IO_FILE = type { i32, i8*, i8*, " +
			"i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*" +
			", %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64," +
			" i8*, i8*, i8*, i8*, i64, i32, [20 x i8] } \n\n " +
			"%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*," +
			" i32 } \n " +
			"declare i8* @fgets(i8*, i32, %struct._IO_FILE*)";
	private static final String printf  = "declare i32 @printf(i8*, ...)";
	private static final String atoi = "declare i32 @atoi(i8*) nounwind readonly";
	private static final String stdin = "@stdin = external global %struct._IO_FILE*";
	
	private static final String printIntHeader = "@.printInt = private unnamed_addr " +
			"constant [3 x i8] c\"%i" + '\\' + "00" + "\", align 1";
	private static final String printCharHeader = "@.printChar = private unnamed_addr " +
			"constant [3 x i8] c\"%c" + '\\' + "00" + "\", align 1";
	private static final String printStringHeader = "@.printString = private unnamed_addr " +
			"constant [3 x i8] c\"%s" + '\\' + "00" + "\", align 1";
	
//	@.str = private unnamed_addr constant [3 x i8] c"%i\00", align 1
//	@.str1 = private unnamed_addr constant [3 x i8] c"%c\00", align 1
//	@.str2 = private unnamed_addr constant [3 x i8] c"%s\00", align 1
	
	public static void generateCode(Tree tree, SymbolTable table)	
	
	{
		Tree current = (tree.getText()==null)? tree.getChild(0) : tree ;
		current = SemanticsUtils.skipImports(current);
		current = Statement.checkAllStatements(current, table, new LabelGenerator());
		while(current!=null)
		{
			Function.writeCodeForFunctions(current, table, new LabelGenerator());
			//current = Statement.checkAllStatements(current, table, new LabelGenerator());
			current = SemanticsUtils.getNextChild(current);
		}
		Function.writeCodeForStartFunction();
	}
	
//	private static void moveHattaToEnd(Tree tree)
//	{
//		Tree curr = (tree.getText()==null)? tree.getChild(0) : tree ;;
//		while(!curr.getChild(0).getText().contentEquals("hatta"))
//		{
//			curr = SemanticsUtils.getNextChild(curr);
//		}
//		tree.addChild(curr);
//		tree.freshenParentAndChildIndexes();
//		tree.deleteChild(curr.getChildIndex());
//		tree.freshenParentAndChildIndexes();
//	}

	public static void addGlobalInstruction(String ins)
	{
		ins = ins.replace("\\n", " \\0A");
		ins = ins.replace("\\t", " \\09");
		ins = ins.replace("\\r", " \\0D");
		instructions.add(0,ins);
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
			writeHeaders(out);
			for (String line : instructions)
			{
				out.write(line + "\n");	
			}
			writeFooter(out);
			out.close();
		}catch (IOException e){
			System.err.println("Error: " + e.getMessage());
		}
	}

	private static void writeHeaders(BufferedWriter out) throws IOException
	{

		if (includePrintIntTop) 
		{
			out.write(printIntHeader + "\n\n");
		}
		if (includePrintCharTop) 
		{
			out.write(printCharHeader + "\n\n");
		}
		if (includePrintStringTop) 
		{
			out.write(printStringHeader + "\n\n");
		}
		if (includeRead)
		{
			out.write(read+ "\n \n");
		}
		if ( includeATOI)
		{
			out.write(atoi  + "\n \n");
		}
		if (includeStdin)
		{
			out.write(stdin + "\n \n");
		}
	}

	private static void writeFooter(BufferedWriter out) throws IOException {
		if (includePrint)
		{
			out.write(printf + "\n");
		}
	}
	public static void includeStdin() { includeStdin=true;}
	public static void includePrint() { includePrint=true;}
	public static void includeRead() { includeRead=true;}
	public static void includePrintInt() { includePrintIntTop = true;}
	public static void includePrintChar() { includePrintCharTop = true;}
	public static void includePrintString() { includePrintStringTop = true;}
	public static void includeATOI() { includeATOI=true;}
}
