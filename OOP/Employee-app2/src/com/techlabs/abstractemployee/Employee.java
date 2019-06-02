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
public Double HRA = houseRentAllowance;
private double travelAllowance;
public Double TA = travelAllowance;
private double dailyAllowance;
public Double DA = dailyAllowance;
private double pa;
public Double PA = pa;
private double bonus;
public Double Bonus = bonus;

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
	HRA = (hraPercent/100)*this.basicSalary;
}

public void setTravelAllowance() {
	TA = (this.taPercent/100)*this.basicSalary;
}

public void setDailyAllowance() {
	DA= (this.daPercent/100)*this.basicSalary;
}

public void setPA() {
	PA = (this.paPercent/100)*this.basicSalary;
}

public void setBonus() {
	Bonus =(this.bonusPercent/100)*this.basicSalary;
}

}


 
