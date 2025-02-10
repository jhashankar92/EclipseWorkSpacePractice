package com.api.automation.ewb.utils;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class APIMethods {

	public static  Response postRequest(String url, String requestBody, HashMap<String, String> heaader) {
		Response response = RestAssured.given().headers(heaader).body(requestBody)

				.when().post(url);
		return response;

	}

	public static Response getRequest(String url, String requestBody, HashMap<String, String> heaader) {
		Response response = RestAssured.given().headers(heaader).body(requestBody)

				.when().post(url);
		return response;

	}

	public static Response getRequestWithoutPayload(String url, HashMap<String, String> heaader) {
		Response response = RestAssured.given().headers(heaader).when().post(url);
		return response;

	}

}
