package day6;

public class Book {
	public static String title = "Java OCA";
	public static int numberOfPages = 400;
	public static double price = 25.99;
	
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println(numberOfPages);
		System.out.println(price);
		// Java OCA
		// 400
		// 25.99
		
		title = "Java OCP";
		numberOfPages = 700;
		price = 26.99;
		
		System.out.println("Title: " + title);
		System.out.println("Number of pages: " + numberOfPages);
		System.out.println("Price: " + price);
		// Title: Java OCP
		// Number of pages: 700
		// Price: 26.99
		
	}
}