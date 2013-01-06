package com.project.controller;

import com.plivo.sdk.xml.elements.Dial;
import com.plivo.sdk.xml.elements.Number;
import com.plivo.sdk.xml.elements.Response;

public class DynamicXmlGeneration {
public static void main(String[] args) {
	Response rs = new Response();
	Dial dial = new Dial();
    Number number = new Number();
	number.setNumber("9987678585");
	dial.setNumber(number);
	dial.setCallerId("68969699");
	rs.setDial(dial);
	System.out.println(rs.serializeToXML());
}
}
