package hw5.practice_1;

public class Truck extends Car{
	
	public Truck(String model, int maxSpeed, int yearOfManufacture ) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
		
	}
	
	@Override
	public void run() {
		
		System.out.println("Truck is now moving");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Truck has stopped");
		
	}

	@Override
	public String toString() {
		return "Truck [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
