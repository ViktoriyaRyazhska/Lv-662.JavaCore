package lesson_8.ClassWork;

import java.time.LocalDate;

public class Car {

    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String Color;
    private int passengerCapacity;
    private boolean isAirConditioning;




    private Car() {

    }

    public static CarBuilder getCar() {
       return new CarBuilder();
    }

     static class CarBuilder{
        private Car Car1;

         public CarBuilder() {
             Car1 =  new Car();
         }

         public Car build(){
             return Car1;
         }

        public CarBuilder addModel(String addModel){
            Car1.model = addModel;
            return this;
        }

         public CarBuilder addDateOfProduction (LocalDate addDateOfProduction) {
             Car1.dateOfProduction = addDateOfProduction;
             return this;
         }

         public CarBuilder addEngineCapacity (double addEngineCapacity) {
             Car1.engineCapacity = addEngineCapacity;
             return this;
         }

             public CarBuilder addColor(String addColor){
             Car1.Color = addColor;
             return this;
         }

         public CarBuilder addPassengerCapacity (int addPassengerCapacity) {
             Car1.passengerCapacity = addPassengerCapacity;
             return this;
         }

         public CarBuilder setIsAirConditioning (boolean setIsAirConditioning) {
             Car1.isAirConditioning = setIsAirConditioning;
             return this;
         }
         @Override
         public String toString() {
             return "Car: " +
                     "model='" + Car1.model + '\'' +
                     ", dateOfProduction=" + Car1.dateOfProduction +
                     ", engineCapacity=" + Car1.engineCapacity +
                     ", Color='" + Car1.Color + '\'' +
                     ", passengerCapacity=" + Car1.passengerCapacity +
                     ", isAirConditioning=" + Car1.isAirConditioning;
         }
     }


}

