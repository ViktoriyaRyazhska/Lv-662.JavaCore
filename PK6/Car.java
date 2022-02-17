package PK6;

import java.time.LocalDate;

public class Car {
	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengetCapasity;
	private boolean isAirConditioning;
	
	@Override
	public String toString() {
		return "Машина [модель: " + model + ", дата производства:" + dateOfProduction + ", обьём двигателя: " + engineCapacity
				+ ", цвет: " + color + ", вместимость пасажиров: " + passengetCapasity + ", кондиционер: "
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
		 Car []arr = new Car[3];

	        arr[0] = Car.getCar()
	                .addModel("Mercedes")
	                .addDateOfProdaction(LocalDate.of(2021, 12, 21))
	                .addEngineCapacity(3.0)
	                .addColor("чёрный")
	                .addPassengetCapasity(2)
	                .setIsAirConditioning(true)
	                .Build();

	        arr[1] = Car.getCar()
	                .addModel("Mazda")
	                .addDateOfProdaction(LocalDate.of(2013, 07, 15))
	                .addEngineCapacity(1.6)
	                .addColor("красны")
	                .addPassengetCapasity(5)
	                .setIsAirConditioning(true)
	                .Build();

	        arr[2] = Car.getCar()
	                .addModel("Skoda")
	                .addDateOfProdaction(LocalDate.of(2007, 03, 4))
	                .addEngineCapacity(1.3)
	                .addColor("чёрный")
	                .addPassengetCapasity(5)
	                .setIsAirConditioning(false)
	                .Build();

	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
}
}

