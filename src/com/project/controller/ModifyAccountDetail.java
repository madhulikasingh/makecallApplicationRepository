package com.project.controller;

import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.response.response.GenericResponse;
import com.plivo.sdk.xml.elements.Response;


public class ModifyAccountDetail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericResponse response = null;
		// TODO Auto-generated method stub
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("city", "Blore");
		parmas.put("name","Madhulika");
		
		try {
			response = restApi.modifyAccount(parmas);
			
			
			System.out.println(response.message);
		} 
		catch (PlivoException e) {
			System.out.println(response.error);
		}

}
}