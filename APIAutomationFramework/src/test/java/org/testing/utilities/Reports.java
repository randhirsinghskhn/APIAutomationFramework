package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class Reports {

	static ExtentReports reports;
	public static ExtentReports ExtentRepro()
	{
		reports = new ExtentReports("C:\\Users\\randh\\git\\APIAutomationFramework\\APIAutomationFramework\\src\\test\\report2.html", false);
		return reports;
	}
}
