package org.testing.runner;

import java.io.IOException;

import org.testing.testcase.TC10_DeleteRequestOnlineAPI;
import org.testing.testcase.TC1_PostRequest;
import org.testing.testcase.TC2_GetAllRecordsRequest;
import org.testing.testcase.TC3_GetSingleRecordRequest;
import org.testing.testcase.TC4_PutRequest;
import org.testing.testcase.TC5_DeleteRequest;
import org.testing.testcase.TC6_PostRequestOnlineAPI;
import org.testing.testcase.TC7_GetAllRecordsOnlineAPI;
import org.testing.testcase.TC8_GetParticularRecordOnlineAPI;
import org.testing.testcase.TC9_UpdateRecordOnlineAPI;

public class TriggerClass {

	public static void main(String[] args) throws IOException {
	
//		TC1_PostRequest t1=new TC1_PostRequest();
//		t1.TC1_PostRequestMethod();
//		
//		TC2_GetAllRecordsRequest t2=new TC2_GetAllRecordsRequest();
//		t2.TC2_GetAllRecordsMethod();
//		
//		TC3_GetSingleRecordRequest t3=new TC3_GetSingleRecordRequest();
//		t3.TC3_SingleRecord();
//		
//		TC4_PutRequest t4=new TC4_PutRequest();
//		t4.TC4_UpdatePutRequest();
//		
//		TC5_DeleteRequest t5=new TC5_DeleteRequest();
//		t5.TC5_DeleteRecord();
		
//		TC6_PostRequestOnlineAPI t6=new TC6_PostRequestOnlineAPI();
//		t6.TC6_PostReqOnlineAPI();
		
		TC7_GetAllRecordsOnlineAPI t7=new TC7_GetAllRecordsOnlineAPI();
		t7.TC7_AllRecords();
		
//		TC8_GetParticularRecordOnlineAPI t8=new TC8_GetParticularRecordOnlineAPI();
//		t8.TC8_GetParticularRecdOnlnAPI();
//		
//		TC9_UpdateRecordOnlineAPI t9=new TC9_UpdateRecordOnlineAPI();
//		t9.TC9_Updateparticular();
		
		TC10_DeleteRequestOnlineAPI t10= new TC10_DeleteRequestOnlineAPI();
		t10.TC10_DeleteOnlineAPI();
	}
}
