package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fl = " float number is out of range [-5,5]: ";

        System.out.printf("This program will prompt three float numbers and will check if all number are in range from -5 to 5 ]");
        System.out.printf("\nPlease enter float number: ");
        double f1 = Double.parseDouble(br.readLine());
        System.out.printf("Please enter float number again: ");
        double f2 = Double.parseDouble(br.readLine());
        System.out.printf("Please enter float number again: ");
        double f3 = Double.parseDouble(br.readLine());

        String str1 = (f1 >= -5 && f1 <= 5) ? "no" : "yes";
        String str2 = (f2 >= -5 && f2 <= 5) ? "no" : "yes";
        String str3 = (f3 >= -5 && f3 <= 5) ? "no" : "yes";

        System.out.println("\nFirst" + fl + str1);
        System.out.println("Second" + fl + str2);
        System.out.println("Third" + fl + str3);

        if ((f1 >= -5 && f1 <= 5) && (f2 >= -5 && f2 <= 5) && (f3 >= -5 && f3 <= 5)) {
            System.out.println("\nAll numbers are in range [-5,5]");
        } else {
            System.out.println("\nThere is a number(s) that are not in range [-5,5]");
        }

    }
}
