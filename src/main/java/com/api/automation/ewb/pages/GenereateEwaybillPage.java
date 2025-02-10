package com.api.automation.ewb.pages;

import java.util.HashMap;
import java.util.Properties;

import com.api.automation.ewb.constants.ApplicationConstants;
import com.api.automation.ewb.constants.PathConstants;
import com.api.automation.ewb.utils.JsonUtility;
import com.api.automation.ewb.utils.PropertyUtils;

public class GenereateEwaybillPage {

	Properties configProp = PropertyUtils.readConfigProperty();
	//AuthenticationTest AuthTestToken = new AuthenticationTest();
	
	public HashMap<String, String> ewbGeneratePostHeader(String authToken) {
		HashMap<String, String> header = new HashMap<String, String>();
		header.put(ApplicationConstants.API_HEADER_ACTION, configProp.getProperty("ewb.action"));
		header.put(ApplicationConstants.API_HEADER_CLIENTID, configProp.getProperty("ewb.clientId"));
		header.put(ApplicationConstants.API_HEADER_AUTH_TOKEN, authToken);
		return header;
	}

	public static void main(String args[]) {
		String s1 = "\"test\"";

		System.out.println(s1);
	}
	
}
