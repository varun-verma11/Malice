/**
 * 
 */
package symbol_table;

/**
 * @author HMV
 *
 */
public abstract class SymbolTableValue {
	protected String identifier ;
	protected DATA_TYPES type ;

	public String getIdentifier() {
		return identifier;
	}
	
	public DATA_TYPES getType()
	{
		return type;
	}
}
