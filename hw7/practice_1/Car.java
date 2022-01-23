package hw7.practice_1;

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
	
	public static Builder getCar() {
		return new Builder();
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengerCapacity=" + passengerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

	public static class Builder {

		private Car car = new Car();
		
		public Builder addModel(String model) {
			car.model = model;
			return this;
		}
		
		public Builder addDateOfProduction(LocalDate dateOfProduction) {
			car.dateOfProduction = dateOfProduction;
			return this;
		}
		
		public Builder addEngineCapacity(double engineCapacity) {
			car.engineCapacity = engineCapacity;
			return this;
		}
		
		public Builder addColor(String color) {
			car.color = color;
			return this;
		}
		
		public Builder addPassengerCapacity(int passengerCapacity) {
			car.passengerCapacity = passengerCapacity;
			return this;
		}
		
		public Builder setIsAirConditioning(boolean isAirConditioning) {
			car.isAirConditioning = isAirConditioning;
			return this;
		}
		
		public Car build() {
			return car;
		}
		
	}
	
}
