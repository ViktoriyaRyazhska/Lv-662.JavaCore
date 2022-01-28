package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayMonthNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Task 1
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(Arrays.toString(array));

        System.out.println("Enter the number of Month");
        int i = Integer.parseInt(br.readLine());
        System.out.println("The amount of days in this month is " + array[i - 1]);


        // Task 2.1
        int[] array1 = {10,-20, 10,-5, 30, 5, 15, 20, -10, -10};

        int sum = 0;

        for (int j = 0; j < array1.length & j < 5; j++) {
            if (array1[j] > 0) {
                    sum += array1[j];
                }
            }
        System.out.println("Sum of first 5 positive numbers = " + sum);


        // Task 2.2
        int product = 1;
        for (i = 0; i < 5; i++) {
            if (array1[i] < 0) {
                product = product * array1[i];
            }
        }
        System.out.println("Product of last 5 negative elements = " + product);



    }
}
