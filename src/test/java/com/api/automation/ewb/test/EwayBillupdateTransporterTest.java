package com.api.automation.ewb.test;
import java.util.HashMap;
import java.util.Properties;

import org.bouncycastle.asn1.eac.ECDSAPublicKey;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.automation.ewb.constants.PathConstants;
import com.api.automation.ewb.pages.GenereateEwaybillPage;
import com.api.automation.ewb.pages.UpdateTransporterPage;
import com.api.automation.ewb.utils.APIMethods;
import com.api.automation.ewb.utils.JsonUtility;
import com.api.automation.ewb.utils.PropertyUtils;
import com.api.automation.ewb.utils.RandomDataGenerator;
import com.api.automation.utils.FileUtility;

import io.restassured.response.Response;

public class EwayBillupdateTransporterTest {
	
	
	Properties configProperties = PropertyUtils.readConfigProperty();
	public String ewb_no;
	public String data_ewb_no;
	public String bdoAuthToken;
	public String invoice_no;
	Assert sassert;

	@BeforeClass

	public void getDataFromPreviousResponse() {
		
		//Get Auth Token from Previous Response
		String authTokenResponsefromFile = JsonUtility.readJsonFileToString(PathConstants.bdoAuthTokenResonsefile);
		bdoAuthToken = JsonUtility.getValueFromJSONString(authTokenResponsefromFile, "bdo_auth_token");
		
		//Get Ewb No., and Invoice.No from previous response
		String generateEwbResponsefromFile = JsonUtility.readJsonFileToString(PathConstants.generateEwbResonsefile);
		data_ewb_no = JsonUtility.getValueFromJSONString(generateEwbResponsefromFile, "Data");
		ewb_no = JsonUtility.getValueFromJSONString(data_ewb_no, "ewayBillNo");
		invoice_no = JsonUtility.getValueFromJSONString(data_ewb_no, "invoiceNo");
		

	}
	
	@Test (priority = 1)
	
	public void updateTransporter() {
		
		UpdateTransporterPage updateTransporterPage = new UpdateTransporterPage();
		
		//Update document Number in payload
		String docnumberpayload = JsonUtility.updateJsonKeyInJsonFile(PathConstants.updatetransporterfilepath, "doc_no", invoice_no);
		System.out.println("Updated payload with doc no.: -->" + docnumberpayload);
		
		//Update EWB Number in payload
		String EWBNumberpayload = JsonUtility.updateJsonKeyInJsonString(docnumberpayload, "ewbNo", ewb_no);
		System.out.println("Updated payload with EWB no.: -->"+ EWBNumberpayload);
		
		//Update Transporter ID in payload
		String TransporterIdpayload = JsonUtility.updateJsonKeyInJsonString(EWBNumberpayload, "transporterId", "05AAACC2870R1ZD");
		
		//Update Transporter ID in payload
		String TransporterNamePayload = JsonUtility.updateJsonKeyInJsonString(TransporterIdpayload, "transporterName", "Shankar");
		System.out.println("TransporterNamePayload*****"+ TransporterNamePayload);
		
		HashMap<String, String> header = updateTransporterPage.ewbupdatetransporterPostHeader(bdoAuthToken);
		Response response = APIMethods.postRequest(configProperties.getProperty("ewb.update.trans.url"), TransporterNamePayload, header);
		
		System.out.println("************************");
		System.out.println("EWB Update Transporter Resposne:-->"+ response.asString());
		
		FileUtility.saveDataToFile(response.asString());
		
	}
	
	
	

}
