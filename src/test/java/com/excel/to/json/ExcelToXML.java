package com.excel.to.json;

import java.util.List;

import com.api.automation.utils.ExcelSheetUtility;
import com.api.automation.utils.JsonUtility;

public class ExcelToXML {

	public static void main(String args[]) {
		JsonUtility jsonUtility = new JsonUtility();
		String jsonData = JsonUtility.readJsonFileToString(
				"C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\ExcelJson\\SampleJson.xml");
		System.out.println("Json :" + jsonData);

		ExcelSheetUtility excelSheetUtility = new ExcelSheetUtility();
		List<String> data =excelSheetUtility.readExcelColumnData(
				"C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\ExcelJson\\Multiples Private Equity Fund I - CRS - CY 2022.xlsx",
				"SendingCompanyIN*", "Message Header");
		excelSheetUtility.readExcelRowData(jsonData, 0);
		
		System.out.println(data);
		
		
	}

}
