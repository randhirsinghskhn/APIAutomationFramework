package org.testing.utilities;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {

	
	public static String JsonParseSingleRec(String ResponseData,String Keyname)
	{
		JSONObject ob=new JSONObject(ResponseData);
		return ob.getString(Keyname);
		
	}
	
	public static void JsonParse(String ResponseData,String Keyname)
	{
		JSONArray array=new JSONArray(ResponseData);
		int L=array.length();
		for(int i=0;i<L;i++)
		{
			JSONObject ob=array.getJSONObject(i);
			System.out.println("Id value is : "+ob.getString(Keyname)) ;
		}
	}
	
	public static String JsonParseOnlineAPI(String ResponseData, String Keyname)
	{
		JSONObject ob=new JSONObject(ResponseData);
		JSONArray array=ob.getJSONArray("data");
		int L=array.length();
		for(int i=0;i<L;i++)
		{
			JSONObject obinner=array.getJSONObject(i);
			System.out.println("Id value is : "+obinner.get(Keyname)) ;
		}
		Random random = new Random();
	    int rndmValue= random.nextInt(L - 1) + 1;
		JSONObject obinner=array.getJSONObject(rndmValue);
		String id= obinner.get(Keyname).toString();
		return id;
		
	}
}
