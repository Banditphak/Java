package day15;

public class Review {
	public static void main(String[] args) {
		// how do you find out the number of characters in your string?
		// By using length() method.
		
		String str = "Tech Lead Academy";
		int size = str.length();
		
		System.out.println("size: " + size); // size: 17
		
		System.out.println(str); // Tech Lead Academy
		// toUpperCase()
		// toLowerCase()
		
		String upperStr = str.toUpperCase();
		
		System.out.println(str); // Tech Lead Academy
		System.out.println(upperStr); // TECH LEAD ACADEMY
		
		String lowerStr = str.toLowerCase();
		System.out.println(lowerStr); // tech lead academy
	}
}