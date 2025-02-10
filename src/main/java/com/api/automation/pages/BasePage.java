package com.api.automation.pages;

import java.io.File;
import java.nio.file.Paths;
import java.util.Properties;

import com.api.automation.logging.InitiateLogger;
import com.api.automation.reports.ExtentTestManager;
import com.api.automation.utils.FileUtility;
import com.api.automation.utils.PropertyFilesUtility;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.restassured.RestAssured;

public class BasePage {

	private static String baseURI;
	Properties envprop = PropertyFilesUtility.readEnvProperties();

	public BasePage() {
		if (baseURI == null) {
			Properties configProp = PropertyFilesUtility.readConfigProperties();
			RestAssured.baseURI = configProp.getProperty("base.uri");

		} else {
			InitiateLogger.debug("Base URL is already initilized...");
		}

	}

	public static String getBaseURI() {
		if (baseURI == null) {
			setBaseURI(baseURI);
		}
		return baseURI;

	}

	public static String setBaseURI(String baseURI) {
		return baseURI = BasePage.baseURI;
	}

	public static void attachedResponse(String response) {
		String filePath = FileUtility.saveDataToFile(response);
		File file = new File(filePath);
		ExtentTestManager.getTest().log(Status.INFO, "<a href='" + file.getAbsolutePath() + "'>Response Body File</a>");
	}

}
