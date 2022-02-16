package com.softserve.Lv_662.JavaCore.myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 1;
        System.out.println("Enter number to get factorial");
        try {
            input = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Wrong input, please enter number only");
        }
        getFactorial(input);
    }
    public static void getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("Factorial of your input = " + result );
    }
}
