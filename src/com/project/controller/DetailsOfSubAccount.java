package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.response.account.SubAccount;
import com.plivo.sdk.response.response.GenericResponse;
import com.plivo.sdk.xml.elements.Response;
public class DetailsOfSubAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method s
		SubAccount response = null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("subauth_id", "subauth_id");
		try
		{
			response = restApi.getSubaccount(parmas);
			System.out.println("subaccount limit: " + response.limit);
		}
		catch (PlivoException e) {
		e.printStackTrace();
		
		}
	}

}
