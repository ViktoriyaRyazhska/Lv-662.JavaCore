package hw4p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car car1 = new Car("Ford_Fiesta", 2016, 1.6);
        Car car2 = new Car("Ford_Focus", 2013, 1.8);
        Car car3 = new Car("Ford_Fusion", 2015, 2.5);
        Car car4 = new Car("Ford_Ranger", 2021, 2.0);

        car1.input(br);
        car2.input(br);
        car3.input(br);
        car4.input(br);



        Car[] cars = new Car[4];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;


        int[] yearProduction = new int[4];
        yearProduction[0] = car1.getYearProduction();
        yearProduction[1] = car2.getYearProduction();
        yearProduction[2] = car3.getYearProduction();
        yearProduction[3] = car4.getYearProduction();



        Car a;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearProduction() < cars[j].getYearProduction()){
                    a = cars[i];
                    cars[i] = cars[j];
                    cars[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(yearProduction));
        // This method of Sorting doesn't work and I don't know why
        // In Console I see that: [2016, 2013, 2015, 2021]

    }
}
