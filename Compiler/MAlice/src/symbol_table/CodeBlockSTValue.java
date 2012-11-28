package symbol_table;

public class CodeBlockSTValue extends SymbolTableValue
{
	SymbolTable symbolTable ;
	public CodeBlockSTValue(SymbolTable currSymTable) 
	{
		this.type = DATA_TYPES.ERROR;
		symbolTable = new SymbolTable();
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1); 
		symbolTable.setEnclosingSymbolTable(currSymTable);
	}

	public SymbolTable getTable()
	{
		return symbolTable ;
	}
}
