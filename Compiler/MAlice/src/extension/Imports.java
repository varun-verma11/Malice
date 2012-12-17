package extension;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import malice_grammar.SemanticVerifier;
import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;
import malice_grammar.malice_grammarParser.program_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;

public class Imports
{
	/**
	 * String containing filenames to be imported
	 * 
	 * @field imports : This keeps a track of the files which have been imported
	 */

	private static Set<String> imports = new HashSet<String>();

	/**
	 * This function checks for errors which could be in import statements, such
	 * as if user wants to import a file which does not exists. Also it
	 * 
	 * manipulates the AST in order to add the imported functions.
	 * 
	 * @param node
	 *            : specifies the node of the tree of whole program.
	 * @return : returns a reference to the manipulated tree.
	 * @throws RecognitionException
	 *             : Thrown if the imported file is not valid
	 * @throws IOException
	 */
	public static Tree checkImports(Tree node) throws RecognitionException,
			IOException
	{
		Tree current = node.getChild(0);
		if (current.getText().contentEquals("wants"))
		{
			if (!new File(new java.io.File(".").getCanonicalPath()
					+ "\\"
					+ current.getChild(current.getChildCount() - 1).getText()
							.substring(
									1,
									current.getChild(
											current.getChildCount() - 1)
											.getText().length() - 1) + ".alice")
					.exists())
			{
				System.err.println("ERROR: Incorrect import. ("
						+ current.getChild(current.getChildCount() - 1)
						+ ") does not exists");
				SemanticVerifier.failed = true;
				return null;
			}
			if (imports.contains(current.getChild(current.getChildCount() - 1)
					.getText()))
			{
				System.err.println("ERROR: Cyclic dependencies encountered "
						+ "for file <"
						+ current.getChild(current.getChildCount() - 1)
								.getText() + ">");
				SemanticVerifier.failed = true;
				return null;
			} else
			{
				imports.add(current.getChild(current.getChildCount() - 1)
						.getText());
			}
			current = importFunctions(current);
			current = SemanticsUtils.getNextChild(current);
			return checkImports(current);
		}
		return node;
	}

	/**
	 * This function imports the functions which are specified in the import
	 * 
	 * @param node
	 *            : specifies the node to attach the imported functions
	 * @return : returns a reference to manipulated tree
	 * @throws RecognitionException
	 */
	private static Tree importFunctions(Tree node) throws RecognitionException
	{
		if (node == null)
			return null;
		Tree current = node;

		while (current != null && current.getText().contentEquals("wants"))
		{
			Tree tree = null;
			try
			{
				CharStream input = new ANTLRFileStream(new java.io.File(".")
						.getCanonicalPath()
						+ "/"
						+ current.getChild(current.getChildCount() - 1)
								.getText().substring(
										1,
										current.getChild(
												current.getChildCount() - 1)
												.getText().length() - 1)
						+ ".alice");
				malice_grammarLexer lexer = new malice_grammarLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				if (lexer.getNumberOfSyntaxErrors() == 0)
				{
					malice_grammarParser parser = new malice_grammarParser(
							tokens);
					program_return prog = parser.program();
					if (parser.getNumberOfSyntaxErrors() == 0)
					{
						tree = (Tree) prog.getTree();
					}
				}
				if (current.getChild(0).getText().contentEquals("everything"))
				{
					attachAllFunctionToTree(node.getParent(),
							checkImports(tree));
					current = SemanticsUtils.getNextChild(current);
				} else
				{
					Set<String> func_to_import = getFunctionsToImport(current);
					importGivenFunctions(func_to_import, node.getParent(), tree);
					current = SemanticsUtils.getNextChild(current);
				}
			} catch (IOException e)
			{

			}
		}

		return current;
	}

	/**
	 * This function imports the given function and adds them to the given tree
	 * 
	 * @param funcToImport
	 *            : specifies the list of functions to be imported
	 * @param parent
	 *            : specifies the node on which the improted functions are to be
	 *            added
	 * @param toAttach
	 *            : specifies the tree of the imported file from which certain
	 *            functions are required
	 */
	private static void importGivenFunctions(Set<String> funcToImport,
			Tree parent, Tree toAttach)
	{
		int number_of_childs = toAttach.getChildCount();
		int curr_child = 0;
		while (!funcToImport.isEmpty() && number_of_childs != curr_child)
		{
			if (toAttach.getChild(curr_child).getText()
					.contentEquals("looking")
					|| toAttach.getChild(curr_child).getText().contentEquals(
							"room"))
			{
				if (funcToImport.contains(toAttach.getChild(curr_child)
						.getChild(0).getText()))
				{
					parent.addChild(toAttach.getChild(curr_child));
					parent.freshenParentAndChildIndexes();
				}
			}
			curr_child++;
		}
	}

	/**
	 * This functions generates a list of the functions which are to be imported
	 * 
	 * @param current
	 *            : specifies the node of the tree which represent the import
	 *            statement
	 * @return
	 */
	private static Set<String> getFunctionsToImport(Tree current)
	{
		Set<String> funcs = new HashSet<String>();
		for (int i = 0; i < current.getChildCount() - 1; i++)
		{
			funcs.add(current.getChild(i).getText());
		}
		return funcs;
	}

	/**
	 * This function attaches all the children of the imported tree into the
	 * specified tree
	 * 
	 * @param node
	 *            : specifies the tree to which the functions are to be added
	 * @param toAttach
	 *            : specifies the tree which has been generated from the file to
	 *            be imported
	 */
	private static void attachAllFunctionToTree(Tree node, Tree toAttach)
	{
		if (toAttach == null)
			return;
		if (toAttach.getText()!=null)
		{
			node.addChild(toAttach);
			node.freshenParentAndChildIndexes();
		}
		int curr_child = 0;
		int number_of_children = toAttach.getChildCount();
		while (curr_child != number_of_children)
		{
			if (toAttach.getChild(curr_child).getText().contentEquals("looking")
					|| toAttach.getChild(curr_child).getText()
							.contentEquals("room"))
			{
				node.addChild(toAttach.getChild(curr_child));
				node.freshenParentAndChildIndexes();
			}
			curr_child++;
		}
	}
}
