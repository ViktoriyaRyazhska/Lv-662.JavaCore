package hw7.practical1;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.dateOfProduction = builder.dateOfProduction;
        this.engineCapacity = builder.engineCapacity;
        this.color = builder.color;
        this.passengerCapacity = builder.passengerCapacity;
        this.isAirConditioning = builder.isAirConditioning;
    }

    public static CarBuilder getCar() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car [" +
                "model='" + this.model + '\'' +
                ", dateOfProduction=" + this.dateOfProduction +
                ", engineCapacity=" + this.engineCapacity +
                ", color='" + this.color + '\'' +
                ", passengerCapacity=" + this.passengerCapacity +
                ", isAirConditioning=" + this.isAirConditioning +
                ']';
    }

    public static class CarBuilder {
        private String model;
        private LocalDate dateOfProduction;
        private double engineCapacity;
        private String color;
        private int passengerCapacity;
        private boolean isAirConditioning;

        public CarBuilder addModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
            this.dateOfProduction = dateOfProduction;
            return this;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder addPasangerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setlsAirConditioning(boolean isAirConditioning) {
            this.isAirConditioning = isAirConditioning;
            return this;
        }

        public Car build() {
            Car car = new Car(this);
            return car;
        }
    }

}
