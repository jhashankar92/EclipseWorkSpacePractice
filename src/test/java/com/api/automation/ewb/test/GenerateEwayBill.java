package com.api.automation.ewb.test;

import java.util.HashMap;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.automation.ewb.constants.PathConstants;
import com.api.automation.ewb.pages.AuthenticationPage;
import com.api.automation.ewb.pages.GenereateEwaybillPage;
import com.api.automation.ewb.utils.APIMethods;
import com.api.automation.ewb.utils.JsonUtility;
import com.api.automation.ewb.utils.PropertyUtils;
import com.api.automation.ewb.utils.RandomDataGenerator;
import com.api.automation.utils.FileUtility;

import io.restassured.response.Response;

public class GenerateEwayBill {

	Properties configProperties = PropertyUtils.readConfigProperty();
	public String ewb_no;
	public String data_ewb_no;
	public String bdoAuthToken;
	public String invoice_no;
	Assert sassert;

	
	@BeforeClass
	
	public void setTokenfromResponse() {
		
		String authTokenResponsefromFile = JsonUtility.readJsonFileToString(PathConstants.bdoAuthTokenResonsefile);
		 bdoAuthToken = JsonUtility.getValueFromJSONString(authTokenResponsefromFile, "bdo_auth_token");
	}

	@Test
	public void generateEwayBill() {
		
		GenereateEwaybillPage generateEwayBill = new GenereateEwaybillPage();
				
		HashMap<String, String> header = generateEwayBill.ewbGeneratePostHeader(bdoAuthToken);
		
		String ewbDocNoString = "EWB-" + RandomDataGenerator.getNumbericString(3);

		String payload = JsonUtility.updateJsonKeyInJsonFile(PathConstants.filepath, "docNo",ewbDocNoString);
		System.out.println("PayLoad"+payload);
		Response response = APIMethods.postRequest(configProperties.getProperty("ewb.gen.url"), payload, header);
		
		System.out.println("Response:"+response.asString());
		
		//sassert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.getStatusCode(),200,"Eway Bill generation is failed as the Status code is not 200");
		
		FileUtility.saveDataToFile(response.asString());
		
		//capture data from Generate EwayBill Response
		data_ewb_no = JsonUtility.getValueFromJSONString(response.asString(), "Data");
		ewb_no = JsonUtility.getValueFromJSONString(JsonUtility.getValueFromJSONString(response.asString(), "Data"), "ewayBillNo");
		invoice_no = JsonUtility.getValueFromJSONString(JsonUtility.getValueFromJSONString(response.asString(), "Data"), "invoiceNo");
		
		//System.out.println(response.asString());invoiceNo
		System.out.println("E-way Bill No.:"+ewb_no);
		System.out.println("Invoice No.:"+invoice_no);
		
		
	}
	
	
}
