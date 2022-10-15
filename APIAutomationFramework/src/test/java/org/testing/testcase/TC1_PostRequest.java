package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.responseValidation;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.Reports;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC1_PostRequest {

	public static String returnIdValue;
	@Test
	public  void TC1_PostRequestMethod() throws IOException {
		ExtentReports report=Reports.ExtentRepro();
		ExtentTest test=report.startTest("TC1_PostRequest");
		
		Properties pr=PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods hm=new HTTPMethods(pr);
		String bodydata=JsonHandle.readJson("../APIAutomationFramework/src/test/java/org/testing/resources/inputPayload.json");
		
		
		
		Random r=new Random();
		Integer idvalue=r.nextInt();
		bodydata=VariableReplacement.assignValue(bodydata, "id", idvalue.toString());
		
		
		Response rs=hm.PostMethod(bodydata, "QA_URI_API");
		System.out.println("***********Test Case 1*****************");
		System.out.println("Resonse code is: "+ rs.statusCode());
		System.out.println("Response is : "+ rs.asString());
		returnIdValue=JsonParsingUsingOrgJson.JsonParseSingleRec(bodydata.toString(), "id");
		
		test=responseValidation.statuscodevalidation(201,rs, test);
		report.endTest(test);
		report.flush(); // for saving the report
	}
}
