package com.techlabs.human;

public class Human {
	private float height;
	private float weight;
	private String name;
	private int age;
	private GenderType gender;

	public Human(float height, float weight, String name, int age, GenderType gender) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {
		return gender;
	}

	public void workOut() {
		//System.out.println((2 / this.weight * 100));
		this.weight = this.weight -(2 / this.weight *100);
	}

	public void eat() {
		this.weight = this.weight + (5 /this.weight * 100);
		this.height = this.height + (1/this.height*100);
	}

	public float calculateBMI() {
		return (this.weight/(this.height * this.height)*10000);
	}

	public String resultBMI(float bmiResult) {
		if (bmiResult > 40) {
			return "OVERWEIGHT";
		}
		if (bmiResult > 25) {
			return "NORMAL";
		} else
			return "UNDERWEIGHT";
	}
	


}
