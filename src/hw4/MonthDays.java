package hw4;

import java.io.IOException;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Please enter month number: ");
        int a = scan.nextInt();
        int month = a - 1;

        boolean isFound = false;
        for (int i = 0; i < monthDays.length; i++) {
            if (i == month) {
                isFound = true;
                month = monthDays[i];
                System.out.println("This month has: " + month + " days");
                break;
            }
        }

        if(!isFound){
            System.out.println("No such month!");
        }
    }
}
