package day8;
import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int  firstNumber,secondNumber,result;
		
		System.out.println("Enter first number: ");
		firstNumber = sc.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = sc.nextInt();
	 result = firstNumber*secondNumber;
	System.out.println("answer is "+firstNumber+"*"+secondNumber+"="+result);
	}

}
