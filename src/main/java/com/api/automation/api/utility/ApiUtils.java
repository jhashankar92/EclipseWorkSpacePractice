package com.api.automation.api.utility;

import java.util.HashMap;

import org.json.simple.JSONObject;

import com.api.automation.logging.InitiateLogger;

import groovyjarjarantlr4.v4.parse.GrammarTreeVisitor.locals_return;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtils {

	public static Response getRequest(String endpoint) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = RestAssured.get(endpoint);
		InitiateLogger.info("Status Code :"+response.getStatusCode());
		return response;		
	}
	
	public static Response getRequestWithParameter(String endpoint, HashMap< String, String> params) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization","Signature keyId=\"fis-buyer-staging.ondc.org|585|ed25519\",\r\n"
				+ "algorithm=\"ed25519\",created=\"1706597672\",expires=\"1706601272\",\r\n"
				+ "headers=\"(created) (expires) digest\",\r\n"
				+ "signature=\"1rPm1DagaPlNNGjY9pt4m+mM0Zhz7iZqQnh4WXXjvQNxBUNADP4mJvGKpAoZwxcdtVSquBGJ/pkDTzud3Yj5DQ==\"");
		request.params(params);
		Response response = RestAssured.get(endpoint);
		InitiateLogger.info("Status Code :"+response.getStatusCode());
		return response;
		
	}

	public static Response postRequest(String endpoint,String bodyRequest) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		//request.header("accept","application/json");
		request.body(bodyRequest);
		InitiateLogger.info("Request : "+bodyRequest);
		Response response = request.post(endpoint);
		InitiateLogger.info("Status Code :"+response.getStatusCode());
		return response;
	}
	
	public static Response postRequestWithHeader(String endpoint,String bodyRequest) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization","Signature keyId=\"fis-buyer-staging.ondc.org|585|ed25519\",\r\n"
				+ "algorithm=\"ed25519\",created=\"1706597672\",expires=\"1706601272\",\r\n"
				+ "headers=\"(created) (expires) digest\",\r\n"
				+ "signature=\"1rPm1DagaPlNNGjY9pt4m+mM0Zhz7iZqQnh4WXXjvQNxBUNADP4mJvGKpAoZwxcdtVSquBGJ/pkDTzud3Yj5DQ==\"");
		request.body(bodyRequest);
		InitiateLogger.info("Request Body for the API: "+"<br/>"+bodyRequest);
		Response response = request.post(endpoint);
		InitiateLogger.info("Status Code :"+response.getStatusCode());
		return response;
	}
	
	public static Response postRequestWithOutBody(String endpoint) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		//request.header("accept","application/json");
		Response response = request.post(endpoint);
		InitiateLogger.info("Status Code :"+response.getStatusCode());
		return response;
	}
	
}
