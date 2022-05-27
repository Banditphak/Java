package day14;

public class SwitchReview {
	public static void main(String[] args) {
		String valueForSwitch = "apple";
		
		//        "apple"
		switch(valueForSwitch) {
		case "orange":
			System.out.println("Let's eat orange!");
			break;
			
		case "apple": // -----> Let's eat apple!
			System.out.println("Let's eat apple!");
			break;  
			
		case "kiwi":
			System.out.println("Let's eat kiwi!");
			break;
			
		default:
			System.out.println("I cannot it that.");		
		}
	}
	     
}




