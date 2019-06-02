package com.techlabs.vehicle;


public class TestClass {
	public static void main(String[] args){
		//IMovable[] m = new IMovable[3];
		IMovable[] m= {new Bike(),new Truck(),new Car()};
		StartRace(m);
	}
	
	public static void StartRace(IMovable[] move) {
		for(IMovable m: move) {
			m.move();
		}
	}
}
