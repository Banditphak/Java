package day46;

public class HandleException {
	public static void main(String[] args) {
		String str = null;
		
		try {
			// in try's body we put code that potentially can throw exception
			System.out.println("before str.length()");
			System.out.println(str.length());
			System.out.println("After str length()");
			System.out.println("After str length()");
	    // e will contain all exception message. can put any thing like exception	
		// in catch we specify what exception we want to catch
		} catch(NullPointerException e) { 
			
			// inside the body catch, we specify what to do if exception is there
			System.out.println("Exception was there: " + e.getMessage());
			                  //Exception was there: Cannot invoke "String.length()" because "str" is null
			System.out.println("str was null, we cannot get length()");
		}

		System.out.println("Line 15");
	}
}