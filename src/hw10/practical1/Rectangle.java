package hw10.practical1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static int squareRectangle(int a, int b) {
        if (a <= 0 | b <= 0)
            throw new ArithmeticException("\033[0;1m" + "You entered negative number or zero, can't calculate square");
        System.out.print("Rectangle square = ");
        return a * b;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calculate square for rectangle\n");

        try {
            System.out.print("Please enter rectangle length: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Please enter rectangle width: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println(squareRectangle(a, b));
        } catch (NumberFormatException | IOException e) {
            System.out.println("\033[0;1m" + "You entered non integer number");
            e.printStackTrace();
        }
    }
}
