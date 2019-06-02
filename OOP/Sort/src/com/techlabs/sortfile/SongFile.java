package com.techlabs.sortfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SongFile {
	public void songfile() throws IOException{
	
		try {
			FileReader read = new FileReader("songs.txt");
			BufferedReader readfile = new BufferedReader(read);
			String txt;
			while((txt = readfile.readLine()) != null) {
				new SongList().addToList(txt);
			}
			readfile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
