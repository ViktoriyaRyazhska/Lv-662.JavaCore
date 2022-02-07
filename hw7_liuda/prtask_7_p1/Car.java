package prtask_7_p1;

import java.time.LocalDate;

public class Car {

    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car(){
    }

    public static class CarBuilder{
        private Car Car1;

        public CarBuilder(){
            Car1 = new Car();
        }

        public CarBuilder addModel(String model){
            Car1.model = model;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProduction){
            Car1.dateOfProduction = dateOfProduction;
            return this;
        }
        public CarBuilder addEngineCapacity(double engineCapacity){
            Car1.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addColor(String color){
            Car1.color = color;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity){
            Car1.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setIsAirConditioning(boolean isAirConditioning){
            Car1.isAirConditioning = isAirConditioning;
            return this;
        }

        public Car build(){
            return Car1;
    }

         public static CarBuilder getCar(){
             return new CarBuilder();
        }

    }
    @Override
    public String toString(){
        return "Car1 [" + model + ", date of production: " + dateOfProduction + ", color: " + color + ", is air conditioning: " + isAirConditioning + "]";
    }
}
