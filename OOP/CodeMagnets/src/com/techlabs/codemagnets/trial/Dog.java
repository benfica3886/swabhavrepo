package com.techlabs.codemagnets.trial;

public class Dog {
	public static void main(String[] args) {
		int x=0;
		pets[] p = new pets[3];
		while(x<3) {
			p[x]= new pets();
			p[x].setSize(20);
			p[x].bark(3);
			x=x+1;
				}
	}

}

 class pets{
	private int size;
	
	public int  getSize() {
		return size;
	}
	
	public void setSize(int s) {
		size =s;
	}
	
	void bark(int z) {
		while(z>0){
		{
		if(size>30) {
			System.out.println("Large");
		}
		else {
			System.out.println("Small");
		}
		z=z-1;
}
}	} }
	