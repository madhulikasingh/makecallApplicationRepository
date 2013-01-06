package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.application.Application;


public class DetailsofSingleApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application response = null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("app_id","123");
		try
		{
			response = restApi.getApplication(parmas);
                        System.out.println("application details fetched for:" +response.applicationID);
			
		}
		catch (PlivoException e) {
		e.printStackTrace(); // logger to be added
		}
	}

}
