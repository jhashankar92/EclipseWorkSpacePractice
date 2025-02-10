package com.api.automation.ewb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	public static Properties readConfigProperty() {

		Properties prop = new Properties();
		Properties ewbpayloadfile = new Properties();

		FileInputStream fis;
	
		try {
			fis = new FileInputStream(
					"C:\\Data Drive\\SeleniumWorkSpace\\API Automation with Framework\\CoreApiAutomationFW\\src\\main\\resources\\PropertyFile\\Dev\\configuration.properties");
			prop.load(fis);

						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}	

	public static Properties readGenarateEwbPayload() {

		Properties ewbpayloadfile = new Properties();

		FileInputStream fis;

		try {
			fis = new FileInputStream(
					"C:\\Data Drive\\SeleniumWorkSpace\\API Automation with Framework\\CoreApiAutomationFW\\src\\main\\resources\\PropertyFile\\Dev\\configuration.properties");
			ewbpayloadfile.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ewbpayloadfile;

	}

}
