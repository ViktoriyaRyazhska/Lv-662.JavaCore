package hw5.practice_1;

public class Sedan extends Car {
	
	public Sedan(String model, int maxSpeed, int yearOfManufacture ) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
		
	}

	@Override
	public void run() {
		
		System.out.println("Sedan is now moving");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Sedan has stopped");
		
	}

	@Override
	public String toString() {
		return "Sedan [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
