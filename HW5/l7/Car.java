package l7;

abstract public class Car {
	String model = "BMW";
	int maxSpeed = 170;
	int yearOfManufacture = 2015;
	
	public abstract double run();
	public abstract double stop();
	public void print () {
		System.out.println("This is a car.");
	}

}
