package Lection8;

import java.time.LocalDate;

import Lection8.Car.CarBuilder;

public class Car {
	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengetCapasity;
	private boolean isAirConditioning;
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengetCapasity=" + passengetCapasity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

	private Car() {
	}
	
	public static CarBuilder getCar() {
		
		return new Car().new CarBuilder();
	}
	class CarBuilder {
		
		public CarBuilder addModel(String addModel) {
			Car.this.model = addModel;
			return this;
		}
		
		public CarBuilder addDateOfProdaction(LocalDate addDateOfProduction) {
			Car.this.dateOfProduction = addDateOfProduction;	
			return this;
		}
		
		public CarBuilder addEngineCapacity(double addEngineCapacity) {
			Car.this.engineCapacity = addEngineCapacity;		
			return this;
		}
		
		public CarBuilder addColor(String addColor) {
			Car.this.color = addColor;
			return this;
		}
		
		public CarBuilder addPassengetCapasity(int addPassengetCapasity) {
			Car.this.passengetCapasity = addPassengetCapasity;
			return this;
		}
		
		public CarBuilder setIsAirConditioning(boolean isAirConditioning) {
			Car.this.isAirConditioning = isAirConditioning;
			return this;
		}
		public Car Build() {
			return Car.this;
		}
	}
	
	public static void main(String[] args) {
		Car car1 = Car.getCar().addModel("Audi").addDateOfProdaction(LocalDate.of(2020, 12, 3)).addEngineCapacity(2.0).addColor("lilac").addPassengetCapasity(5).setIsAirConditioning(true).Build();
		Car car2 = Car.getCar().addModel("Mazda").addDateOfProdaction(LocalDate.of(2021, 05, 8)).addEngineCapacity(1.8).addColor("ocean blue").addPassengetCapasity(5).setIsAirConditioning(true).Build();
		Car car3 = Car.getCar().addModel("Toyota").addDateOfProdaction(LocalDate.of(2019, 06, 12)).addEngineCapacity(1.2).addColor("pearl").addPassengetCapasity(5).setIsAirConditioning(true).Build();
		Car car4 = Car.getCar().addModel("Honda").addDateOfProdaction(LocalDate.of(2025, 8, 5)).addEngineCapacity(1.8).addColor("cherry").addPassengetCapasity(5).setIsAirConditioning(true).Build();

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
	}
}
