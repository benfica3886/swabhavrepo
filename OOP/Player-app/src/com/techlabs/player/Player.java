package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private Gender gender;

	public Player(int id, String name, int age) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Player(int id, String name) {
		this(id, name, 20);
	}

	public Player(int id, String name, int age, Gender gender) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public Player whoIsElder(Player p) {
		// System.out.println(age);
		// System.out.println(p.age);
		if (age < p.age) {
			return p;
		}
		return this;
	}

}
