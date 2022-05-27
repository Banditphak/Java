package day13;

public class DayOfWeek2 {
	public static void main(String[] args) {
		printNumOfDay("Mon"); // Mon: 2
		printNumOfDay("Sun"); // Sun: 1
		printNumOfDay("Fri"); // Fri: 6
		printNumOfDay("apple"); // Invalid input
	}

	/*
	 * "Sun" -> Sun: 1 "Mon" -> Mon: 2 "Tue" -> Tue: 3 "Wed" -> Wed: 4 "Thur"->
	 * Thur: 5 "Fri" -> Fri: 6 "Sat" -> Sat: 7 otherwise invalid input.
	 */
	public static void printNumOfDay(String day) {
		// your code goes here by using switch statement.

		switch (day) {
		case "Sun":
			System.out.println("Sun: 1");
			break;
		case "Mon":
			System.out.println("Mon: 2");
			break;
		case "Tue":
			System.out.println("Tue: 3");
			break;
		case "Wed":
			System.out.println("Wed: 4");
			break;
		case "Thur":
			System.out.println("Thur: 5");
			break;
		case "fri":
			System.out.println("Fri: 6");
			break;
		case "sat":
			System.out.println("Sat: 7");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}
}