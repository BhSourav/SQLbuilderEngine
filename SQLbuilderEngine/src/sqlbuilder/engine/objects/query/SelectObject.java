/**
 * 
 */
package sqlbuilder.engine.objects.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sourav created on Jan 31, 2016
 *
 */
public class SelectObject {

	private List<AttributeObject> selectAttributes=new ArrayList<>();

	/**
	 * @return the selectAttributes
	 */
	public List<AttributeObject> getSelectAttributes() {
		return selectAttributes;
	}

	/**
	 * @param selectAttributes the selectAttributes to set
	 */
	public void setSelectAttributes(AttributeObject attribObj) {
		this.selectAttributes.add(attribObj);
	}
	
}
