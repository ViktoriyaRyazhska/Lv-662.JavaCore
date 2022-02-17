package hw10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pk {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое значение:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Введите второе значение:");
            int b = Integer.parseInt(br.readLine());
            System.out.println(squareRectangle(a, b));
        } catch (NumberFormatException | IOException e) {
            System.err.println("Это не число!");
        }
    }
	 public static int squareRectangle(int x, int y) {
	        if (x <= 0 || y <= 0) {
	            throw new ArithmeticException("Число не может быть меньше нуля!");
	        }
	        System.out.print("Площадь прямоугольника:");
	        return x * y;
	    }
}