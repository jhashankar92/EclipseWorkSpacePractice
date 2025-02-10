package com.api.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.api.automation.logging.InitiateLogger;

public class JsonUtility {

	public static String readJsonFileToString(String filePath) {
		String jsonText = null;
		File jsonFile = new File(filePath);
		if (jsonFile.exists()) {

			try {
				FileInputStream inputStream = new FileInputStream(jsonFile);
				jsonText = org.apache.commons.io.IOUtils.toString(inputStream);
				// System.out.println("Json Data"+jsonText);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			InitiateLogger.error("File Path Specfied is not correct");
		}

		return jsonText;
	}

	public static JSONObject getJsonObjectFromString(String response) {
		JSONObject object = null;
		JSONParser jsonParser = new JSONParser();
		try {
			object = (JSONObject) jsonParser.parse(response.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return object;

	}
	public static JSONObject getJsonObject(JSONObject objectParameter,String keyName) {
		JSONObject object = null;
		object = (JSONObject) objectParameter.get(keyName);
		return object;

	}
	
	public static String getKeyValueFromJsonObject(JSONObject objectParameter,String keyName) {
		String value = (String) objectParameter.get(keyName);
		return value;

	}

	public static void readJsonKeyValue(String response, String firstArry, String key) {

		JSONObject responseJson = getJsonObjectFromString(response);
		JSONObject jsonArray = (JSONObject) responseJson.get(firstArry);
		String jsonArray1 = (String) jsonArray.get(key);
		System.err.print(jsonArray1);
	}

	public static String updateJsonKeyInJsonFile(String filePath, String key, String value) {
		JSONObject object = getJsonObjectFromString(readJsonFileToString(filePath));
		JSONObject object1 = (JSONObject) object.get("context");
		String jsonKey = (String) object1.get(key);
		
		if (!(jsonKey.equalsIgnoreCase(value))) {
			object1.put(key, value);
			System.out.println("Updated Json : "+object1.toJSONString());
		}
		return object.toJSONString();
	}

	public static void main(String args[]) {
		String jsonTring ="C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\PropertyFile\\TestData\\SelectJsonRequest.json";
		updateJsonKeyInJsonFile(jsonTring, "transaction_id", "Test");
		// readJsonKeyValue(readJsonFileToString("C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\PropertyFile\\TestData\\SelectJsonRequest.json"));
	}
}
