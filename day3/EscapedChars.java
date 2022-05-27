package day3;

public class EscapedChars {
	public static void main(String[] args) {
		System.out.println("I said \"Hello\"?");  // I said "Hello"?
		
		// \t - tab space, \n - new line
		System.out.println("John\tDoe");   // John    Doe
		System.out.println("John\nDoe");   // John
		                                   // Doe
		
		
		System.out.println("A\nB\nC");    // A
		                                  // B
		                                  // C
		
		System.out.println("A\tB\tC");    // A    B    C
		
	}

}
