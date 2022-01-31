package lesson_11.ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRectangleAppl {

    public static void main(String[] args)  {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter first value");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Please enter second value");
            int b = Integer.parseInt(br.readLine());
            System.out.println(SquareRectangle(a, b));
        } catch (NumberFormatException | IOException e) {
            System.out.println("NumberFormatException - it is not a number");
        }
    }

    public static int SquareRectangle(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new ArithmeticException("ArithmeticException - Can not calculate square if entered data equals 0");
        }
        return x * y;
    }
}
