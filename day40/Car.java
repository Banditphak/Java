package day40;

public class Car {
	private String model;
	private double price;
	
	public void setModel(String model) {
		this.model = model;
	}
		
	public String getModel() {
		return model;
	}
	
	public void setPrice( double price) {
		if (price < 1) {
			
			throw new IllegalArgumentException("No Sale: " + price);
		} else {
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}
}
	


