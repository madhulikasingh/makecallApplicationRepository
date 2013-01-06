package com.project.controller;
import java.util.LinkedHashMap;

import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.account.Account;
import com.plivo.sdk.response.account.SubAccount;
import com.plivo.sdk.response.account.SubAccountFactory;
import com.plivo.sdk.response.response.GenericResponse;
import com.plivo.sdk.xml.elements.Response;
public class DetailsOfAllSubAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method s
		SubAccountFactory subAccountFactory = null;
		RestAPI restApi = new RestAPI("<AUTH_ID>", "<AUTH_TOKEN>", "v1");
		LinkedHashMap<String,String> parmas = new LinkedHashMap<String,String>();
		parmas.put("account", "subauth_id");
		try
		{
			subAccountFactory = restApi.getSubaccounts();
		}
		catch (PlivoException e) {
		  e.printStackTrace();//todo: log it using loggers
		}
		printSubAccountDetails(subAccountFactory);
	}

	private static void printSubAccountDetails(SubAccountFactory subAccountFactory) {
		
		for(SubAccount subAccount: subAccountFactory.SubAccountList)
		{
			System.out.println("****SubAccount Details****");
			System.out.println("SubAccount : " + subAccount.limit); // tostring method to be implemented in subaccount
		}
		
	}

}
