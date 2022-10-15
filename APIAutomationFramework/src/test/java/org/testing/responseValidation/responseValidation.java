package org.testing.responseValidation;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class responseValidation {

	public static ExtentTest statuscodevalidation(int Expectedstatus, Response res, ExtentTest test)
	{
		if(Expectedstatus==res.getStatusCode())
		{
			test.log(LogStatus.PASS, "Status code is matching with the expected status code");
		}
		else
		{
			test.log(LogStatus.FAIL, "Status code is not matching with the expected status code");
		}
		return test;
	}
	
	public static ExtentTest datavalidation(String Expectedfirstname, String ActualFirstname, ExtentTest test)
	{
		if(Expectedfirstname.equalsIgnoreCase(ActualFirstname))
		{
			test.log(LogStatus.PASS, "First Name is matching with the expected first name");
		}
		else
		{
			test.log(LogStatus.FAIL, "First Name is not matching with the expected first name");
		}
		return test;
	}
}
