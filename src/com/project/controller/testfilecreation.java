package com.project.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class testfilecreation {
public static void main(String[] args) {
	try
	{
	FileWriter fstream = new FileWriter("d:\\out.txt");
	
    BufferedWriter bufferedWriter = new BufferedWriter(fstream);
    bufferedWriter.write("Hello Java");
    //Close the output stream
    bufferedWriter.close();
	}catch (Exception e){//Catch exception if any
		System.err.println("Error: " + e.getMessage());
	}
}
}
