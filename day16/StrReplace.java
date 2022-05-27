package day16;

public class StrReplace {
	public static void main(String[] args) {
		// replace(oldString, newString) - it will replace the old string with new string
		//                                 and it will return that new version.
		String city = "Alma-Ata";
		System.out.println(city); // Alma-Ata
		
		// Alma-Ata => Alma Ata
		city = city.replace("-", " ");
		System.out.println(city); // Alma Ata
		
		city = city.replace(" ", "");
		System.out.println(city); // AlmaAta
		
		String str = "Java*Python*JS*PH";
		System.out.println(str); // Java*Python*JS*PH
		
		str = str.replace("*", ", ");
		System.out.println(str); // Java, Python, JS, PH
		
		String str2 = "Hello, World!";
		System.out.println(str2); // Hello, World!
		
		// Hello, Class!
		str2 = str2.replace("World", "Class");
		System.out.println(str2); // Hello, Class!
		// BREAK TILL 11:29AM EST

		String city1 = "Alo Ha";
		System.out.println(city);
		
		city1 = city1.replace("Alo Ha", "What's up");
		System.out.println(city1);
		
		String myBaby = "Hate Java!";
		System.out.println("I use to "+myBaby);
		myBaby = myBaby.replace("Hate", "Love");
		System.out.println("Now I "+myBaby);
		
		String WEWI = "WEEWII! ";
		System.out.println(WEWI);
		WEWI = WEWI.replace("WII","WOO");
	    System.out.println(WEWI+WEWI+WEWI+WEWI);
	}   
	}    
	    
	    
	    
	    
	