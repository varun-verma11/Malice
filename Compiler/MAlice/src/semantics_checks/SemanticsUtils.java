package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;

public class SemanticsUtils {
	public static DATA_TYPES getReturnType(Tree node)
	{
		return DATA_TYPES.valueOf(node.getText().toUpperCase());
	}

	public static Tree getNextChild(Tree current)
	{
		return current.getParent().getChild(current.getChildIndex()+1);
	}
}
