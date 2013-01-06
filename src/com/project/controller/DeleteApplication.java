package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.response.GenericResponse;


public class DeleteApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericResponse response = null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("acc_id", "madhu_id");
		try {
		response = restApi.deleteApplication(parmas);
		System.out.println("Application deleted with message : " + response.message);
		} 
		catch (PlivoException e) {
			e.printStackTrace();
		}
		}
}
