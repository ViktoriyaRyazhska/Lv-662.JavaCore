package PracticalTasks_Inner_Classes;

import java.time.LocalDate;

public class CarAppl {

	public static void main(String[] args) {

		Car car1 = Car.getCar().addModel("Opel").addColor("yellow").addDateOfProduction(LocalDate.of(2016, 01, 01))
				.addEngineCapacity(1.6).addPassengerCapacity(5).setlsAirConditioning(true).build();
		Car car2 = Car.getCar().addModel("Volkswagen").addColor("red").addDateOfProduction(LocalDate.of(2020, 10, 30))
				.addEngineCapacity(1.6).addPassengerCapacity(5).setlsAirConditioning(true).build();
		
		
		System.out.println(car1);
		System.out.println(car2);

	}

}
