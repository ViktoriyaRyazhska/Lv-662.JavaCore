package lesson_4_CW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //       Enter 10 integer numbers.
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

        int amount = 0;
        for (int i = 0; i < 5; i++) {
            if (digits[i] > 0) {
                amount++;
            }
        }

        int b = 0;
        int sum = 0;
        while (b < 5) {
            if (amount == 5) {
                sum += digits[b];
            }
            b++;
        }

        int product = 1;
        for (int i = 5; i < digits.length; i++) {
            if (sum == 0) {
                product = product * digits[i];
            }
        }
        if (sum > 0) {
            System.out.println("First 5 numbers are positive and their sum is " + sum);
        } else {
            System.out.println("First 5 numbers are not positive, so the product of last 5 numbers = " + product);
        }

    }
}
