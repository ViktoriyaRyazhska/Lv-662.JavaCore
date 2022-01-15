package lesson_4_CW;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car[] cars = new Car[5];
        cars[0] = new Car("electro", 2010, 1.6);
        cars[1] = new Car("gas", 2015, 1.4);
        cars[2] = new Car("electro", 2020, 2.0);
        cars[3] = new Car("electro", 2018, 1.4);
        cars[4] = new Car("gas", 2020, 1.2);

        System.out.println("Please enter the year of production");

//   display 1st element of array
        //       System.out.println(cars[0].toString());
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() == a) {
                System.out.println(cars[i].toString());
            }
        }
// ordered by the field year

        Car temp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ordered by the field year: \n");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
