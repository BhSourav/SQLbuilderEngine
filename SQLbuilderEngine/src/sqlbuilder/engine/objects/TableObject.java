/**
 * 
 */
package sqlbuilder.engine.objects;

/**
 * @author Sourav created on 5 Jan 2016
 *
 */
public class TableObject {

	/**
	 * 
	 */
	public TableObject() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	ColumnObject colObj;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ColumnObject getColObj() {
		return colObj;
	}
	public void setColObj(ColumnObject colObj) {
		this.colObj = colObj;
	}
	
	
}
