package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
	DATA_TYPES[] args;
	
	
	public FunctionSTValue(String identifier, SymbolTable symTable, DATA_TYPES[] args) 
	{
		this.identifier = identifier;
		this.parent = symTable;
		symbolTable = new SymbolTable();
		this.args = args;
	}
	
	public FunctionSTValue(String identifier, DATA_TYPES return_value, SymbolTable parent, DATA_TYPES[] args)
	{
		this.identifier = identifier;
		this.type = return_value ;
		this.parent = parent;
		symbolTable = new SymbolTable();
		this.args = args;
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

