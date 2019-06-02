package com.techlabs.numbers;

public class NumberCheck {
 private int numToGuess;
 private int tries; 
 
 public void setNumToGuess() {
	this.numToGuess= (int) (Math.random()*5);
	this.tries=0;
 }
 
 
 public int getTries() {
	 this.tries++;
	 return (this.tries);
}
 
 public String checkValue(int num) {
	 getTries();
	 if( num > numToGuess)
		 return "HIGH";
	 else if( num< numToGuess)
		 return "LESS";
	 else
		 System.out.println("No of tries="+this.tries);
		 return ("FOUND");
 }
 
}
