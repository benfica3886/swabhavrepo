package com.techlabs.crudtest;

import com.techlabs.crud.CustomerDB;
import com.techlabs.crud.DepartmentDB;
import com.techlabs.crud.ICrudable;
import com.techlabs.crud.InvoiceDB;

public class CrudTest {
	public static void main(String[] args) {
		doDBOperations(new InvoiceDB());
		doDBOperations(new DepartmentDB());
		doDBOperations(new CustomerDB());
	}

public static void doDBOperations(ICrudable x) {
	System.out.println("Doing DB operations:-");
	x.create();
	x.update();
	x.read();
	x.delete();
	System.out.println(" ");
}

}