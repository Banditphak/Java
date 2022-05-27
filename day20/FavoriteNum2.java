package day20;

import java.util.Scanner;

public class FavoriteNum2 {
	public static void main(String[] args) {
		final int myAge = 40;
		Scanner sc = new Scanner(System.in);

		int enterAge;
		do {
			System.out.println("Can you guess my age?");
			enterAge = sc.nextInt();

			if (myAge != enterAge) {
				System.out.println("No You are wrong! ");
			}

		} while (myAge != enterAge);
		System.out.println("Yes, you right I'm " + myAge);
	}

}
