package extension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;
import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;

public class HighOrderFunctions
{
	private static final String[] func_names = new String[] { "map" };
	public final Set<String> highOrderFunctions = new HashSet<String>(Arrays
			.asList(func_names));

	public static DATA_TYPES checkMapFunction(Tree node, SymbolTable table)
	{
		if (node.getChildCount() != 2)
		{
			printMessage(node, "Function map only takes in 2 arguments.");
			return null;
		}
		DATA_TYPES ret_type = checkOneArityFunction(node.getChild(0), table);
		if (ret_type != DATA_TYPES.valueOf(node.getChild(1).getText()
				.substring("array_".length())))
		{
			printMessage(node, "Function ");
		}
		return ret_type;
	}

	private static DATA_TYPES checkOneArityFunction(Tree node, SymbolTable table)
	{
		if (!table.checkItemWasDeclaredBefore(node.getText()))
		{
			printMessage(node, "Function " + node.getText() + " is not defined");
			return null;
		}
		try
		{
			FunctionSTValue func = (FunctionSTValue) table.lookup(node
					.getText());
			if (func.getArgs().size() != 1)
			{
				printMessage(node, "Function " + node.getText()
						+ " does not have an arity 1.");
			}
			if (func.getType() != DATA_TYPES.LETTER
					|| func.getType() != DATA_TYPES.NUMBER
					|| func.getType() != DATA_TYPES.SENTENCE)
			{
				printMessage(node, "Function " + node.getText()
						+ " does not return a scalar "
						+ "(number, letter or sentence) type .");
			}
			DATA_TYPES arg_type = func.getArgs().get(0);
			Tree nextChild = SemanticsUtils.getNextChild(node);
			try
			{
				DATA_TYPES type_of_list = table.lookup(nextChild.getText())
						.getType();
				if (!type_of_list.toString().substring("array_".length())
						.contentEquals(arg_type.toString()))
				{
					printMessage(nextChild, "The return type of function and "
							+ "type of the array do not match.");
				}
			} catch (NullPointerException e)
			{
				printMessage(nextChild, "The argument " + nextChild.getText()
						+ " for function map is not defined.");
			}
			return func.getType();
		} catch (ClassCastException e)
		{
			printMessage(node,"Function " + node.getText() + " is not defined");
		}
		return null;
	}

	public static void swapMapWithWhile(Tree node, SymbolTable table)
	{
		
	}
	private static void printMessage(Tree node, String msg)
	{
		System.err.println("Line " + node.getLine() + ": "
				+ node.getCharPositionInLine() + ": " + msg);
	}
}
