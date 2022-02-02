package Lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squareRectangle {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		System.out.println("Please, enter first integer number, that describes side of rectangle: ");
		a = input();
		System.out.println("Please, enter second integer number, that describes side of rectangle: ");
		b = input();

		try {
			System.out.println(squareRectangle(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

	static int squareRectangle(int a, int b) {
		if (a <= 0 || b <= 0) {
			throw new ArithmeticException("Side size can not be less than 1!");
		}

		return a * b;
	}

	static int input() {
		int a = 0;
		try {
			a = Integer.parseInt(br.readLine());

		} catch (NumberFormatException | IOException e1) {
			System.out.println("Not a number!");
		}
		return a;
	}
}
