package intra.Lection_8;

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
	class CarBuilder {
		public CarBuilder addmodel (String addmodel) {
		Car.this.model = addmodel;
		return this;
		}
		public CarBuilder addDateOfProduction (LocalDate addDateOfProduction) {
			Car.this.dateOfProduction = addDateOfProduction;
			return this;
		}
		public CarBuilder addEngineCapacity (double addEngineCapacity) {
			Car.this.engineCapacity = addEngineCapacity;
			return this;
		}
		public CarBuilder addColor (String addColor) {
			Car.this.color = addColor;
			return this;
		}
		public CarBuilder addPassengerCapacity (int addPassergerCapacity) {
			Car.this.passengerCapacity = addPassergerCapacity;
			return this;
		}
		public CarBuilder setIsAirConditionining (boolean setIsAirConditioning) {
			Car.this.isAirConditioning = true;
			return this;
		}
		public Car Car1() {
			return Car.this;     	
		}
		public CarBuilder getCar1() {
			//return this.getCar1();
			return Car.getCar();
		}
	}

@Override
		public String toString() {
			return "Car [model=" + "Ford" + ", dateOfProduction=" + LocalDate.of(2020, 03, 25) +  ", engineCapacity ="
					+ 3.5 + ", color=" + "yellow" + ", passengerCapacity=" + 6
					+ ", isAirConditioning=" + true + "]";
		}

public static void main(String[] args) { 
	System.out.println(Car.getCar());
}
 
}