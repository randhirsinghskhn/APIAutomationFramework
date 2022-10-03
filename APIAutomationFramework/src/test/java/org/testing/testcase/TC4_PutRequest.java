package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest {

	@Test
	public void TC4_UpdatePutRequest() throws IOException
	{
		Properties pr= PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		String bodaydata= JsonHandle.readJson("../APIAutomationFramework/src/test/java/org/testing/resources/updateRequestPayload.json");
		Response res= http.PutRequest(bodaydata, "QA_URI_API", TC1_PostRequest.returnIdValue);
		System.out.println("******************Test Case 4*******************");
		System.out.println("Response code is: "+ res.statusCode());
		System.out.println("Response is: "+res.asString());
	}
	
}
