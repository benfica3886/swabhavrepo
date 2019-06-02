package com.techlabs.child;
import com.techlabs.man.*;

 interface A{
	public static void run() {
		// TODO Auto-generated method stub
		
	}
}

interface B{
	public void sleep();
}

public class Child extends Man  implements A,B{
 
	public void walk() {
		System.out.println("child walking");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
	}
	 
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		Child m = new Child();
		m.eat();
		m.walk();
		m.run();
		m.sleep();
	}
}
