package com.techlabs.codemagnets.ch5;


public class GuessGame {
	public static void main(String[] args) {
		int randomNum = (int) (Math.random() * 5);
		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		CheckVal val = new CheckVal();
		{
			val.Loc(locations);
		}
		if (args.length > 0) {
			for (String item : args)
				val.Check(item);
		}
		System.out.println("No. of guess: "+ args.length);
		
	}
}

class CheckVal {
	int[] locations;

	public void Loc(int[] loc) {
		locations = loc;
	}

	public void Check(String value) {
		String res = "miss";
		int hit = 0;
		int toint = Integer.parseInt(value);
		for (int elements : locations) {
 			if (toint == elements) {
				res = "hit";
				hit++;
				break;
			}
		}
		if (hit == locations.length) {
			System.out.println("Found three");
		} else {
			System.out.println("result: " + res);
		}

	}

}