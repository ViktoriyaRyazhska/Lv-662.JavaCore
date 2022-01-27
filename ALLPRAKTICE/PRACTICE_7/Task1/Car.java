package Task_7Praktice.Task1;

import java.time.LocalDate;

public class Car {

   //fields
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car(){}

    //methods
    @Override
    public String toString() {
        return "Car model: " + model + " Car date of production : " + dateOfProduction + " engine capacity : " + engineCapacity + " Color : " + color + ", Passenger capacity: " + passengerCapacity + ", Have air conditioning - "  +  isAirConditioning;
    }



    public static class CarBuilder{
        private Car newCar;

        public CarBuilder() {
            newCar = new Car();
        }

        public CarBuilder addModel(String model){
        newCar.model = model;
        return this;
    }
    public CarBuilder addDateOfProduction(LocalDate dateOfProduction){
        newCar.dateOfProduction = dateOfProduction;
        return this;
    }
    public CarBuilder addColor(String color){
        newCar.color = color;
        return this;
    }
    public CarBuilder addEngineCapacity(double engineCapacity){
        newCar.engineCapacity = engineCapacity;
        return this;
    }
    public CarBuilder addPassengerCapacity(int passengerCapacity){
        newCar.passengerCapacity = passengerCapacity;
        return this;
    }
    public CarBuilder addIsAirConditioning(boolean isAirConditioning){
        newCar.isAirConditioning = isAirConditioning;
        return this;
        }
        public Car build(){
            return newCar;
        }
    }
}
