package Lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static double div(double a, double b) {
		if (a == 0 || b == 0) {
			throw new ArithmeticException("The double number can't be equal to 0!");
		}
		return a / b;
	}
	
	static double input() {
		double a = 0;
		try {
			a = Double.parseDouble(br.readLine());

		} catch (NumberFormatException | IOException e1) {
			System.out.println("Not a number!");
		}
		return a;
	}

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		System.out.println("Please, enter the first double number: ");
		a = input();
		System.out.println("Please, enter the second double number: ");
		b = input();
		try {
			System.out.println(div(a,b));
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	}
}
