package day46;

public class HandleException2 {
	public static void main(String[] args) {
		String str = null;

		
		try {
			System.out.println(str);//null
			System.out.println(str.toUpperCase());
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke
			//"String.toUpperCase()" because "str" is null
			//at day46.HandleException2.main(HandleException2.java:7)			
		
		} catch (NullPointerException exception) {
			System.out.println(exception.getMessage());
			//Cannot invoke "String.toUpperCase()" because "str" is null
			System.out.println("Exception is handled!");
			//Exception is handled!
		}
	}

}
