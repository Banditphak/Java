package day14;

public class StrUppperLowerCase2 {
	public static void main (String[] args) {
		
		String str = "crying";
		  System.out.println(str); // crying
		  str = str.toUpperCase();
		  System.out.println(str); // CRYING
		
		String str2 = "can't remember!";
		str2 = str2.toUpperCase();
		System.out.println(str2);// CAN'T REMEMBER!
		str2 = str2.toLowerCase();
		System.out.println(str2);// can't remember!
		
		String str3 = "my method is weak! might have to rewatch last week video";
		str3 = str3.toUpperCase();System.out.println(str3);// MY METHOD IS WEAK! MIGHT HAVE TO REWATCH LAST WEEK VIDEO
		
		str3 = str3.toLowerCase();
        System.out.println(str3);// my method is week! might have to rewatch last week video
        
		String str4 = "do you have any trick! to help remember?";
		System.out.println(str4.toUpperCase());//DO YOU HAVE ANY TRICK! TO HELP REMEMBER? 
	
   }
	
}
