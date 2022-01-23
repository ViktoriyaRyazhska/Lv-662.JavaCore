package hw7.practice_1;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Car car = Car.getCar().addModel("Citroen C4")
				              .addColor("Brown")
				              .addDateOfProduction(LocalDate.of(2011, 12, 21))
				              .addEngineCapacity(1.4)
				              .addPassengerCapacity(5)
				              .setIsAirConditioning(true)
				              .build();
		
		System.out.println(car);

	}

}
