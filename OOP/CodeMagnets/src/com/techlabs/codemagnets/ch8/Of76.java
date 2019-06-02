package com.techlabs.codemagnets.ch8;

class Clowns extends Picasso{ }

class Acts extends Picasso{
	public int iMethod() {
		return 5;
	}
	
}

public class Of76 extends Clowns {
	public static void main(String[] args) {
		Nose[] i = new Nose[3];
		i[0]= new Acts();
		i[1] = new Clowns();
		i[2] = new Of76();
		for(int y=0;y<3;y++) {
			System.out.println(i[y].iMethod()+" " +  i[y].getClass());
		}
	}
}

