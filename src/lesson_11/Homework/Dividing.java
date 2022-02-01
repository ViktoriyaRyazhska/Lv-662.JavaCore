package lesson_11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dividing {

    public static double div(double x, double y) {
        if (x <= 0 || y <= 0) {
            throw new ArithmeticException("ArithmeticException - Can not calculate div if entered data equals 0");
        }
        return x / y;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double a = Double.parseDouble(br.readLine());
            double b = Double.parseDouble(br.readLine());
            System.out.println(String.format("%,.2f", div(a, b)));
        } catch (NumberFormatException | IOException exception) {
            System.out.println("Please input double numbers: " + exception.getMessage());
        }


    }
}
