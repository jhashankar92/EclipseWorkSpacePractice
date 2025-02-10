package com.api.automation.constants;

public class PathConstants {
	
	
	public static final String SRC_PATH= System.getProperty("user.dir");
	public static final String RESOURCE_PATH= System.getProperty("user.dir")+"\\src\\main\\resources";
	public static final String ENV_PROPERTIES_PATH= RESOURCE_PATH+"\\environment.properties";
	public static final String CONFIG_PROPERTIES_PATH= RESOURCE_PATH+"\\PropertyFile\\*env*\\configuration.properties";
	public static final String COMMON_DATA_PROPERTIES_FILE = null;
	public static final String DOWNLOAD_FILE_PATH = null;
	public static final String RESPONSE_FILE_PATH=RESOURCE_PATH+"\\Response\\";
	
	
	//request file file path
	public static final String POST_REQUEST_FILE_PATH=RESOURCE_PATH+"\\PropertyFile\\TestData\\PostRequestRequestBody.json";
	public static final String SEARCH_REQUEST_BODY_FILE_PATH=RESOURCE_PATH+"\\PropertyFile\\TestData\\SearchJsonRequest.json";
	public static final String ON_SEARCH_REQUEST_BODY_FILE_PATH=RESOURCE_PATH+"\\PropertyFile\\TestData\\OnSearchJsonRequest.json";
	public static final String SELECT_REQUEST_BODY_FILE_PATH=RESOURCE_PATH+"\\PropertyFile\\TestData\\SelectJsonRequest.json";
	
}
