package com.techlabs.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestinfReflection {
	public static void main(String[] args) {
		Class rc = Test.class;
		String className = rc.getName();
		System.out.println(className);
		int classModifier = rc.getModifiers();
		System.out.println(Modifier.isPublic(classModifier));
	Method[] classMethod = rc.getMethods();
	for(Method M : classMethod ) {
		System.out.println(M.getName());
	}
	
	}
	
}

//class foo{
	//public void method() {
		//System.out.println("hello");
	//}
//}