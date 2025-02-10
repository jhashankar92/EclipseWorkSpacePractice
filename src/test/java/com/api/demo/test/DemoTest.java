package com.api.demo.test;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.api.automation.api.utility.ApiUtils;
import com.api.automation.constants.ApplicationConstants;
import com.api.automation.constants.PathConstants;
import com.api.automation.logging.InitiateLogger;
import com.api.automation.pages.BasePage;
import com.api.automation.utils.FileUtility;
import com.api.automation.utils.JsonUtility;
import com.ondc.api.base.test.BaseTest;

import io.restassured.response.Response;

public class DemoTest extends BaseTest{
	
	String baseURI = BasePage.getBaseURI();
	SoftAssert sAssert;
	
	@Test
	public void getRequest() {
		sAssert = new SoftAssert();
		Response response =ApiUtils.getRequest("/comments");
		InitiateLogger.info("Response : "+response.getBody().asString());
		sAssert.assertEquals(response.getStatusCode(), ApplicationConstants.SUCCESS_STATUS_CODE,"Api Is not returing 200 Sucess");
		FileUtility.saveDataToFile(response.getBody().asString());
		
	}
	
	@Test
	public void postRequest() {
		sAssert = new SoftAssert();
		String bodyRequest = JsonUtility.readJsonFileToString(PathConstants.POST_REQUEST_FILE_PATH);
		System.out.println(PathConstants.POST_REQUEST_FILE_PATH);
		System.out.println(bodyRequest);
		Response response =ApiUtils.postRequest("/posts", bodyRequest);
		InitiateLogger.info("Response : "+response.getBody().asString());
		sAssert.assertEquals(response.getStatusCode(), ApplicationConstants.SUCCESS_STATUS_CODE,"Api Is not returing 200 Sucess");
		FileUtility.saveDataToFile(response.getBody().asString());
		
	}

}
