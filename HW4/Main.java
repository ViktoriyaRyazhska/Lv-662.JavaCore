package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        ////////////// 1 //////////////


        int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       // System.out.println(Arrays.toString(daysInEachMonth));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of month: ");
        int a = Integer.parseInt(br.readLine());

        if(a > 0 && a < 13) {
            for ( int i = 0; i < daysInEachMonth.length; i++){
                if (daysInEachMonth[i] == daysInEachMonth[a-1]){
                    System.out.println(daysInEachMonth[i]);
                    break;
                }
            }
        } else System.out.println("Invalid number of month");
        System.out.println(" ");

        ////////////// 2 //////////////


        int[] numbers = {1, 1, 3, 4, -5, 13, -14, 12, 3, 23};
        int sumFirstPart = 0;
        int productSecondPart = 1;

        for ( int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0 && i < (numbers.length/2)){
                    sumFirstPart = 0;
                    for ( int j = (numbers.length/2); j < numbers.length; j++){
                        productSecondPart *= numbers[j];
                    }
                    break;
                } if (i < (numbers.length/2)) sumFirstPart += numbers[i];
            }

        if (sumFirstPart != 0) System.out.println(" Sum of the first part: " + sumFirstPart);
        if (productSecondPart != 1) System.out.println(" Product of the second part: " + productSecondPart);
        System.out.println(" ");



        ////////////// 3 //////////////

        int k = 0;

        System.out.println("Enter the amount of integers: ");
        int n = Integer.parseInt(br.readLine());
        int[] integers= new int[n];
        System.out.println("Enter " + n + " " + "integers");
        for (int i = 0; i < integers.length; i++){
            integers[i] = Integer.parseInt(br.readLine());
        }
        int min = integers[0];
        int imin = 0;

        for (int i = 0; i < integers.length; i++){
            if(integers[i] > 0){
                k++;
                if (k == 2){
                    System.out.println("Second positive number: " + integers[i] + " " + "Position: " + (i+1));
                }
            }
            if(integers[i] < min){
                min = integers[i];
                imin = i;
            }
        }

        System.out.println("Minimum in array: " + min + " " + "Position: " + (imin + 1));




        ////////////// 4 //////////////



        Car[] cars = {
                new Car("bmw", 2004, 305),
                new Car("audi", 2013, 400),
                new Car("mazda", 2017, 230),
                new Car("porsche", 2017, 430)
        };

        System.out.println("Enter the year of production of car: ");
        int yearOfProduction = Integer.parseInt(br.readLine());

        for (Car car: cars) {
            if(yearOfProduction == car.getYearOfProduction()) System.out.println(car.toString());
        }

        Car tmp;

        for(int i = 0; i < cars.length - 1 ; i++){
            for(int j = i + 1 ; j < cars.length; j++){
                if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()){
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j]= tmp;
                }
            }
        }
        System.out.println("Sorted by year of production: ");

        System.out.println(Arrays.toString(cars));

    }
}
