package test;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject personInfo = new JSONObject();
		personInfo.put("name", "Garry");
		personInfo.put("age", 20);
		personInfo.put("jobInfo ", "programmer");
		JSONArray hobbyList = new JSONArray();
		hobbyList.add("programming");
		hobbyList.add("baking");
		hobbyList.add("tiyping");
		personInfo.put("messages", hobbyList);
		try {
			FileWriter file = new FileWriter("d:\\test.json");
			file.write(personInfo.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(personInfo);

	}

}
