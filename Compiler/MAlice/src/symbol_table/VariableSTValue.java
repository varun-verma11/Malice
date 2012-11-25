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
	
	public VariableSTValue(DATA_TYPES type, boolean initialised)
	{
		this.type = type;
		this.initialised = initialised ;
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
