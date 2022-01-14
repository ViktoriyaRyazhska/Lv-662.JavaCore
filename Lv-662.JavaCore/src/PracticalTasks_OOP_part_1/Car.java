package PracticalTasks_OOP_part_1;

public abstract class Car {
	
	private String model;
	private int maxSpeed;
	private int yearOfManufacture;
	
	public Car(String model, int maxSpeed, int yearOfManufacture){
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
		
	}
	public void run() {
		System.out.println("The car moves on a trajectory");
	}
	
	public void stop() {
		System.out.println("The car stops in the destination");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}


}
