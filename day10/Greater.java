package day10;

public class Greater {
	public static void main(String[] args) {
		System.out.println(greater100(199.5)); //199.5
		
		double res = greater100(50.9);
		System.out.println(res); // 100.0
	}
	
	public static double greater100(double dNum) {
		if (dNum > 100) {  // 50.9 or 199 .5    > 100 
			return dNum;   // return -> 199.5 is more then 100
		} else {
			return 100.0;  // return ->50.9 is less then 100 
		}        
	}
}