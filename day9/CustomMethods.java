package day9;

public class CustomMethods {
	public static void main(String[] args) {
		printExclamation("Apple"); // Apple!
        printExclamation("John");  // John!
		printline("Markerdee");    // Markerdee
		double res = plus100(5.5);
		System.out.println(res);   // 105.5
		
		System.out.println(plus100(9.0)); // 109.0
	}
	
	public static void printExclamation(String str) {
		System.out.println(str + "!");
	
	}                                   
	
	public static double plus100(double dNum) {
		return dNum + 100;
	}
	public static void printline(String str) {
		System.out.println(str);  
	}
}
