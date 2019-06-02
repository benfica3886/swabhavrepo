package com.techlabs.human.test;

import com.techlabs.human.GenderType;
import com.techlabs.human.Human;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human(155, 100, "adee", 25, GenderType.FEMALE);
		System.out.println("name=" + h.getName());
		System.out.println("height =" + h.getHeight());
		System.out.println("weight=" + h.getWeight());
		System.out.println("BMI=" + h.calculateBMI());
		System.out.println("Gender="+ h.getGender());
		System.out.println("Result=" + h.resultBMI(h.calculateBMI()));
		 h.workOut();
		 System.out.println("After workout="+h.getWeight());
		// System.out.println("After workout="+h.getHeight());
		 h.eat();
		// System.out.println("After eating:"+h.getWeight());
		 System.out.println("After eating:"+h.getHeight());
//		if (h.calculateBMI() < 25) {
	//		while (h.calculateBMI() >= 25) {
		//		h.eat();
		//	}
		//}
		System.out.println(h.getWeight());
	}
}
