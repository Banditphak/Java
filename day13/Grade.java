package day13;

public class Grade {
	public static void main(String[] args) {
		displaScore('A'); // 90 - 100
		displaScore('B'); // 89 - 65
		displaScore('C'); // 64 - 50
		displaScore('D'); // less then 50
		                  // See you next year!
		displaScore('F'); 
		}                 // See you next year!

	public static void displaScore(char grade) {

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("90 - 100");
			break;
			
		case 'B':
		case 'b':
			System.out.println("89 - 65");
			break;

		case 'C':
		case 'c':
			System.out.println("64 - 50");
			break;

		case 'D':
		case 'd':
			System.out.println("less then 50");
	// NO! brake;		
    // Will print less then 50 and See you next year!
	 		
		case 'F':
		case 'f':
			System.out.println("See you next year!");
			break;
		
		default:
			System.out.println("Invalid input");

		}
	}
}
