package day4;

public class Var {
	public static void main(String[] args) {
		String firstName;
		firstName = "John";
		
		System.out.println(firstName); // John
		System.out.println(firstName); // John
		// reassigning new value
		firstName = "Smith";
		System.out.println(firstName); // Smith
		
		firstName = "Alex";
		System.out.println(firstName); // Alex
		
		// We cannot declare variables with same name
		// String firstName;
		String lastName = "Doe";
		System.out.println(lastName); // Doe
		
		// We can declare multiple variables in the same statement.
		String address = "101 Main st", state = "VA", country = "USA";
		
		String address1 = "200 North St";
		String state1 = "MA";
		String country1 = "USA";
		System.out.println(address1+", "+state+", "+country);
		
		// Var version 2
		String firstName2 = "John";
		String lastName2 = "Doe";
		
		System.out.println(firstName2); // John
		System.out.println(lastName2); // Doe
		// "John Doe"
		System.out.println(firstName2 + " " + lastName2); // John Doe
		// We can join two String values together by using '+' operator
		// We call it 'String concatenation'
		
		String fullName = "Full name: " + firstName2 + " " + lastName2;
		System.out.println(fullName); // Full name: John Doe
		
		firstName = "Ramesh";
		lastName = "Kanery";
		System.out.println(firstName + " " + lastName); // Ramesh Kanery
		//          "Ramesh" + "Kanery";
		fullName = firstName + lastName;
		System.out.println(fullName); // RameshKanery
	}
}


