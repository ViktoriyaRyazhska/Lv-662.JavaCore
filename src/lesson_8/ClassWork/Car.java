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
       return new Car().new CarBuilder();
    }

     class CarBuilder{

//         public Car Build() {
//             return Car.this;
//         }

        public CarBuilder addModel(String addModel){
            Car.this.model = addModel;
            return this;
        }

         public CarBuilder addDateOfProduction (LocalDate addDateOfProduction) {
             Car.this.dateOfProduction = addDateOfProduction;
             return this;
         }

         public CarBuilder addEngineCapacity (double addEngineCapacity) {
             Car.this.engineCapacity = addEngineCapacity;
             return this;
         }

             public CarBuilder addColor(String addColor){
             Car.this.Color = addColor;
             return this;
         }

         public CarBuilder addPassengerCapacity (int addPassengerCapacity) {
             Car.this.passengerCapacity = addPassengerCapacity;
             return this;
         }

         public CarBuilder setIsAirConditioning (boolean setIsAirConditioning) {
             Car.this.isAirConditioning = setIsAirConditioning;
             return this;
         }

         @Override
         public String toString() {
             return "Car{" +
                     "model='" + model + '\'' +
                     ", dateOfProduction=" + dateOfProduction +
                     ", engineCapacity=" + engineCapacity +
                     ", Color='" + Color + '\'' +
                     ", passengerCapacity=" + passengerCapacity +
                     ", isAirConditioning=" + isAirConditioning +
                     '}';
         }

    }


}

