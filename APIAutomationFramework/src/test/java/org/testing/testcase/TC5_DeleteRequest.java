package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC5_DeleteRequest {

	public void TC5_DeleteRecord() throws IOException
	{
		Properties pr= PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		
		Response rs= http.DeleteRequest("QA_URI_API", TC1_PostRequest.returnIdValue);
		System.out.println("***************Test Case 5******************");
		System.out.println("Response code is: "+rs.statusCode());
		
	}
}
