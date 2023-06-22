package curs12;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
public class JsonFileProcessor {
	
	
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser");
		obj.put("email", "test@email");
		
		try(FileWriter file = new FileWriter("test.json")){
			file.write(obj.toJSONString());
		}catch(IOException e) {
		e.printStackTrace();
	}

}
}
