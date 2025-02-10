package com.api.automation.ewb.pages;

import java.util.HashMap;
import java.util.Properties;

import com.api.automation.ewb.constants.ApplicationConstants;
import com.api.automation.ewb.constants.PathConstants;
import com.api.automation.ewb.utils.JsonUtility;
import com.api.automation.ewb.utils.PropertyUtils;

public class EwayBillUpdateVehiclePage {
	
	
		Properties configProp = PropertyUtils.readConfigProperty();
			
		public HashMap<String, String> ewbupdatevehiclePostHeader(String authToken) {
			HashMap<String, String> header = new HashMap<String, String>();
			header.put(ApplicationConstants.API_HEADER_CLIENTID, configProp.getProperty("ewb.clientId"));
			header.put(ApplicationConstants.API_HEADER_AUTH_TOKEN, authToken);
			return header;
		}

}
