package com.techlabs.FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public void readFile(String file) {
		String fileContent;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader b = new BufferedReader(fr);
			while ((fileContent = b.readLine()) != null) {
				//System.out.println(fileContent + "\n");
			}
			b.close();
		}
		// BufferReader.close();
		catch (IOException e) {
			System.out.println("FILE NOT FOUND");
		}
	}

}
