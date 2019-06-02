package com.techlabs.employee;

import com.techlabs.abstractemployee.Employee;

public class Manager extends Employee {
	private double  HRA;
	private double  TA;
	private double  DA;

	public Manager(double basicSalary, int Id, String employeeName) {
		super(basicSalary, Id, employeeName);
	}

	@Override
	public String toString(){
		String result = super.toString();
		return(result + "HRA ="+ this.HRA);
	}		
	
	@Override
	public void calculateSalary() {	
		this.HRA = ((50*getbasicSalary())/100);
		this.DA = (30*getbasicSalary()/100);
		this.TA = (30*getbasicSalary()/100);
	}
	
	
	
	

}
