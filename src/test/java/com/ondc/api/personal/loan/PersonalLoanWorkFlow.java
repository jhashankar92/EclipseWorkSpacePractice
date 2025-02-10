package com.ondc.api.personal.loan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.api.automation.api.utility.ApiUtils;
import com.api.automation.constants.ApplicationConstants;
import com.api.automation.constants.PathConstants;
import com.api.automation.logging.InitiateLogger;
import com.api.automation.pages.BasePage;
import com.api.automation.pages.CommonPage;
import com.api.automation.utils.FileUtility;
import com.api.automation.utils.JsonUtility;
import com.ondc.api.base.test.BaseTest;

import io.restassured.response.Response;

public class PersonalLoanWorkFlow extends BaseTest {

	String baseURI = BasePage.getBaseURI();
	SoftAssert sAssert;

	@Test
	public void verifyPostSearchRequest() {
		InitiateLogger.info("Verify The Search API with Country Parameter");
		sAssert = new SoftAssert();

		String bodyrequest = JsonUtility.readJsonFileToString(PathConstants.SEARCH_REQUEST_BODY_FILE_PATH);
		Response response = ApiUtils.postRequestWithHeader("search", bodyrequest);
		InitiateLogger.info("Response : " + response.getBody().asString());

		sAssert.assertEquals(response.getStatusCode(), ApplicationConstants.SUCCESS_STATUS_CODE,
				"Api is not returing the success response");
		sAssert.assertEquals(CommonPage.readAcknowledgeFromResponse(response.getBody().asString()), "ACK",
				"There is issue with Api as Acknowlegment is not received");
		FileUtility.saveDataToFile(response.getBody().asString());
		sAssert.assertAll();

	}

	@Test
	public void verifyPostOnSearchRequest() {
		InitiateLogger.info("Verify The OnSearch API ");
		sAssert = new SoftAssert();
		/*
		 * String bodyrequest = JsonUtility.readJsonFileToString(
		 * "C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\PropertyFile\\TestData\\OnSearchJsonRequest.json"
		 * );
		 */
		String bodyrequest = JsonUtility.readJsonFileToString(PathConstants.ON_SEARCH_REQUEST_BODY_FILE_PATH);
		Response response = ApiUtils.postRequestWithHeader("onsearch", bodyrequest);
		InitiateLogger.info("Response : " + response.getBody().asString());

		sAssert.assertEquals(response.getStatusCode(), ApplicationConstants.SUCCESS_STATUS_CODE,
				"Api is not returing the success response");
		
		sAssert.assertEquals(CommonPage.readAcknowledgeFromResponse(response.getBody().asString()), "ACK",
				"There is issue with Api as Acknowlegment is not received");
		FileUtility.saveDataToFile(response.getBody().asString());
		attachedResponse(response.getBody().asString());
		sAssert.assertAll();

	}

	@Test
	public void verifyPostSelectRequest() {
		InitiateLogger.info("Verify The Select API ");
		sAssert = new SoftAssert();

		String bodyrequest = JsonUtility.readJsonFileToString(PathConstants.SELECT_REQUEST_BODY_FILE_PATH);
		Response response = ApiUtils.postRequestWithHeader("select", bodyrequest);
		InitiateLogger.info("Response : " + response.getBody().asString());

		sAssert.assertEquals(response.getStatusCode(), ApplicationConstants.SUCCESS_STATUS_CODE,
				"Api is not returing the success response");
		sAssert.assertEquals(CommonPage.readAcknowledgeFromResponse(response.getBody().asString()), "ACK",
				"There is issue with Api as Acknowlegment is not received");
		FileUtility.saveDataToFile(response.getBody().asString());
		attachedResponse(response.getBody().asString());
		sAssert.assertAll();

	}

}
