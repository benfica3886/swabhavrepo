package com.techlabs.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		case1();
		
		FileInputStream fi = new FileInputStream("Information.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Information Obj2= (Information) ois.readObject();
		System.out.println(Obj2.rollno);
		System.out.println(Obj2.name);
	}

	private static void case1() throws FileNotFoundException, IOException {
		Information info = new Information();
		info.name="abc";
		info.rollno=12;
		
		File f = new File("Information.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(info);
		oos.close();
	}
}
