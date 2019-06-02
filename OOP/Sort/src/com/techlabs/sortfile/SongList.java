package com.techlabs.sortfile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SongList {
	ArrayList <String> songList = new ArrayList<String>();
	
	public void addToList(String songTitle) {
		String[] song = songTitle.split(",");
		for(String s: song) {
		songList.add(s);
		Collections.sort(songList);
		}
		System.out.println(songList);
		
		}
}
