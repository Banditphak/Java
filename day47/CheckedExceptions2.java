package day47;

public class CheckedExceptions2 {
	  
	// Thread.sleep(1000); // 'throws' exception 
	//It will sleep the main thread for 1 second, each time the for loop runs
	
	// and in the main method we are saying main method also 'throws' this 
	// exception
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
}