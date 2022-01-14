package PracticalTasks_OOP_part_1;

public class Sedan extends Car {
	private String color;

	public Sedan(String model, int maxSpeed, int yearOfManufacture, String color) {
		super(model, maxSpeed, yearOfManufacture);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model = " + this.getModel() + ", maxSpeed = " + this.getMaxSpeed() + ", yearOfManufacture = "
				+ this.getYearOfManufacture() + ", color of car = " + color + "]";
	}
}