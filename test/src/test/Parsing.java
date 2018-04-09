package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("d:\\test.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String name = (String) jsonObject.get("name");
			System.out.println("name :: " + name);

			long id = (Long) jsonObject.get("id");
			System.out.println("id :: " + id);
			// Array
			JSONArray phoneNum = (JSONArray) jsonObject.get("phoneNumbers");
			Iterator<String> iterator = phoneNum.iterator();
			while (iterator.hasNext()) {
				System.out.println("phoneNumbers :: " + iterator.next());
			} // Object
			JSONArray array = (JSONArray) jsonObject.get("address");
			for (int i = 0; i < array.size(); i++) {
				JSONObject result = (JSONObject) array.get(i);
				System.out.println("result :: " + result.get("zipcode"));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
