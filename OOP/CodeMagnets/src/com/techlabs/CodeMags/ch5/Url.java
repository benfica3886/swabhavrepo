package com.techlabs.CodeMags.ch5;

public class Url {
	public static void main(String[] args) {
		if (args.length > 0) {
			for (int y = 0; y < args.length; y++) {
				int x = args[y].indexOf(".");
				int z = args[y].lastIndexOf(".");
				System.out.println("domain name:" + args[y].substring(x + 1, z));
				System.out.println("Query =" + args[y].substring(args[y].lastIndexOf("?")+1));
			}
		} else
			System.out.println("no input");
		System.out.println("No. of input:" + args.length);
	}
}
