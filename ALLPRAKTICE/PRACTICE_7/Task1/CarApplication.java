package Task_7Praktice.Task1;

import java.time.LocalDate;

public class CarApplication {
        public static void main(String[] args) {

            LocalDate date = LocalDate.now();

            Car []arr = new Car[3];

            arr[0] = new Car.CarBuilder()
                    .addModel("Mercedes")
                    .addDateOfProduction(date)
                    .addEngineCapacity(3.5)
                    .addColor("red")
                    .addPassengerCapacity(5)
                    .addIsAirConditioning(true)
                    .build();

            arr[1] = new Car.CarBuilder()
                    .addModel("Reno")
                    .addDateOfProduction(date)
                    .addEngineCapacity(3.1)
                    .addColor("Yellow")
                    .addPassengerCapacity(10)
                    .addIsAirConditioning(true)
                    .build();

            arr[2] = new Car.CarBuilder()
                    .addModel("Audi")
                    .addDateOfProduction(date)
                    .addEngineCapacity(2.5)
                    .addColor("White")
                    .addPassengerCapacity(7)
                    .addIsAirConditioning(true)
                    .build();

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
}

