package day40;

public class CarDemo {
	public static void main(String []args) {
		
		Car car = new Car();
		
		car.setModel("Civic");
		car.setPrice(23000.00);
		
		System.out.println("Car Model: "+ car.getModel());
		System.out.println("Car Price: " + car.getPrice());
		
	}

}
