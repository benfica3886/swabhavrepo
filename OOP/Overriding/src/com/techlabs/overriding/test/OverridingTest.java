package com.techlabs.overriding.test;

import com.techlabs.overriding.BaseClass;

public class OverridingTest extends  BaseClass{

	//public int Calculate(int h,int w) {
		//return(h*w);
		
	//} 
	public static void main(String[] args) {
		BaseClass b = new OverridingTest(); 
		System.out.println("1="+b.Calculate(20, 10));
	   
	   	BaseClass b1 = new Override2();
	   	System.out.println("2="+b1.Calculate(10, 10));
	}

}

class Override2 extends BaseClass{
	
	public int Calulate(int h, int w) {
		return h-w;
	}
	
}
