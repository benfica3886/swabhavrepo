package com.techlabs.numberstest;
import java.util.*;

import com.techlabs.numbers.NumberCheck;

public class NumbersTest {
	
	
	public static void main(String[] args) {
	String result=null;
	NumberCheck n = new NumberCheck();
	n.setNumToGuess();
	Scanner in = new Scanner(System.in);
	//System.out.println("enter num:");
	//String result= n.checkValue(in.nextInt());
	//System.out.println(result);
	while(result != "FOUND") {
		System.out.println("enter num:");
		result= n.checkValue(in.nextInt());
		System.out.println(result);
	}
	in.close();
	
	}
	
}
