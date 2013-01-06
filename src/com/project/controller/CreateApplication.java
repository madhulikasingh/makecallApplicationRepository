package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.response.response.GenericResponse;
import com.plivo.sdk.xml.elements.Response;
public class CreateApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericResponse response = null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("answer_url","https://dl-web.dropbox.com/get/documentplivo/madhulika1.xml?w=81522631");
		parmas.put("app_name", "xyz");
		try
		{
			response = restApi.createApplication(parmas);
                    
                        System.out.println("Application created with message: " + response.message);
            
		}
		catch (PlivoException e) {
		
		}
	}

}
