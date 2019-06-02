package com.techlabs.FileWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public String name;
	public String writeContent;
	public String appendContent;
	
	public void writeFile() {
		try {
			FileWriter fw = new FileWriter("temp2.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.write(writeContent);
			pw.close();
		}

		catch (IOException e) {
			System.out.println("erroe");
		}
	}
	
	public void writeAppend() {
		try {
			FileWriter fw = new FileWriter(name , true);
			PrintWriter pw = new PrintWriter(fw);
			pw.append(appendContent);
			pw.close();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}
}


