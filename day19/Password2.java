package day19;

import java.util.Scanner;

public class Password2 {
	public static final String PASSWORD = "qwerty1$";
	public static final int LIMIT = 3;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String enteredPassword = "";
		
		int numberOfAttempts = 0;
		while (numberOfAttempts < LIMIT) {

			System.out.println("Enter password:");
			enteredPassword = scan.next();

			if (PASSWORD.equals(enteredPassword)) {
				System.out.println("Welcome to your dashbord");
				break;
			}
			numberOfAttempts++;
		}

		if (numberOfAttempts >= LIMIT) {
			System.out.println("Your Account is blocked. Number of attemts: " + numberOfAttempts);
		}

	}

}
