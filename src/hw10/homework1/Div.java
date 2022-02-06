package hw10.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Div {
    public static double div(double a, double b) {
        double result = a / b;
        if (result == Double.POSITIVE_INFINITY | result == Double.NEGATIVE_INFINITY)
            throw new ArithmeticException("Division by zero");
        return result;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Divide two numbers\n");

        try {
            System.out.print("Please enter first number: ");
            double a = Double.parseDouble(br.readLine());
            System.out.print("Please enter second number: ");
            double b = Double.parseDouble(br.readLine());
            System.out.println(div(a, b));
        } catch (NumberFormatException | IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
