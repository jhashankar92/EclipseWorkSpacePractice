package com.api.automation.ewb.test;

import java.util.HashMap;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.automation.ewb.constants.PathConstants;
import com.api.automation.ewb.pages.EwayBillUpdateVehiclePage;
import com.api.automation.ewb.pages.GetEwayBillDetailsPage;
import com.api.automation.ewb.utils.APIMethods;
import com.api.automation.ewb.utils.JsonUtility;
import com.api.automation.ewb.utils.PropertyUtils;

import io.restassured.response.Response;

public class GetEwayBillDetailsTest {

	Properties configProperties = PropertyUtils.readConfigProperty();
	
	public String ewb_no;
	public String bdoAuthToken;
	public String data_ewb_no;
	
	
	Assert sassert;

	@BeforeClass

	public void getDataFromGenerateEwayBillResponse() {
		
		//Get Auth Token from Previous Response
		String authTokenResponsefromFile = JsonUtility.readJsonFileToString(PathConstants.bdoAuthTokenResonsefile);
		 bdoAuthToken = JsonUtility.getValueFromJSONString(authTokenResponsefromFile, "bdo_auth_token");
		
		//Get Ewb No., and Invoice.No from previous response
		String generateEwbResponsefromFile = JsonUtility.readJsonFileToString(PathConstants.generateEwbResonsefile);
		data_ewb_no = JsonUtility.getValueFromJSONString(generateEwbResponsefromFile, "Data");
		ewb_no = JsonUtility.getValueFromJSONString(data_ewb_no, "ewayBillNo");
		
	}
	
	@Test (priority = 1)
	
	public void getEwaybillDetails() {
		
		GetEwayBillDetailsPage getewaybilldetails = new GetEwayBillDetailsPage();
		
		HashMap<String, String> header = getewaybilldetails.getEwayBillDetailsHeader(bdoAuthToken);
		
		Response response =APIMethods.getRequestWithoutPayload((configProperties.getProperty("ewb.get.url")+ewb_no), header);
		//Response response = APIMethods.getRequest((configProperties.getProperty("ewb.get.url")+ewb_no), null, header);		
		System.out.println("Response:"+response.asString());
		
	}
	
}
