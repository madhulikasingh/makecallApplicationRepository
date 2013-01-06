package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.response.response.GenericResponse;
import com.plivo.sdk.xml.elements.Response;
public class SubAccount {
public static void main(String args[])
{
	GenericResponse response = null;
	RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
	LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
	parmas.put("name", "madhulika");
	parmas.put("enabled","false");

	try
	{
		response = restApi.createSubaccount(parmas);
		System.out.println(response.message);
		
	}
	catch (PlivoException e) {
		System.out.println(response.error);
	  e.printStackTrace();
	  
	}

}

}
