package com.project.controller;
import java.util.LinkedHashMap;
import java.util.List;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.application.Application;
import com.plivo.sdk.response.application.ApplicationFactory;
import com.plivo.sdk.response.response.GenericResponse;


public class GetDetailOfApplication {
public static void main(String args[])
{
	ApplicationFactory applicationFactory = null;
	RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
	LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
	parmas.put("limit", "10");
	parmas.put("offset", "705");
	try
	{
		applicationFactory = restApi.getApplications(parmas);
		printAllApplicationDetails(applicationFactory.ApplicationList);
                
		
	}
	catch (PlivoException e) {
		
	  e.printStackTrace();
	}
}

private static void printAllApplicationDetails(List<Application> applicationList) {
	for (Application application : applicationList)
	{
		System.out.println("****Printing All Application Detail****");
		System.out.println("Application ID : " + application.applicationID);
		System.out.println("Application Name: " + application.applicationName);
	}
	
	
}
}
