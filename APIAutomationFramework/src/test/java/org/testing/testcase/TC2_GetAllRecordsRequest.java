package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.responseValidation.responseValidation;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.Reports;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC2_GetAllRecordsRequest {

	@Test
	public void TC2_GetAllRecordsMethod() throws IOException
	{
		ExtentReports report= Reports.ExtentRepro();
		ExtentTest test=report.startTest("TC2_GetAllRecordsRequest");
		Properties pr= PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods ht=new HTTPMethods(pr);
		Response rs= ht.GetAllMethod("QA_URI_API");
		System.out.println("****************Test Case 2********************");
		System.out.println("Status code is : "+ rs.statusCode());
		System.out.println("response data is: "+ rs.asString());
		JsonParsingUsingOrgJson.JsonParse(rs.asString(), "id");
		
		test= responseValidation.statuscodevalidation(200, rs, test);
	    report.endTest(test);
	    report.flush();
				
	}
}
