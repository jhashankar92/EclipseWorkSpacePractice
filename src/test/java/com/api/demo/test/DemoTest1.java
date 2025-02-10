package com.api.demo.test;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class DemoTest1 {
	
	
	@Test
	public static void getResponseBody() {
		
		given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();		
	}
	
	@Test
	public void getResponseBodyWithParam() {
		given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").
		when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();		
	}
  
	@Test
	public void getResponseBodyWithStatusCode() {
		int statusCode=given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").
		when().get("http://demo.guru99.com/V4/sinkministatement.php").statusCode();
		System.out.println("Status Code : " +statusCode);
		
		given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
}
 
	@Test
	public void getHeadersFromAPI() {
		System.out.println("The Header of The API : "+given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").
				when().get("http://demo.guru99.com/V4/sinkministatement.php").then().extract().headers());
	}
	
	@Test
	public void getContentFromAPI() {
		System.out.println("The Header of The API : "+given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").
				when().get("http://demo.guru99.com/V4/sinkministatement.php").then().extract().contentType());
	}
	
	@Test
	public void getResponseTime() {
		System.out.println("The Response time Of API :" + given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").
				when().get("http://demo.guru99.com/V4/sinkministatement.php").timeIn(TimeUnit.MILLISECONDS)+"milliseconds");
	}
	
	
}