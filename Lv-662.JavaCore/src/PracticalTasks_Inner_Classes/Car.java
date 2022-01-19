package PracticalTasks_Inner_Classes;

import java.time.LocalDate;

public class Car {

	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengerCapacity;
	private boolean isAirConditioning;

	private Car() {

	}

	public static CarBuilder getCar() {
		return new Car().new CarBuilder();
	}

	// Inner Class

	class CarBuilder {

		public CarBuilder addModel(String addModel) {
			Car.this.model = addModel;
			return this;
		}

		public CarBuilder addColor(String addColor) {
			Car.this.color = addColor;
			return this;
		}

		public CarBuilder addDateOfProduction(LocalDate addDateOfProduction) {
			Car.this.dateOfProduction = addDateOfProduction;
			return this;
		}

		public CarBuilder addEngineCapacity(double addEngineCapacity) {
			Car.this.engineCapacity = addEngineCapacity;
			return this;
		}

		public CarBuilder addPassengerCapacity(int addPassengerCapacity) {
			Car.this.passengerCapacity = addPassengerCapacity;
			return this;
		}

		public CarBuilder setlsAirConditioning(boolean setlsAirConditioning) {
			Car.this.isAirConditioning = setlsAirConditioning;
			return this;
		}
		////////////////////////////////////

		public Car build() {
			return Car.this;

		}
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengerCapacity=" + passengerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

}
