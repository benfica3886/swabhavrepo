package com.techlabs.child;

import com.techlabs.parent.*;

public class Child extends Parent {

	public Child(int y) {
		super(y);
		System.out.println("child");
	}

	public static void main(String[] args) {
		Child c = new Child(5);

	}
}
