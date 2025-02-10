package com.api.automation.ewb.pages;

import java.util.HashMap;
import java.util.Properties;

import com.api.automation.ewb.constants.ApplicationConstants;
import com.api.automation.ewb.utils.PropertyUtils;

public class AuthenticationPage {

	Properties configProp = PropertyUtils.readConfigProperty();

	public String ewbAuthenticationPayload() {
		String client_id = configProp.getProperty("ewb.clientId");
		String client_seckey = configProp.getProperty("ewb.client.seckey");
		String app_secret_key = configProp.getProperty("ewb.app.seckey");

		String payload = "{\r\n" + "	\"" + ApplicationConstants.API_HEADER_CLIENTID + "\":\"" + client_id + "\",\r\n"
				+ "	\"" + ApplicationConstants.API_HEADER_CLIENT_SECRET + "\":\"" + client_seckey + "\",\r\n" + "	\""
				+ ApplicationConstants.API_HEADER_APP_SECRET_KEY + "\":\"" + app_secret_key + "\"\r\n" + "}";
		return payload;

	}

	public HashMap<String, String> ewbAuthenticationGetHeader() {
		HashMap<String, String> header = new HashMap<String, String>();
		header.put(ApplicationConstants.API_HEADER_CONTENT_TYPE, configProp.getProperty("ewb.content_type"));
		return header;
	}

	public static void main(String args[]) {
		String s1 = "\"test\"";

		System.out.println(s1);
	}

}
