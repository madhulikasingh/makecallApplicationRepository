package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.response.response.GenericResponse;


public class DeleteSubAccount {
public static void main(String args[])
{
	GenericResponse response = null;
	RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
	LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
	parmas.put("subauth_id", "madhuSubauth_id");
	try {
	response = restApi.deleteSubaccount(parmas);
        System.out.println("SubAccount Deleted with Message:" + response.message);
	
	} 
	catch (PlivoException e) {
		
	}
	}
}

