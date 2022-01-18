package hw2.hw5;

public class CarApp {
    public static void main(String[] args) {
        Car[] car = new Car[4];

        car[0] = new Sedan("Renault Zoe", 141, 2017);
        car[1] = new Truck("Tesla Cybertruck", 180, 2022);
        car[2] = new Sedan("Deawoo Lanos", 99, 1991);
        car[3] = new Truck("Ford F-150", 230, 2023);

        for (Car i : car) {
            System.out.println(i);
        }

    }
}
