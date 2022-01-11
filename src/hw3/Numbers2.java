package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("This program will prompt three numbers and will print the maximum and minimum number ]");
        System.out.printf("\nPlease enter first number: ");
        int i1 = Integer.parseInt(br.readLine());
        System.out.printf("Please enter second number: ");
        int i2 = Integer.parseInt(br.readLine());
        System.out.printf("Please enter third number: ");
        int i3 = Integer.parseInt(br.readLine());

        // Max number
        if (i1 > i2 && i1 > i3) {
            System.out.println("\nMax number is: " + i1);
        };
        if (i2 > i1 && i2 > i3) {
            System.out.println("\nMax number is: " + i2);
        };
        if (i3 > i1 && i3 > i2) {
            System.out.println("\nMax number is: " + i3);
        };

        // Min number
        if (i1 < i2 && i1 < i3) {
            System.out.println("Min number is: " + i1);
        };
        if (i2 < i1 && i2 < i3) {
            System.out.println("Min number is: " + i2);
        };
        if (i3 < i1 && i3 < i2) {
            System.out.println("Min number is: " + i3);
        };

    }
}
