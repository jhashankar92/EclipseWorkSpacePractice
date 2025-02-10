package com.api.automation.ewb.test;

import org.testng.annotations.Test;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.api.automation.ewb.pages.AuthenticationPage;
import com.api.automation.ewb.utils.APIMethods;
import com.api.automation.ewb.utils.JsonUtility;
import com.api.automation.ewb.utils.PropertyUtils;
import com.api.automation.utils.FileUtility;

import io.restassured.response.Response;

public class AuthenticationTest {
	
	Properties configProperties = PropertyUtils.readConfigProperty();
	public static String ewb_BDO_AUTH_Token;

	@Test
	public void getAuthToken() {
		AuthenticationPage authenticationPage = new AuthenticationPage();

		System.out.println(authenticationPage.ewbAuthenticationPayload());

		Response response = APIMethods.postRequest(configProperties.getProperty("ewb.auth.url"),
				authenticationPage.ewbAuthenticationPayload(), authenticationPage.ewbAuthenticationGetHeader());

		System.out.println(response.asString());

		// converting response to JSON Object
		JSONObject jo = new JSONObject(response.asString());

		// Storing Auth token in a variable
		ewb_BDO_AUTH_Token = jo.get("bdo_auth_token").toString();
		System.out.println("BDO Auth Token is:" + ewb_BDO_AUTH_Token);
		JsonUtility.getValueFromJSONString(response.asString(),"bdo_auth_token");
		
		//FileUtility.saveDataToFile(response.asString());
		FileUtility.saveDataToFile(response.asString());
	}

}
