/**
 * 
 */
package sqlbuilder.engine.objects;

/**
 * @author Sourav created on 5 Jan 2016
 *
 */
public class ColumnObject {

	/**
	 * 
	 */
	public ColumnObject() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	ColAttribObject colattrib;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ColAttribObject getColattrib() {
		return colattrib;
	}
	public void setColattrib(ColAttribObject colattrib) {
		this.colattrib = colattrib;
	}
	

}
