package co.techlans.test;

import com.techlabs.boy.Boy;
import com.techlabs.chlid.Child;
import com.techlabs.kid.Kid;
import com.techlabs.man.Man;

public class Test {
	public static void main(String[] args) {
		//Case1();
		//Case2();
		//Case3();
		case4();
	}

	private static void case4() {
		poly(new Man());
		poly(new Boy());
		poly(new Child());
		poly(new Kid());
	}
	
	private static void poly(Man x) {
		x.play();
		x.read();
	}

	private static void case3() {
		Man x;
		x = new Boy();
		x.play();
		x.read();
	}

	private static void case2() {
		Boy y;
		y = new Boy();
		y.play();
		y.eat();
		y.walk();
	}

	private static void case1() {
		Man x;
		x= new Man();
		x.play();
		x.read();
	}
}
