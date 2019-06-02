package com.techlabs.boy;

import com.techlabs.man.Man;

public class Boy extends Man {
	public void eat() {
		System.out.println("Boy eating");
	}
	
	public void walk() {
		System.out.println("Boy walking");
	}
	
	@Override
	public void play() {
		System.out.println("Boy playing");
	}
}
