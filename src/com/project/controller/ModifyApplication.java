package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.response.GenericResponse;


public class ModifyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericResponse response = null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("app_id","123");
		parmas.put("name", "madhu");
		try
		{
			response = restApi.modifyApplication(parmas);
			System.out.println(response.message);
		}
		catch (PlivoException e) {
			System.out.println(response.error);
				}
	}
}
