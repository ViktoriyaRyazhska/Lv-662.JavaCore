package hw5.practice_1;

public abstract class Car {
	
	protected String model;
	protected int maxSpeed;
	protected int yearOfManufacture;
	
	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public abstract void run();
	
	public abstract void stop();
	
}
