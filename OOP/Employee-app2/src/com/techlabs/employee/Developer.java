package com.techlabs.employee;

import com.techlabs.abstractemployee.Employee;

public class Developer extends Employee {

	public Developer(double basicSalary, int Id, String employeeName,double paPercent, double bonusPercent) {
		super(basicSalary, Id, employeeName,paPercent, bonusPercent);
	}

	
	@Override
	public double calculateSalary() {
		setBonus();
		setPA();
		return (Bonus + PA + getBasicSalary());
	}
	

}
