package com.techlabs.FileTest;

import com.techlabs.FileRead.FileRead;
import com.techlabs.FileWrite.FileWrite;

public class FileTest {

	public static void main(String[] args) {
		FileWrite fw = new FileWrite();
		FileRead fr = new FileRead();
		fw.writeContent="how are you?";
		fw.appendContent ="good morning";
		fw.writeFile();
		fw.writeFile();
		fr.readFile("temp2.txt");
		fw.name ="demo.txt";
		fw.writeAppend();
	}

}
     