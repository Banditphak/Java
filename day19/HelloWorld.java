package day19;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("How Many Times You Want to print Hello World!:");
    int numberOfPrints = scan.nextInt();

	if(numberOfPrints>10){
		System.out.println("I cannot print more than 10 Times");
	}else{
		int count = 0;
		while (count < numberOfPrints) {
			System.out.println("Hello World!");
			count++;
		
		}
		
	
		
		
		
		
	}
}
}
