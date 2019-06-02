package com.techlabs.inventory;

import java.util.Iterator;

public class Guitar {
	private String sr_No;
	private double price;
	GuitarSpecification specification;
	
	public Guitar(String sr_No, double price, Builder builder,Type type, Wood backWood, Wood topWood) {
		this.sr_No = sr_No;
		this.price = price;
		this.specification = new GuitarSpecification(builder, type, backWood,topWood);
		}
	
	
	public String getSr_No() {
		return sr_No;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpecification getSpec() {
		return specification;
	}
	
}
