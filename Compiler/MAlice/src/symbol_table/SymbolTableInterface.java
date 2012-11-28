package symbol_table;


public interface SymbolTableInterface<K extends Comparable<K>, V> {
	public V lookup(K key);
	public void insert(K name, V value) ;
}
