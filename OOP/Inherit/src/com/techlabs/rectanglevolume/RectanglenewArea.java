package com.techlabs.rectanglevolume;

import com.techlabs.inherit.Rectangle;

interface cube {

	default void newReactangle() {
		 System.out.println("new rectamgle");
		 
	}

	void hello();
}

public class RectanglenewArea implements cube{
	public void hello()   	{
		System.out.println("old");
		  };
		     	
        public static void main(String[] args) {
        	cube r = new RectanglenewArea();
        	r.newReactangle();
        	r.hello();   
        	
        }
}
