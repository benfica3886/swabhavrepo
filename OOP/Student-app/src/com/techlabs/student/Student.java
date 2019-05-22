package com.techlabs.student;

public class Student {
	private String name;
	private int rollno;
	private float cgpa;
	
	public Student(String newname, int newroll, float newcgpa) {
		name = newname;
		rollno = newroll;
		cgpa = newcgpa;
		System.out.println("object created");
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public float getcgpa() {
		return cgpa;
	}
	
	public double percentage() {
		return (cgpa*9.5);
	}
}
