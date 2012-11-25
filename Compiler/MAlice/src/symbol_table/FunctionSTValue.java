package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable table ;
	DATA_TYPES return_type = null;		
	
	public FunctionSTValue(String identifier) 
	{
		this.identifier = identifier;
		table = new SymbolTable();
	}
	
	public FunctionSTValue(String identifier, DATA_TYPES return_value)
	{
		this.identifier = identifier;
		this.return_type = return_value ;
		table = new SymbolTable();
	}
	
	public DATA_TYPES getReturnType() {
		return return_type;
	}
	
	public SymbolTable getTable()
	{
		return table ;
	}	
	
}

