package com.techlabs.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
 
public class Inventory {
	private List guitars;
	
	public Inventory () {
		this.guitars = new LinkedList<Object>();
	}
	
	public void addGuitars(String sr_no, double price, Type type, Wood backwood, Wood topwood, Builder builder) {
	Guitar g = new Guitar(sr_no, price, builder, type, backwood, topwood);
	guitars.add(g);
	
	}
	
	public List search(GuitarSpecification searchGuitar) {
	    List matchingGuitars = new LinkedList();
	      for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar g = (Guitar)i.next();
	      GuitarSpecification sp = g.getSpec();
	      if (searchGuitar.getBuilder() != sp.getBuilder())
	        continue;
	      if (searchGuitar.getType() != sp.getType())
	        continue;
	      if (searchGuitar.getBackWood() != sp.getBackWood())
	        continue;
	      if (searchGuitar.getTopWood() != sp.getTopWood())
	        continue;
	      matchingGuitars.add(g);
	    }
	    return matchingGuitars;
	  }

	
	
}
