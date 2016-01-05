/**
 * 
 */
package sqlbuilder.engine.objects;

/**
 * @author Sourav created on 05/01/2016
 *
 */
public class ColAttribObject {

	/**
	 * 
	 */
	public ColAttribObject() {
		// TODO Auto-generated constructor stub
	}
	
	private int size;
	private boolean nullable;
	private String datatype;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isNullable() {
		return nullable;
	}
	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

}
