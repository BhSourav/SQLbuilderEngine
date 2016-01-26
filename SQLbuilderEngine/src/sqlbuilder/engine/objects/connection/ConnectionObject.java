/**
 * 
 */
package sqlbuilder.engine.objects.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Sourav created on Jan 26, 2016
 *
 */
public class ConnectionObject {

	private String filePath;
	private String conKey=ConnectionProfileObject.class.getName();
	private List<Map<String, ConnectionProfileObject>> conList=new ArrayList<>();
	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}
	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/**
	 * @return the conKey
	 */
	public String getConKey() {
		return conKey;
	}
	/**
	 * @param conKey the conKey to set
	 */
	public void setConKey(String conKey) {
		conKey=ConnectionProfileObject.class.getName();
	}
	/**
	 * @return the conList
	 */
	public List<Map<String, ConnectionProfileObject>> getConList() {
		return conList;
	}
	/**
	 * @param conList the conList to set
	 */
	public void setConList(List<Map<String, ConnectionProfileObject>> conList) {
		this.conList = conList;
	}
	
}
