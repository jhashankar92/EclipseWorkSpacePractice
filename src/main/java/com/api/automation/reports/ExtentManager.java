package com.api.automation.reports;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.api.automation.constants.ApplicationConstants;
import com.api.automation.utils.DateAndTimeUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentManager {

	private static ExtentReports extent;
	private static String reportFileName = "Automation-Report"
			+ DateAndTimeUtils.getCurrentdateAndTime(ApplicationConstants.REPORT_NAME_DATE_AND_TIME_FORMAT) + ".html";
	private static String fileSeperator = System.getProperty("file.separator");
	private static String reportFilepath = System.getProperty("user.dir") + fileSeperator + "TestReport";
	private static String reportFileLocation = reportFilepath + fileSeperator + reportFileName;

	public static ExtentReports getInstance() {
		if (extent == null)
			createInstance();
		return extent;
	}

	// Create an extent report instance
	public static ExtentReports createInstance() {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportFileLocation);

		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle(reportFileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(reportFileName);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		List<ViewName> DEFAULT_ORDER = Arrays.asList(ViewName.DASHBOARD, ViewName.CATEGORY, ViewName.TEST);
		htmlReporter.viewConfigurer().viewOrder().as(DEFAULT_ORDER);
		// Set environment details
		//extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Suite", "Regression");
		return extent;
	}

}
