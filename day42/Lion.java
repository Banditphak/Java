package day42;

/*
 * What's inheritance in Java?
 * It is a process where one class can inherit visible
 * properties and method from another class.
 * extends keyword is used for inheritance
 * 
 * Lion is child/sub class 
 * Animal is parent/super class
 * 
 * What happens if child class will define the same method 
 * as parent class has it?
 * 
 * It's Overrides the parent's class method
 */

public class Lion extends Animal {
	public String str;
	
	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}
	
	@Override
	public void run() {
		System.out.println("Lion is running");
	}
	
	@Override
	public String getName() {
		return "Lion's name: " + name;
	}
}