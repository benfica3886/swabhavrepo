package com.techlabs.man;
import com.techlabs.interfac.*;

public class Boy extends Man implements D{

	public void read() {
		System.out.println("Reading");
	}
	@Override
	public 	void walk() {
		System.out.println("boy walking");
		
	}

	public static void main(String args[]) {
		Man m = new Boy();
		m.eat();
		m.walk();
		Boy b = new Boy(); 
		b.read();
	}
}
