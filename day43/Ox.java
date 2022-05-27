package day43;

public class Ox extends Mammal{

	@Override
	public void run() {
	System.out.println("Ox is running");
	}
	
	@Override
	public void eat() {
	System.out.println("Ox Eat Grass");
	}
	@Override
	public void dance() {
		System.out.println("Ox Don't dance");
	}
}
