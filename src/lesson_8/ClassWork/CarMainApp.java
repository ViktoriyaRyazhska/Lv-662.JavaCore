package lesson_8.ClassWork;

import java.time.LocalDate;

public class CarMainApp {

    public static void main(String[] args) {
        Car.CarBuilder carMain = Car.getCar().addModel("Fiat").addColor("White").
                addEngineCapacity(2.4).addPassengerCapacity(6).setIsAirConditioning(true).
                addDateOfProduction(LocalDate.of(2021, 05, 8));


        System.out.println(carMain.toString());
    }


}

