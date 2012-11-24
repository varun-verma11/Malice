/**
 * 
 */
package symbol_table;

/**
 * @author varun
 *
 */
public class VariableSTValue extends SymbolTableValue
{
	private boolean initialised;
	private DATA_TYPES type ;
	
	public VariableSTValue(String identifier, DATA_TYPES type, boolean initialised)
	{
		this.type = type;
		this.identifier = identifier ;
		this.initialised = initialised ;
	}
	
	public DATA_TYPES getType()
	{
		return type;
	}
	
	public void setInitialised(boolean initialised)
	{
		this.initialised = initialised ;
	}
	
	public boolean isInitialised() 
	{
		return initialised ;
	}

}
