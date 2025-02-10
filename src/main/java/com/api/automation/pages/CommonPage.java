package com.api.automation.pages;

import org.json.simple.JSONObject;

import com.api.automation.utils.JsonUtility;

public class CommonPage extends BasePage{
	
	
	public static String readAcknowledgeFromResponse(String response) {
		
		JSONObject object = JsonUtility.getJsonObjectFromString(response);
		JSONObject messageObject = JsonUtility.getJsonObject(object, "message");
		JSONObject ackObject = JsonUtility.getJsonObject(messageObject, "ack");
		String status = (String) ackObject.get("status");
		return status;
	}

}
