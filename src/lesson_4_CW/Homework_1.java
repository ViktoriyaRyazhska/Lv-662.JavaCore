package lesson_4_CW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task 1");
//Ask user to enter the number of month; Read the value and write the amount of days in this month

        int[] numbers = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Please enter the number of month");
        int a = Integer.parseInt(br.readLine());

        int count = a - 1;
        if (count > 11 | count < 1) {
            System.out.println("The is no such month!");
        } else {
            System.out.println("The " + a + " month has " + numbers[count] + " days");
        }


    }
}














