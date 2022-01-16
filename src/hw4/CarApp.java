package hw4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) throws IOException {
        Car[] car = new Car[4];

        car[0] = new Car("electric", "22kw", 2015);
        car[1] = new Car("electric", "77kw", 2019);
        car[2] = new Car("electric", "83kw", 2021);
        car[3] = new Car("electric", "41kw", 2017);

        //Display cars certain model year
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean isFound = false;
        for (int i = 0; i < car.length; i++) {
            if (car[i].getProductionYear() == a) {
                isFound = true;
                System.out.println(car[i].toString());
            }
        }
        if(!isFound){
            System.out.println("No such year in database");
        }

        //Display cars ordered by the field year
        Car tmp;
        for (int i = 0; i < car.length; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getProductionYear() < car[j].getProductionYear()) {
                    tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
                }
            }
        }

        System.out.println("\nCars by year: ");
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].toString());
        }
    }
}
