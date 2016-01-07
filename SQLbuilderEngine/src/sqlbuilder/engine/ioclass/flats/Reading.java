/**
 * 
 */
package sqlbuilder.engine.ioclass.flats;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import sqlbuilder.engine.objects.SchemaObject;
import sqlbuilder.engine.objects.TableObject;

/**
 * @author Sourav created on 7 Jan 2016
 *
 */
public class Reading {

	/**
	 * 
	 */

	//private String filepath="";

	public Reading() {

	}

	public Object getjsonSchemaObject(String filepath) {
		ObjectMapper mapper=new ObjectMapper();
		SchemaObject so = null;
		try {
			so=mapper.readValue(new File(filepath), SchemaObject.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return so;
	}

	public Object getjsonTableObject(String filepath) {
		//ObjectMapper mapper=new ObjectMapper();
		TableObject to=null;
		try {
			JsonFactory jsonFactory = new JsonFactory();
			JsonParser jp = jsonFactory.createParser(new File(filepath));
			jp.setCodec(new ObjectMapper());
			JsonNode node=jp.readValueAsTree();
			ArrayNode node1=(ArrayNode) node.get("table");
			//System.out.println(node1);
			//ArrayNode node2=(ArrayNode) node1.get("name");
			//System.out.println(node1.getNodeType());
			//System.out.println(node1.get("name").toString());
			
			Iterator<Entry<String, JsonNode>> object = node1.fields();
			while (object.hasNext()) {
				Entry<String, JsonNode> obj=object.next();
				System.out.println(obj.getValue().toString());
			}
			
			/*if( node1.get("name").equals("s_asset"))
			{
				
				System.out.println(node1.get("column").toString());
			}*/
				
				//JSONArray array=new JSONArray(filepath);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return to;
		}

		public static void main(String[] args) {
			Reading rd=new Reading();
			rd.getjsonTableObject("metadata_store/new_test.json");
		}
	}
