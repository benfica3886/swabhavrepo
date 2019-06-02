package com.techlabs.abstractemployee;

public abstract class Employee {
private double basicSalary;
private int Id;
private String employeeName;

private double hraPercent;
private double taPercent;
private double daPercent;
private double paPercent;
private double bonusPercent;

private double houseRentAllowance;
private double travelAllowance;
private double dailyAllowance;
private double pa;
private double bonus;

//for manager
public Employee(double basicSalary, int Id, String employeeName,double hraPercent, double taPercent, double daPercent ) {
	this.basicSalary = basicSalary;
	this.Id = Id;
	this.employeeName = employeeName;
	this.hraPercent = hraPercent;
	this.daPercent = daPercent;
	this.taPercent = taPercent;
}

// for tester and developer
public Employee(double basicSalary, int Id, String employeeName,double paPercent, double bonusPercent) {
	this.basicSalary = basicSalary;
	this.Id = Id;
	this.employeeName = employeeName;
	this.paPercent = paPercent;
	this.bonusPercent = bonusPercent;
}

public abstract double calculateSalary();

public double getBasicSalary(){
	return basicSalary;
}

public int getId() {
	return Id;
}

public String getEmployeeName() {
	return employeeName;
}

public void setHouseRentAllowance() {
	this.houseRentAllowance = (this.hraPercent/100)*this.basicSalary;
}

public void setTravelAllowance() {
	this.travelAllowance = (this.taPercent/100)*this.basicSalary;
}

public void setDailyAllowance() {
	this.dailyAllowance = (this.daPercent/100)*this.basicSalary;
}

public void setPA() {
	this.pa = (this.paPercent/100)*this.basicSalary;
}

public void setBonus() {
	this.bonus =(this.bonusPercent/100)*this.basicSalary;
}

public double getHouseRentAllowance() {
	return houseRentAllowance;
}

public double getTravelAllowance() {
	return travelAllowance;
}

public double getDailyAllowance() {
	return dailyAllowance;
}

public double getPA() {
	return pa;
}

public double getBonus() {
	return bonus;
}
}



