package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
	//SymbolTable enclosingLevelTable = null;
	DATA_TYPES return_type = null;		
	
	public FunctionSTValue(String identifier) 
	{
		this.identifier = identifier;
		symbolTable = new SymbolTable();
	}
	
	public FunctionSTValue(String identifier, DATA_TYPES return_value, SymbolTable parent)
	{
		this.identifier = identifier;
		this.return_type = return_value ;
		this.parent = parent;
		symbolTable = new SymbolTable();
	}
	
	public DATA_TYPES getReturnType() 
	{
		return return_type;
	}
	
	public SymbolTable getTable()
	{
		return symbolTable ;
	}	
	
}

