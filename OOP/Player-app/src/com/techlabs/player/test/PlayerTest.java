package com.techlabs.player.test;

import com.techlabs.player.Gender;
import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p = new Player(1, "ben");
		// System.out.println(p.getAge());
		// System.out.println(p.getId());
		// System.out.println(p.getName());

		  Player p1 = new Player(1, "abc", 20);
		  Player p2 = new Player(2, "benfica", 11);

		  Player ans=p1.whoIsElder(p2);
		// System.out.println(ans.getAge());
		// System.out.println(ans.getName());
		// System.out.println(ans.getId());

		Player playerArr[] = new Player[3];
		playerArr[0] = new Player(1, "xyz", 20);
		playerArr[1] = new Player(2, "ben", 12);
		playerArr[2] = new Player(3, "gly", 20);
		//playerArr[3] = new Player(3, "ade", 12);
   		display(playerArr);
   		Player play = new Player(1, "adee", 20, Gender.FEMALE);
   		System.out.println(play.getName());
   		System.out.println(Gender.FEMALE);
}

	public static void display(Player playerArr[]) {
		for (Player play : playerArr) {
			System.out.println(play.getAge());
			System.out.println(play.getId());
			System.out.println(play.getName());
		}

	}
}
