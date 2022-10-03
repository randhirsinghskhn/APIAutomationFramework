package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_GetParticularRecordOnlineAPI {

	@Test
	public void TC8_GetParticularRecdOnlnAPI() throws IOException
	{
		Properties pr=PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response rs= http.GetSingleRecMethod("QA_URI_API_SINGLE", TC7_GetAllRecordsOnlineAPI.idValue);
		System.out.println("*********************Test Case 8*****************************");
		System.out.println("Response code is: "+rs.statusCode());
		System.out.println("Response data is: "+rs.asString());
	}
}
