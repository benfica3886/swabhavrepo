package com.techlabs.arguments;

public class Url {
	public static void main(String[] args) {
		if (args.length > 0) {
			for (int y = 0; y < args.length; y++) {
				String arr[] = args[y].split("\\.");
				System.out.println("Domain name:" + arr[1]);
				System.out.println("Query =" + args[y].substring(args[y].lastIndexOf("?") + 1));
			}
		} else
			System.out.println("no input");
		System.out.println("No. of input:" + args.length);
	}
}
