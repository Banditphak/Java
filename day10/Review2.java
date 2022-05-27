package day10;

public class Review2 {
	public static void main(String[] args) {
		System.out.println(getNum(2000)); // big number
		System.out.println(getNum(7)); // regular number
		
		String res = getNum(1000);
		System.out.println(res); // big number
		
		getNum(999);
		
		printName("John", 18);//false
		printName("Alex", 35);//true not get execute if age 35 > 21
		printName("Ramesh", 15);// false
	}
	
	public static void printName(String name, int age) {
		if (age > 21) {
			// void methods can have return statement
			// it will just exit from the method.
			return ;
		} 
		
		System.out.println("Name: " + name);
	}
	
	public static String getNum(int num) {
		// 999 >= 1000 -> false
		if (num >= 1000) {
			return "big number"; 
		} else {
			return "regular number";
		}
	}
	

}