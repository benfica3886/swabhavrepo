package com.techlabs.CodeMags.ch3;

public class TestArray {
	public static void main (String[] args) {
		int y=0;
		int ref;
		int[] index = new int[4];
		index[0]=1;
		index[1]=2;
		index[2]=3;
		index[3]=2;
		String [] island = new String[4];
		island[0]="Bermuda";
		island[1]="Fiji";
		island[2]="Azores";
		island[3]="Cozumal";
		while(y<4) {
			ref = index[y];
			System.out.print("Isaland =");
			System.out.println(island[ref]);
			y=y+1;
		}	
	}

}
