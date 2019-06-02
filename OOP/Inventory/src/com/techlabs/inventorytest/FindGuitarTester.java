package com.techlabs.inventorytest;
import com.techlabs.inventory.Builder;
import com.techlabs.inventory.Guitar;
import com.techlabs.inventory.GuitarSpecification;
import com.techlabs.inventory.Inventory;
import com.techlabs.inventory.Type;
import com.techlabs.inventory.Wood;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory i = new Inventory();
		initilizeInventory(i);
		GuitarSpecification request = new GuitarSpecification(Builder.COLLIINGS, Type.ELECTRIC, Wood.ALDER, Wood.SITKA);
		
		List matchingGuitars = i.search(request);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("List of guitars:");
			for (Iterator item = matchingGuitars.iterator(); item.hasNext(); ) {
				//GuitarSpecification guitarspec = (GuitarSpecification)item.next();
				Guitar guitar = (Guitar)item.next();
				System.out.println("Builder="+guitar.getSpec().getBuilder());
				System.out.println("Guitar Type="+ guitar.getSpec().getType());
				System.out.println("Backwood="+guitar.getSpec().getBackWood());
				System.out.println("Topwood="+guitar.getSpec().getTopWood());
				System.out.println("Price="+ guitar.getPrice() +"\n");
			}
		}else{
			System.out.println("Not found");
		}	
	}
	
	public static void initilizeInventory(Inventory i) {
		i.addGuitars("1", 5000,Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, Builder.COLLIINGS);
		i.addGuitars("2", 5000,Type.ELECTRIC, Wood.ALDER, Wood.SITKA, Builder.COLLIINGS);
		i.addGuitars("3", 7000,Type.ELECTRIC, Wood.ALDER, Wood.SITKA, Builder.COLLIINGS);
		i.addGuitars("4", 5000,Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, Builder.COLLIINGS);
	}
	
	
}
	
	

