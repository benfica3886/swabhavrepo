package com.techlabs.employee;

import com.techlabs.abstractemployee.Employee;

public class Tester extends Employee {

	public Tester(double basicSalary, int Id, String employeeName,double paPercent, double bonusPercent) {
		super(basicSalary, Id, employeeName,paPercent, bonusPercent);
	}
	
	@Override
	public double calculateSalary() {
		setBonus();
		setPA();
		return (getBasicSalary() + Bonus + PA);
	}

}
