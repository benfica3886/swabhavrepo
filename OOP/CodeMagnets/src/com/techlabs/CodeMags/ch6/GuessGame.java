package com.techlabs.CodeMags.ch6;

import java.util.*;

public class GuessGame {
	public static void main(String[] args) {
		ArrayList<String> Guess = new ArrayList<>();
		Guess.add("abc");
		Guess.add("xyz");
		GuessVal(Guess);
	}

	public static void GuessVal(ArrayList<String> value) {
		ArrayList<String> Store = new ArrayList<>();
		Store.add("mno");
		Store.add("abc");
		if (value.equals(Store)) {
			System.out.println(value);
		}

	}
}