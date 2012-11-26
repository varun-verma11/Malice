package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
	DATA_TYPES return_type = null;	
	DATA_TYPES[] args;
	int newTableScopeLevel;
	
	public FunctionSTValue(SymbolTable currSymTable, DATA_TYPES[] args) 
	{
		this.identifier = identifier;//?????
		this.parent = currSymTable;
		symbolTable = new SymbolTable();
		this.newTableScopeLevel = parent.getCurrentScopeLevel() + 1;
		symbolTable.updateCurrentScopeLevel(newTableScopeLevel);
		this.args = args;
	}
	
	public FunctionSTValue(DATA_TYPES return_type, SymbolTable currSymTable, DATA_TYPES[] args)
	{
		this.return_type = return_type ;
		this.identifier = identifier;
		this.parent = currSymTable;
		symbolTable = new SymbolTable();
		this.newTableScopeLevel = parent.getCurrentScopeLevel() + 1;
		symbolTable.updateCurrentScopeLevel(newTableScopeLevel);
		this.args = args;
	}
	
	public DATA_TYPES getReturnType() 
	{
		return return_type;
	}
	
	public SymbolTable getTable()
	{
		return symbolTable ;
	}	
	
	public SymbolTable getParent() 
	{
		return parent;
	}
	
	public DATA_TYPES[] getArgs() 
	{
		return args;
	}
	
}


