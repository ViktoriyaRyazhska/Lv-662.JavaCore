package prtask_7_p1;

import java.time.LocalDate;

public class MainCar {
    public static void main(String[] args) {
       Car car1 = new Car.CarBuilder()
                .addModel("Ford")
                .addDateOfProduction(LocalDate.of(2018, 10, 31))
                .addEngineCapacity(1.6)
                .addColor("white")
                .addPassengerCapacity(5)
                .setIsAirConditioning(true)
                .build();

        System.out.println(car1);

    }
}
