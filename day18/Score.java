package day18;

public class Score {
	enum Grade {
		A, B, C, F
	};

	public static void main(String[] args) {
		displayScore(Grade.A); // your score: 90 - 100
		displayScore(Grade.C); // your score: 50 - 64
		displayScore(Grade.F); // your score: less than 50
		displayScore(Grade.C);
	}

	/*
	 * if grade is A then print "your score: 90 - 100" if grade is B then print
	 * "your score: 65 - 89" if grade is C then print "your score: 50 - 64" if grade
	 * is F then print "your score: less than 50"
	 */
	public static void displayScore(Grade grade) {

		// your code goes here
		switch (grade) {
		case A:
			System.out.println("your score: 90 - 100");
			break;
		case B:
			System.out.println("Your score: 65 - 89");
			break;
		case C:
			System.out.println("Your score: 50 - 64");
			break;
		case F:
			System.out.println("Your score: less then 50");
			break;
		default:
			System.out.println("Java Is Awsome!");
		}
	}
}