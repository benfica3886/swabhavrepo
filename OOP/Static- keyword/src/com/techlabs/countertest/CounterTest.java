package com.techlabs.countertest;

import com.techlabs.counter.Counter;

public class CounterTest {
	
	 static {    
		Counter.name ="benfica";
	}
	
	public static void main( String[] args) {
		Counter c = new Counter();
		c.AddCounter1();
		c.AddCounter2();
		display(c);
		Counter c1 = new Counter();
		//display(c1);
		c1.AddCounter2();
		display(c1);
		Counter c2 = new Counter();
		Counter.AddCounter2();
		display(c2);
	}
	
	
	public static void display(Counter p) {
		System.out.println("not statci="+ p.count1);
		System.out.println("static = "+ Counter.count2);
		System.out.println("name = "+ Counter.name);
	}
	
}
