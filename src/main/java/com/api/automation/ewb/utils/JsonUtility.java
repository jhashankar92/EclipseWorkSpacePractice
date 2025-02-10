package com.api.automation.ewb.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import javax.swing.text.StyleContext;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.internal.support.FileReader;

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
			System.out.println("File Path Specfied is not correct");
		}

		return jsonText;

	}

	public static String getValueFromJSONString(String jsonString, String key) {
		JSONObject jo = new JSONObject(jsonString);

		// Storing Auth token in a variable
		String value = jo.get(key).toString();
		System.out.println("value: " + value);

		return value;
	}

	public static org.json.simple.JSONObject getJsonObjectFromString(String response) {
		org.json.simple.JSONObject object = null;

		JSONParser jsonParser = new JSONParser();
		try {
			object = (org.json.simple.JSONObject) jsonParser.parse(response.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return object;

	}

	public static String updateJsonKeyInJsonFile(String filePath, String key, String value) {
		org.json.simple.JSONObject object = getJsonObjectFromString(readJsonFileToString(filePath));
		org.json.simple.JSONObject object1 = (org.json.simple.JSONObject) object.get("data");
		String jsonKey = (String) object1.get(key);

		if (!(jsonKey.equalsIgnoreCase(value))) {
			object1.put(key, value);
			System.out.println("Updated Json : " + object1.toString());
		}
		return object.toString();
	}

	public static String updateJsonKeyInJsonString(String jsonString, String key, String value) {
		org.json.simple.JSONObject object = getJsonObjectFromString(jsonString);
		org.json.simple.JSONObject object1 = (org.json.simple.JSONObject) object.get("data");
		String jsonKey = (String) object1.get(key);

		if (!(jsonKey.equalsIgnoreCase(value))) {
			object1.put(key, value);
			System.out.println("Updated Json : " + object1.toString());
		}
		return object.toString();
	}
	
}
