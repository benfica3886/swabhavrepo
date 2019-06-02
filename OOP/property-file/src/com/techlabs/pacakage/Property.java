package com.techlabs.pacakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.xml.stream.XMLStreamException;


public class Property {
	public static void main(String[] args) throws XMLStreamException, IOException{
		Case1();
		
		InputStream is = new FileInputStream("info.properties");
		OutputStream os = new FileOutputStream("info.xml");
		Properties p = new Properties();
		p.load(is);
		p.storeToXML(os, "info.properties", "UTF-8");
		
	}

	private static void Case1() throws IOException, FileNotFoundException {
		Properties p = new Properties();
		p.setProperty("name", "abc");
		p.setProperty("Location", "Mumbai");
		p.store(new FileWriter("info.properties"),"comments");
		FileReader file = new FileReader("info.properties");
		p.load(file);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("Location")); 
	}
}
 