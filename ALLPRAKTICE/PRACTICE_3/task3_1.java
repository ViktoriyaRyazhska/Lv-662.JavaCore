package Task_3Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextInt();
        System.out.println("Enter second number");
        double b = sc.nextInt();
        System.out.println("Enter third number");
        double c = sc.nextInt();

        int z = 0;

        z =  (a % 2 == 0 )? ++z :  z;
        z =  (b % 2 == 0 )? ++z :  z;
        z =  (c % 2 == 0 )? ++z :  z;

        System.out.println("numbers of odd = " + z);
    }
}