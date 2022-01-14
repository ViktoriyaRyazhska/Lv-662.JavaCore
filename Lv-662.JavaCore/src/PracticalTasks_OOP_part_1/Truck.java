package PracticalTasks_OOP_part_1;

public class Truck extends Car {
	private int loadCapacity;

	public Truck(String model, int maxSpeed, int yearOfManufacture, int loadCapacity) {
		super(model, maxSpeed, yearOfManufacture);
		this.loadCapacity = loadCapacity;

	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		return "Car [model = " + this.getModel() + ", maxSpeed = " + this.getMaxSpeed() + ", yearOfManufacture = "
				+ this.getYearOfManufacture() + ", loadCapacity = " + loadCapacity + "]";

	}

}
