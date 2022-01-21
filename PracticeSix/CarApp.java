package PracticeSix;

import java.time.LocalDate;

public class CarApp {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        Car []arr = new Car[3];

        arr[0] = new Car.CarBuilder()
                .addModel("BMW")
                .addDateOfProduction(date)
                .addEngineCapacity(2.5)
                .addColor("Black")
                .addPassengerCapacity(4)
                .addIsAirConditioning(true)
                .build();

        arr[1] = new Car.CarBuilder()
                .addModel("Volvo")
                .addDateOfProduction(date)
                .addEngineCapacity(2.1)
                .addColor("White")
                .addPassengerCapacity(5)
                .addIsAirConditioning(false)
                .build();

        arr[2] = new Car.CarBuilder()
                .addModel("Skoda")
                .addDateOfProduction(date)
                .addEngineCapacity(1.5)
                .addColor("Green")
                .addPassengerCapacity(4)
                .addIsAirConditioning(false)
                .build();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
