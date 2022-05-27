package day12;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		// if y is greater then 5 then assign value to x = y * 2
		//other wise assign value to x = y* 3
		
		
		
//		if(y>5) {
//			x = y * 2;
//		}else {
//			x=y*3;
//		}
		
		// = condition ? if TruThisValue : if FalseThisValue;
		
		
		x = y>5 ? y *2 : y*3;
		System.out.println("y: "+y);
		System.out.println("x: "+x);
		
		// if num is even then "java" otherwise "php"
		//
		int num = 7;
		String str = num%2 == 0? "java":"php";
		System.out.println(str);//php
		
	}	
	
	

}
