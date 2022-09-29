package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC6_PostRequestOnlineAPI {
public int idValue;
	public void TC6_PostReqOnlineAPI() throws IOException
	{
		Properties pr = PropertiesHandle.readPropertyFile("../APIAutomationFramework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		String BodyData=JsonHandle.readJson("../APIAutomationFramework/src/test/java/org/testing/resources/inputPayloadOnline.json");
		Response rs= http.PostMethod(BodyData, "QA_URI_API_ONLINE");
		System.out.println("*************************Test Case 6 *************************");
		System.out.println("Response code is: " + rs.statusCode());
		System.out.println("Response is: "+ rs.asString());
		JSONObject ob=new JSONObject(rs.asString());
//		System.out.println("Object value is: "+ ob.toString());
		JSONObject inner=ob.getJSONObject("data");
//		System.out.println("inner object is: "+inner.toString());
		idValue=inner.getInt("id");
		System.out.println("id value is: "+ idValue);
	}
}
