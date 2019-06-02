package com.techlabs.employee;

import com.techlabs.abstractemployee.Employee;

public class Manager extends Employee {

	public Manager(double basicSalary, int Id, String employeeName,double hra, double ta, double da) {
		super(basicSalary, Id, employeeName, hra, ta, da);
	}
		
	@Override
	public double calculateSalary() {
		setHouseRentAllowance();
		setDailyAllowance();
		setTravelAllowance();
		return (getBasicSalary() + HRA + DA + TA);
		
	}
	
	
	
	

}
