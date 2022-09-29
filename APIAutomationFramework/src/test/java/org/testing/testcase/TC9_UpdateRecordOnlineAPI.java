package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC9_UpdateRecordOnlineAPI {

	public void TC9_Updateparticular() throws IOException
	{
		Properties pr=PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		String BodyData= JsonHandle.readJson("../APIAutomationFramework/src/test/java/org/testing/resources/UpdateRequestOnlineAPI.json");
		Response rs= http.PutRequest(BodyData, "QA_URI_API_PUT", TC7_GetAllRecordsOnlineAPI.idValue);
		System.out.println("************************Test Case 9***********************************");
		System.out.println("Response code is: "+ rs.statusCode());
		System.out.println("Response is :" + rs.asString());
	}
}
