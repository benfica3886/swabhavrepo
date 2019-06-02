package com.techlabs.manboy;

public class TestClass {

public static void main(String[] args) {
	atTheMovies(new Boy());
	atTheParty(new Boy());
	atTheParty(new Man());
}


public static void atTheParty(IMannerable obj) {
	System.out.println("Party operatins");
	obj.respect();
	obj.wish();
	System.out.println(" ");
}

public static void atTheMovies(IEmotionable obj) {
	System.out.println("Movie operatins");
	obj.Cry();
	obj.Laugh();
	System.out.println(" ");
}

}
