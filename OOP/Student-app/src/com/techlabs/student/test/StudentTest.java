package com.techlabs.student.test;

import com.techlabs.student.Student;

public class StudentTest {
	
	public static void main(String[] args) {
	Student s = new Student("benfica",1,1);
	System.out.println(s.getcgpa());
	System.out.println(s.getName());
	System.out.println(s.getRollno());
	
	Student[] sarr = new Student[3];
	sarr[0]= new Student("abc", 2, 8);
	sarr[1]= new Student("xyz", 3, 2);
	sarr[2]= new Student("qwt", 4, 3);
	
	for (int x =0 ; x<3; x++) {
	System.out.println(sarr[x].getName());
	System.out.println(sarr[x].getcgpa());
	System.out.println(sarr[x].getRollno());
	System.out.println(sarr[x].percentage()+"%");
	}
	
	
	
	}
	
	
}
