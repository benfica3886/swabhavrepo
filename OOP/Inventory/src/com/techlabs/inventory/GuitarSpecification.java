package com.techlabs.inventory;

public class GuitarSpecification  {
	
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	public GuitarSpecification(Builder builder, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}
	
	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

}
