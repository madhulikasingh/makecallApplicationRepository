package com.project.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import com.plivo.sdk.client.RestAPI;
import com.plivo.sdk.exception.PlivoException;
import com.plivo.sdk.response.call.Call;
import com.plivo.sdk.xml.elements.Dial;
import com.plivo.sdk.xml.elements.Response;
import com.plivo.sdk.xml.elements.Number;
/**
 * Servlet implementation class ServiceController
 */
public class MakeCallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String yourNumber = request.getParameter("yourNumber");
		System.out.println("From : " + from + " To : " + to + " Your Number : " + yourNumber);
		
		Response rs = createDynamicXml(from, to);
		System.out.println(rs.serializeToXML());
		hostXMLasURL(rs);

		
		makeCallUsingPlivo(out, yourNumber, to);
	}

	private void makeCallUsingPlivo(PrintWriter out, String yourNumber, String to) {
		RestAPI restAPI = new RestAPI("MAOGM1MMQXODBJNZE1ZD", "ZjI1YWI0NzJlODM3NmJkNTMwNjJmZDE5MTgyMDU3", "v1");
		LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
		params.put("from", yourNumber);
		params.put("to", to);
		params.put("answer_url", "http://174.129.157.75:8090/plivo/plivocall1.xml");	//https://dl-web.dropbox.com/get/documentplivo/madhulika.xml?w=a1be6b11
		Call responsePlivo;
		try {

			responsePlivo = restAPI.makeCall(params);
			System.out.println(responsePlivo.apiID);
			out.println(responsePlivo.apiID);
			System.out.println("reached here!!!");
		} 
		catch (PlivoException e) {
			System.out.println(e.getMessage());
			out.println(e.getMessage());
		}
	}

	private void hostXMLasURL(Response rs) {
		BufferedWriter bufferedWriter =null;
		try
		{
		FileWriter fstream = new FileWriter("/home/madhulika/apache2/htdocs/xml/plivocall1.xml");
        bufferedWriter = new BufferedWriter(fstream);
        bufferedWriter.write(rs.serializeToXML());
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		finally
		{
			try
            {
				bufferedWriter.close(); 
            }
            catch(IOException ex)
            {
                 
           }
		}
	}

	private Response createDynamicXml(String from, String to) {
		Response rs = new Response();
		Dial dial = new Dial();
	    Number number = new Number();
		number.setNumber(to);
		dial.setNumber(number);
		dial.setCallerId(from);
		rs.setDial(dial);
		return rs;
	}
}
