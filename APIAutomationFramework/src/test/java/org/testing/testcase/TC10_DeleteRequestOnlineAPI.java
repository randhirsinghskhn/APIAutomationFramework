package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC10_DeleteRequestOnlineAPI {

	@Test
	public void TC10_DeleteOnlineAPI() throws IOException
	{
		Properties pr=PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response rs= http.DeleteRequest("QA_URI_API_DELETE", TC7_GetAllRecordsOnlineAPI.idValue);
		System.out.println("********************Test Case 10*****************************");
		System.out.println("Response code is: "+ rs.statusCode());
	}
}
