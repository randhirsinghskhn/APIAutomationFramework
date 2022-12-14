package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.responseValidation;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.Reports;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC3_GetSingleRecordRequest {

	@Test
	public void TC3_SingleRecord() throws IOException
	{
		ExtentReports report= Reports.ExtentRepro();
		
		ExtentTest test=report.startTest("TC3_GetSingleRecordRequest");
		String expectedFirstName="Rashpal";
		Properties pr= PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		
		Response rs= http.GetSingleRecMethod("QA_URI_API", TC1_PostRequest.returnIdValue);
		System.out.println("**************Test Case 3******************");
		System.out.println("Status code is : "+rs.statusCode());
		System.out.println("resposne data is :"+ rs.asString());
		String actualFirstName=rs.jsonPath().get("firstname"); //fetching the first name from response using json path
		System.out.println("Actual First name is: "+actualFirstName);
		test=responseValidation.datavalidation(expectedFirstName, actualFirstName, test);
		
		report.endTest(test);
		report.flush();
		
		
	}
}
