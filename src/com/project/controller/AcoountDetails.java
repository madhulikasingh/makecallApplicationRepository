package com.project.controller;
import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.xml.elements.Response;


public class AcoountDetails {
 public static void main(String[] args) {
		Account account= null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		try {
		account= restApi.getAccount();
		System.out.println("Account holders city: " +account.city);
		System.out.println("Account holders name: " +account.name);
		
		}
		catch (PlivoException e) {
			e.printStackTrace();
		}
		
	}

}