package day5;

public class PrimitivesInJava {
	
	public static void main(String[] args) {
		// Primitives are core data type in Java.
		// There 8 primitives in Java.
		// Primitives for whole numbers: byte, short, int, long
		// Primitives for floating numbers: float, double
		// Primitive for single character: char
		// Primitive for logical value(true, false): boolean
		
		// WHOLE NUMBERS:
		byte bNum = 100; // -128 -> 127
		System.out.println(bNum); //100
		
		short shNum = 50;
		System.out.println(shNum); // 50
		
		int iNum = 999;
		System.out.println(iNum); // 999
		
		long lNum = 1;
		System.out.println(lNum); // 1
		
		long lNum2 = 653246425645L;
		// We use L to tell that it's long and not int because the value(literal)
		// is out of range for int.
		
		// the default literal for whole numbers is int
		System.out.println(100); // 100
		
		// Floating numbers: float, double
		float fNum = 123421.9F;
		System.out.println(fNum); // 123421.9
		// We put F or f after the value for float to tell the compiler
		// that value is float and not double. 
		// The default literal for floating numbers is double.
		
		double dNum = 999.12;
		System.out.println(dNum); // 999.12
		
		// the default literal for floating numbers is double.
		System.out.println(9.9);
		
		// char and boolean
		char ch = 'A';
		System.out.println(ch); // A
		System.out.println(ch + 0); // 65   //ACII
		
		boolean isCorrect = true;
		System.out.println(isCorrect); // true
		
		isCorrect = false;
		System.out.println(isCorrect); // false
	}
}