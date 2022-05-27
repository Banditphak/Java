package day40;

// Encapsulation
// It is data protecting(hiding) mechanism
// We achieve encapsulation by making properties
// private and by providing public getters and setters.

public class Dog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
		
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if (age < 1) {
			// System.out.println("Invalid age: " + age);
			throw new IllegalArgumentException("Invalid age: " + age);
		} else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
}