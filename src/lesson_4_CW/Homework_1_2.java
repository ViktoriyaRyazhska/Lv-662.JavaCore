package lesson_4_CW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework_1_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task 1");
//Ask user to enter the number of month; Read the value and write the amount of days in this month

        int[] numbers = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Please enter the number of month");
        int a = Integer.parseInt(br.readLine());

        int count = a - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i == count) {
                System.out.println("The " + a + " month has " + numbers[i] + " days");
            } else if (count > 12 | count < 1) {
                System.out.println("The is no such month!");
            }
        }

//        Enter 10 integer numbers.
//        Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
        System.out.println("Task 2");
        System.out.println("Please enter 10 integer numbers");
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());
        int a4 = Integer.parseInt(br.readLine());
        int a5 = Integer.parseInt(br.readLine());
        int a6 = Integer.parseInt(br.readLine());
        int a7 = Integer.parseInt(br.readLine());
        int a8 = Integer.parseInt(br.readLine());
        int a9 = Integer.parseInt(br.readLine());
        int a10 = Integer.parseInt(br.readLine());

        int[] digits = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
        System.out.println("You entered next digits: " + Arrays.toString(digits));

        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[0] >= 0 & digits[1] >= 0 & digits[2] >= 0 & digits[3] >= 0 & digits[4] >= 0) {
                sum = digits[0] + digits[1] + digits[2] + digits[3] + digits[4];
            }
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[0] < 0 | digits[1] < 0 | digits[2] < 0 | digits[3] < 0 | digits[4] < 0) {
                sum = digits[5] + digits[6] + digits[7] + digits[8] + digits[9];
            }
        }
        System.out.println("Sum = " + sum);
        

    }
}




