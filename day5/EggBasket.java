package day5;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		numberOfBaskets = 10;
		eggsPerBasket = 6;
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("the total number of eggs is " + totalEggs);
		//If you have
		//6 eggs per basket and
		//10 baskets, then
		//the total number of eggs is 60
		//60 is total eggs.

		
		// We can concatenate to the string any data type in Java and 
		// the output type will be string.
		String totalMsg = totalEggs + " is total eggs.";
		System.out.println(totalMsg);
	}
}