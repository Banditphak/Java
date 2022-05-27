package day6;

public class Project {
	public static void main(String[] args) {
		   int amount = Integer.parseInt(args[0]);
		   int quarters = amount/25;
	       int dimes = (amount - quarters * 25)/10;
	       int nickels = (amount - quarters *25- dimes * 10)/5;
	       int pennies = (amount - quarters*25-dimes*10-nickels*5)/1;
	      
	       System.out.println(+amount+" cents in coins:");
	       System.out.println(+quarters+" quarters");
	       System.out.println(+dimes+" dimes");
	       System.out.println(+nickels+" nickels");
	       System.out.println(+pennies+" pennies");
		
		
		       
		      
		     
	}

}
