package org.testing.teststeps;

import java.util.Properties;

import org.testing.utilities.JsonHandle;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

// for fetching the uri value from properties file, we need properties class object
public class HTTPMethods {

	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr= pr;
	}
	
	public  Response PostMethod(String bodydata, String UriKey)
	{
		Response rs=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(UriKey));
		
		
		return rs;
	}
	public Response GetAllMethod(String Urikey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(Urikey));
		
		return res;
	}
	
	public Response GetSingleRecMethod(String UriKey, String Idvalue)
	{
		String CompleteURI=pr.getProperty(UriKey)+"/"+Idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(CompleteURI);
		
		return res;
	}
	
	public Response PutRequest(String bodaydata,String UriKey, String IdValue)
	{
		String CompleteURI=pr.getProperty(UriKey)+"/"+IdValue;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodaydata)
		.when()
		.put(CompleteURI);
		
		return res;
		
	}
	
	public Response DeleteRequest(String UriKey,String IdValue)
	{
		String CompleteUri=pr.getProperty(UriKey)+"/"+IdValue;
		
		Response rs=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(CompleteUri);
		
		return rs;
	}
}
