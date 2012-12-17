package extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;
import codeGeneration.CodeGenerator;
import codeGeneration.LabelGenerator;

public class MathLibrary
{

	/**
	 * @field func_names A list of strings including names of included functions
	 */
	private static final String[] func_names = new String[] { "sin", "cos",
			"tan", "asin", "acos", "atan", "log", "log10", "exp", "sinh",
			"cosh", "tanh", "sqrt" };

	/**
	 * @field math_func A HashSet made of func_names list-entries
	 */
	private static Set<String> math_func = new HashSet<String>(Arrays
			.asList(func_names));

	/**
	 * Adds function names as keys and corresponding functionSTValues to the
	 * given SymbolTable
	 * 
	 * @param table
	 *            Current symbol-table
	 */
	public static void addFunctionsToSymbolTable(SymbolTable table)
	{
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		table
				.insert("sin", new FunctionSTValue(DATA_TYPES.NUMBER, table,
						args));
		table
				.insert("cos", new FunctionSTValue(DATA_TYPES.NUMBER, table,
						args));
		table
				.insert("tan", new FunctionSTValue(DATA_TYPES.NUMBER, table,
						args));
		table.insert("asin",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
		table.insert("acos",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
		table.insert("atan",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
		table
				.insert("log", new FunctionSTValue(DATA_TYPES.NUMBER, table,
						args));
		table.insert("log10", new FunctionSTValue(DATA_TYPES.NUMBER, table,
				args));
		table
				.insert("exp", new FunctionSTValue(DATA_TYPES.NUMBER, table,
						args));
		table.insert("sinh",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
		table.insert("cosh",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
		table.insert("tanh",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
		table.insert("sqrt",
				new FunctionSTValue(DATA_TYPES.NUMBER, table, args));
	}

	/**
	 * Writes appropriate method for each function so that the instruction is
	 * added in the table
	 * 
	 * @param node
	 *            Current node at function call
	 * @param table
	 *            Current symbol-table
	 * @param gen
	 *            Current LabelGenerator
	 */
	public static String writeMathFunc(Tree node, SymbolTable table,
			LabelGenerator gen)
	{
		String func = node.getText();
		if (math_func.contains(func))
		{
			if (func.equals("sin"))
			{
				return writeMathReadone(func, node, table, gen);
			} else if (func.equals("cos"))
			{
				return writeMathReadone(func, node, table, gen);
			}
			else if (func.equals("sqrt"))
			{
				return writeMathReadone(func, node, table, gen);
			}
			else if (func.equals("tan"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("log"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("log10"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("exp"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("sinh"))
			{
				return writeMathUsusal(func, node, table, gen);
			} else if (func.equals("tanh"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("cosh"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("asin"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("acos"))
			{
				return writeMathUsusal(func, node, table, gen);
			}
			else if (func.equals("atan"))
			{
				return writeMathUsusal(func, node, table, gen);
			}

		}
		return null;
	}

	/**
	 * writeMathReadone and writeMathUsusal are helper methods to write the
	 * relevant LLVM instructions
	 */

	private static String writeMathReadone(String func, Tree node,
			SymbolTable table, LabelGenerator gen)
	{
		String regId = gen.getUniqueRegisterID();
		double param = Double.parseDouble(node.getChild(1).getText());
		CodeGenerator.addInstruction(regId + " = call double @" + func
				+ "(double " + param + ") nounwind readnone");
		return regId;
	}

	private static String writeMathUsusal(String func, Tree node,
			SymbolTable table, LabelGenerator gen)
	{
		String regId = gen.getUniqueRegisterID();
		double param = Double.parseDouble(node.getChild(1).getText());
		CodeGenerator.addInstruction(regId + " = call double @" + func
				+ "(double " + param + ") nounwind");
		return regId;
	}

	public static boolean checkIfMathFunction(String func)
	{
		return math_func.contains(func);
	}
}