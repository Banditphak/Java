package day21;

public class WarmUp {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println( i+ ". Tue class.");
			// print 0.Tue class. => 9.Tue class.
		}
		System.out.println("------------");
		
		int count = 0;
		for (;count <5; count += 2) {
			System.out.println("hello");
		    // print hello three times. 
		System.out.println("-------------");
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch+" ");
		}   // print a b c => x y z
	
	}
}

