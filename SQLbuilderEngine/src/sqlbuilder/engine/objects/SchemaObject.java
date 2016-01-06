/**
 * 
 */
package sqlbuilder.engine.objects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sqlbuilder.engine.objects.ColAttribObject.nullable;

/**
 * @author Sourav created on 5 Jan 2016
 *
 */
public class SchemaObject {

	/**
	 * 
	 */
	public SchemaObject() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	List<TableObject> table=new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TableObject> gettable() {
		return table;
	}
	public void settable(TableObject table) {
		this.table.add(table);
	}
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ColAttribObject co=new ColAttribObject();
		co.setDatatype("char");
		co.setNullable(nullable.yes);
		co.setSize(3);
		ColumnObject cobj=new ColumnObject();
		cobj.setColumnattrib(co);
		cobj.setName("row_id");
		TableObject to=new TableObject();
		to.setName("s_asset");
		to.setcolumn(cobj);
		
		co=new ColAttribObject();
		co.setDatatype("char");
		co.setNullable(nullable.no);
		co.setSize(3);
		cobj=new ColumnObject();
		cobj.setColumnattrib(co);
		cobj.setName("asset_id");
		//to=new TableObject();
		//to.setName("s_asset");
		to.setcolumn(cobj);
		
		SchemaObject so=new SchemaObject();
		so.setName("oneview_owner");
		so.settable(to);
		//System.out.println(to.getColObj().get(0).getName());
		
		co=new ColAttribObject();
		co.setDatatype("char");
		co.setNullable(nullable.yes);
		co.setSize(3);
		cobj=new ColumnObject();
		cobj.setColumnattrib(co);
		cobj.setName("asset_id");
		to=new TableObject();
		to.setName("s_asset");
		to.setcolumn(cobj);
		so.settable(to);
		
		System.out.println(to.getcolumn().get(0).getName());
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("MetaData_Store/new_test.json"), so);
	}
}
