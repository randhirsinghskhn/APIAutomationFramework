package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_GetAllRecordsOnlineAPI {

	public static String idValue;
	@Test
	public void TC7_AllRecords() throws IOException
	{
		Properties pr=PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response rs= http.GetAllMethod("QA_URI_API_ALL");
		System.out.println("*********************Test Case 7********************************");
		System.out.println("Response code is : "+ rs.statusCode());
		System.out.println("Response is: " + rs.asString());
		idValue= JsonParsingUsingOrgJson.JsonParseOnlineAPI(rs.asString(), "id");
		System.out.println("idValue is: "+ idValue);		
	}
}
