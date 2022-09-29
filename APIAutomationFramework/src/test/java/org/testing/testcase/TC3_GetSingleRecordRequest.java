package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC3_GetSingleRecordRequest {

	public void TC3_SingleRecord() throws IOException
	{
		Properties pr= PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		
		Response rs= http.GetSingleRecMethod("QA_URI_API", TC1_PostRequest.returnIdValue);
		System.out.println("**************Test Case 3******************");
		System.out.println("Status code is : "+rs.statusCode());
		System.out.println("resposne data is :"+ rs.asString());
		
	}
}
