package com.techlabs.testingreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlabs.rectangle.Rectangle;
import com.techlabs.testclass.Test;

public class ReflectionTesting {

	public static void main(String[] args) {
		Class c = Object.class;
		System.out.println("Class name :" + c.getName());
		
		int numOfMethods = 0;
		int numOfGettter = 0;
		int numOfSettter = 0;
		Method[] m = c.getMethods();
		for (Method methods : m) {
			if (methods.getName().startsWith("get")) {
				System.out.println("Getter :" + methods.getName());
				numOfGettter++;
			} else if (methods.getName().startsWith("set")) {
				System.out.println("Setter :" + methods.getName());
				numOfSettter++;
			} else {
				System.out.println("Method name :" + methods.getName());
				numOfMethods++;
			}
		}
		System.out.println("Number of methods :" + numOfMethods);
		System.out.println("Number of Getter :" + numOfGettter);
		System.out.println("Number of Setter :" + numOfSettter);
		
		Constructor[] constructor = c.getConstructors();{
			for(Constructor elements : constructor) {
				System.out.println("Constructor : "+ elements.getName());
			}
		}
	}
}
