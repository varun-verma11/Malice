package preprocessor;

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
	private static Set<String> imports = new HashSet<String>();

	public static Tree checkImports(Tree node) throws IOException,
			RecognitionException
	{
		Tree current = node.getChild(0);
		if (current.getText().contentEquals("bring"))
		{
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

	private static Tree importFunctions(Tree node) throws IOException,
			RecognitionException
	{
		if (node == null)
			return null;
		Tree current = node;

		while (current != null && current.getText().contentEquals("bring"))
		{
			Tree tree = null;
			CharStream input = new ANTLRFileStream(
			// new java.io.File( "." ).getCanonicalPath() + "/"
					"c:/Users/varun/Documents/Malice/"
							+ "malice_new_clone/Tests For Extension"
							+ "/"
							+ current
									.getChild(current.getChildCount() - 1)
									.getText()
									.substring(
											1,
											current
													.getChild(
															current
																	.getChildCount() - 1)
													.getText().length() - 1)
							+ ".alice");
			malice_grammarLexer lexer = new malice_grammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			if (lexer.getNumberOfSyntaxErrors() == 0)
			{
				malice_grammarParser parser = new malice_grammarParser(tokens);
				program_return prog = parser.program();
				if (parser.getNumberOfSyntaxErrors() == 0)
				{
					tree = (Tree) prog.getTree();
				}
			}
			if (current.getChild(0).getText().contentEquals("everything"))
			{
				attachAllFunctionToTree(node.getParent(), checkImports(tree));
				current = SemanticsUtils.getNextChild(current);
			} else
			{
				Set<String> func_to_import = getFunctionsToImport(current);
				importGivenFunctions(func_to_import, node.getParent(), tree);
				current = SemanticsUtils.getNextChild(current);
			}
		}

		return current;
	}

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
				if (funcToImport.contains(toAttach.getChild(curr_child).getChild(0)
						.getText()))
				{
					parent.addChild(toAttach.getChild(curr_child));
					parent.freshenParentAndChildIndexes();
				}
			}
			curr_child++;
		}
	}

	private static Set<String> getFunctionsToImport(Tree current)
	{
		Set<String> funcs = new HashSet<String>();
		for (int i = 0; i < current.getChildCount() - 1; i++)
		{
			funcs.add(current.getChild(i).getText());
		}
		return funcs;
	}

	private static void attachAllFunctionToTree(Tree node, Tree toAttach)
	{
		if (toAttach == null)
			return;
		// Tree temp = (node.getText() == null) ? node.getChild(0) : node;
		// while (temp != null && !temp.getText().contentEquals("bring"))
		// {
		// temp = SemanticsUtils.getNextChild(temp);
		// }
		int curr_child = 0;
		int number_of_children = node.getChildCount();
		while (curr_child != number_of_children)
		{
			if (!node.getChild(curr_child).getText().contentEquals("bring"))
			{
				// insertChildInIndex(node, temp.getChildIndex(), current);
				// insertChildInIndex(node, current);
				node.addChild(node.getChild(curr_child));
			}
			curr_child++;
			node.freshenParentAndChildIndexes();
		}
	}

	// private static void insertChildInIndex(Tree node,Tree toInsert)
	// {
	// // Tree curr = node.getChild(childIndex);
	// // int numberOfChilds = node.getChildCount();
	// // childIndex++;
	// // Tree next = node.getChild(childIndex);
	// // while(childIndex<numberOfChilds)
	// // {
	// // node.freshenParentAndChildIndexes();
	// // node.setChild(childIndex, curr);
	// // curr = next;
	// // next = node.getChild(childIndex);
	// // childIndex++;
	// // }
	//
	// node.addChild(toInsert);
	// node.freshenParentAndChildIndexes();
	// // node.addChild(curr);
	// }
}
