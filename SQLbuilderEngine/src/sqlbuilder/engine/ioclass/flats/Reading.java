/**
 * 
 */
package sqlbuilder.engine.ioclass.flats;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import sqlbuilder.engine.objects.dataModel.DB.SchemaObject;
import sqlbuilder.engine.objects.dataModel.DB.TableObject;

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
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
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
			
			for (int i = 0; i < node1.size(); i++) {
				//System.out.println("hello");
				//String tabName=node1.get(i).get("name").asText();
				//System.out.println(tabName);
				if( node1.get(i).get("name").asText().equals("s_asset_x"))
				{
					System.out.println(node1.get(i).toString());
					String node2=node1.get(i).toString();
					
					to=mapper.readValue(node2, TableObject.class);
					//System.out.println(to.getName().toString());
					break;
				}
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
