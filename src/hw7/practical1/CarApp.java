package hw7.practical1;

import java.time.LocalDate;

public class CarApp {
    public static void main(String[] args) {
        // used two ways to build a car
        Car car1 = new Car.CarBuilder()
                .addModel("Renault")
                .addDateOfProduction(LocalDate.ofEpochDay(2021 - 05 - 31))
                .addColor("Red")
                .addPasangerCapacity(4)
                .build();
        Car car2 = Car.getCar()
                .addModel("Pegeout")
                .setlsAirConditioning(true)
                .addColor("Black")
                .addEngineCapacity(1.5)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
