/**
 * 
 */
package sqlbuilder.engine.objects.connection;

/**
 * @author Sourav created on Jan 26, 2016
 *
 */
public class ConnectionProfileObject {

	private String name;
	ConnectionParameterObject con;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the con
	 */
	public ConnectionParameterObject getCon() {
		return con;
	}
	/**
	 * @param con the con to set
	 */
	public void setCon(ConnectionParameterObject con) {
		this.con = con;
	}
	
}
